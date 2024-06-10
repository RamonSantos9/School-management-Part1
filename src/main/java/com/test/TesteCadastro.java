package com.test;

import com.gerenciamentoescolar.dao.Conexao;
import com.gerenciamentoescolar.dao.UsuarioDao;
import com.gerenciamentoescolar.modelo.Usuario;
import java.sql.Connection;
import java.sql.SQLException;


public class TesteCadastro {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        try (Connection connection = conexao.conectar()) {
            Usuario usuario = new Usuario();
            usuario.setNome("Nome Exemplo");
            usuario.setTelefone("1234567890");
            usuario.setEmail("exemplo@exemplo.com");
            usuario.setCpf("123.456.789-01");
            usuario.setRg("12345678");
            usuario.setRua("Rua Exemplo");
            usuario.setCidade("Cidade Exemplo");
            usuario.setEstado(1);
            usuario.setBairro("Bairro Exemplo");
            usuario.setNumero("123");
            usuario.setPais(1);
            usuario.setPai("Pai Exemplo");
            usuario.setMae("Mae Exemplo");
            usuario.setAniversario("06-09-2005");
            usuario.setEscolaridade("Escolaridade Exemplo");
            usuario.setCargo(1);
            usuario.setSenha("senhaexemplo");
            
            
            UsuarioDao usuarioDao = new UsuarioDao();
            boolean sucesso = usuarioDao.cadastrar(usuario);

            if (sucesso) {
                System.out.println("Usuário cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar usuário.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
