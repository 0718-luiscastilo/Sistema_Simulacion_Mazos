package codigo;

import java.util.Scanner;

public class Funciones {
    private static final int MAX_MAZO = 8;
    private Carta[] mazo = new Carta[MAX_MAZO];
    private int totalMazo = 0;
    private int energia = 10;
    private static final int ENERGIA_MAXIMA = 10;
    private static final int MAX_CARTAS = 20;
    private static final Scanner scanner = new Scanner(System.in);


    public int registrarCarta(Carta[] cartas, int totalCartas) {
        if (totalCartas >= 20) {
            System.out.println("El catálogo está lleno. No se pueden registrar más cartas.");
            return totalCartas;
        }
        System.out.println("===== REGISTRAR CARTA =====");
        System.out.println("1. Carta de Ataque");
        System.out.println("2. Carta de Defensa");
        System.out.println("3. Carta de Habilidad");
        System.out.print("Seleccione el tipo de carta: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese una opción válida.");
            scanner.next();
            System.out.print("Seleccione el tipo de carta: ");
        }
        int tipo = scanner.nextInt();
        scanner.nextLine();
        while (tipo < 1 || tipo > 3) {
            System.out.println("Ingrese una opción válida.");
            System.out.print("Seleccione el tipo de carta: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese una opción válida.");
                scanner.next();
                System.out.print("Seleccione el tipo de carta: ");
            }
            tipo = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("Ingrese el identificador: ");
        String identificador = scanner.nextLine();
        while (identificador.isBlank()) {
            System.out.println("El identificador no puede estar vacío.");
            System.out.print("Ingrese el identificador: ");
            identificador = scanner.nextLine();
        }
        for (int i = 0; i < totalCartas; i++) {
            if (cartas[i].getIdentificador().equalsIgnoreCase(identificador)) {
                System.out.println("El identificador ya existe.");
                return totalCartas;
            }
        }
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        while (nombre.isBlank()) {
            System.out.println("El nombre no puede estar vacío.");
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
        }
        System.out.print("Ingrese el costo de energía: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número válido.");
            scanner.next();
            System.out.print("Ingrese el costo de energía: ");
        }
        int costoEnergia = scanner.nextInt();
        while (costoEnergia < 0) {
            System.out.println("El costo de energía no puede ser negativo.");
            System.out.print("Ingrese el costo de energía: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número válido.");
                scanner.next();
                System.out.print("Ingrese el costo de energía: ");
            }
            costoEnergia = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.print("Ingrese la rareza: ");
        String rareza = scanner.nextLine();
        while (rareza.isBlank()) {
            System.out.println("La rareza no puede estar vacía.");
            System.out.print("Ingrese la rareza: ");
            rareza = scanner.nextLine();
        }
        System.out.print("Ingrese el estado: ");
        String estado = scanner.nextLine();
        while (estado.isBlank()) {
            System.out.println("El estado no puede estar vacío.");
            System.out.print("Ingrese el estado: ");
            estado = scanner.nextLine();
        }
        Carta nuevaCarta;
        switch (tipo) {
            case 1:
                System.out.print("Ingrese el daño: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingrese un número válido.");
                    scanner.next();
                    System.out.print("Ingrese el daño: ");
                }
                int danio = scanner.nextInt();
                while (danio < 0) {
                    System.out.println("El daño no puede ser negativo.");
                    System.out.print("Ingrese el daño: ");
                    danio = scanner.nextInt();
                }
                scanner.nextLine();
                System.out.print("Ingrese el tipo de ataque: ");
                String tipoAtaque = scanner.nextLine();
                System.out.print("Ingrese el objetivo: ");
                String objetivo = scanner.nextLine();
                nuevaCarta = new CartaAtaque(identificador, nombre, costoEnergia, rareza, estado, danio,
                    tipoAtaque, objetivo );
                break;
            case 2:
                System.out.print("Ingrese la defensa: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingrese un número válido.");
                    scanner.next();
                    System.out.print("Ingrese la defensa: ");
                }
                int defensa = scanner.nextInt();
                while (defensa < 0) {
                    System.out.println("La defensa no puede ser negativa.");
                    System.out.print("Ingrese la defensa: ");
                    defensa = scanner.nextInt();
                }
                scanner.nextLine();
                System.out.print("Ingrese el tipo de defensa: ");
                String tipoDefensa = scanner.nextLine();
                System.out.print("Ingrese la duración: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingrese un número válido.");
                    scanner.next();
                    System.out.print("Ingrese la duración: ");
                }
                int duracionDefensa = scanner.nextInt();
                while (duracionDefensa < 0) {
                    System.out.println("La duración no puede ser negativa.");
                    System.out.print("Ingrese la duración: ");
                    duracionDefensa = scanner.nextInt();
                }
                scanner.nextLine();
                nuevaCarta = new CartaDefensa(identificador, nombre, costoEnergia, rareza, estado, defensa, 
                    tipoDefensa, duracionDefensa);
                break;
            case 3:
                System.out.print("Ingrese el nombre de la habilidad: ");
                String habilidad = scanner.nextLine();
                System.out.print("Ingrese el efecto: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingrese un número válido.");
                    scanner.next();
                    System.out.print("Ingrese el efecto: ");
                }
                int efecto = scanner.nextInt();
                while (efecto < 0) {
                    System.out.println("El efecto no puede ser negativo.");
                    System.out.print("Ingrese el efecto: ");
                    efecto = scanner.nextInt();
                }
                System.out.print("Ingrese la duración: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingrese un número válido.");
                    scanner.next();
                    System.out.print("Ingrese la duración: ");
                }
                int duracionHabilidad = scanner.nextInt();
                while (duracionHabilidad < 0) {
                    System.out.println("La duración no puede ser negativa.");
                    System.out.print("Ingrese la duración: ");
                    duracionHabilidad = scanner.nextInt();
                }
                scanner.nextLine();
                nuevaCarta = new CartaHabilidad(identificador, nombre, costoEnergia, rareza, estado, habilidad,
                    efecto, duracionHabilidad);
                break;
            default:
                return totalCartas;
        }
        cartas[totalCartas] = nuevaCarta;
        totalCartas++;
        System.out.println("Carta registrada correctamente.");
        System.out.println("Identificador: " + nuevaCarta.getIdentificador());
        System.out.println("Nombre: " + nuevaCarta.getNombre());
        System.out.println("Total de cartas registradas: " + totalCartas + "/20");
        return totalCartas;
    }
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
    public void buscarCarta(Carta[] cartas, int totalCartas) {
        if (totalCartas == 0) {
            System.out.println("No hay cartas disponibles.");
            return;
        }
        System.out.print("Ingrese el identificador o nombre de la carta: ");
        String busqueda = scanner.nextLine();
        while (busqueda.isBlank()) {
            System.out.println("Ingrese un valor válido.");
            busqueda = scanner.nextLine();
        }
        boolean encontrado = false;
        for (int i = 0; i < totalCartas; i++) {
            if (cartas[i].getIdentificador().equalsIgnoreCase(busqueda) || cartas[i].getNombre().equalsIgnoreCase(busqueda)) {
                encontrado = true;
                System.out.println("===== CARTA ENCONTRADA =====");
            cartas[i].mostrarInformacion();
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna carta.");
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
        for (int i = 0; i < totalMazo; i++) { if (mazo[i].getIdentificador().equalsIgnoreCase(identificador)) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            System.out.println("La carta no existe en el mazo.");
            return;
        }
        Carta carta = mazo[posicion];
        System.out.println("Carta: " + carta.getNombre());
        System.out.println("Costo: " + carta.getCostoEnergia());
        System.out.println("Energía actual: " + energia);
        if (!verificarEnergia(carta)) {
            System.out.println( "No se puede activar la carta por falta de energía.");
            return;
        }
        consumirEnergia(carta);
        if (carta instanceof Activable) {
            Activable activable = (Activable) carta;
            activable.activar();
        }
    }
    public void mostrarEstadisticasMazo() {
        if (totalMazo == 0) {
            System.out.println("El mazo está vacío.");
            return;
        }
        int totalAtaque = 0;
        int totalDefensa = 0;
        int totalHabilidad = 0;
        int comun = 0;
        int rara = 0;
        int epica = 0;
        int legendaria = 0;
        int costoTotalEnergia = 0;
        for (int i = 0; i < totalMazo; i++) {
            Carta cartaActual = mazo[i];
            if (cartaActual instanceof CartaAtaque) {
                totalAtaque++;
            } else if (cartaActual instanceof CartaDefensa) {
                totalDefensa++;
            } else if (cartaActual instanceof CartaHabilidad) {
                totalHabilidad++;
            }
            costoTotalEnergia += cartaActual.getCostoEnergia();
            String rareza = cartaActual.getRareza();
            if (rareza.equalsIgnoreCase("Comun")) {
                comun++;
            } else if (rareza.equalsIgnoreCase("Rara")) {
                rara++;
            } else if (rareza.equalsIgnoreCase("Epica")) {
                epica++;
            } else if (rareza.equalsIgnoreCase("Legendaria")) {
                legendaria++;
            }
        }
        double costoPromedio = (double) costoTotalEnergia / totalMazo;
        System.out.println("===== ESTADÍSTICAS DEL MAZO =====");
        System.out.println("Total de cartas: "+ totalMazo + "/" + MAX_MAZO);
        System.out.println("Cartas de ataque: " + totalAtaque);
        System.out.println("Cartas de defensa: " + totalDefensa);
        System.out.println("Cartas de habilidad: " + totalHabilidad);
        System.out.println();
        System.out.println("===== RAREZAS =====");
        System.out.println("Común: " + comun);
        System.out.println("Rara: " + rara);
        System.out.println("Épica: " + epica);
        System.out.println("Legendaria: " + legendaria);
        System.out.println();
        System.out.println("Costo total de energía: " + costoTotalEnergia);
        System.out.printf("Costo promedio de energía: %.2f%n", costoPromedio );
    }
    public int mostrarMenu() {
        int opcion;
        do {
            System.out.println();
            System.out.println("===== MENÚ DE OPCIONES =====");
            System.out.println("1. Registrar carta");
            System.out.println("2. Mostrar todas las cartas");
            System.out.println("3. Buscar carta");
            System.out.println("4. Agregar carta al mazo");
            System.out.println("5. Eliminar carta del mazo");
            System.out.println("6. Mostrar mazo del jugador");
            System.out.println("7. Mostrar energía actual");
            System.out.println("8. Activar carta");
            System.out.println("9. Mostrar estadísticas del mazo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese una opción válida.");
                scanner.next();
                System.out.print("Ingrese una opción: ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion < 0 || opcion > 9) {
                System.out.println("Ingrese una opción válida.");
            }
        } while (opcion < 0 || opcion > 9);
        return opcion;
    }
}
