package Almacen;

public class Contenedor {
    private int id;
    private float peso;
    private String pais;
    private boolean aduanas;
    private int prioridad;
    private String descripcion;
    private String envia;
    private String recibe;

    public Contenedor(int id, float peso, String pais, boolean aduanas, int prioridad, String descripcion, String envia, String recibe){

        this.id=id;
        this.peso=peso;
        this.pais=pais;
        this.aduanas=aduanas;
        this.prioridad=prioridad;
        this.descripcion=descripcion;
        this.envia=envia;
        this.recibe=recibe;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setPeso(int peso){
        this.peso=peso;
    }
    public float getPeso(){
        return peso;
    }
    public void setPais(String pais){
        this.pais=pais;
    }
    public String getPais(){
        return pais;
    }
    public void setAduanas(boolean aduanas){
        this.aduanas=aduanas;
    }
    public boolean getAduanas(){
        return aduanas;
    }
    public void setPrioridad(int prioridad){
        if(prioridad==1||prioridad==2||prioridad==3) {
            this.prioridad = prioridad;
        }
    }
    public int getPrioridad(){
        return prioridad;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setEnvia(String envia){
        this.envia=envia;
    }
    public String getEnvia(){
        return envia;
    }
    public void setRecibe(String recibe){
        this.recibe=recibe;
    }
    public String getRecibe(){
        return recibe;
    }

    @Override
    public String toString() {
        return "Contenedores{" +
                "id=" + id +
                ", peso=" + peso +
                ", pais='" + pais + '\'' +
                ", aduanas=" + aduanas +
                ", prioridad=" + prioridad +
                ", descripcion='" + descripcion + '\'' +
                ", envia='" + envia + '\'' +
                ", recibe='" + recibe + '\'' +
                '}';
    }
}