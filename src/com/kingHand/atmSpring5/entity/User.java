package com.kingHand.atmSpring5.entity;

public class User {
    private int id;
    private String password;
    private String name;
    private String idCardNO;
    private String email;
    private double balance;
    private String numberOfError;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNO() {
        return idCardNO;
    }

    public void setIdCardNO(String idCardNO) {
        this.idCardNO = idCardNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumberOfError() {
        return numberOfError;
    }

    public void setNumberOfError(String numberOfError) {
        this.numberOfError = numberOfError;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
