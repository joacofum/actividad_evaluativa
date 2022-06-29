package ejercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        try{
            Scanner entrada = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Ingrese sueldo básico: ");
            double sueldo = entrada.nextDouble();
            System.out.println("Ingrese área de trabajo: ");
            String area_trabajo = entrada2.nextLine();
            System.out.println("Ingrese número de hijos: ");
            int nro_hijos = entrada.nextInt();

            double total_pago = 0;
            double bonificacion = 0;
            if(area_trabajo.equals("Sistemas")){
                bonificacion = sueldo * 0.25;
            }else if(area_trabajo.equals("Contabilidad")){
                bonificacion = sueldo * 0.20;
            }else{
                bonificacion = sueldo * 0.10;
            }

            if(nro_hijos >= 2){
                bonificacion += 150 * nro_hijos;
            }

            total_pago = sueldo +bonificacion;

            System.out.println("El sueldo total es: " + total_pago);
        }catch (Exception e){
            System.out.println("Ha ingresado datos incorrectos");
        }

    }
}
