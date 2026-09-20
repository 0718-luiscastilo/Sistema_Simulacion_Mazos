package codigo;

public class CartaHabilidad extends Carta {
    private String habilidad;
    private int efecto;
    private int duracion;

    public  CartaHabilidad(String identificador, String nombre, int costoEnergia, String rareza, String estado, 
        String habilidad, int efecto, int  duracion){
            super(identificador, nombre, costoEnergia, rareza, estado);
            this.habilidad = habilidad;
            this.efecto = efecto;
            this.duracion = duracion;
    }
    public  CartaHabilidad(){
            super();
            habilidad ="Nula";
            efecto = 0;
            duracion = 0;
    }
    public String getHabilidad(){
        return habilidad;
    }
    public int getEfecto(){
        return efecto;
    }

    public int getDuracion(){
        return duracion;
    }
    public void setHabilidad(String habilidad){
        if(habilidad != null && !habilidad.isBlank()){
            this.habilidad = habilidad;
        }
    }
    public void setEfecto(int efecto){
        if(efecto >= 0){
            this.efecto = efecto;
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
        System.out.println("Habilidad: " + habilidad);
        System.out.println("Efecto: " + efecto);
        System.out.println("Duracion: " + duracion);
        System.out.println("---------------------------");
    }
    public void activarHabilidad() {

        System.out.println("La carta " + getNombre() + " activa la habilidad " + habilidad + ".");
        System.out.println("Efecto: recupera " + efecto + " puntos de vida.");
        System.out.println("Duracion: " + duracion + " turnos.");
    }
}
