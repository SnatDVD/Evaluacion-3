
package com.iescomercio.tema_10.repasoSwing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

public class VentanaExperimental extends JFrame{
    
    private JPanel jpBase, jpBaseSinBtn;
    private JPanel jpBartoloBase, jpBartoloNorte,
            jpBartoloSur, jpBartoloEste, jpBartoloOeste;
    private JPanel jpJambitoBase, jpJambitoEste,
            jpJambitoOeste;
    private JPanel jpPestañasBase, jpPestañaOeste,
            jpPestañaEste;
    
    private JLabel jlbBartoloPregunta, jlbBartoloFoto,
            jlbBartoloDescripcion, jlbJambitoPregunta,
            jlbJambitoCubata, jlbJambitoPolitico, 
            jlbJambitoFoto, jlbPestañasColor;
    
    private JButton jbtnCerrar, jbtnSiguiente;
    private JButton jbtnBartoloOpcion1, jbtnBartoloOpcion2,
            jbtnBartoloOpcion3;
    private JButton jbtnJambitoSubir,jbtnJambitoOpcion1, 
            jbtnJambitoOpcion2, jbtnJambitoOpcion3, 
            jbtnJambitoOpcion4, jbtnJambitoOpcion5, 
            jbtnJambitoOpcion6;
    
    private JTextArea jtaBartoloDescripcion;
    private JComboBox jcbJambitoCubata;
    private JList jliJambitoPolitico;
    private JSplitPane jspPestañaArchivos;
    private JColorChooser jccPestañasColor;
    private JSlider jsliPestañasColor;
    
    public VentanaExperimental(){
        
    }
    
    private void inicializar(){
        
        jpBase = new JPanel(new BorderLayout(5, 5));
        jpBaseSinBtn = new JPanel(new CardLayout());
        
        jpBartoloBase = new JPanel(new BorderLayout(5, 5));
        jpBartoloNorte = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpBartoloEste = new JPanel(null);
        jpBartoloOeste = new JPanel
            (new BoxLayout(jpBartoloOeste, BoxLayout.Y_AXIS));
        jpBartoloSur = new JPanel
            (new BoxLayout(jpBartoloSur, BoxLayout.Y_AXIS));
        
        jpJambitoBase = new JPanel(new BorderLayout());
        jpJambitoEste = new JPanel
            (new BoxLayout(jpJambitoEste, BoxLayout.Y_AXIS));
        jpJambitoOeste = new JPanel
            (new BoxLayout(jpJambitoOeste, BoxLayout.Y_AXIS));
        
        jpPestañasBase = new JPanel(new BorderLayout());
        jpPestañaEste = new JPanel
            (new BoxLayout(jpPestañaEste, BoxLayout.Y_AXIS));
        jpPestañaOeste = new JPanel
            (new BoxLayout(jpPestañaOeste, BoxLayout.Y_AXIS));
        
        jlbBartoloPregunta = new JLabel("¿Qué es más?");
        jlbBartoloDescripcion = new JLabel("Descripcion");
        jlbBartoloFoto = new JLabel("Bartolo1.jpg");
        
        
    }
    
}
