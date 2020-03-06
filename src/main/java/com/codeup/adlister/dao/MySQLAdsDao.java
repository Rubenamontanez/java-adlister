package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
//Connecting To A Database
//Before we can query or modify the information in a database,
// we will need to connect to it. We'll use the static getConnection
// method of the DriverManager class to return a Connection object,
// which, as the name implies, is an object that represents a database connection.
//The getConnection method requires a URL for the database,
// a username of the user to connect as, and the password for that user.
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() {
//        Refactor your MySQLAdsDao to use prepared statements.
//        instead of Statement stmt = null; we will now use "PreparedStatement stmt = null;"
//        Once we have our connection object, we can use it to create statement
//        objects, which are objects that represent an individual SQL statement.
//        We'll use the createStatement method on the connection object for this.
        PreparedStatement stmt;
        try {
//            Refactor your MySQLAdsDao to use prepared statements.
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            stmt = connection.prepareStatement("SELECT * FROM ads");
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
//        PreparedStatement; class example
        try {
//            Refactor your MySQLAdsDao to use prepared statements.
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            String query = "INSERT INTO ads(user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1,ad.getUserId());
            stmt.setString(2,ad.getTitle());
            stmt.setString(3,ad.getDescription());

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

//    private String createInsertQuery(Ad ad) {
//        return "INSERT INTO ads(user_id, title, description) VALUES "
//            + "(" + ad.getUserId() + ", "
//            + "'" + ad.getTitle() +"', "
//            + "'" + ad.getDescription() + "')";
//    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
