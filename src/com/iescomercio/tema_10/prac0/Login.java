/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema_10.prac0;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
    private JLabel jlbLogin, jlbPass;
    private JTextField jtxtLogin, jtxtPass;
    private JButton jbtnOk, jbtnLimpiar;
    private JPanel jpPanel;

    public Login() {
        super("Identificación ...");
        inicializar();
        meteElementos();
        establecerOyentes();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    private void inicializar() {
        jlbLogin = new JLabel("Usuario");
        jlbPass = new JLabel("Contraseña");
        jtxtLogin = new JTextField(15);
        jtxtPass = new JTextField(15);
        jbtnOk = new JButton("Ok");
        jbtnLimpiar = new JButton("Limpiar");
        jpPanel = new JPanel(new GridLayout(3,2));
    }

    private void meteElementos() {
        this.add(jpPanel);
        jpPanel.add(jlbLogin);
        jpPanel.add(jtxtLogin);
        jpPanel.add(jlbPass);
        jpPanel.add(jtxtPass);
        jpPanel.add(jbtnOk);
        jpPanel.add(jbtnLimpiar);   
        this.pack();
    }

    private void establecerOyentes() {
        jbtnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonOk();
            }
        });
        jbtnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonLimpiar();
            }
        });
        
    }
    private void clickBotonLimpiar() {        
        jtxtLogin.setText("");
        jtxtPass.setText("");
    }
    
    private void clickBotonOk() {
        // Meter el codigo cuando se haga click sobre el boton
        String l = jtxtLogin.getText();
        String p = jtxtPass.getText();
        
        if (l.equalsIgnoreCase("DAVID") && p.equalsIgnoreCase("1234")) {
            JOptionPane.showMessageDialog(this, "Usuario correcto", "Identificacion", JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(this, "Usuario INVALIDO", "Identificacion", JOptionPane.ERROR_MESSAGE);
              
    }
    
    
}
