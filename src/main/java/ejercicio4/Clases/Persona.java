package ejercicio4.Clases;

public abstract class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private boolean asiste;
    private final String[] nombres = {"A", "B", "C"};

    public Persona() {
        this.nombre = nombres[generarNumeroAleatorio(0,2)];
        int sexo = generarNumeroAleatorio(0,1);
        if(sexo == 0){
            this.sexo = 'H';
        }else{
            this.sexo = 'M';
        }
        this.edad = generarNumeroAleatorio(12,20);
        this.asiste = disponible();
    }

    public abstract boolean disponible();

    public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random() * (minimo -(maximo +1)) + (maximo+1));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public boolean isAsiste() {
        return asiste;
    }

    public void setAsiste(boolean asiste) {
        this.asiste = asiste;
    }
}
