package cn.springdemo.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class UserServiceLogger {
    private static final Logger log = Logger.getLogger(UserServiceLogger.class);

    public void before(JoinPoint jp ) {
        log.info("调用了前置增强方法");
    }

    public void afterReturning (JoinPoint jp , Object result ) {
        log.info("调用了后置增强");
    }



}
