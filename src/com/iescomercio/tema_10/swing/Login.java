
package com.iescomercio.tema_10.swing;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Login extends JFrame{
    
    private JLabel jlbLogin, jlbPass;
    private JTextField jtxtLogin, jtxtPass;
    private JButton jbtnOk, jbtnLimpiar;
    private JPanel jpPanel;
    
    public Login(){
        super("Identificacion");
        inicializar();
        colocarElementos();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private void inicializar(){
        jlbLogin = new JLabel("Usuario");
        jlbPass = new JLabel("Contraseña");
        jtxtLogin = new JTextField(15);
        jtxtPass = new JTextField(15);
        jbtnOk = new JButton("OK");
        jbtnLimpiar = new JButton("Limpiar");
        jpPanel = new JPanel(new GridLayout(3,2));
    }
    
    private void colocarElementos(){
        this.add(jpPanel);
        jpPanel.add(jlbLogin);
        jpPanel.add(jtxtLogin);
        jpPanel.add(jlbPass);
        jpPanel.add(jtxtPass);
        jpPanel.add(jbtnOk);
        jpPanel.add(jbtnLimpiar);
        this.pack();
    }
    
}
