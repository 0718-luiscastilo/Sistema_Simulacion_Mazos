package codigo;

public abstract class Carta {
    private String identificador;
    private String nombre;
    private int costoEnergia;
    private String rareza;
    private String estado;

    public  Carta(String identificador, String nombre, int costoEnergia, String rareza, String estado){
        this.identificador  = identificador;
        this.nombre = nombre;
        this.costoEnergia = costoEnergia;
        this.rareza = rareza;
        this.estado = estado;
    }
    public  Carta(){
        identificador = "C001"; 
        nombre = "Sin nombre";
        costoEnergia = 0;
        rareza = "Epica";
        estado = "Sin Estado ";
    }
    public String getIdentificador(){
        return identificador;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCostoEnergia(){
        return costoEnergia;
    }
    public String getRareza(){
        return rareza;
    }
    public String getEstado(){
        return estado;
    }
    public void setIdentificador(String identificador){
        if(identificador != null && !identificador.isBlank()){
            this.identificador = identificador;
        }
    }
    public void setNombre(String nombre){
        if(nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }
    public void setCostoEnergia(int costoEnergia){
        if(costoEnergia >= 0){
            this.costoEnergia = costoEnergia;
        }
    }
    public void setRareza(String rareza){
        if(rareza != null && !rareza.isBlank()){
            this.rareza = rareza;
        }
    }
    public void setEstado(String estado){
        if(estado != null && !estado.isBlank()){
            this.estado = estado;
        }
    }
    public abstract void mostrarInformacion();
    
}
