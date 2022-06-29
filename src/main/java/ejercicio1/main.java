package ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        double km;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese kilómetros, si ingresa 0 saldrá del programa: ");
            km = entrada.nextDouble();
            System.out.println("La conversión de kilómetros a millas es: " + km * 1.6093);
        }while(km != 0);

    }
}
