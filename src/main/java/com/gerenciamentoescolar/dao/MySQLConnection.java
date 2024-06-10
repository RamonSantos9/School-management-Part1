package com.gerenciamentoescolar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciamentoescolar";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Carregando o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver carregado com sucesso.");

            // Estabelecendo a conexão
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Conexão estabelecida com sucesso!");

                // Faça aqui as operações no banco de dados, se necessário

                // Fechando a conexão
                connection.close();
                System.out.println("Conexão fechada com sucesso.");
            } else {
                System.out.println("Falha ao estabelecer conexão.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
