package com.gerenciamentoescolar.service;

import com.gerenciamentoescolar.dao.UsuarioDao;
import com.gerenciamentoescolar.modelo.Usuario;
import java.sql.SQLException;



public class UsuarioService {
    private UsuarioDao usuarioDao = new UsuarioDao();
    
    public boolean cadastrar(Usuario usuario) throws SQLException{
        UsuarioDao UsuarioDao = new UsuarioDao();
        return UsuarioDao.cadastrar(usuario);
    }
    
    public boolean autenticar(String nome, String senha, int cargo) throws SQLException {
        return usuarioDao.autenticar(nome, senha, cargo);
    }
}

