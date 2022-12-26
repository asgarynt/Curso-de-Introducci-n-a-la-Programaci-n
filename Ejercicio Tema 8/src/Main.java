public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

            persona1.setEdad(18);
            persona1.setNombre("Asgary");
            persona1.setTelefono(5551234567L);
        System.out.println("Edad: " + persona1.getEdad()
                + "\nNombre: " + persona1.getNombre()
                + "\nTeléfono: " + persona1.getTelefono());
    }



}

class Persona {

    private int edad;
    private String nombre;
    private long telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
