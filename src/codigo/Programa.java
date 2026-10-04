package codigo;

import java.util.Scanner;

public class Programa{
    static final int MAX_CARTAS = 20;
    
    
    
    public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);
    Funciones funciones = new Funciones();
    Carta[] cartas = new Carta[MAX_CARTAS];
    int totalCartas = 0;
    
    int opcion;
    do{
        opcion = funciones.mostrarMenu();
        switch (opcion) {
            case 1:
                funciones.mostrarTodasLasCartas(cartas, totalCartas);
                break;
            case 2:
                funciones.buscarCarta(cartas, totalCartas);
                break;
            case 3:
                funciones.agregarAlMazo(cartas, totalCartas);
                break;
            case 4:
                funciones.eliminarDelMazo();
                break;
            case 5:
                funciones.mostrarMazo();
                break;
            case 6:
                funciones.mostrarEnergia();
                break;
            case 7:
                funciones.activarCarta();
                break;
            case 8:
                funciones.mostrarEstadisticasMazo();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }while(opcion != 0);

    }

}