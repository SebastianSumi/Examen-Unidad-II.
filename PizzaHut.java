import java.util.Scanner;
import java.util.Random;

public class PizzaHut {
    public Scanner sc = new Scanner(System.in);

    private int ValidarEntradaNumerica(int min, int max, String mensaje) {
        int valor;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número válido.");
                sc.next();
                System.out.println(mensaje);
            }
            valor = sc.nextInt();
            sc.nextLine();
        } while (valor < min || valor > max);
        return valor;
    }
    public String generarOpcion(String Ubi, int i) {
        return "(" + i + ")-" + Ubi;
    }

    public String generarMenu( int i) {
        String Ubi;
        String[] ubicaciones = {
                "Centro de la ciudad",
                "Salida Huancané",
                "Salida Cuzco",
                "Salida Puno",
                "Salida Arequipa",
                "Encuentre mi ubicación"
        };
        Ubi = ubicaciones[i - 1];
        return Ubi;
    }

    public void mostrarMenu (){
        for (int i = 1; i <= 6; i++) {
            System.out.println(generarOpcion(generarMenu(i),i));
        }
        seleccionarMenu();
    }

    public String seleccionarMenu (){
        String Ubi;
        int opcion;
        double cargo;
        opcion = ValidarEntradaNumerica(1,6,"Seleccione su ubicación:");
        if (opcion >= 1 && opcion <= 5) {
            Ubi = generarMenu(opcion);
            cargo= aplicarCargo(opcion);
            cargoEntrega(Ubi, cargo);
            return Ubi;
        }
        else {
            Random rand = new Random();
            opcion = rand.nextInt(5);
            Ubi = generarMenu(opcion);
            cargo = aplicarCargo(opcion);
            cargoEntrega(Ubi, cargo);
            return Ubi;
        }
    }

    public double aplicarCargo (int cargo){
        int km [] = {3,8,5,6,0};
        return km[cargo]*0.3;
    }

    public double cargoEntrega (String Ubi, double cargo){
        int opcion;
        opcion = ValidarEntradaNumerica(1,2,"Seleccione entre:\n(1)-Entrega a Domicilio\n(2)-Recoger en local");
        switch (opcion){
            case 1:
                return cargo;
            case 2:
                System.out.println("Lo esperamos en: Av. Horizonte Sur 1234, Salida Arequipa, Juliaca");
                return 0;
            default:
                System.out.println("Error inesperado");
                return  0;
        }
    }

    public static void main(String[] args) {
        PizzaHut pizzaHut = new PizzaHut();
    }
}
