
package com.iescomercio.tema_10.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Calculadora extends JFrame{
    
    private JPanel jpnBase;
    private JPanel jpnNorte;
    private JPanel jpnCentro;
    
    private JTextField jtxVisualizador;
            
    private JButton[] botones;
    
    public Calculadora(){
        jpnBase = new JPanel();
        jpnCentro = new JPanel();
        jpnNorte = new JPanel();
        
        jtxVisualizador = new JTextField(25);
        
        botones = new JButton[16];
        botones[0] = new JButton("1");
        botones[1] = new JButton("2");
        botones[2] = new JButton("3");
        botones[3] = new JButton("+");
        botones[4] = new JButton("4");
        botones[5] = new JButton("5");
        botones[6] = new JButton("6");
        botones[7] = new JButton("-");
        botones[8] = new JButton("7");
        botones[9] = new JButton("8");
        botones[10] = new JButton("9");
        botones[11] = new JButton("/");
        botones[12] = new JButton("0");
        botones[13] = new JButton("=");
        botones[14] = new JButton("C");
        botones[15] = new JButton("*");
        
        this.add(jpnBase);
        jpnBase.setLayout(new BorderLayout(0, 0));
        jpnBase.add(jpnNorte, BorderLayout.NORTH);
        jpnNorte.setLayout(new FlowLayout());
        jpnBase.add(jpnCentro, BorderLayout.CENTER);
        jpnCentro.setLayout(new GridLayout(4, 4, 4, 4));
        
        
        jpnNorte.add(jtxVisualizador);
        for (int c = 0; c < botones.length; c++){
            jpnCentro.add(botones[c]);
        }
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        setVisible(true);
    }
}
