public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();

        System.out.println(suma(10, 20, 30));


        miCoche.sumarNumeroPuertas();

        System.out.println(miCoche.numeroPuertas);

    }


    public static int suma(int a, int b, int c) {

        return a + b + c;

    }
}

class Coche {

    int numeroPuertas = 0;



    public void sumarNumeroPuertas(){

        this.numeroPuertas++;

    }

}