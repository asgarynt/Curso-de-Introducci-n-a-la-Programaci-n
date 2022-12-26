public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.credito = 1000;
        cliente1.edad = 18;
        cliente1.nombre = "Asgary";
        cliente1.telefono = 5551234567L;
        System.out.println("EMPLEADO");
        System.out.println("Edad: " + cliente1.edad
                + "\nNombre: " + cliente1.nombre
                + "\nTeléfono: " + cliente1.telefono
                + "\nCrédito: " + cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.salario = 2000.5;
        trabajador1.edad = 28;
        trabajador1.nombre = "Daniel";
        trabajador1.telefono = 5559876543L;

        System.out.println("\nTRABAJADOR");
        System.out.println("Edad: " + trabajador1.edad
                + "\nNombre: " + trabajador1.nombre
                + "\nTeléfono: " + trabajador1.telefono
                + "\nSalario: " + trabajador1.salario);
    }



}

class Persona {

    int edad;
    String nombre;
    long telefono;

}

class Cliente extends Persona{

    int credito;

}

class Trabajador extends Persona{

    double salario;

}