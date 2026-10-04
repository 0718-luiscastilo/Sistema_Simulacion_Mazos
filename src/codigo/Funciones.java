package codigo;

import java.util.Scanner;

public class Funciones {
    private static final int MAX_MAZO = 8;
    private Carta[] mazo = new Carta[MAX_MAZO];
    private int totalMazo = 0;
    private int energia = 10;
    private static final int ENERGIA_MAXIMA = 10;


    static Scanner scanner = new Scanner(System.in); 
    void mostrarTodasLasCartas(Carta[] cartas, int totalCartas){
        if(totalCartas ==0){
            System.out.println("No hay cartas disponibles");
            return;
        }
        System.out.println("===== CARTAS DISPONIBLES =====");
        for(int i =0; i<totalCartas;i++){
            cartas[i].mostrarInformacion();
        }
    }
    public void buscarCarta(Carta[] cartas, int totalCartas){
        boolean encontrado = false;
        if(totalCartas ==0){
            System.out.println("No hay cartas disponibles");
            return;
        }
        System.out.print("Ingrese el nombre: ");
        String buscarNombre =scanner.nextLine();
        while(buscarNombre.isBlank()){
            System.out.println("Ingrese Nombre valido.");
            buscarNombre= scanner.nextLine();
        }
        System.out.println("===== CARTA ENCONTRADA =====");
        for(int i =0; i<totalCartas;i++){
            if(cartas[i].getNombre().equalsIgnoreCase(buscarNombre)){
                encontrado = true;
                cartas[i].mostrarInformacion();
            }
        }
        if(!encontrado){
            System.out.println("No existe ninguna carta con ese nombre.");
        }
    }
    public void agregarAlMazo(Carta[] cartas, int totalCartas) {
        if (totalCartas == 0) {
            System.out.println("No hay cartas disponibles.");
            return;
        }
        if (totalMazo >= MAX_MAZO) {
            System.out.println("El mazo está lleno.");
            return;
        }
        System.out.println("===== CARTAS DISPONIBLES =====");

        for (int i = 0; i < totalCartas; i++) {
            System.out.println(
                    cartas[i].getIdentificador() + " - " +
                    cartas[i].getNombre()
            );
        }
        System.out.print("Ingrese el identificador de la carta que desea agregar: ");
        String identificador = scanner.nextLine();
        while (identificador.isBlank()) {
            System.out.println("Ingrese un identificador válido.");
            identificador = scanner.nextLine();
        }
        Carta cartaSeleccionada = null;
        for (int i = 0; i < totalCartas; i++) {
            if (cartas[i].getIdentificador().equalsIgnoreCase(identificador)) {
                cartaSeleccionada = cartas[i];
                break;
            }
        }
        if (cartaSeleccionada == null) {
            System.out.println("La carta no existe en el catálogo.");
            return;
        }
        for (int i = 0; i < totalMazo; i++) {
            if (mazo[i].getIdentificador().equalsIgnoreCase(cartaSeleccionada.getIdentificador())) {
                System.out.println("La carta ya está en el mazo.");
                return;
            }
        }
        mazo[totalMazo] = cartaSeleccionada;
        totalMazo++;

        System.out.println("Carta agregada al mazo correctamente.");
    }
    public void eliminarDelMazo(){
        if (totalMazo == 0) {
        System.out.println("El mazo está vacío.");
        return;
        }
        System.out.print("Ingrese el identificador de la carta que desea eliminar: ");
        String identificador = scanner.nextLine();
        while (identificador.isBlank()) {
            System.out.println("Ingrese un identificador válido.");
            identificador = scanner.nextLine();
        }
        int posicion = -1;
        for (int i = 0; i < totalMazo; i++) {
            if (mazo[i].getIdentificador().equalsIgnoreCase(identificador)) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            System.out.println("La carta no existe en el mazo.");
            return;
        }
        for (int i = posicion; i < totalMazo - 1; i++) {
            mazo[i] = mazo[i + 1];

        }
        totalMazo--;
        mazo[totalMazo] = null;
        System.out.println("Carta eliminada correctamente.");
    }
    public void mostrarMazo(){
        if (totalMazo == 0) {
        System.out.println("El mazo está vacío.");
        return;
        }
        System.out.println("===== MAZO DEL JUGADOR =====");
        for(int i =0; i<totalMazo;i++){
            System.out.println("Carta " + (i + 1));
            mazo[i].mostrarInformacion();
        }
        System.out.println("Cartas en el mazo: " + totalMazo + "/" + MAX_MAZO);
    }
    public void mostrarEnergia() {
        System.out.println("Energía máxima: " + ENERGIA_MAXIMA);
        System.out.println("Energía actual: " + energia);
    }
    public boolean verificarEnergia(Carta carta) {
        System.out.println("Carta: " + carta.getNombre());
        System.out.println("Costo: " + carta.getCostoEnergia());
        if (energia >= carta.getCostoEnergia()) {
            System.out.println("Energía suficiente → Sí");
            return true;
        }
        System.out.println("Energía suficiente → No");
        return false;
    }
    public void consumirEnergia(Carta carta) {
        if (energia >= carta.getCostoEnergia()) {
            energia -= carta.getCostoEnergia();
            System.out.println("Consumir energía → " +  (energia + carta.getCostoEnergia()) + " - " +
            carta.getCostoEnergia());
        System.out.println("Energía restante → " + energia);
    } else {
        System.out.println("No hay suficiente energía.");
    }
    }
    public void activarCarta() {
        if (totalMazo == 0) {
            System.out.println("El mazo no tiene ninguna carta.");
            return;
        }
        System.out.print("Ingrese el identificador de la carta que desea activar: ");
        String identificador = scanner.nextLine();
        while (identificador.isBlank()) {
            System.out.println("Ingrese un identificador válido.");
            identificador = scanner.nextLine();
        }
        int posicion = -1;
        for (int i = 0; i < totalMazo; i++) {
            if (mazo[i].getIdentificador().equalsIgnoreCase(identificador)) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            System.out.println("La carta no existe en el mazo.");
            return;
        }
        Carta carta = mazo[posicion];
        System.out.println("El costo de energía de la carta es: " + carta.getCostoEnergia());
        System.out.println("La energía actual es: " + energia);
        if (carta.getCostoEnergia() <= energia) {
            System.out.println("Se puede activar la carta.");
            consumirEnergia(carta);
        if (carta instanceof CartaAtaque) {
            CartaAtaque ataque = (CartaAtaque) carta;
            ataque.realizarAtaque();
        } else if (carta instanceof CartaDefensa) {
            CartaDefensa defensa = (CartaDefensa) carta;
            defensa.activarDefensa();
        } else if (carta instanceof CartaHabilidad) {
            Activable habilidad = (Activable) carta;
            habilidad.activar();
        }
        } else {
            System.out.println("No se puede activar la carta, no hay suficiente energía.");
        }
    }
    
