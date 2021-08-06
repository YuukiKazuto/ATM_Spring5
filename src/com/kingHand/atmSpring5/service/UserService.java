package com.kingHand.atmSpring5.service;

import com.kingHand.atmSpring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(timeout = 5, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, readOnly = false)
public class UserService {
    @Autowired
    private UserDao userDao;
    public void register(){
        userDao.addUser();
    }
    public void transfer(int id,int tId,double money){
        userDao.reduceMoney(id,money);
        userDao.addMoney(tId,money);
    }
}
