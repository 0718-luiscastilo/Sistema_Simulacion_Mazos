package codigo;

public class CartaAtaque extends Carta{
    private int danio;
    private String tipoAtaque;
    private String objetivo;

    public  CartaAtaque(String identificador, String nombre, int costoEnergia, String rareza, String estado, 
        int danio, String tipoAtaque, String objetivo){
            super(identificador, nombre, costoEnergia, rareza, estado);
            this.danio = danio;
            this.tipoAtaque = tipoAtaque;
            this.objetivo = objetivo;
    }
    public  CartaAtaque(){
            super();
            danio =0;
            tipoAtaque = "Fisico";
            objetivo = "Nada";
    }
    public int getDanio(){
        return danio;
    }
    public String getTipoAtaque(){
        return tipoAtaque;
    }
    public String getObjetivo(){
        return objetivo;
    }
     public void setDanio(int danio){
        if(danio >= 0){
            this.danio = danio;
        }
    }
    public void setTipoAtaque(String tipoAtaque){
        if(tipoAtaque != null && !tipoAtaque.isBlank()){
            this.tipoAtaque = tipoAtaque;
        }
    }
    public void setObjetivo(String objetivo){
        if(objetivo != null && !objetivo.isBlank()){
            this.objetivo = objetivo;
        }
    }
    @Override 
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        super.mostrarInformacion();
        System.out.println("Daño: " + danio);
        System.out.println("Tipo de Ataque : " + tipoAtaque);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("---------------------------");
    }
    public void realizarAtaque(){
        danio = 15;
        System.out.println("La carta " + getNombre() + "realiza un ataque");
        System.out.println("Daño causado: " + danio);
    } 
}
