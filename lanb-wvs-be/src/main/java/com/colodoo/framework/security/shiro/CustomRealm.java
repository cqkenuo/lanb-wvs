package com.colodoo.framework.security.shiro;

import com.colodoo.framework.manager.roleUser.model.RoleUser;
import com.colodoo.framework.manager.roleUser.model.RoleUserExample;
import com.colodoo.framework.manager.roleUser.service.RoleUserMapper;
import com.colodoo.framework.manager.user.model.User;
import com.colodoo.framework.manager.user.model.UserExample;
import com.colodoo.framework.manager.user.service.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义 Realm
 * 
 * @author colodoo
 *
 */
@Component
@Slf4j
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleUserMapper roleUserMapper;

    /**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        return new SimpleAuthenticationInfo(token.getPrincipal(), new String((char[]) token.getCredentials()), getName());
    }

    /**
     * 获取授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userId = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //查找用户
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(userId);
        List<User> users = userMapper.selectByExample(userExample);
        User user = null;
        if (users.size() > 0) {
            user = users.get(0);
        }

        //找角色关联
        RoleUserExample roleUserExample = new RoleUserExample();
        roleUserExample.createCriteria().andUserIdEqualTo(user.getUserId());
        List<RoleUser> roleUsers = roleUserMapper.selectByExample(roleUserExample);

        //找所有角色
        Set<String> set = new HashSet<>();
        for(RoleUser roleUser: roleUsers) {
            set.add(roleUser.getRoleId());
        }

        //设置该用户拥有的角色
        info.setRoles(set);
        return info;
    }
}
