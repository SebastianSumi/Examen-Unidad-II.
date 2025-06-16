import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;
import java.lang.Math;

public class PizzaHut {
    public Scanner sc = new Scanner(System.in);
    double tasaIgv = 0.18;
    public double Cargo;
    private String Ubic, name,DNI;
    public double TOTAL;
    public String ProductoSelec;
    public int Contador = 0;
    public int opion;
    String nombre;


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

    private double ValidarEntradaNumerica2(int min, String mensaje) {
        double valor;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número válido.");
                sc.next();
                System.out.println(mensaje);
            }
            valor = sc.nextInt();
            sc.nextLine();
        } while (valor < min);
        return valor;
    }

    public String generarOpcion(String Ubi, int i) {
        return "(" + i + ")-" + Ubi;
    }

    public String generarMenu(int i) {
        String Ubi;
        ArrayList <String> ubicaciones = new ArrayList<>();
        ubicaciones.add("Centro de Juliaca");
        ubicaciones.add("Salida Huancane");
        ubicaciones.add("Salida Cusco");
        ubicaciones.add("Salida Puno");
        ubicaciones.add("Salida Arequipa");
        ubicaciones.add("Salida Lampa");
        ubicaciones.add("Encuentre mi ubicación");
        Ubi = ubicaciones.get(i-1);
        return Ubi;
    }

    public void mostrarMenu() {
        for (int i = 1; i <= 7; i++) {
            System.out.println(generarOpcion(generarMenu(i), i));
        }
        seleccionarMenu();
    }

    public String seleccionarMenu() {
        String Ubi;
        int opcion;
        double cargo;
        opcion = ValidarEntradaNumerica(1, 6, "Seleccione su ubicación:");
        if (opcion >= 1 && opcion <= 6) {
            Ubi = generarMenu(opcion);
            Ubic = Ubi;
            opion = opcion-1;
            sistema();
            return Ubi;
        } else {
            Random rand = new Random();
            opcion = rand.nextInt(6) + 1;
            Ubi = generarMenu(opcion);
            Ubic = Ubi;
            opion = opcion-1;
            sistema();
            return Ubi;
        }
    }

    public double aplicarCargo() {
        int km[] = {3, 8, 5, 6, 0, 9};
        return km[opion] * 0.3;
    }

    public double cargoEntrega() {
        int opcion;
        double cargo;
        opcion = ValidarEntradaNumerica(1, 2, "Seleccione entre:\n(1)-Entrega a Domicilio\n(2)-Recoger en local");
        switch (opcion) {
            case 1:
                cargo = aplicarCargo();
                Cargo = cargo;
                System.out.println("El cargo de entrega a domicilio es: s/." + Cargo);
                TOTAL = TOTAL + Cargo;
                return cargo;
            case 2:
                System.out.println("Lo esperamos en: Av. Horizonte Sur 1234, Salida Arequipa, Juliaca");
                return 0;
            default:
                System.out.println("Error inesperado");
                return 0;
        }
    }


    //


    public void seleccionarProducto(String producto, double precio) {
        if (ProductoSelec == null || ProductoSelec.isEmpty()) {
            ProductoSelec = producto;
        } else {
            ProductoSelec += " + " + producto;
        }
        TOTAL += precio;
        System.out.println("Producto agregado: " + producto);
        System.out.println("Total actual: S/ " + TOTAL);
    }

    Scanner entrada = new Scanner(System.in);
    //Menu 1.- Favoritos del mes
    String[] LoNuevo1 = {"Pizza Criolla (Ají, carne y choclo)", "Lasagna de Espinaca y Ricotta ", "Lasagna de Espinaca y Ricotta "};
    double[] PrecioLoNuevo1 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo1 = new int[3]; //cantidad pedida
    double[] subtotal_LoNuevo1 = {0, 0, 0}; //se almacenan los precios por compra
    String[] PideAhora1 = {"Pizza Mediana de Pepperoni + Extra ", "Combo Express (Pizza personal + gaseosa)", "Alitas BBQ (6 unidades)"};
    double[] PrecioPideAhora1 = {49.6, 25.2, 15.4};
    int[] carritomenuPideAhora1 = new int[3];
    double[] subtotal_PideAhora1 = {0, 0, 0};
    String[] MegaPromos1 = {"Pack Amistad (Pizza + alitas + papas + gaseosa) ", "Dúo Familiar (2 Pizzas Grandes + 2 Bebidas)", "Super Combo Pizza + Postre"};
    double[] PrecioMegaPromos1 = {43.6, 35.6, 12.9};
    int[] carritomenuMegaPromos1 = new int[3];
    double[] subtotal_MegaPromos1 = {0, 0, 0};
    String[] ExclusivasWeb1 = {"Pizza Trufa y Queso ", "Pizza Premium de Espinaca y ChampiñonesLasagna de Carne Especial", ""};
    double[] PrecioExclusivasWeb1 = {45, 35, 26};
    int[] carritomenuExclusivasWeb1 = new int[3];
    double[] subtotal_ExclusivasWeb1 = {0, 0, 0};
    String[] ParaMí1 = {"Ensalada César con Pollo", "Wrap Mediterráneo", "Pasta Alfredo con Pollo"};
    double[] PrecioParaMí1 = {48.6, 25, 16};
    int[] carritomenuParamí1 = new int[3];
    double[] subtotal_Paramí1 = {0, 0, 0};
    String[] Antojitos1 = {"Papas con Queso Cheddar ", "Churros con Caramelo", "Mini Empanadas de Queso"};
    double[] PrecioAntojitos1 = {45.6, 23.5, 13};
    int[] carritomenuAntojitos1 = new int[3];
    double[] subtotal_Antojitos1 = {0, 0, 0};
    String[] Bebidas1 = {"Pizza BBQ Suprema", "Pasta Bolognesa con Queso", "Papas Rústicas con Tocino"};
    double[] PrecioBebidas1 = {6.2, 9.2, 10.9};
    int[] carritoBebidas1 = new int[3];
    double[] subtotal_Bebidas1 = {0, 0, 0};
    //Menu 2.- Para Compaartir
    String[] LoNuevo2 = {"Pizza BBQ Suprema ", "Pasta Bolognesa con Queso ", "Papas Rústicas con Tocino"};
    double[] PrecioLoNuevo2 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo2 = new int[3];
    double[] subtotal_LoNuevo2 = {0, 0, 0};
    String[] PideAhora2 = {"Pizza Mediana Cuatro Quesos ", "Pizza Individual de Pollo BBQ", "Alitas Picantes (8 unidades)"};
    double[] PrecioPideAhora2 = {45.8, 36.2, 15};
    int[] carritomenuPideAhora2 = new int[3];
    double[] subtotal_PideAhora2 = {0, 0, 0};
    String[] MegaPromos2 = {"Mega Pack (3 Pizzas + 4 Bebidas)", "Postre del Día (Brownie + Helado)", "Súper Combo Pizza + Bebida + Alitas"};
    double[] PrecioMegaPromos2 = {46.2, 36.9, 15.6};
    int[] carritomenuMegaPromos2 = new int[3];
    double[] subtotal_MegaPromos2 = {0, 0, 0};
    String[] ExclusivasWeb2 = {"Pizza de Trufa y Espárragos ", "Pasta Carbonara", "Pizza Gourmet de Mariscos"};
    double[] PrecioExclusivasWeb2 = {49.5, 35.2, 12.5};
    int[] carritomenuExclusivasWeb2 = new int[3];
    double[] subtotal_ExclusivasWeb2 = {0, 0, 0};
    String[] ParaMí2 = {"Wrap de Pollo BBQ", "Ensalada Mediterránea", "Sándwich de Pollo y Aguacate"};
    double[] PrecioParaMí2 = {43.2, 35.2, 16.5};
    int[] carritomenuParamí2 = new int[3];
    double[] subtotal_Paramí2 = {0, 0, 0};
    String[] Antojitos2 = {"Palitos de Queso Frito", "Mini Pizzas Margarita (4 unidades)", "Churros con Chocolate"};
    double[] PrecioAntojitos2 = {46.2, 39.2, 18.9};
    int[] carritomenuAntojitos2 = new int[3];
    double[] subtotal_Antojitos2 = {0, 0, 0};
    String[] Bebidas2 = {"Malteada de Fresa", "Té Helado de Limón", "Gaseosa de 500ml"};
    double[] PrecioBebidas2 = {7.6, 5.3, 12.9};
    int[] carritoBebidas2 = new int[3];
    double[] subtotal_Bebidas2 = {0, 0, 0};
    //Menu 3.-Sabores Exclusivos
    String[] LoNuevo3 = {"Pizza Mediterránea (Aceitunas, tomate seco y queso feta) ", "Pasta Alfredo con Camarones", "Papas Gajo con Salsa de Pesto"};
    double[] PrecioLoNuevo3 = {45.3, 35.1, 14.5};
    int[] carritomenuLoNuevo3 = new int[3];
    double[] subtotal_LoNuevo3 = {0, 0, 0};
    String[] PideAhora3 = {"Pizza Mediana Napolitana ", "Pizza Individual Hawaiana", "Alitas BBQ (8 unidades)"};
    double[] PrecioPideAhora3 = {48.5, 35.6, 15.2};
    int[] carritomenuPideAhora3 = new int[3];
    double[] subtotal_PideAhora3 = {0, 0, 0};
    String[] MegaPromos3 = {"Super Combo Pizza + Bebidas", "Pack Amistad 2 (Pizza + alitas + papas + 2 gaseosas)", "Brownie con Helado"};
    double[] PrecioMegaPromos3 = {47.6, 38.1, 16.2};
    int[] carritomenuMegaPromos3 = new int[3];
    double[] subtotal_MegaPromos3 = {0, 0, 0};
    String[] ExclusivasWeb3 = {"Pizza de Mariscos", "Lasagna de Espinaca y Ricotta", "Pasta Carbonara Premium"};
    double[] PrecioExclusivasWeb3 = {46.5, 37.2, 15.2};
    int[] carritomenuExclusivasWeb3 = new int[3];
    double[] subtotal_ExclusivasWeb3 = {0, 0, 0};
    String[] ParaMí3 = {"Wrap Mediterráneo", "Ensalada César con Pollo", "Sándwich de Roast Beef y Queso"};
    double[] PrecioParaMí3 = {49.2, 35.1, 16.3};
    int[] carritomenuParamí3 = new int[3];
    double[] subtotal_Paramí3 = {0, 0, 0};
    String[] Antojitos3 = {"Palitos de Queso", "Papas con Cheddar y Tocino", "Mini Pizzas Margarita"};
    double[] PrecioAntojitos3 = {46.3, 35.2, 17.8};
    int[] carritomenuAntojitos3 = new int[3];
    double[] subtotal_Antojitos3 = {0, 0, 0};
    String[] Bebidas3 = {"Malteada de Café", "Frapuccino de Vainilla", "Gaseosa de 500ml"};
    double[] PrecioBebidas3 = {9.9, 14.5, 8.4};
    int[] carritoBebidas3 = new int[3];
    double[] subtotal_Bebidas3 = {0, 0, 0};
    //Menu 4.-Satisfaccion Total
    String[] LoNuevo4 = {"Pizza Ahumada con Tocino ", "Pasta Napolitana con Albóndigas", "Papas Rústicas con Salsa BBQ"};
    double[] PrecioLoNuevo4 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo4 = new int[3];
    double[] subtotal_LoNuevo4 = {0, 0, 0};
    String[] PideAhora4 = {"Pizza Mediana Cuatro Quesos", "Pizza Pepperoni Extra Grande", "Alitas Picantes con Miel"};
    double[] PrecioPideAhora4 = {46.5, 35.1, 14};
    int[] carritomenuPideAhora4 = new int[3];
    double[] subtotal_PideAhora4 = {0, 0, 0};
    String[] MegaPromos4 = {"Dúo Pizza + Bebida", "Pack Mega Pizza + Papas + Bebidas", "Brownie con Helado"};
    double[] PrecioMegaPromos4 = {48.5, 35, 15.6};
    int[] carritomenuMegaPromos4 = new int[3];
    double[] subtotal_MegaPromos4 = {0, 0, 0};
    String[] ExclusivasWeb4 = {"Pizza Trufa y Espárragos", "Lasagna de Carne Premium", "Pasta Alfredo Especial"};
    double[] PrecioExclusivasWeb4 = {46.5, 38, 18.9};
    int[] carritomenuExclusivasWeb4 = new int[3];
    double[] subtotal_ExclusivasWeb4 = {0, 0, 0};
    String[] ParaMí4 = {"Wrap de Pollo BBQ", "Ensalada Mediterránea", "Sándwich de Pollo y Aguacate"};
    double[] PrecioParaMí4 = {48, 15.6, 12.4};
    int[] carritomenuParamí4 = new int[3];
    double[] subtotal_Paramí4 = {0, 0, 0};
    String[] Antojitos4 = {"Nachos con Salsa de Queso", "Mini Pizzas Margarita", "Churros con Chocolate"};
    double[] PrecioAntojitos4 = {45.2, 32.1, 16.7};
    int[] carritomenuAntojitos4 = new int[3];
    double[] subtotal_Antojitos4 = {0, 0, 0};
    String[] Bebidas4 = {"Limonada Refrescante", "Té Helado de Limón", "Jarra de Chicha Morada"};
    double[] PrecioBebidas4 = {5.1, 8.0, 14.8};
    int[] carritoBebidas4 = new int[3];
    double[] subtotal_Bebidas4 = {0, 0, 0};
    //menu 5.- Gourment Express
    String[] LoNuevo5 = {"Pizza Cuatro Carnes ", "Pasta Alfredo con Champiñones", "Papas Rústicas con Salsa Especial"};
    double[] PrecioLoNuevo5 = {44.9, 33.5, 11.4};
    int[] carritomenuLoNuevo5 = new int[3];
    double[] subtotal_LoNuevo5 = {0, 0, 0};
    String[] PideAhora5 = {"Pizza Mediana Margarita", "Pizza Individual de Pollo BBQ", "Alitas BBQ Clásicas"};
    double[] PrecioPideAhora5 = {44.9, 31.6, 31.1};
    int[] carritomenuPideAhora5 = new int[3];
    double[] subtotal_PideAhora5 = {0, 0, 0};
    String[] MegaPromos5 = {"Súper Combo Pizza + Postre", "Pack Amistad 3 (Pizza + alitas + papas + 4 gaseosas)", "Postre Especial del Día"};
    double[] PrecioMegaPromos5 = {46.8, 24.5, 12};
    int[] carritomenuMegaPromos5 = new int[3];
    double[] subtotal_MegaPromos5 = {0, 0, 0};
    String[] ExclusivasWeb5 = {"Pizza Gourmet Espinaca y Ricotta", "Pasta Carbonara Deluxe", "Pizza Premium de Champiñones"};
    double[] PrecioExclusivasWeb5 = {40.6, 32.5, 15.2};
    int[] carritomenuExclusivasWeb5 = new int[3];
    double[] subtotal_ExclusivasWeb5 = {0, 0, 0};
    String[] ParaMí5 = {"Wrap de Pollo Teriyaki", "Ensalada César con Pollo", "Sándwich de Roast Beef"};
    double[] PrecioParaMí5 = {43.5, 38.6, 17.5};
    int[] carritomenuParamí5 = new int[3];
    double[] subtotal_Paramí5 = {0, 0, 0};
    String[] Antojitos5 = {"Papas Gajo con Salsa Especial", "Palitos de Queso Frito", "Churros con Pasta"};
    double[] PrecioAntojitos5 = {47.2, 38.1, 16.4};
    int[] carritomenuAntojitos5 = new int[3];
    double[] subtotal_Antojitos5 = {0, 0, 0};
    String[] Bebidas5 = {"Malteada de Chocolate", "Gaseosa de 500ml", "Jarra de Té Frío"};
    double[] PrecioBebidas5 = {8.3, 4.21, 10.28};
    int[] carritoBebidas5 = new int[3];
    double[] subtotal_Bebidas5 = {0, 0, 0};
    //Menu 6.- Experiencia Completa
    String[] LoNuevo6 = {"Pizza Especial de la Casa ", "Pasta Bolognesa con Queso", "Papas Rústicas con Tocino y Queso"};
    double[] PrecioLoNuevo6 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo6 = new int[3];
    double[] subtotal_LoNuevo6 = {0, 0, 0};
    String[] PideAhora6 = {"Pizza Mediana Napolitana", "Pizza Extra Carne", "Alitas Picantes (8 unidades)"};
    double[] PrecioPideAhora6 = {46.5, 39.2, 16.4};
    int[] carritomenuPideAhora6 = new int[3];
    double[] subtotal_PideAhora6 = {0, 0, 0};
    String[] MegaPromos6 = {"Combo Pizza + Postre + Bebida ", "Pack Dúo Pizza + Bebidas", "Mega Combo Pizza + Alitas"};
    double[] PrecioMegaPromos6 = {49.2, 36.5, 15.0};
    int[] carritomenuMegaPromos6 = new int[3];
    double[] subtotal_MegaPromos6 = {0, 0, 0};
    String[] ExclusivasWeb6 = {"Pizza de Mariscos Premium", "Pasta Napolitana Gourmet", "Pizza Cuatro Quesos Deluxe"};
    double[] PrecioExclusivasWeb6 = {51.2, 38.50, 12.4};
    int[] carritomenuExclusivasWeb6 = new int[3];
    double[] subtotal_ExclusivasWeb6 = {0, 0, 0};
    String[] ParaMí6 = {"Wrap Mediterráneo ", "Ensalada César con Pollo", "Sándwich de Roast Beef y Aguacate"};
    double[] PrecioParaMí6 = {52.4, 38.2, 14.6};
    int[] carritomenuParamí6 = new int[3];
    double[] subtotal_Paramí6 = {0, 0, 0};
    String[] Antojitos6 = {"Papas con Cheddar y Tocino", "Nachos con Salsa Mexicana", "Mini Pizzas Margarita"};
    double[] PrecioAntojitos6 = {48.5, 41.2, 15.2};
    int[] carritomenuAntojitos6 = new int[3];
    double[] subtotal_Antojitos6 = {0, 0, 0};
    String[] Bebidas6 = {"Malteada de Café", "Té Helado de Frutas", "Jarra de Chicha Morada"};
    double[] PrecioBebidas6 = {12.3, 5.2, 8.7};
    int[] carritoBebidas6 = new int[3];
    double[] subtotal_Bebidas6 = {0, 0, 0};

    public void MenuPrincipal(String Ubicaccion) {
        int opcciones;
        int hola;
        switch (Ubicaccion.toUpperCase()) {
            case "SALIDA HUANCANE":
                System.out.println("En Pizza Hut cerca a " + Ubicaccion + " tenemos los siguientes menus: ");
                opcciones = Opcciones();
                switch (opcciones) {
                    case 1:
                        hola = Menus(LoNuevo1, PrecioLoNuevo1);
                        CompraLoNuevo1(hola, LoNuevo1, PrecioLoNuevo1);
                        menusito();
                        break;
                    case 2:
                        hola = Menus(PideAhora1, PrecioPideAhora1);
                        CompraPideAhora1(hola, PideAhora1, PrecioPideAhora1);
                        menusito();
                        break;
                    case 3:
                        hola = Menus(MegaPromos1, PrecioMegaPromos1);
                        CompraMegaPromos1(hola, MegaPromos1, PrecioMegaPromos1);
                        menusito();
                        break;
                    case 4:
                        hola = Menus(ExclusivasWeb1, PrecioExclusivasWeb1);
                        CompraExclusivasWeb1(hola, ExclusivasWeb1, PrecioExclusivasWeb1);
                        menusito();
                        break;
                    case 5:
                        hola = Menus(ParaMí1, PrecioParaMí1);
                        CompraParamí1(hola, ParaMí1, PrecioParaMí1);
                        menusito();
                        break;
                    case 6:
                        hola = Menus(Antojitos1, PrecioAntojitos1);
                        Antojitos1(hola, Antojitos1, PrecioAntojitos1);
                        menusito();
                        break;
                    case 7:
                        hola = Menus(Bebidas1, PrecioBebidas1);
                        CompraBebidas1(hola, Bebidas1, PrecioBebidas1);
                        menusito();
                        break;
                }
                break;
            case "SALIDA CUSCO":
                System.out.println("En Pizza Hut cerca a " + Ubicaccion + " tenemos los siguientes menus: ");
                opcciones = Opcciones();
                switch (opcciones) {
                    case 1:
                        hola = Menus(LoNuevo2, PrecioLoNuevo2);
                        CompraLoNuevo2(hola, LoNuevo2, PrecioLoNuevo2);
                        menusito();
                        break;
                    case 2:
                        hola = Menus(PideAhora2, PrecioPideAhora2);
                        CompraPideAhora2(hola, PideAhora2, PrecioPideAhora2);
                        menusito();
                        break;
                    case 3:
                        hola = Menus(MegaPromos2, PrecioMegaPromos2);
                        CompraMegaPromos2(hola, MegaPromos2, PrecioMegaPromos2);
                        menusito();
                        break;
                    case 4:
                        hola = Menus(ExclusivasWeb2, PrecioExclusivasWeb2);
                        CompraExclusivasWeb2(hola, ExclusivasWeb2, PrecioExclusivasWeb2);
                        menusito();
                        break;
                    case 5:
                        hola = Menus(ParaMí2, PrecioParaMí2);
                        CompraParamí2(hola, ParaMí2, PrecioParaMí2);
                        menusito();
                        break;
                    case 6:
                        hola = Menus(Antojitos2, PrecioAntojitos2);
                        Antojitos2(hola, Antojitos2, PrecioAntojitos2);
                        menusito();
                        break;
                    case 7:
                        hola = Menus(Bebidas2, PrecioBebidas2);
                        CompraBebidas2(hola, Bebidas2, PrecioBebidas2);
                        menusito();
                        break;
                }
                break;
            case "SALIDA PUNO":
                System.out.println("En Pizza Hut cerca a " + Ubicaccion + " tenemos los siguientes menus: ");
                opcciones = Opcciones();
                switch (opcciones) {
                    case 1:
                        hola = Menus(LoNuevo3, PrecioLoNuevo3);
                        CompraLoNuevo3(hola, LoNuevo3, PrecioLoNuevo3);
                        menusito();
                        break;
                    case 2:
                        hola = Menus(PideAhora3, PrecioPideAhora3);
                        CompraPideAhora3(hola, PideAhora3, PrecioPideAhora3);
                        menusito();
                        break;
                    case 3:
                        hola = Menus(MegaPromos3, PrecioMegaPromos3);
                        CompraMegaPromos3(hola, MegaPromos3, PrecioMegaPromos3);
                        menusito();
                        break;
                    case 4:
                        hola = Menus(ExclusivasWeb3, PrecioExclusivasWeb3);
                        CompraExclusivasWeb3(hola, ExclusivasWeb3, PrecioExclusivasWeb3);
                        menusito();
                        break;
                    case 5:
                        hola = Menus(ParaMí3, PrecioParaMí3);
                        CompraParamí3(hola, ParaMí3, PrecioParaMí3);
                        menusito();
                        break;
                    case 6:
                        hola = Menus(Antojitos3, PrecioAntojitos3);
                        Antojitos3(hola, Antojitos3, PrecioAntojitos3);
                        menusito();
                        break;
                    case 7:
                        hola = Menus(Bebidas3, PrecioBebidas3);
                        CompraBebidas3(hola, Bebidas3, PrecioBebidas3);
                        menusito();
                        break;
                }
                break;
            case "SALIDA AREQUIPA":
                System.out.println("En Pizza Hut cerca a " + Ubicaccion + " tenemos los siguientes menus: ");
                opcciones = Opcciones();
                switch (opcciones) {
                    case 1:
                        hola = Menus(LoNuevo4, PrecioLoNuevo4);
                        CompraLoNuevo4(hola, LoNuevo4, PrecioLoNuevo4);
                        menusito();
                        break;
                    case 2:
                        hola = Menus(PideAhora4, PrecioPideAhora4);
                        CompraPideAhora4(hola, PideAhora4, PrecioPideAhora4);
                        menusito();
                        break;
                    case 3:
                        hola = Menus(MegaPromos4, PrecioMegaPromos4);
                        CompraMegaPromos4(hola, MegaPromos4, PrecioMegaPromos4);
                        menusito();
                        break;
                    case 4:
                        hola = Menus(ExclusivasWeb4, PrecioExclusivasWeb4);
                        CompraExclusivasWeb4(hola, ExclusivasWeb4, PrecioExclusivasWeb4);
                        menusito();
                        break;
                    case 5:
                        hola = Menus(ParaMí4, PrecioParaMí4);
                        CompraParamí4(hola, ParaMí4, PrecioParaMí4);
                        menusito();
                        break;
                    case 6:
                        hola = Menus(Antojitos4, PrecioAntojitos4);
                        Antojitos4(hola, Antojitos4, PrecioAntojitos4);
                        menusito();
                        break;
                    case 7:
                        hola = Menus(Bebidas4, PrecioBebidas4);
                        CompraBebidas4(hola, Bebidas4, PrecioBebidas4);
                        menusito();
                        break;
                }
                break;
            case "CENTRO DE JULIACA":
                System.out.println("En Pizza Hut cerca a " + Ubicaccion + " tenemos los siguientes menus: ");
                opcciones = Opcciones();
                switch (opcciones) {
                    case 1:
                        hola = Menus(LoNuevo5, PrecioLoNuevo5);
                        CompraLoNuevo5(hola, LoNuevo5, PrecioLoNuevo5);
                        menusito();
                        break;
                    case 2:
                        hola = Menus(PideAhora5, PrecioPideAhora5);
                        CompraPideAhora5(hola, PideAhora5, PrecioPideAhora5);
                        menusito();
                        break;
                    case 3:
                        hola = Menus(MegaPromos1, PrecioMegaPromos1);
                        CompraMegaPromos5(hola, MegaPromos5, PrecioMegaPromos5);
                        menusito();
                        break;
                    case 4:
                        hola = Menus(ExclusivasWeb5, PrecioExclusivasWeb5);
                        CompraExclusivasWeb5(hola, ExclusivasWeb5, PrecioExclusivasWeb5);
                        menusito();
                        break;
                    case 5:
                        hola = Menus(ParaMí5, PrecioParaMí5);
                        CompraParamí5(hola, ParaMí5, PrecioParaMí5);
                        menusito();
                        break;
                    case 6:
                        hola = Menus(Antojitos5, PrecioAntojitos5);
                        Antojitos5(hola, Antojitos5, PrecioAntojitos5);
                        menusito();
                        break;
                    case 7:
                        hola = Menus(Bebidas5, PrecioBebidas5);
                        CompraBebidas5(hola, Bebidas5, PrecioBebidas5);
                        menusito();
                        break;
                }
                break;
            case "SALIDA LAMPA":
                System.out.println("En Pizza Hut cerca a " + Ubicaccion + " tenemos los siguientes menus: ");
                opcciones = Opcciones();
                switch (opcciones) {
                    case 1:
                        hola = Menus(LoNuevo6, PrecioLoNuevo6);
                        CompraLoNuevo6(hola, LoNuevo6, PrecioLoNuevo6);
                        menusito();
                        break;
                    case 2:
                        hola = Menus(PideAhora6, PrecioPideAhora6);
                        CompraPideAhora6(hola, PideAhora6, PrecioPideAhora6);
                        menusito();
                        break;
                    case 3:
                        hola = Menus(MegaPromos6, PrecioMegaPromos6);
                        CompraMegaPromos6(hola, MegaPromos6, PrecioMegaPromos6);
                        menusito();
                        break;
                    case 4:
                        hola = Menus(ExclusivasWeb6, PrecioExclusivasWeb6);
                        CompraExclusivasWeb6(hola, ExclusivasWeb6, PrecioExclusivasWeb6);
                        menusito();
                        break;
                    case 5:
                        hola = Menus(ParaMí6, PrecioParaMí6);
                        CompraParamí6(hola, ParaMí6, PrecioParaMí6);
                        menusito();
                        break;
                    case 6:
                        hola = Menus(Antojitos6, PrecioAntojitos6);
                        Antojitos6(hola, Antojitos6, PrecioAntojitos6);
                        menusito();
                        break;
                    case 7:
                        hola = Menus(Bebidas6, PrecioBebidas6);
                        CompraBebidas6(hola, Bebidas6, PrecioBebidas6);
                        menusito();
                        break;
                }
                break;
        }
    }

    public int Menus(String[] menu, double[] precio) {
        int opccion;
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Opción " + (i + 1) + " : " + menu[i] + " - Precio: S/." + precio[i]);
        }
        opccion = ValidarEntradaNumerica(1, 3, "Ingrese una opccio del 1-3");
        int opccionSeleccionada = opccion - 1;
        return opccionSeleccionada;
    }

    public int Opcciones() {
        int opccion;
        System.out.println("1.- Lo nuevo");
        System.out.println("2.- Pide ahora");
        System.out.println("3.- Megapromos");
        System.out.println("4.- Exclusivas web");
        System.out.println("5.- Para mí");
        System.out.println("6.- Antojitos");
        System.out.println("7.- Bebidas");
        opccion = ValidarEntradaNumerica(1, 6, "Ingrese un valor del 1 al 6");
        return opccion;
    }

    public void CompraLoNuevo1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo1[opccion] += cantidad;
        subtotal_LoNuevo1[opccion] = carritomenuLoNuevo1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuLoNuevo1[opccion] + " de " + menu[opccion]);
    }

    public void CompraLoNuevo2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo2[opccion] += cantidad;
        subtotal_LoNuevo2[opccion] = carritomenuLoNuevo2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuLoNuevo2[opccion] + " de " + menu[opccion]);
    }

    public void CompraLoNuevo3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo3[opccion] += cantidad;
        subtotal_LoNuevo3[opccion] = carritomenuLoNuevo3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuLoNuevo3[opccion] + " de " + menu[opccion]);
    }

    public void CompraLoNuevo4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo4[opccion] += cantidad;
        subtotal_LoNuevo4[opccion] = carritomenuLoNuevo4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuLoNuevo4[opccion] + " de " + menu[opccion]);
    }

    public void CompraLoNuevo5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo5[opccion] += cantidad;
        subtotal_LoNuevo5[opccion] = carritomenuLoNuevo5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuLoNuevo5[opccion] + " de " + menu[opccion]);
    }

    public void CompraLoNuevo6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo6[opccion] += cantidad;
        subtotal_LoNuevo6[opccion] = carritomenuLoNuevo6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuLoNuevo6[opccion] + " de " + menu[opccion]);
    }

    //PideAhora

    public void CompraPideAhora1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora1[opccion] += cantidad;
        subtotal_PideAhora1[opccion] = carritomenuPideAhora1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuPideAhora1[opccion] + " de " + menu[opccion]);
    }

    public void CompraPideAhora2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora2[opccion] += cantidad;
        subtotal_PideAhora2[opccion] = carritomenuPideAhora2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuPideAhora2[opccion] + " de " + menu[opccion]);
    }

    public void CompraPideAhora3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora3[opccion] += cantidad;
        subtotal_PideAhora3[opccion] = carritomenuPideAhora3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuPideAhora3[opccion] + " de " + menu[opccion]);
    }

    public void CompraPideAhora4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora4[opccion] += cantidad;
        subtotal_PideAhora4[opccion] = carritomenuPideAhora4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuPideAhora4[opccion] + " de " + menu[opccion]);
    }

    public void CompraPideAhora5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora5[opccion] += cantidad;
        subtotal_PideAhora5[opccion] = carritomenuPideAhora5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuPideAhora5[opccion] + " de " + menu[opccion]);
    }

    public void CompraPideAhora6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora6[opccion] += cantidad;
        subtotal_PideAhora6[opccion] = carritomenuPideAhora6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuPideAhora6[opccion] + " de " + menu[opccion]);
    }

    //MegaPrmos

    public void CompraMegaPromos1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos1[opccion] += cantidad;
        subtotal_MegaPromos1[opccion] = carritomenuMegaPromos1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuMegaPromos1[opccion] + " de " + menu[opccion]);
    }

    public void CompraMegaPromos2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos2[opccion] += cantidad;
        subtotal_MegaPromos2[opccion] = carritomenuMegaPromos2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuMegaPromos2[opccion] + " de " + menu[opccion]);
    }

    public void CompraMegaPromos3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos3[opccion] += cantidad;
        subtotal_MegaPromos3[opccion] = carritomenuMegaPromos3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuMegaPromos3[opccion] + " de " + menu[opccion]);
    }

    public void CompraMegaPromos4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos4[opccion] += cantidad;
        subtotal_MegaPromos4[opccion] = carritomenuMegaPromos4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuMegaPromos4[opccion] + " de " + menu[opccion]);
    }

    public void CompraMegaPromos5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos5[opccion] += cantidad;
        subtotal_MegaPromos5[opccion] = carritomenuMegaPromos5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuMegaPromos5[opccion] + " de " + menu[opccion]);

    }

    public void CompraMegaPromos6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos6[opccion] += cantidad;
        subtotal_MegaPromos6[opccion] = carritomenuMegaPromos6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuMegaPromos6[opccion] + " de " + menu[opccion]);

    }

    //ExclusivasWeb

    public void CompraExclusivasWeb1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb1[opccion] += cantidad;
        subtotal_ExclusivasWeb1[opccion] = carritomenuExclusivasWeb1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuExclusivasWeb1[opccion] + " de " + menu[opccion]);

    }

    public void CompraExclusivasWeb2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb2[opccion] += cantidad;
        subtotal_ExclusivasWeb2[opccion] = carritomenuExclusivasWeb2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuExclusivasWeb2[opccion] + " de " + menu[opccion]);
    }

    public void CompraExclusivasWeb3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb3[opccion] += cantidad;
        subtotal_ExclusivasWeb3[opccion] = carritomenuExclusivasWeb3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuExclusivasWeb3[opccion] + " de " + menu[opccion]);
    }

    public void CompraExclusivasWeb4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb4[opccion] += cantidad;
        subtotal_ExclusivasWeb4[opccion] = carritomenuExclusivasWeb4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuExclusivasWeb4[opccion] + " de " + menu[opccion]);
    }

    public void CompraExclusivasWeb5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb5[opccion] += cantidad;
        subtotal_ExclusivasWeb5[opccion] = carritomenuExclusivasWeb5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuExclusivasWeb5[opccion] + " de " + menu[opccion]);
    }

    public void CompraExclusivasWeb6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb6[opccion] += cantidad;
        subtotal_ExclusivasWeb6[opccion] = carritomenuExclusivasWeb6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuExclusivasWeb6[opccion] + " de " + menu[opccion]);
    }

    //Paramí

    public void CompraParamí1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí1[opccion] += cantidad;
        subtotal_Paramí1[opccion] = carritomenuParamí1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuParamí1[opccion] + " de " + menu[opccion]);
    }

    public void CompraParamí2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí2[opccion] += cantidad;
        subtotal_Paramí2[opccion] = carritomenuParamí2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuParamí2[opccion] + " de " + menu[opccion]);
    }

    public void CompraParamí3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí3[opccion] += cantidad;
        subtotal_Paramí3[opccion] = carritomenuParamí3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuParamí3[opccion] + " de " + menu[opccion]);
    }

    public void CompraParamí4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí4[opccion] += cantidad;
        subtotal_Paramí4[opccion] = carritomenuParamí4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuParamí4[opccion] + " de " + menu[opccion]);
    }

    public void CompraParamí5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí5[opccion] += cantidad;
        subtotal_Paramí5[opccion] = carritomenuParamí5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuParamí5[opccion] + " de " + menu[opccion]);
    }

    public void CompraParamí6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí6[opccion] += cantidad;
        subtotal_Paramí6[opccion] = carritomenuParamí6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuParamí6[opccion] + " de " + menu[opccion]);
    }

    //Antojitos

    public void Antojitos1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos1[opccion] += cantidad;
        subtotal_Antojitos1[opccion] = carritomenuAntojitos1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuAntojitos1[opccion] + " de " + menu[opccion]);
    }

    public void Antojitos2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos2[opccion] += cantidad;
        subtotal_Antojitos2[opccion] = carritomenuAntojitos2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuAntojitos2[opccion] + " de " + menu[opccion]);
    }

    public void Antojitos3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos3[opccion] += cantidad;
        subtotal_Antojitos3[opccion] = carritomenuAntojitos3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuAntojitos3[opccion] + " de " + menu[opccion]);
    }

    public void Antojitos4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos4[opccion] += cantidad;
        subtotal_Antojitos4[opccion] = carritomenuAntojitos4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuAntojitos4[opccion] + " de " + menu[opccion]);
    }

    public void Antojitos5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos5[opccion] += cantidad;
        subtotal_Antojitos5[opccion] = carritomenuAntojitos5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuAntojitos5[opccion] + " de " + menu[opccion]);
    }

    public void Antojitos6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos6[opccion] += cantidad;
        subtotal_Antojitos6[opccion] = carritomenuAntojitos6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritomenuAntojitos6[opccion] + " de " + menu[opccion]);
    }

    //Bebidas

    public void CompraBebidas1(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas1[opccion] += cantidad;
        subtotal_Bebidas1[opccion] = carritoBebidas1[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritoBebidas1[opccion] + " de " + menu[opccion]);
    }

    public void CompraBebidas2(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas2[opccion] += cantidad;
        subtotal_Bebidas2[opccion] = carritoBebidas2[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritoBebidas2[opccion] + " de " + menu[opccion]);
    }

    public void CompraBebidas3(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas3[opccion] += cantidad;
        subtotal_Bebidas3[opccion] = carritoBebidas3[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritoBebidas3[opccion] + " de " + menu[opccion]);
    }

    public void CompraBebidas4(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas4[opccion] += cantidad;
        subtotal_Bebidas4[opccion] = carritoBebidas4[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritoBebidas4[opccion] + " de " + menu[opccion]);
    }

    public void CompraBebidas5(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas5[opccion] += cantidad;
        subtotal_Bebidas5[opccion] = carritoBebidas5[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritoBebidas5[opccion] + " de " + menu[opccion]);
    }

    public void CompraBebidas6(int opccion, String[] menu, double[] precio) {
        int cantidad;
        System.out.println("Cuantas comidas comprara de " + menu[opccion] + "?.  Ingrese la cantidad");
        cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas6[opccion] += cantidad;
        subtotal_Bebidas6[opccion] = carritoBebidas6[opccion] * precio[opccion];
        double totalProducto = cantidad * precio[opccion];
        String nombreProducto = cantidad + "x " + menu[opccion];
        seleccionarProducto(nombreProducto, totalProducto);
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao" + carritoBebidas6[opccion] + " de " + menu[opccion]);
    }

    public void menusito() {
        int opccion;
        System.out.println("Que desea hacer ahora??");
        System.out.println("1.- Elegir otra pizza cerca de mi ubicaccion");
        System.out.println("2.- Pagar");
        System.out.println("3.- Seleccionar otra ubicación");
        opccion = ValidarEntradaNumerica(1, 3, "Ingrese una opccion del 1-3");
        switch (opccion) {
            case 1:
                MenuPrincipal(Ubic);
                break;
            case 2:
                boletaVenta();
                break;
            case 3:
                mostrarMenu();
                break;
        }
    }

    public void sistema() {
        MenuPrincipal(Ubic);
    }

