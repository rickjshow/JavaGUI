package org.example;

import javax.swing.*;

import static javax.swing.SwingUtilities.*;
public class app {
    public static void main(String[] args) {
        invokeLater(() -> {
            // Cria uma instância da classe Exemplo
            Exemplo exemplo = new Exemplo();
            // Torna a janela visível
            exemplo.setVisible(true);
        });
    }
}
