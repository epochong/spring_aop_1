package com.epochong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author epochong
 * @date 2019/8/1 22:58
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
         /*
         * 通过xml文件获取Bean对象-两种方法动态代理
         * 1.注解
         * 2.Sing AOP
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过Bean id = userManagerImpl(目标对象)获取UserManagerImpl对象实例

        //各个类之间的关联-操作的是通过Spring管理的
        IUserManager iUserManager = (IUserManager) context.getBean("userManagerImpl");
        iUserManager.addUserInfo("epochong","123");
        iUserManager.delUserInfo(1);
        //不在allMethod标识的范围内方法
        iUserManager.queryUserById(1);
        iUserManager.modifyUserInfo("hahaha","222",1);
    }
}
