package com.netease.modular.personal.user;


import com.netease.common.user.BaseUser;
import com.netease.common.user.IUser;
import com.netease.modular.personal.model.UserInfo;
import com.netease.arouter.annotation.ARouter;

/**
 * personal模块实现的内容
 */
@ARouter(path = "/personal/getUserInfo")
public class PersonalUserImpl implements IUser {

    @Override
    public BaseUser getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("熊老师");
        userInfo.setAccount("netease_think");
        userInfo.setPassword("666666");
        userInfo.setVipLevel(9);
        return userInfo;
    }
}
