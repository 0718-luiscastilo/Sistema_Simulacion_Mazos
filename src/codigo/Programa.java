package codigo;

import java.util.Scanner;

public class Programa{
    static final int MAX_CARTAS =20;
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int totalCartas = 0;
        Carta[] cartas = new Carta[MAX_CARTAS];
        CartaAtaque carta1 = new CartaAtaque("A001","Espada Fuego",3,"Rara","Disponible",25,"Fuego","Enemigo");
        cartas[totalCartas] = carta1;
        totalCartas++;
        CartaDefensa carta2 = new CartaDefensa("D001","Escudo de Acero",2,"Comun","Disponible",20,"Fisica",2);
        cartas[totalCartas] = carta2;
        totalCartas++;
        CartaHabilidad carta3 = new CartaHabilidad("H001","Curacion",4,"Epica","Disponible","Curacion",30,2);
        cartas[totalCartas] = carta3;
        totalCartas++;

        for(int i =0; i<totalCartas;i++){
            cartas[i].mostrarInformacion();
        }
        scaner.close();
    }

}