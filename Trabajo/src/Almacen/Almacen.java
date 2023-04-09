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
    private JRadioButton prioridad1;
    private JRadioButton prioridad2;
    private JRadioButton prioridad3;
    private JCheckBox caduana;
    private JTextArea areamostrar;
    private JTextArea Areaid;
    private JTextArea areap;

    private HubContenedores h;

   public Almacen(){
       setTitle("Hub de contenedores");
       setSize(800,800);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setContentPane(Almacen);


       HBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               h=new HubContenedores();


           }
       });
       ABoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int id=Integer.parseInt(idtxt.getText());
               float peso=Float.parseFloat(pesotxt.getText());
               String pais=paistxt.getText();
               boolean aduana= false;
               if(caduana.isSelected())
                   aduana=true;     //Boolean.parseBoolean(aduanatxt.getText());
               int prioridad=3;
               if (prioridad1.isSelected()) prioridad=1;
               else if (prioridad2.isSelected()) prioridad=2;
               //si no se marca asumimos que el valor es 3
               String descripcion=descripciontxt.getText();
               String envia=enviatxt.getText();
               String recibe=recibetxt.getText();
               Contenedor c=new Contenedor(id,peso,pais,aduana,prioridad,descripcion,envia,recibe);
               h.apilarcontenedor(c);
           }
       });
       DBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int prioridad=Integer.parseInt(desapilartxt.getText());
               h.desapilar(prioridad);

           }
       });
       MBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(h!=null){
                   areamostrar.setText(h.toString());


               }
           }
       });
       MIDBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(h!=null) {
                   int id = Integer.parseInt(entraridtxt.getText());
                   Areaid.setText(h.mostrarporid(id));
               }


           }
       });
       MPBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               if(h!=null) {
                   String pais = entradaptxt.getText();
                   areap.setText(h.unPais(pais));
               }

           }
       });
   }

    public static void main(String[] args) {

       new Almacen();

    }
}
