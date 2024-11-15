public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;
    private String dni;

    // Constructor vacío (opcional)
    public Persona() {
    }

    // Constructor con parámetros (opcional, para inicializar directamente)
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) { // Validación básica
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser positiva.");
        }
    }

    // Métodos getter y setter para dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
