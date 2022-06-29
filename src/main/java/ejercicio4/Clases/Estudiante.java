package ejercicio4.Clases;

public class Estudiante extends Persona{
    double calificacion_actual;

    public Estudiante() {
        super();
        this.calificacion_actual = generarNumeroAleatorio(0,10);
        super.setEdad(generarNumeroAleatorio(12,18));
    }

    @Override
    public boolean disponible() {
        int probabilidad = generarNumeroAleatorio(0,100);
        if(probabilidad >= 50){
            super.setAsiste(true);
            return true;
        }
        return false;
    }

    public double getCalificacion_actual() {
        return calificacion_actual;
    }

    public void setCalificacion_actual(double calificacion_actual) {
        this.calificacion_actual = calificacion_actual;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " - Edad: " + super.getEdad() +
                " - Sexo: " + super.getSexo() + " - Calificación: " + this.calificacion_actual;
    }
}