//

    String emailGuardado, contraseñaGuardada;

    // restringe que tenga  letras . o - luego @ luego letras luego el ".com"
    private boolean validarCorreo(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.com$";
        return Pattern.compile(regex).matcher(email).matches();
    }
    // REsTRINGE LOS DIJITOS DE LA A-Z
    private boolean validarPassword(String password) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@&%$#!?*])[A-Za-z\\d@&%$#!?*]{8,}$";
        return Pattern.compile(regex).matcher(password).matches();
    }


    // Expresiones regulares para validar solo números con la cantidad exacta de dígitos.
    public static boolean esTarjetaValida(String tarjeta) {
        boolean esValida = tarjeta != null && tarjeta.matches("^[0-9]{16}$");
        return esValida;
    }
    public static boolean esCVVValido(String cvv) {
        boolean esValido = cvv != null && cvv.matches("^[0-9]{3}$");
        return esValido;
    }


    public void registrarCuenta() {
        String email, contraseña;
        System.out.println("Ingrese su nombre");
        name = sc.nextLine();
        System.out.println("ingrese su DNI");
        DNI = sc.nextLine();
        do {
            System.out.println("Ingrese su correo electrónico:");
            email = entrada.nextLine();
            if (!validarCorreo(email)) {
                System.out.println("El correo ingresado no es válido. Debe contener '@' y terminar en .com");
            }
        } while (!validarCorreo(email));
        do {
            System.out.println("Ingrese su contraseña (mínimo 8 caracteres, letras, números y caracteres especiales):");
            contraseña = entrada.nextLine();
            if (!validarPassword(contraseña)) {
                System.out.println("La contraseña no cumple con los requisitos.");
            }
        } while (!validarPassword(contraseña));
        System.out.println("Gracias por registrarse. Ahora puede iniciar sesión.");
        emailGuardado = email;
        contraseñaGuardada = contraseña;
    }

    public boolean iniciarSesion() {
        String email, contraseña;
        int intentos = 4;
        while (intentos > 0) {
            System.out.println("\n--- INICIO DE SESIÓN ---");
            System.out.println("Ingrese su correo electrónico:");
            email = entrada.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña = entrada.nextLine();
            if (email.equals(emailGuardado) && contraseña.equals(contraseñaGuardada)) {
                System.out.println("Inicio de sesión correcto. ¡Bienvenido a Pizza Hut! " + name);
                return true;
            } else {
                intentos--;
                System.out.println("Inicio de sesión fallido. Le quedan " + intentos + " intentos.");
            }
        }
        System.out.println("No se pudo acceder al sistema.");
        return false;
    }

    public double vago() {
        double depocito = ValidarEntradaNumerica2(0, "Depocite el monto:");
        return pago(depocito);
    }

    public void boletaVenta() {
        double IGV, subTotal, depocito, pago, vuelto, total;
        cargoEntrega();
        total = TOTAL;
        IGV = TOTAL * 0.18;
        subTotal = TOTAL - IGV;
        System.out.println("Monto a depocitar: s/." + total);
        vago();
        if (TOTAL > 0) {
            System.out.println("Monto insuficiente");
            vago();
        }
        vuelto = Math.abs(TOTAL);
        System.out.println("-Boleta de venta-");
        System.out.println("Usuario: " + name);
        System.out.println("Producto: " + ProductoSelec);
        System.out.println("Total a pagar: s/." + total);
        System.out.println("Subtotal: s/." + subTotal);
        System.out.println("IGV: s/." + IGV);
        System.out.println("Cargo de delivery: s/." + Cargo);
        System.out.println("Vuelto: " + vuelto);
    }

    public double pago(double dep) {
        TOTAL = TOTAL - dep;
        if (TOTAL == 0) {
            return 0;
        } else if (TOTAL > 0) {
            return TOTAL;
        } else {
            return TOTAL;
        }
    }

