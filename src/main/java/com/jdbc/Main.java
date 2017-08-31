package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    private final static String USERNAME = "root";
    private static final String PASSWORD = "root";
    private final static String URL = "jdbc:mysql://localhost:3306/library?useSSL=false";

    public static void main(String[] args) throws SQLException {

        DBProcessor db = new DBProcessor();
        Connection conn = db.getConnection(URL, USERNAME, PASSWORD);
        String query = "SELECT * FROM university.subjects";

//        Statement statement=conn.createStatement();
//        ResultSet resultSet= statement.executeQuery(query);
//
//        while (resultSet.next()){
//            int id=resultSet.getInt("id");
//            String name=resultSet.getString("name");
//            Subjects subjects=new Subjects(id,name);
//            System.out.println(subjects);
//        }
//
//        statement.close();

        PreparedStatement pStatement = conn.prepareStatement(query);
        ResultSet resultSet = pStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        pStatement.close();
        conn.close();


//        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//             Statement statement = connection.createStatement()) {

//            statement.addBatch("INSERT INTO university.students " +
//                    "(age, firstname, lastname, address, city, country) " +
//                    "VALUES (45,\"chet1\",\"CHET\",\"newAd\",\"SPb\",\"ru\")");
//            statement.addBatch("INSERT INTO university.students " +
//                    "(age, firstname, lastname, address, city, country) " +
//                    "VALUES (45,\"chet2\",\"CHET\",\"newAd\",\"SPb\",\"ru\")");
//            statement.addBatch("INSERT INTO university.students " +
//                    "(age, firstname, lastname, address, city, country) " +
//                    "VALUES (45,\"chet3\",\"CHET\",\"newAd\",\"SPb\",\"ru\")");
//            System.out.println(statement.executeBatch());
//            statement.clearBatch();
//            statement.executeUpdate("UPDATE university.students SET firstname=\"vtor3\" WHERE age=55");
//            ResultSet resultSet= statement.executeQuery("SELECT * FROM university.students");
//            System.out.println();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
