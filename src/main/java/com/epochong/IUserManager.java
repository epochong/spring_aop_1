package com.epochong;

/**
 * @author epochong
 * @date 2019/8/1 22:42
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 目标类的接口
 */
public interface IUserManager {
    /**
     * 添加用户成员
     * @param username 用户名
     * @param password 用户密码
     * @return 是否添加成功
     * @throws Exception sql异常
     */
    boolean addUserInfo(String username, String password) throws Exception;

    boolean delUserInfo(int id) throws Exception;

    boolean modifyUserInfo(String username, String password, int id) throws Exception;

    boolean queryUserById(int id) throws Exception;
}
