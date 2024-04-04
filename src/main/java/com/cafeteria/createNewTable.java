package com.cafeteria;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class createNewTable {

    public static void CreateNewTable() {
        String url = "jdbc:sqlite:/home/raphael/Documents/sqlite/db/test.db";

        String sql = "CREATE TABLE IF NOT EXISTS produtos (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	nome text NOT NULL,\n"
                + "	preco real\n"
                + " qtd int\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
