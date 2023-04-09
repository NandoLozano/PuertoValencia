package Almacen;

public class Main {
    public static void main(String[] args) {
        HubContenedores cont=new HubContenedores();
        Contenedor c=new Contenedor(3,120,"españa",true,3,"especial","alonso","maria");
        cont.apilarcontenedor(c);
        Contenedor c1=new Contenedor(4,120,"españa",true,3,"especial","alonso","maria");
        System.out.println(cont);
        for (int i = 0; i < 11; i++) {
            cont.apilarcontenedor(c1);
        }

        cont.desapilar(3);
        //System.out.println(c);
        //System.out.println(cont.unPais("españa"));
        //System.out.println(cont.mostrarporid(1));
        System.out.println(cont);
    }
}