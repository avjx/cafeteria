package com.cafeteria;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author sqlitetutorial.net
 */
public class Main {

    /**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */

    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:/home/raphael/Documents/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // public static void main(String[] args) {
    // createNewDatabase("test.db");
    // }


    public static void main(String[] args) {

        /*
         * // Insert app = new Insert();
         * 
         * // Scanner scanner = new Scanner(System.in);
         * 
         * // System.out.println("Insira os dados dos produtos");
         * // System.out.println("Nome: ");
         * // String nomeproduto = scanner.nextLine();
         * 
         * // System.out.println("Preco: ");
         * // double precoproduto = scanner.nextDouble();
         * 
         * // System.out.println("Quantidade: ");
         * // int qtdproduto = scanner.nextInt();
         * 
         * // app.insert(nomeproduto, precoproduto, qtdproduto);
         * 
         * // app.insert("Cafe com leite", 5);
         * // app.insert("Capuccino", 7);
         * 
         * // DeleteApp delete = new DeleteApp();
         * // delete.delete(3);
         * 
         * // SelectApp select = new SelectApp();
         * 
         * // select.selectAll();
         */

        // !!!! FAZER PRINT DE LOADING !!!!


        System.out.print("\033\143");// LIMPA TERMINAL
        Menu menu = new Menu();
        menu.mostrarMenu();

    }

}