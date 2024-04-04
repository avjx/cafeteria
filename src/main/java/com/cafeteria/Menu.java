package com.cafeteria;

import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {

        String escolha;

        SelectApp select = new SelectApp();

        do {
            // System.out.print("\033\143");// LIMPA TERMINAL
            System.out.println("\n\n-------------------------------------------");
            System.out.println("               < CAFETERIA >               ");
            System.out.println("-------------------------------------------");
            System.out.println("[ 1 ] - Inserir um produto novo.");
            System.out.println("[ 2 ] - Atualizar o estoque de um produto.");
            System.out.println("[ 3 ] - Remover um produto.");
            System.out.println("[ 4 ] - Mostrar produtos cadastrados.");
            System.out.println("-------------------------------------------");
            System.out.println("-> Digite 'sair' para fechar o programa.");
            System.out.println("-------------------------------------------");
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

            escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    System.out.print("\033\143");// LIMPA TERMINAL

                    Insert app = new Insert();
                    // Scanner scanner = new Scanner(System.in);

                    System.out.println("Insira os dados dos produtos");
                    System.out.println("Nome: ");
                    String nomeproduto = scanner.nextLine();

                    System.out.println("Preco: ");
                    double precoproduto = scanner.nextDouble();

                    System.out.println("Quantidade: ");
                    int qtdproduto = scanner.nextInt();

                    app.insert(nomeproduto, precoproduto, qtdproduto);
                    break;

                case "2":
                    System.out.print("\033\143");// LIMPA TERMINAL

                    select.selectAll();

                    UpdateApp update = new UpdateApp();

                    System.out.println("\n-> Insira o Id e a quantidade que deseja atualizar");
                    System.out.println("Id: ");
                    int idproduto = scanner.nextInt();

                    System.out.println("Quantidade: ");
                    int qtdprod = scanner.nextInt();

                    update.update(idproduto, qtdprod);
                    break;

                case "3":
                    System.out.print("\033\143");// LIMPA TERMINAL

                    select.selectAll();

                    DeleteApp delete = new DeleteApp();
                    // Scanner scanner2 = new Scanner(System.in);
                    System.out.println("\n-> Qual o 'id' do produto que deseja excluir?");
                    int idProduto = scanner.nextInt();
                    delete.delete(idProduto);
                    break;

                case "4":

                    select.selectAll();
                    break;

                default:
                    break;
            }
        } while (!escolha.equalsIgnoreCase("sair"));

    }

}