//

    String[] nombres = new String[100];
    String[] dnis = new String[100];
    String[] descripciones = new String[100];
    String[] fechas = new String[100];

    int contador = 0;
    Scanner scanner = new Scanner(System.in);
    int opcion;

    public int Reclamaciones() {
            opcion = ValidarEntradaNumerica(1, 3, "\n=== Libro de Reclamaciones ===\n1. Registrar Reclamo\n2. Listar Reclamos \n3. Salir \nSeleccione una opción: ");
            return opcion;
    }

    private void reclamosRegis(int contador) {
        if (contador == 0) {
            System.out.println("No hay reclamos registrados.");
        } else {
            System.out.println("\n=== Lista de Reclamos ===");
            for (int i = 0; i < contador; i++) {
                System.out.println("📌 Reclamo " + (i + 1));
                System.out.println("Cliente: " + nombres[i]);
                System.out.println("DNI: " + dnis[i]);
                System.out.println("Descripción: " + descripciones[i]);
                System.out.println("Fecha: " + fechas[i]);
                System.out.println("----------------------------");
            }
        }
    }

    public void registrarRecl(int opcion) {
        opcion = Reclamaciones();
        switch (opcion) {
            case 1:
                if (contador < 100) {
                    System.out.print("Nombre del Cliente: ");
                    nombres[contador] = scanner.nextLine();

                    System.out.print("DNI: ");
                    dnis[contador] = scanner.nextLine();

                    System.out.print("Descripción del Reclamo: ");
                    descripciones[contador] = scanner.nextLine();

                    System.out.print("Fecha (dd/mm/aaaa): ");
                    fechas[contador] = scanner.nextLine();

                    contador++;
                    Contador = contador;
                    System.out.println("Reclamo registrado con éxito.");
                } else {
                    System.out.println("No se pueden registrar más reclamos. Límite alcanzado.");
                }
                break;

            case 2:
                reclamosRegis(contador);
                break;

            case 3:
                System.out.println("Saliendo del libro de reclamaciones...");
                menu();
                break;

            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }

    }

    private void login() {
        System.out.println("--BIENVENIDO A PIZZA HUT--");
        System.out.println("Número de ayuda: tel:(01)505-1111");
        System.out.println("Iniciando registro...");
        registrarCuenta();
        System.out.println("Iniciando sesión...");
        iniciarSesion();
    }


    public void menu() {
        int opcion;
        opcion = ValidarEntradaNumerica(1, 2, "(1)-Pedir pizza y más\n(2)-Perfil\nSeleccionar una opción:");
        switch (opcion) {
            case 1:
                mostrarMenu();
                break;
            case 2:
                System.out.println("Usuario: " + name);
                System.out.println("Reclamaciones: ");
                reclamosRegis(Contador);
                menu();
                break;
        }

        System.out.println("¿Tiene algún reclamo o sugerencia? SI/NO");
        switch (sc.nextLine().toUpperCase()) {
            case "SI":
                registrarRecl(1);
                registrarRecl(2);
                break;
            case "NO":
                sc.close();
                break;
            default:
        }
    }
    //carritomenuLonuevo
    //carritomenuPideAhora1
    //carritomenuMegaPromos1
    //carritomenuExclusivasWeb1
    //carritomenuParamí1
    //carritomenuAntojitos1
    //carritoBebidas1
    public void detalleDeCompra(int[] carritomenuLoNuevo1, int[] carritomenuLoNuevo2, int[] carritomenuLoNuevo3, int[] carritomenuLoNuevo4, int[] carritomenuLoNuevo5, int[] carritomenuLoNuevo6
            , int[] carritomenuPideAhora1, int[] carritomenuPideAhora2, int[] carritomenuPideAhora3, int[] carritomenuPideAhora4, int[] carritomenuPideAhora5, int[] carritomenuPideAhora6
            , int[] carritomenuMegaPromos1, int[] carritomenuMegaPromos2, int[] carritomenuMegaPromos3, int[] carritomenuMegaPromos4, int[] carritomenuMegaPromos5, int[] carritomenuMegaPromos6
            , int[] carritomenuExclusivasWeb1, int[] carritomenuExclusivasWeb2, int[] carritomenuExclusivasWeb3, int[] carritomenuExclusivasWeb4, int[] carritomenuExclusivasWeb5, int[] carritomenuExclusivasWeb6
            , int[] carritomenuParamí1, int[] carritomenuParamí2, int[] carritomenuParamí3, int[] carritomenuParamí4, int[] carritomenuParamí5, int[] carritomenuParamí6
            , int[] carritomenuAntojitos1, int[] carritomenuAntojitos2, int[] carritomenuAntojitos3, int[] carritomenuAntojitos4, int[] carritomenuAntojitos5, int[] carritomenuAntojitos6
            , int[] carritoBebidas1, int[] carritoBebidas2, int[] carritoBebidas3, int[] carritoBebidas4, int[] carritoBebidas5, int[] carritoBebidas6
            ,   double[] LoNuevo_1,double []LoNuevo_2,double []LoNuevo_3,double []LoNuevo_4,double []LoNuevo_5,double []LoNuevo_6
            ,   double[] PideAhora_1,double[] PideAhora_2,double[] PideAhora_3,double[] PideAhora_4,double[] PideAhora_5,double[] PideAhora_6
            ,   double[] MegaPromos_1,double[] MegaPromos_2,double[] MegaPromos_3,double[] MegaPromos_4,double[] MegaPromos_5,double[] MegaPromos_6
            ,   double[] ExclusivasWeb_1,double[] ExcluivasWeb_2,double[] ExclusivasWeb_3,double[] ExclusivasWeb_4,double[] ExclusivasWeb_5,double[] ExclusivasWeb_6
            ,   double[] ParaMí_1,double[] ParaMí_2,double[] ParaMí_3,double[] ParaMí_4,double[] ParaMí_5,double[] ParaMí_6
            ,   double[] Antojitos_1,double[] Antojitos_2,double[] Antojitos_3,double[] Antojitos_4,double[] Antojitos_5,double[] Antojitos_6
            ,   double[] Bebidas_1,double[] Bebidas_2,double[] Bebidas_3,double[] Bebidas_4,double[] Bebidas_5,double[] Bebidas_6
    ) {


        double subtotalLonuevo1 = Arrays.stream(LoNuevo_1).sum(), subtotalLonuevo2 = Arrays.stream(LoNuevo_2).sum(), subtotalLonuevo3 = Arrays.stream(LoNuevo_3).sum(), subtotalLonuevo4 = Arrays.stream(LoNuevo_4).sum(), subtotalLonuevo5 = Arrays.stream(LoNuevo_5).sum(), subtotalLonuevo6 = Arrays.stream(LoNuevo_6).sum(),
                subtotalPideAhora1 = Arrays.stream(PideAhora_1).sum(), subtotalPideAhora2 = Arrays.stream(PideAhora_2).sum(), subtotalPideAhora3 = Arrays.stream(PideAhora_3).sum(), subtotalPideAhora4 = Arrays.stream(PideAhora_4).sum(), subtotalPideAhora5 = Arrays.stream(PideAhora_5).sum(), subtotalPideAhora6 = Arrays.stream(PideAhora_6).sum()
                , subtotalMegaPromos1 = Arrays.stream(MegaPromos_1).sum(), subtotalMegaPromos2 = Arrays.stream(MegaPromos_2).sum(), subtotalMegaPromos3 = Arrays.stream(MegaPromos_3).sum(), subtotalMegaPromos4 = Arrays.stream(MegaPromos_4).sum(), subtotalMegaPromos5 = Arrays.stream(MegaPromos_5).sum(), subtotalMegaPromos6 = Arrays.stream(MegaPromos_6).sum()
                , subtotalExclusivasWeb1 = Arrays.stream(ExclusivasWeb_1).sum(), subtotalExclusivasWeb2 = Arrays.stream(ExcluivasWeb_2).sum(), subtotalExclusivasWeb3 = Arrays.stream(ExclusivasWeb_3).sum(), subtotalExclusivasWeb4 = Arrays.stream(ExclusivasWeb_4).sum(), subtotalExclusivasWeb5 = Arrays.stream(ExclusivasWeb_5).sum(), subtotalExclusivasWeb6 = Arrays.stream(ExclusivasWeb_6).sum()
                , subtotalParaMí1 = Arrays.stream(ParaMí_1).sum(), subtotalParaMí2 = Arrays.stream(ParaMí_2).sum(), subtotalParaMí3 = Arrays.stream(ParaMí_3).sum(), subtotalParaMí4 = Arrays.stream(ParaMí_4).sum(), subtotalParaMí5 = Arrays.stream(ParaMí_5).sum(), subtotalParaMí6 = Arrays.stream(ParaMí_6).sum()
                , subtotalAntojitos1 = Arrays.stream(Antojitos_1).sum(), subtotalAntojitos2 = Arrays.stream(Antojitos_2).sum(), subtotalAntojitos3 = Arrays.stream(Antojitos_3).sum(), subtotalAntojitos4 = Arrays.stream(Antojitos_4).sum(), subtotalAntojitos5 = Arrays.stream(Antojitos_5).sum(), subtotalAntojitos6 = Arrays.stream(Antojitos_6).sum()
                , subtotalBebidas1 = Arrays.stream(Bebidas_1).sum(), subtotalBebidas2 = Arrays.stream(Bebidas_2).sum(), subtotalBebidas3 = Arrays.stream(Bebidas_3).sum(), subtotalBebidas4 = Arrays.stream(Bebidas_4).sum(), subtotalBebidas5 = Arrays.stream(Bebidas_5).sum(), subtotalBebidas6 = Arrays.stream(Bebidas_6).sum();

        System.out.println("\n----DETALLED E SU COMPRA----");



        for (int i = 0; i < carritomenuLoNuevo1.length; i++) {
            if (carritomenuLoNuevo1[i] > 0) {
                double precioUnitario = PrecioLoNuevo1[i];
                double subtotalProductoExtra = carritomenuLoNuevo1[i] * precioUnitario;
                subtotalLonuevo1 += subtotalProductoExtra;
                System.out.println(LoNuevo1[i] + ": " + carritomenuLoNuevo1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuLoNuevo2.length; i++) {
            if (carritomenuLoNuevo2[i] > 0) {
                double precioUnitario = PrecioLoNuevo2[i];
                double subtotalProductoExtra = carritomenuLoNuevo2[i] * precioUnitario;
                subtotalLonuevo2 += subtotalProductoExtra;
                System.out.println(LoNuevo2[i] + ": " + carritomenuLoNuevo2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuLoNuevo3.length; i++) {
            if (carritomenuLoNuevo3[i] > 0) {
                double precioUnitario = PrecioLoNuevo3[i];
                double subtotalProductoExtra = carritomenuLoNuevo3[i] * precioUnitario;
                subtotalLonuevo3 += subtotalProductoExtra;
                System.out.println(LoNuevo3[i] + ": " + carritomenuLoNuevo3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuLoNuevo4.length; i++) {
            if (carritomenuLoNuevo4[i] > 0) {
                double precioUnitario = PrecioLoNuevo4[i];
                double subtotalProductoExtra = carritomenuLoNuevo4[i] * precioUnitario;
                subtotalLonuevo4 += subtotalProductoExtra;
                System.out.println(LoNuevo4[i] + ": " + carritomenuLoNuevo4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuLoNuevo5.length; i++) {
            if (carritomenuLoNuevo5[i] > 0) {
                double precioUnitario = PrecioLoNuevo5[i];
                double subtotalProductoExtra = carritomenuLoNuevo5[i] * precioUnitario;
                subtotalLonuevo5 += subtotalProductoExtra;
                System.out.println(LoNuevo5[i] + ": " + carritomenuLoNuevo5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuLoNuevo6.length; i++) {
            if (carritomenuLoNuevo6[i] > 0) {
                double precioUnitario = PrecioLoNuevo6[i];
                double subtotalProductoExtra = carritomenuLoNuevo6[i] * precioUnitario;
                subtotalLonuevo6 += subtotalProductoExtra;
                System.out.println(LoNuevo6[i] + ": " + carritomenuLoNuevo6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora1.length; i++) {
            if (carritomenuPideAhora1[i] > 0) {
                double precioUnitario = PrecioPideAhora1[i];
                double subtotalProductoExtra = carritomenuPideAhora1[i] * precioUnitario;
                subtotalPideAhora1 += subtotalProductoExtra;
                System.out.println(PideAhora1[i] + ": " + carritomenuPideAhora1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora2.length; i++) {
            if (carritomenuPideAhora2[i] > 0) {
                double precioUnitario = PrecioPideAhora2[i];
                double subtotalProductoExtra = carritomenuPideAhora2[i] * precioUnitario;
                subtotalPideAhora2 += subtotalProductoExtra;
                System.out.println(PideAhora2[i] + ": " + carritomenuPideAhora2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora3.length; i++) {
            if (carritomenuPideAhora3[i] > 0) {
                double precioUnitario = PrecioPideAhora3[i];
                double subtotalProductoExtra = carritomenuPideAhora3[i] * precioUnitario;
                subtotalPideAhora3 += subtotalProductoExtra;
                System.out.println(PideAhora3[i] + ": " + carritomenuPideAhora3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora4.length; i++) {
            if (carritomenuPideAhora4[i] > 0) {
                double precioUnitario = PrecioPideAhora4[i];
                double subtotalProductoExtra = carritomenuPideAhora4[i] * precioUnitario;
                subtotalPideAhora4 += subtotalProductoExtra;
                System.out.println(PideAhora4[i] + ": " + carritomenuPideAhora4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora5.length; i++) {
            if (carritomenuPideAhora5[i] > 0) {
                double precioUnitario = PrecioPideAhora5[i];
                double subtotalProductoExtra = carritomenuPideAhora5[i] * precioUnitario;
                subtotalPideAhora5 += subtotalProductoExtra;
                System.out.println(PideAhora5[i] + ": " + carritomenuPideAhora5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora6.length; i++) {
            if (carritomenuPideAhora6[i] > 0) {
                double precioUnitario = PrecioPideAhora6[i];
                double subtotalProductoExtra = carritomenuPideAhora6[i] * precioUnitario;
                subtotalPideAhora6 += subtotalProductoExtra;
                System.out.println(PideAhora6[i] + ": " + carritomenuPideAhora6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuPideAhora2.length; i++) {
            if (carritomenuPideAhora2[i] > 0) {
                double precioUnitario = PrecioPideAhora2[i];
                double subtotalProductoExtra = carritomenuPideAhora2[i] * precioUnitario;
                subtotalPideAhora2 += subtotalProductoExtra;
                System.out.println(PideAhora2[i] + ": " + carritomenuPideAhora2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuMegaPromos1.length; i++) {
            if (carritomenuMegaPromos1[i] > 0) {
                double precioUnitario = PrecioMegaPromos1[i];
                double subtotalProductoExtra = carritomenuMegaPromos1[i] * precioUnitario;
                subtotalMegaPromos1 += subtotalProductoExtra;
                System.out.println(MegaPromos1[i] + ": " + carritomenuMegaPromos1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuMegaPromos2.length; i++) {
            if (carritomenuMegaPromos2[i] > 0) {
                double precioUnitario = PrecioMegaPromos2[i];
                double subtotalProductoExtra = carritomenuMegaPromos2[i] * precioUnitario;
                subtotalMegaPromos2 += subtotalProductoExtra;
                System.out.println(MegaPromos2[i] + ": " + carritomenuMegaPromos2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuMegaPromos3.length; i++) {
            if (carritomenuMegaPromos3[i] > 0) {
                double precioUnitario = PrecioMegaPromos3[i];
                double subtotalProductoExtra = carritomenuMegaPromos3[i] * precioUnitario;
                subtotalMegaPromos3 += subtotalProductoExtra;
                System.out.println(MegaPromos3[i] + ": " + carritomenuMegaPromos3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuMegaPromos4.length; i++) {
            if (carritomenuMegaPromos4[i] > 0) {
                double precioUnitario = PrecioMegaPromos4[i];
                double subtotalProductoExtra = carritomenuMegaPromos4[i] * precioUnitario;
                subtotalMegaPromos4 += subtotalProductoExtra;
                System.out.println(MegaPromos4[i] + ": " + carritomenuMegaPromos4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuMegaPromos5.length; i++) {
            if (carritomenuMegaPromos5[i] > 0) {
                double precioUnitario = PrecioMegaPromos5[i];
                double subtotalProductoExtra = carritomenuMegaPromos5[i] * precioUnitario;
                subtotalMegaPromos5 += subtotalProductoExtra;
                System.out.println(MegaPromos5[i] + ": " + carritomenuMegaPromos5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuMegaPromos6.length; i++) {
            if (carritomenuMegaPromos6[i] > 0) {
                double precioUnitario = PrecioMegaPromos6[i];
                double subtotalProductoExtra = carritomenuMegaPromos6[i] * precioUnitario;
                subtotalMegaPromos6 += subtotalProductoExtra;
                System.out.println(MegaPromos6[i] + ": " + carritomenuMegaPromos6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuExclusivasWeb1.length; i++) {
            if (carritomenuExclusivasWeb1[i] > 0) {
                double precioUnitario = PrecioExclusivasWeb1[i];
                double subtotalProductoExtra = carritomenuExclusivasWeb1[i] * precioUnitario;
                subtotalExclusivasWeb1 += subtotalProductoExtra;
                System.out.println(ExclusivasWeb1[i] + ": " + carritomenuExclusivasWeb1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuExclusivasWeb2.length; i++) {
            if (carritomenuExclusivasWeb2[i] > 0) {
                double precioUnitario = PrecioExclusivasWeb2[i];
                double subtotalProductoExtra = carritomenuExclusivasWeb2[i] * precioUnitario;
                subtotalExclusivasWeb2 += subtotalProductoExtra;
                System.out.println(ExclusivasWeb2[i] + ": " + carritomenuExclusivasWeb2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuExclusivasWeb3.length; i++) {
            if (carritomenuExclusivasWeb3[i] > 0) {
                double precioUnitario = PrecioExclusivasWeb3[i];
                double subtotalProductoExtra = carritomenuExclusivasWeb3[i] * precioUnitario;
                subtotalExclusivasWeb3 += subtotalProductoExtra;
                System.out.println(ExclusivasWeb3[i] + ": " + carritomenuExclusivasWeb3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuExclusivasWeb4.length; i++) {
            if (carritomenuExclusivasWeb4[i] > 0) {
                double precioUnitario = PrecioExclusivasWeb4[i];
                double subtotalProductoExtra = carritomenuExclusivasWeb4[i] * precioUnitario;
                subtotalExclusivasWeb4 += subtotalProductoExtra;
                System.out.println(ExclusivasWeb4[i] + ": " + carritomenuExclusivasWeb4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuExclusivasWeb5.length; i++) {
            if (carritomenuExclusivasWeb5[i] > 0) {
                double precioUnitario = PrecioExclusivasWeb5[i];
                double subtotalProductoExtra = carritomenuExclusivasWeb5[i] * precioUnitario;
                subtotalExclusivasWeb5 += subtotalProductoExtra;
                System.out.println(ExclusivasWeb5[i] + ": " + carritomenuExclusivasWeb5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuExclusivasWeb6.length; i++) {
            if (carritomenuExclusivasWeb6[i] > 0) {
                double precioUnitario = PrecioExclusivasWeb6[i];
                double subtotalProductoExtra = carritomenuExclusivasWeb6[i] * precioUnitario;
                subtotalExclusivasWeb6 += subtotalProductoExtra;
                System.out.println(ExclusivasWeb6[i] + ": " + carritomenuExclusivasWeb6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuParamí1.length; i++) {
            if (carritomenuParamí1[i] > 0) {
                double precioUnitario = PrecioParaMí1[i];
                double subtotalProductoExtra = carritomenuParamí1[i] * precioUnitario;
                subtotalParaMí1 += subtotalProductoExtra;
                System.out.println(ParaMí1[i] + ": " + carritomenuParamí1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuParamí2.length; i++) {
            if (carritomenuParamí2[i] > 0) {
                double precioUnitario = PrecioParaMí2[i];
                double subtotalProductoExtra = carritomenuParamí2[i] * precioUnitario;
                subtotalParaMí2 += subtotalProductoExtra;
                System.out.println(ParaMí2[i] + ": " + carritomenuParamí2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuParamí3.length; i++) {
            if (carritomenuParamí3[i] > 0) {
                double precioUnitario = PrecioParaMí3[i];
                double subtotalProductoExtra = carritomenuParamí3[i] * precioUnitario;
                subtotalParaMí3 += subtotalProductoExtra;
                System.out.println(ParaMí3[i] + ": " + carritomenuParamí3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuParamí4.length; i++) {
            if (carritomenuParamí4[i] > 0) {
                double precioUnitario = PrecioParaMí4[i];
                double subtotalProductoExtra = carritomenuParamí4[i] * precioUnitario;
                subtotalParaMí4 += subtotalProductoExtra;
                System.out.println(ParaMí4[i] + ": " + carritomenuParamí4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuParamí5.length; i++) {
            if (carritomenuParamí5[i] > 0) {
                double precioUnitario = PrecioParaMí5[i];
                double subtotalProductoExtra = carritomenuParamí5[i] * precioUnitario;
                subtotalParaMí5 += subtotalProductoExtra;
                System.out.println(ParaMí5[i] + ": " + carritomenuParamí5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuParamí6.length; i++) {
            if (carritomenuParamí6[i] > 0) {
                double precioUnitario = PrecioParaMí6[i];
                double subtotalProductoExtra = carritomenuParamí6[i] * precioUnitario;
                subtotalParaMí6 += subtotalProductoExtra;
                System.out.println(ParaMí6[i] + ": " + carritomenuParamí6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuAntojitos1.length; i++) {
            if (carritomenuAntojitos1[i] > 0) {
                double precioUnitario = PrecioAntojitos1[i];
                double subtotalProductoExtra = carritomenuAntojitos1[i] * precioUnitario;
                subtotalAntojitos1 += subtotalProductoExtra;
                System.out.println(Antojitos1[i] + ": " + carritomenuAntojitos1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuAntojitos2.length; i++) {
            if (carritomenuAntojitos2[i] > 0) {
                double precioUnitario = PrecioAntojitos2[i];
                double subtotalProductoExtra = carritomenuAntojitos2[i] * precioUnitario;
                subtotalAntojitos2 += subtotalProductoExtra;
                System.out.println(Antojitos2[i] + ": " + carritomenuAntojitos2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuAntojitos3.length; i++) {
            if (carritomenuAntojitos3[i] > 0) {
                double precioUnitario = PrecioAntojitos3[i];
                double subtotalProductoExtra = carritomenuAntojitos3[i] * precioUnitario;
                subtotalAntojitos3 += subtotalProductoExtra;
                System.out.println(Antojitos3[i] + ": " + carritomenuAntojitos3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuAntojitos4.length; i++) {
            if (carritomenuAntojitos4[i] > 0) {
                double precioUnitario = PrecioAntojitos4[i];
                double subtotalProductoExtra = carritomenuAntojitos4[i] * precioUnitario;
                subtotalAntojitos4 += subtotalProductoExtra;
                System.out.println(Antojitos4[i] + ": " + carritomenuAntojitos4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuAntojitos5.length; i++) {
            if (carritomenuAntojitos5[i] > 0) {
                double precioUnitario = PrecioAntojitos5[i];
                double subtotalProductoExtra = carritomenuAntojitos5[i] * precioUnitario;
                subtotalAntojitos5 += subtotalProductoExtra;
                System.out.println(Antojitos5[i] + ": " + carritomenuAntojitos5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritomenuAntojitos6.length; i++) {
            if (carritomenuAntojitos6[i] > 0) {
                double precioUnitario = PrecioAntojitos6[i];
                double subtotalProductoExtra = carritomenuAntojitos6[i] * precioUnitario;
                subtotalAntojitos6 += subtotalProductoExtra;
                System.out.println(Antojitos6[i] + ": " + carritomenuAntojitos6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritoBebidas1.length; i++) {
            if (carritoBebidas1[i] > 0) {
                double precioUnitario = PrecioBebidas1[i];
                double subtotalProductoExtra = carritoBebidas1[i] * precioUnitario;
                subtotalBebidas1 += subtotalProductoExtra;
                System.out.println(Bebidas1[i] + ": " + carritoBebidas1[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritoBebidas2.length; i++) {
            if (carritoBebidas2[i] > 0) {
                double precioUnitario = PrecioBebidas2[i];
                double subtotalProductoExtra = carritoBebidas2[i] * precioUnitario;
                subtotalBebidas2 += subtotalProductoExtra;
                System.out.println(Bebidas2[i] + ": " + carritoBebidas2[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritoBebidas3.length; i++) {
            if (carritoBebidas3[i] > 0) {
                double precioUnitario = PrecioBebidas3[i];
                double subtotalProductoExtra = carritoBebidas3[i] * precioUnitario;
                subtotalBebidas3 += subtotalProductoExtra;
                System.out.println(Bebidas3[i] + ": " + carritoBebidas3[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritoBebidas4.length; i++) {
            if (carritoBebidas4[i] > 0) {
                double precioUnitario = PrecioBebidas4[i];
                double subtotalProductoExtra = carritoBebidas4[i] * precioUnitario;
                subtotalBebidas4 += subtotalProductoExtra;
                System.out.println(Bebidas4[i] + ": " + carritoBebidas4[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritoBebidas5.length; i++) {
            if (carritoBebidas5[i] > 0) {
                double precioUnitario = PrecioBebidas5[i];
                double subtotalProductoExtra = carritoBebidas5[i] * precioUnitario;
                subtotalBebidas5 += subtotalProductoExtra;
                System.out.println(Bebidas1[i] + ": " + carritoBebidas5[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        for (int i = 0; i < carritoBebidas6.length; i++) {
            if (carritoBebidas6[i] > 0) {
                double precioUnitario = PrecioBebidas6[i];
                double subtotalProductoExtra = carritoBebidas6[i] * precioUnitario;
                subtotalBebidas6 += subtotalProductoExtra;
                System.out.println(Bebidas6[i] + ": " + carritoBebidas6[i] + " x S/." + String.format("%.2f", precioUnitario) + " = S/." + String.format("%.2f", subtotalProductoExtra));
            }
        }

        double subtotalgeneral=subtotalLonuevo1+subtotalLonuevo2+subtotalLonuevo3+subtotalLonuevo4+subtotalLonuevo5+subtotalLonuevo6
                +subtotalPideAhora1+subtotalPideAhora2+subtotalPideAhora3+subtotalPideAhora4+subtotalPideAhora5+subtotalPideAhora6
                +subtotalMegaPromos1+subtotalMegaPromos2+subtotalMegaPromos3+subtotalMegaPromos4+subtotalMegaPromos5+subtotalMegaPromos6
                +subtotalExclusivasWeb1+subtotalExclusivasWeb2+subtotalExclusivasWeb3+subtotalExclusivasWeb4+subtotalExclusivasWeb5+subtotalExclusivasWeb6
                +subtotalParaMí1+subtotalParaMí2+subtotalParaMí3+subtotalParaMí4+subtotalParaMí5+subtotalParaMí6
                +subtotalAntojitos1+subtotalAntojitos2+subtotalAntojitos3+subtotalAntojitos4+subtotalAntojitos5+subtotalAntojitos6
                +subtotalBebidas1+subtotalBebidas2+subtotalBebidas3+subtotalBebidas4+subtotalBebidas5+subtotalBebidas6;
        double IGv=subtotalgeneral*tasaIgv;
        double totalPagar = subtotalgeneral + IGv;


        double montoPagado;
        do {
            System.out.println("\nTOTAL A PAGAR: S/." + String.format("%.2f", totalPagar));
            System.out.println("Ingrese el monto con el que va a pagar (debe ser mayor o igual a S/." + String.format("%.2f", totalPagar) + "): S/.");
            montoPagado = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            if (montoPagado < totalPagar) {
                System.out.println("¡Error! El monto ingresado es insuficiente. Por favor, intente de nuevo.");
            } else if (montoPagado < 0) {
                System.out.println("¡Error! El monto de pago no puede ser negativo. Por favor, intente de nuevo.");
            }
        } while (montoPagado < totalPagar);

        // Generamos la boleta de venta solo si el pago es suficiente
        System.out.println("\n----BOLETA DE VENTA---------");

        System.out.println("SUBTOTAL: S/." + String.format("%.2f", subtotalgeneral));
        System.out.println("IGV (" + (tasaIgv * 100) + "%): S/." + String.format("%.2f", IGv));
        System.out.println("TOTAL A PAGAR: S/." + String.format("%.2f", totalPagar));
        System.out.println("MONTO PAGADO: S/." + String.format("%.2f", montoPagado));

        double vuelto = montoPagado - totalPagar;
        System.out.println("VUELTO: S/." + String.format("%.2f", vuelto));

    }
    public void MetododDePago(){
        int opccion;
        String tarjeta,cvv;
        double efectivo;
        System.out.println("Elige el metodo de pago efectivo  o tarjeta");
        System.out.println("1.- Efectivo");
        System.out.println("2.- Tarjeta");
        opccion=ValidarEntradaNumerica(1,2,"Ingresse un valor del al 1-2");
        switch (opccion){
            case 1:
                System.out.println("Ingrese el numero de tarjeta");
                tarjeta=entrada.nextLine();
                esTarjetaValida(tarjeta);
                System.out.println("ingrese su CVV");
                cvv=entrada.nextLine();
                esCVVValido(cvv);

                detalleDeCompra(carritomenuLoNuevo1,carritomenuLoNuevo2,carritomenuLoNuevo3,carritomenuLoNuevo4,carritomenuLoNuevo5,carritomenuLoNuevo6
                        ,carritomenuPideAhora1,carritomenuPideAhora2,carritomenuPideAhora3,carritomenuPideAhora4,carritomenuPideAhora5,carritomenuPideAhora6
                        ,carritomenuMegaPromos1,carritomenuMegaPromos2,carritomenuMegaPromos3,carritomenuMegaPromos4,carritomenuMegaPromos5,carritomenuMegaPromos6
                        ,carritomenuExclusivasWeb1,carritomenuExclusivasWeb2,carritomenuExclusivasWeb3,carritomenuExclusivasWeb4,carritomenuExclusivasWeb5,carritomenuExclusivasWeb6
                        ,carritomenuParamí1,carritomenuParamí2,carritomenuParamí3,carritomenuParamí4,carritomenuParamí5,carritomenuParamí6
                        ,carritomenuAntojitos1,carritomenuAntojitos2,carritomenuAntojitos3,carritomenuAntojitos4,carritomenuAntojitos5,carritomenuAntojitos6
                        ,carritoBebidas1,carritoBebidas2,carritoBebidas3,carritoBebidas4,carritoBebidas5,carritoBebidas6,subtotal_LoNuevo1,subtotal_LoNuevo2,subtotal_LoNuevo3,subtotal_LoNuevo4,subtotal_LoNuevo5,subtotal_LoNuevo6
                        ,subtotal_PideAhora1,subtotal_PideAhora2,subtotal_PideAhora3,subtotal_PideAhora4,subtotal_PideAhora5,subtotal_PideAhora6
                        ,subtotal_MegaPromos1,subtotal_MegaPromos2,subtotal_MegaPromos3,subtotal_MegaPromos4,subtotal_MegaPromos5,subtotal_MegaPromos6
                        ,subtotal_ExclusivasWeb1,subtotal_ExclusivasWeb2,subtotal_ExclusivasWeb3,subtotal_ExclusivasWeb4,subtotal_ExclusivasWeb5,subtotal_ExclusivasWeb6
                        ,subtotal_Antojitos1,subtotal_Antojitos2,subtotal_Antojitos3,subtotal_Antojitos4,subtotal_Antojitos5,subtotal_Antojitos6
                        ,subtotal_Antojitos1,subtotal_Antojitos2,subtotal_Antojitos3,subtotal_Antojitos4,subtotal_Antojitos5,subtotal_Antojitos6
                        ,subtotal_Bebidas1,subtotal_Bebidas2,subtotal_Bebidas3,subtotal_Bebidas4,subtotal_Bebidas5,subtotal_Bebidas6);

                break;
            case 2:
                System.out.println("ingrese el monto a pagar");
                detalleDeCompra(carritomenuLoNuevo1,carritomenuLoNuevo2,carritomenuLoNuevo3,carritomenuLoNuevo4,carritomenuLoNuevo5,carritomenuLoNuevo6
                        ,carritomenuPideAhora1,carritomenuPideAhora2,carritomenuPideAhora3,carritomenuPideAhora4,carritomenuPideAhora5,carritomenuPideAhora6
                        ,carritomenuMegaPromos1,carritomenuMegaPromos2,carritomenuMegaPromos3,carritomenuMegaPromos4,carritomenuMegaPromos5,carritomenuMegaPromos6
                        ,carritomenuExclusivasWeb1,carritomenuExclusivasWeb2,carritomenuExclusivasWeb3,carritomenuExclusivasWeb4,carritomenuExclusivasWeb5,carritomenuExclusivasWeb6
                        ,carritomenuParamí1,carritomenuParamí2,carritomenuParamí3,carritomenuParamí4,carritomenuParamí5,carritomenuParamí6
                        ,carritomenuAntojitos1,carritomenuAntojitos2,carritomenuAntojitos3,carritomenuAntojitos4,carritomenuAntojitos5,carritomenuAntojitos6
                        ,carritoBebidas1,carritoBebidas2,carritoBebidas3,carritoBebidas4,carritoBebidas5,carritoBebidas6,subtotal_LoNuevo1,subtotal_LoNuevo2,subtotal_LoNuevo3,subtotal_LoNuevo4,subtotal_LoNuevo5,subtotal_LoNuevo6
                        ,subtotal_PideAhora1,subtotal_PideAhora2,subtotal_PideAhora3,subtotal_PideAhora4,subtotal_PideAhora5,subtotal_PideAhora6
                        ,subtotal_MegaPromos1,subtotal_MegaPromos2,subtotal_MegaPromos3,subtotal_MegaPromos4,subtotal_MegaPromos5,subtotal_MegaPromos6
                        ,subtotal_ExclusivasWeb1,subtotal_ExclusivasWeb2,subtotal_ExclusivasWeb3,subtotal_ExclusivasWeb4,subtotal_ExclusivasWeb5,subtotal_ExclusivasWeb6
                        ,subtotal_Antojitos1,subtotal_Antojitos2,subtotal_Antojitos3,subtotal_Antojitos4,subtotal_Antojitos5,subtotal_Antojitos6
                        ,subtotal_Antojitos1,subtotal_Antojitos2,subtotal_Antojitos3,subtotal_Antojitos4,subtotal_Antojitos5,subtotal_Antojitos6
                        ,subtotal_Bebidas1,subtotal_Bebidas2,subtotal_Bebidas3,subtotal_Bebidas4,subtotal_Bebidas5,subtotal_Bebidas6);

                break;

        }



    }

    public static void main (String[]args){
        PizzaHut pizzaHut = new PizzaHut();
        pizzaHut.login();
        pizzaHut.menu();
    }
}
