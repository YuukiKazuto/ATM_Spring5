package com.kingHand.atmSpring5.userlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLog {
    public static final Logger log= LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
    }
}