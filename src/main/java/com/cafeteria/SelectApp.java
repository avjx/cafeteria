package com.cafeteria;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class SelectApp {

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

    public void selectAll() {
        String sql = "SELECT id, nome, preco, qtd FROM produtos";

        System.out.print("\033\143");// LIMPA TERMINAL

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("id: "+rs.getInt("id") + "   " +
                        "|  "+rs.getString("nome") + "" +
                        "   (R$ "+rs.getDouble("preco")+")"+" (qtd: "+rs.getInt("qtd")+")");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
