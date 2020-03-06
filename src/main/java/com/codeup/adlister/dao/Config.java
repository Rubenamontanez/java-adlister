package com.codeup.adlister.dao;

class Config{


    public static String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUsername() {
        return "root";
    }

    public String getPassword() {
        return "codeup";
    }
}
