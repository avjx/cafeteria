package com.cafeteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    private Connection connect() {

        String url = "jdbc:sqlite:/home/raphael/Documents/sqlite/db/test.db";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(String nome, double preco, int qtd) {
        String sql = "INSERT INTO produtos (nome, preco, qtd) VALUES(?,?, ?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setDouble(2, preco);
            pstmt.setInt(3, qtd);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
