package ejercicio4;

import ejercicio4.Clases.Aula;

public class main {
    public static void main(String[] args){
        Aula a = new Aula();
        if(a.darClase()){
            a.notas();
        }
    }
}
