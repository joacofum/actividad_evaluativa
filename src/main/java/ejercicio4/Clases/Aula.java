package ejercicio4.Clases;

public class Aula {
    private int id;
    private final int max_estudiantes = 10;
    private String materia;
    private Profesor profesor;
    private Estudiante[] estudiantes;

    public final String[] materias = {"Matemáticas", "Filosofía", "Física"};

    public Aula(){
        id = 1;
        profesor = new Profesor();
        estudiantes = new Estudiante[max_estudiantes];
        crearEstudiantes();
        materia = materias[generarNumeroAleatorio(0,2)];
    }

    public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random() * (minimo -(maximo +1)) + (maximo+1));
    }

    private void crearEstudiantes(){
        for(int i = 0; i<estudiantes.length; i++){
            estudiantes[i] = new Estudiante();
        }
    }

    //Retorna true si más de la mitad de los estudiantes asistió a clases.
    private boolean asistenciaEstudiantes(){
        int cantAsistencias = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.isAsiste()) {
                cantAsistencias++;
            }
        }
        if(cantAsistencias > (max_estudiantes/2)){
            return true;
        }
        return false;
    }

    //Retorna true si la clase se puede dar teniendo en cuenta 3 casos.
    public boolean darClase(){
        //Chequeo si el profesor existe
        if(!profesor.isAsiste()){
            System.out.println("No se puede dar clase porque el profesor no asiste");
            return false;
        }else if(profesor.getMateria_dicta().equals(materia)){
            //Chequeo si la materia que dicta el profesor es la misma materia del aula.
            System.out.println("La materia que dicta el profesor no concuerda con la materia del aula");
            return false;
        }else if(!asistenciaEstudiantes()){
            //Chequeo si más de la mitad de los estudiantes concurrió a clases.
            System.out.println("Faltó más de la mitad de los alumnos");
            return false;
        }
        return true;
    }

    //Imprimo en consola los estudiantes y cada nota, además muestro un total de estudiantes que aprobaron
    //diferenciado por sexo.
    public void notas(){
        int aprobadosH = 0;
        int aprobadosM = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCalificacion_actual() > 4) {
                if(estudiante.getSexo() == 'M'){
                    aprobadosM++;
                }else{
                    aprobadosH++;
                }
            }
            System.out.println(estudiante);
        }
        System.out.println("La cantidad de mujeres que aprobaron fueron: " + aprobadosM);
        System.out.println("La cantidad de hombres que aprobaron fueron: " + aprobadosH);

    }


}
