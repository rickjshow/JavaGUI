package org.example;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class Exemplo extends JFrame {

    private JTextField campoNome;

    private JButton botaoEnviar;

    public Exemplo (){
        setTitle("Exemplo GUI");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints contraints = new GridBagConstraints();
        contraints.insets = new Insets(5,5,5,5);

        JLabel labelNome = new JLabel("Digite seu nome");
        contraints.gridx = 0;
        contraints.gridy = 0;
        panel.add(labelNome, contraints);

        campoNome = new JTextField(20);
        contraints.gridx = 1;
        contraints.gridy = 0;
        panel.add(campoNome, contraints);

        botaoEnviar = new JButton("Enviar");
        botaoEnviar.addActionListener(e -> executarBotao());
        contraints.gridx = 2;
        contraints.gridy = 0;
        contraints.gridwidth = 2;
        panel.add(botaoEnviar, contraints);

        add(panel);
        setLocationRelativeTo(null);
    }

    private void executarBotao() {
        showMessageDialog(this,
                          "Nome: " + this.campoNome.getText());
    }
}