    public void mostrarEstadisticasMazo(){
        if (totalMazo == 0) {
            System.out.println("El mazo está vacío.");
            return;
        }
        int totalAtaque = 0;
        int totalDefensa = 0;
        int totalHabilidad = 0;
        int costoTotalEnergia = 0;
        Carta cartaMayorCosto = mazo[0];
        for (int i = 0; i < totalMazo; i++) {
            Carta cartaActual = mazo[i];
            if (mazo[i] instanceof CartaAtaque) {
                totalAtaque++;
            } else if (mazo[i] instanceof CartaDefensa) {
                totalDefensa++;
            } else if (mazo[i] instanceof CartaHabilidad) {
                totalHabilidad++;
            }
            // Sumar el costo de energía
            costoTotalEnergia += cartaActual.getCostoEnergia();
            // Encontrar la carta con mayor costo
            if (cartaActual.getCostoEnergia() > cartaMayorCosto.getCostoEnergia()) {
                cartaMayorCosto = cartaActual;
            }
        }
        // Calcular el costo promedio
        double costoPromedio = (double) costoTotalEnergia / totalMazo;
        
        System.out.println("===== ESTADÍSTICAS DEL MAZO =====");
        System.out.println("Total de cartas en el mazo: " + totalMazo + "/" + MAX_MAZO);
        System.out.println("Total de cartas de ataque: " + totalAtaque);
        System.out.println("Total de cartas de defensa: " + totalDefensa);
        System.out.println("Total de cartas de habilidad: " + totalHabilidad);
        System.out.println("Costo promedio de energía: " + costoPromedio);
        System.out.println("Costo total de energía: " + costoTotalEnergia);
        System.out.println("Carta con mayor costo de energía: " + cartaMayorCosto);
    }    
    public int mostrarMenu(){
        int opcion;
        do {
            System.out.println("===== MENÚ DE OPCIONES =====");
            System.out.println("1. Mostrar todas las cartas");  
            System.out.println("2. Buscar carta por nombre");
            System.out.println("3. Agregar carta al mazo");
            System.out.println("4. Eliminar carta del mazo");
            System.out.println("5. Mostrar mazo del jugador");
            System.out.println("6. Mostrar energía actual");
            System.out.println("7. Activar carta");
            System.out.println("8. Mostrar estadísticas del mazo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            
            while(!scanner.hasNextInt()){
                System.out.println("Ingrese una opción válida.");
                scanner.next();
                System.out.print("Ingrese una opción: ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            if(opcion < 0 || opcion > 8){
                System.out.println("Ingrese una opción válida.");
            }
        }while(opcion < 0 || opcion > 8);
        return opcion;
    }
}
