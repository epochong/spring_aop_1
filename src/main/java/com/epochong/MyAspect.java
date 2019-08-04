package com.epochong;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author epochong
 * @date 2019/8/2 0:07
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 两种方式中的一种：注解方式
 */
@Aspect
public class MyAspect {

    /**
     * PointCut是一个范围
     * allMethod是一个标识，标识PointCut
     */
    @Pointcut("execution(* add*(..)) || execution(* del*(..))")
    private void allMethod() {}

    /**
     * 横切性关注点（方法）
     */
    @Before("allMethod()")
    public void checkSecurity() {
        System.out.println("====MyAspect.checkSecurity()====");
    }
}
