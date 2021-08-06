package com.kingHand.atmSpring5.dao;

public interface UserDao {
    void addUser();
    void reduceMoney(int id, double money);
    void addMoney(int id, double money);
}
