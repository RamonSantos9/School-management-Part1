package com.gerenciamentoescolar;

import com.gerenciamentoescolar.view.LoginUsuarioView;


public class Inicio {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                LoginUsuarioView telaLoginView = new LoginUsuarioView();
                telaLoginView.setVisible(true);
            }
        });
    }
}
