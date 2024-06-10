package com.gerenciamentoescolar.dao;

import com.gerenciamentoescolar.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class UsuarioDao {
    public boolean cadastrar(Usuario usuario) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();

        String query = "INSERT INTO Usuario (nome, telefone, email, cpf, rg, aniversario, rua, cidade, estado, bairro, numero, pais, pai, mae, escolaridade, cargo, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getTelefone());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getRg());
            stmt.setString(6, usuario.getAniversario());
            stmt.setString(7, usuario.getRua());
            stmt.setString(8, usuario.getCidade());
            stmt.setInt(9, usuario.getEstado());
            stmt.setString(10, usuario.getBairro());
            stmt.setString(11, usuario.getNumero());
            stmt.setInt(12, usuario.getPais());
            stmt.setString(13, usuario.getPai());
            stmt.setString(14, usuario.getMae());
            stmt.setString(15, usuario.getEscolaridade());
            stmt.setInt(16, usuario.getCargo());
            stmt.setString(17, usuario.getSenha());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            conexao.desconectar(connection);
        }
    }
    
    public boolean autenticar(String nome, String senha, int cargo) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();

        String query = "SELECT * FROM Usuario WHERE nome = ? AND senha = ? AND cargo = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, senha);
            preparedStatement.setInt(3, cargo);

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean loginSuccessful = resultSet.next();

            conexao.desconectar(connection);
            return loginSuccessful;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }    
}
 
    
    


