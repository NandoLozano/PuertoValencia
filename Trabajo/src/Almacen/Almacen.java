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

   public Almacen(){
       setTitle("Hub de contenedores");
       setSize(800,600);
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
               boolean aduana=Boolean.parseBoolean(aduanatxt.getText());
               int prioridad=Integer.parseInt(prioridadtxt.getText());
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
                   mostrartxt.setText(h.toString());


               }
           }
       });
       MIDBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(h!=null) {
                   int id = Integer.parseInt(entraridtxt.getText());
                   saliridtxt.setText(h.mostrarporid(id));
               }


           }
       });
       MPBoton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               if(h!=null) {
                   String pais = entradaptxt.getText();
                   salirptxt.setText(h.unPais(pais));
               }

           }
       });
   }

    public static void main(String[] args) {

       new Almacen();

    }
}
