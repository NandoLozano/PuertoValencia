package Almacen;

public class HubContenedores {
    private Contenedor[][] c;
    final int nFilas = 10;  //[0..9]
    final int nColumnas = 12; //[0..11]

    public HubContenedores() {

        c = new Contenedor[this.nFilas][this.nColumnas];

        //  for (int i = 0; i < nFilas; i++) {
        //      for (int j = 0; j < nColumnas; j++) {
        //          c[i][j] = new Contenedor(1, 120, "españa", true, 1, "especial", "alonso", "maria");
//
        //          c[i][j].setId(0);
        //          c[i][j].setDescripcion("0");
        //          c[i][j].setAduanas(true);
        //          c[i][j].setPais("0");
        //          c[i][j].setEnvia("0");
        //          c[i][j].setRecibe("0");
        //          c[i][j].setPrioridad(0);
        //          c[i][j].setPeso(0);
//
//
        //      }
        //  }


    }

    public void setC(Contenedor[][] m) {

        if (m != null) {
            this.c = m;
        }

    }


    public void apilarcontenedor(Contenedor cont) {
        boolean revisar = false;
        int i;
        if (this.c != null) {
            switch (cont.getPrioridad()) {

                        case 1:
                            for (i = 0; i < this.nFilas; i++) {
                                if (this.c[i][this.nColumnas - 1] == null) {
                                    revisar = true;
                                    break;  //break1
                                }
                            }
                            //Aqui llega el break1
                            if (revisar)
                                this.c[i][nColumnas - 1] = cont;

                            break; //break2
                        case 2:

                            for (i = 0; i < this.nFilas; i++) {
                                if (this.c[i][this.nColumnas - 2] == null) {
                                    revisar = true;
                                    break;  //break1
                                }

                            }

                            if (revisar)
                                this.c[i][nColumnas-2] = cont;

                            break; //break2


                        case 3:
                            for (i = 0; i < nFilas; i++) {
                                for (int l = nColumnas - cont.getPrioridad(); l > 0; l--) {
                                    if (this.c[i][l] == null) {
                                        if (!revisar) {
                                            this.c[i][l] = cont;
                                            revisar = !revisar;
                                        }


                                    }


                                }

                            }


                    }
            }
        }




    public void desapilar(int prioridad) {
        boolean revisar = false;
        int i = 0;
        int j = nColumnas - prioridad;
        if (prioridad == 1 || prioridad == 2) {
            for (i = 0; i < nFilas; i++) {
                if (c[i][nColumnas - prioridad] != null) {
                    c[i][nColumnas - prioridad] = null;
                    System.out.println("quitando..");
                    break;

                }


            }



        }
        else {
            for (i = 0; i < nFilas; i++) {
                for (j = nColumnas - prioridad; j >= 0; j--) {


                    if (c[i][j] != null) {
                        c[i][j] = null;
                        System.out.println("quitando..");
                        revisar = true;
                        break;

                    }
                }
                if (revisar) {

                    break;
                }
            }



        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < nFilas; i++) {
            s += "\n";
            for (int j = nColumnas - 1; j >= 0; j--) {
                if (c[i][j] != null) {
                    s += "Contenedor numero" + "[" + i + "]" + "[" + j + "]" + c[i][j].getId() + "->" + c[i][j].toString() + "\n";
                }


            }

        }
        return s;
    }

    public String mostrarporid(int id) {
        for (int i = 0; i < nFilas; i++) {
            for (int j = nColumnas - 1; j >= 0; j--) {
                if (c[i][j] != null) {
                    if (c[i][j].getId() == id) {
                        return c[i][j].toString();
                    }
                }


            }


        }
        return "no se ha encontrado el cont";


    }

    public String unPais(String pais) {
        int cont = 0;
        for (int i = 0; i < nFilas; i++) {
            for (int j = nColumnas - 1; j >= 0; j--) {
                if (c[i][j] != null) {
                    if (c[i][j].getPais().equals(pais)) {
                        cont++;
                    }


                }
            }


        }
        return "hay" + " " + cont + " de " + pais;


    }
}









