package Almacen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Almacen extends JFrame{
    private JPanel Almacen;
    private JButton ABoton;
    private JTextField idtxt;
    private JButton DBoton;
    private JButton HBoton;
    private JButton MBoton;
    private JButton MIDBoton;
    private JTextField mostrartxt;
    private JTextField entraridtxt;
    private JButton MPBoton;
    private JTextField saliridtxt;
    private JTextField entradaptxt;
    private JTextField salirptxt;
    private JTextField pesotxt;
    private JLabel pesolabel;
    private JLabel idlabel;
    private JLabel paislabel;
    private JTextField paistxt;
    private JTextField aduanatxt;
    private JTextField prioridadtxt;
    private JTextField descripciontxt;
    private JTextField enviatxt;
    private JTextField recibetxt;
    private JLabel recibelabel;
    private JLabel envialabel;
    private JLabel descripcionlabel;
    private JLabel prioridadlabel;
    private JLabel aduanalabel;
    private JTextField desapilartxt;

    private HubContenedores h;

   public Almacen() {
       setTitle("Hub de contenedores");
       setSize(800, 600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setContentPane(Almacen);


   }
    public static void main(String[] args) {

       new Almacen();

    }
}
