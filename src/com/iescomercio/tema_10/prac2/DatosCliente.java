package com.iescomercio.tema_10.prac2;

import com.iescomercio.tema_10.prac1.Cliente;
import com.iescomercio.tema_10.prac1.LinkedHashSetDAO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DatosCliente extends JFrame {

    private JLabel jlbDNI, jlbNombre, jlbApellidos, jlbDireccion, jlbLoc,
            jlbProvincia, jlbTelefono, jlbEdad;
    private JButton jbtInicio, jbtFinal, jbtSiguiente, jbtAnterior, jbtNuevo,
            jbtAlta, jbtBaja, jbtModificar;
    private JTextField jtxDNI, jtxNombre, jtxApellidos, jtxDireccion, jtxLoc,
            jtxProvincia, jtxTelefono;
    private JSpinner jspEdad;
    private JPanel jpPanel;
    private LinkedHashSetDAO<Cliente> clientes;

    //Image icon = Toolkit.getDefaultToolkit().getImage("/com/iescomercio/tema10/prac2/inicio.png");
    Image icon = new ImageIcon(getClass().getResource("/com/iescomercio/tema_10/prac2/inicio.png")).getImage();

    public DatosCliente() {
        super("Datos cliente...");
        inicializar();
        meteElementos();
        establecerOyente();

        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void inicializar() {

        clientes = new LinkedHashSetDAO<>();

        jbtInicio = new JButton("");
        jbtInicio.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/inicio.png")));
        jbtAnterior = new JButton("");
        jbtAnterior.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/anterior.png")));
        jbtSiguiente = new JButton("");
        jbtSiguiente.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/siguiente.png")));
        jbtFinal = new JButton("");
        jbtFinal.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/final.png")));
        jlbDNI = new JLabel("DNI: ");
        jtxDNI = new JTextField(15);
        jlbNombre = new JLabel("Nombre: ");
        jtxNombre = new JTextField(15);
        jlbApellidos = new JLabel("Apellidos: ");
        jtxApellidos = new JTextField(15);
        jlbDireccion = new JLabel("Direccion: ");
        jtxDireccion = new JTextField(15);

        jlbLoc = new JLabel("Loc: ");
        jtxLoc = new JTextField(15);
        jlbProvincia = new JLabel("Provincia: ");
        jtxProvincia = new JTextField(15);
        jlbTelefono = new JLabel("Telefono: ");
        jtxTelefono = new JTextField(15);
        jlbEdad = new JLabel("Edad: ");
        jspEdad = new JSpinner();
        jbtNuevo = new JButton("Nuevo");

        jbtNuevo.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/final.png")));
        jbtAlta = new JButton("Alta");
        jbtAlta.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/final.png")));
        jbtBaja = new JButton("Baja");
        jbtBaja.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/final.png")));
        jbtModificar = new JButton("Modificar");
        jbtModificar.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/com/iescomercio/tema_10/prac2/final.png")));

        jpPanel = new JPanel(new GridLayout(6, 4));
    }

    private void meteElementos() {
        this.add(jpPanel);
        jpPanel.add(jbtInicio);
        jpPanel.add(jbtAnterior);
        jpPanel.add(jbtSiguiente);
        jpPanel.add(jbtFinal);
        jpPanel.add(jlbDNI);
        jpPanel.add(jtxDNI);
        jpPanel.add(jlbNombre);
        jpPanel.add(jtxNombre);
        jpPanel.add(jlbApellidos);
        jpPanel.add(jtxApellidos);
        jpPanel.add(jlbDireccion);
        jpPanel.add(jtxDireccion);
        jpPanel.add(jlbLoc);
        jpPanel.add(jtxLoc);
        jpPanel.add(jlbProvincia);
        jpPanel.add(jtxProvincia);
        jpPanel.add(jlbTelefono);
        jpPanel.add(jtxTelefono);
        jpPanel.add(jlbEdad);
        jpPanel.add(jspEdad);
        jpPanel.add(jbtNuevo);
        jpPanel.add(jbtAlta);
        jpPanel.add(jbtBaja);
        jpPanel.add(jbtModificar);
        this.pack();

    }

    private void establecerOyente() {
        jbtNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonNuevo();
            }
        });

        jbtAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incorporarCliente();
                popupAdvertencia("Alta");
            }
        });
        jbtBaja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupAdvertencia("Baja");
            }
        });
        jbtModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupAdvertencia("Modificar");
            }
        });
        jbtSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCliente((Cliente) clientes.siguiente(e));
            }
        });
        jbtAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCliente((Cliente) clientes.anterior(e));
            }
        });
    }

    private void popupAdvertencia(String nombreAdver) {
        JOptionPane.showMessageDialog(this, "REALIZADA¡¡", nombreAdver,
                JOptionPane.INFORMATION_MESSAGE);

    }

    private void popupError(Exception e) {
        JOptionPane.showMessageDialog(this, "Error", e.getMessage(),
                JOptionPane.INFORMATION_MESSAGE);

    }

    private void clickBotonNuevo() {
        jtxDNI.setText("");
        jtxApellidos.setText("");
        jtxLoc.setText("");
        jtxTelefono.setText("");
        jtxNombre.setText("");
        jtxDireccion.setText("");
        jtxProvincia.setText("");
        jspEdad.setValue(0);

    }

    private void incorporarCliente() {
        clientes.alta(getClienteActual());
    }

    private Cliente getClienteActual() {
        try {
            Integer i = (Integer) jspEdad.getValue();

            return new Cliente(jtxDNI.getText(), jtxNombre.getText(),
                    jtxApellidos.getText(), jtxLoc.getText(),
                    jtxDireccion.getText(), jtxProvincia.getText(),
                    jtxTelefono.getText(), i);
        } catch (Exception e) {
            popupError(e);
            return null;
        }
    }

    private void mostrarCliente(Cliente cli) {
        jtxDNI.setText(cli.getDni());
        jtxNombre.setText(cli.getNombre());
        jtxApellidos.setText(cli.getApellidos());
        jtxDireccion.setText(cli.getDireccion());
        jtxLoc.setText(cli.getLoc());
        jtxProvincia.setText(cli.getProvincia());
        jtxTelefono.setText(cli.getTlfno());
        jspEdad.setValue(cli.getEdad());
    }

}
