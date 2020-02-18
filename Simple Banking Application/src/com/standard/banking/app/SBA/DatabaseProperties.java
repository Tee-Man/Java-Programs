package com.standard.banking.app.SBA;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseProperties {

    private final String databaseConnection = "jdbc:mysql://localhost:3306/banking_application_database.db";
    private Connection connection;
    private ResultSet tempDatase;
    private Statement databaseAction;


    public void createClientRecord(){

        
    }

}
