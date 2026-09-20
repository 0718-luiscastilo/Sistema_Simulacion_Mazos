package codigo;

public class CartaDefensa extends Carta{
    private int defensa;
    private String tipoDefensa;
    private int duracion;
    
    public  CartaDefensa(String identificador, String nombre, int costoEnergia, String rareza, String estado, 
        int defensa, String tipoDefensa, int  duracion){
            super(identificador, nombre, costoEnergia, rareza, estado);
            this.defensa = defensa;
            this.tipoDefensa = tipoDefensa;
            this.duracion = duracion;
    }
    public  CartaDefensa(){
            super();
            defensa =0;
            tipoDefensa = "Fisico";
            duracion = 0;
    }
    public int getDefensa() {
        return defensa;
    }
    public String getTipoDefensa(){
        return tipoDefensa;
    }
    public int getDuracion(){
        return duracion;
    }
    public void setDefensa(int defensa) {
        if (defensa >= 0) {
            this.defensa = defensa;
        }
    }
    public void setTipoDefensa(String tipoDefensa){
        if(tipoDefensa != null && !tipoDefensa.isBlank()){
            this.tipoDefensa = tipoDefensa;
        }
    }
    public void setDuracion(int duracion){
        if(duracion >= 0){
            this.duracion = duracion;
        }
    }
    @Override 
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        System.out.println("Identificador: " + getIdentificador());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Costo de Energia: " + getCostoEnergia());
        System.out.println("Rareza: " + getRareza());
        System.out.println("Estado: " + getEstado());
        System.out.println("Defensa: " + defensa);
        System.out.println("Tipo de Defensa: " + tipoDefensa);
        System.out.println("Duracion: " + duracion);
        System.out.println("---------------------------");
    }
    public void activarDefensa(){
        System.out.println("La carta " + getNombre() + " activa su defensa.");
        System.out.println("Defensa proporcionada: " + defensa);
        System.out.println("Tipo de defensa: " + tipoDefensa);
        System.out.println("Duracion: " + duracion + " turnos.");
    }
}
