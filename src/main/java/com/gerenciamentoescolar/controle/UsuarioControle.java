
package com.gerenciamentoescolar.controle;

import com.gerenciamentoescolar.modelo.Usuario;
import com.gerenciamentoescolar.service.UsuarioService;
import java.sql.SQLException;



public class UsuarioControle {
    private UsuarioService usuarioService = new UsuarioService();
    
    
    public boolean cadastrar(Usuario usuario) throws SQLException{
        UsuarioService UsuarioService = new UsuarioService();
        return UsuarioService.cadastrar(usuario);
    }
   
    public boolean autenticar(String nome, String senha, int cargo) throws SQLException {
        return usuarioService.autenticar(nome, senha, cargo);
    }
    
    public UsuarioControle() {
        this.usuarioService = new UsuarioService();
    }
}

