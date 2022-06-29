package ejercicio4.Clases;

public class Profesor extends Persona{
    String materia_dicta;
    public final String[] materias = {"Matemáticas", "Filosofía", "Física"};

    public Profesor(){
        super();
        super.setEdad(generarNumeroAleatorio(20,40));
        materia_dicta = materias[generarNumeroAleatorio(0,2)];
    }

    @Override
    public boolean disponible() {
        int probabilidad = generarNumeroAleatorio(0,100);
        if(probabilidad >= 20){
            super.setAsiste(true);
            return true;
        }
        return false;
    }

    public String getMateria_dicta() {
        return materia_dicta;
    }
}
