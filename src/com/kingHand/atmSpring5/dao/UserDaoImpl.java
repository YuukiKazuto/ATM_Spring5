package com.kingHand.atmSpring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser() {

    }

    @Override
    public void reduceMoney(int id, double money) {
        String sql="update user set balance=balance-? where id=?";
        jdbcTemplate.update(sql,money,id);
    }

    @Override
    public void addMoney(int id, double money) {
        String sql="update user set balance=balance+? where id=?";
        jdbcTemplate.update(sql,money,id);
    }
}
