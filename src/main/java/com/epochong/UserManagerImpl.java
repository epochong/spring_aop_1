package com.epochong;

/**
 * @author epochong
 * @date 2019/8/1 22:52
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe TargetObject
 */
public class UserManagerImpl implements IUserManager {
    @Override
    public boolean addUserInfo(String username, String password) throws Exception {
        System.out.println("UserManagerImpl.addUserInfo()");
        return false;
    }

    @Override
    public boolean delUserInfo(int id) throws Exception {
        System.out.println("UserManagerImpl.delUserInfo()");
        return false;
    }

    @Override
    public boolean modifyUserInfo(String username, String password, int id) throws Exception {
        System.out.println("UserManagerImpl.modifyUserInfo()");
        return false;
    }

    @Override
    public boolean queryUserById(int id) throws Exception {
        System.out.println("UserManagerInfo.queryUserById()");
        return false;
    }
}
