
package com.iescomercio.tema_10.cardLayout;

import com.iescomercio.tema_10.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class VentanaAlquiler extends JFrame {

    private JPanel jpBase, jpBotones, jpClienteNorte, jpClienteCentro,  
            jpBarcoNorte, jpBarcoCentro, jpFacturaNorte, jpFacturaCentro,
            jpNorte, jpCentro;

    private JLabel jlbClienteDNI, jlbClienteNombre, jlbClienteNombreEspacio,
            jlbClienteDir, jlbClienteDirEspacio, jlbClienteTlfno,
            jlbClienteTlfnoEspacio, jlbClienteEdad, jlbClienteEdadEspacio,
            jlbBarcoMatricula, jlbBarcoEslora, jlbBarcoAñoMatriculacion,
            jlbNumPasajeros;
    
    private JButton jbtSiguiente, jbtCancelar, jbtClienteBuscar, jbtBarcoBuscar;
    
    private JTextField jtxBuscadorCliente, jtxBuscadorBarco;
    
    public VentanaAlquiler(){
        inicializar();
        colocarElementos();
        preparar();
    }
    
    private void inicializar(){
        
        jpBase = new JPanel(new BorderLayout(5, 5));
        
        jpBotones = new JPanel(new FlowLayout());
        jpNorte = new JPanel(new CardLayout(5, 5));
        jpCentro = new JPanel(new CardLayout(5, 5));
        
        jpClienteCentro = new JPanel(new GridLayout(4, 2, 7, 5));
        jpClienteNorte = new JPanel(new GridLayout(1, 3, 7, 5));
        
        jpBarcoCentro = new JPanel(new GridLayout(ERROR, ABORT));
        jpBarcoNorte = new JPanel(new GridLayout(1, 3));
        
        jpFacturaNorte = new JPanel(new FlowLayout());
        jpFacturaCentro = new JPanel(new GridLayout(ERROR, ABORT));
        
        jtxBuscadorCliente = new JTextField(20);
        jtxBuscadorBarco = new JTextField(20);
        
        jbtSiguiente = new JButton("Siguiente");
        jbtCancelar = new JButton("Cancelar");
        
        jbtClienteBuscar = new JButton("Buscar");
        jbtBarcoBuscar = new JButton("Buscar");
        
        jlbClienteDNI = new JLabel("DNI");
        jlbClienteNombre = new JLabel("Nombre");
        jlbClienteDir = new JLabel("Dirección");
        jlbClienteTlfno = new JLabel("Telefono");
        jlbClienteEdad = new JLabel("Edad");
        
        jlbClienteNombreEspacio = new JLabel();
        jlbClienteDirEspacio = new JLabel();
        jlbClienteTlfnoEspacio = new JLabel();
        jlbClienteEdadEspacio = new JLabel();
           
    }
    
    private void colocarElementos(){
        
        this.add(jpBase);
        
        jpBase.add(jpNorte, BorderLayout.NORTH);
        jpBase.add(jpCentro, BorderLayout.CENTER);
        jpBase.add(jpBotones, BorderLayout.SOUTH);
        
        jpNorte.add(jpClienteNorte, "ClienteNorte");
        jpNorte.add(jpBarcoNorte, "BarcoNorte");
        jpNorte.add(jpFacturaNorte, "FacturaNorte");
        
        jpCentro.add(jpClienteCentro, "ClienteCentro");
        jpCentro.add(jpBarcoCentro, "BarcoCentro");
        jpCentro.add(jpFacturaCentro, "FacturaCentro");
        
        jpBotones.add(jbtSiguiente);
        jpBotones.add(jbtCancelar);
        
        jpClienteNorte.add(jlbClienteDNI);
        jpClienteNorte.add(jtxBuscadorCliente);
        jpClienteNorte.add(jbtClienteBuscar);
        
        jpClienteCentro.add(jlbClienteNombre);
        jpClienteCentro.add(jlbClienteNombreEspacio);
        jpClienteCentro.add(jlbClienteDir);
        jpClienteCentro.add(jlbClienteDirEspacio);
        jpClienteCentro.add(jlbClienteTlfno);
        jpClienteCentro.add(jlbClienteTlfnoEspacio);
        jpClienteCentro.add(jlbClienteEdad);
        jpClienteCentro.add(jlbClienteEdadEspacio);
        
        
        
    }
    
    private void preparar(){
        
        jlbClienteNombreEspacio.setBackground(Color.magenta);
        jlbClienteDirEspacio.setBackground(Color.magenta);
        jlbClienteTlfnoEspacio.setBackground(Color.magenta);
        jlbClienteEdadEspacio.setBackground(Color.magenta);
        jlbClienteNombreEspacio.setOpaque(true);
        jlbClienteDirEspacio.setOpaque(true);
        jlbClienteTlfnoEspacio.setOpaque(true);
        jlbClienteEdadEspacio.setOpaque(true);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
}
