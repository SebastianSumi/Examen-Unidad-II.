import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class PizzaHut {
    public Scanner sc = new Scanner(System.in);
    double tasaIgv = 0.18;
    public double Cargo;
    private String Ubic, name,DNI;
    public double TOTAL;
    public String ProductoSelec;
    public int Contador = 0;
    public int opion;
    final String email_admin = "admin@pizzahut.com";
    final String pass_admin = "1@holaHOLA";

    private int validarEntradaNumerica(int min, int max, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: debe ingresar un número entero");
                sc.next();
            }
            valor = sc.nextInt();
            sc.nextLine();
        } while (valor < min || valor > max);
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
        Ubi = ubicaciones.get(i);
        return Ubi;
    }

    public void mostrarMenu() {
        for (int i = 0; i <= 7; i++) {
            System.out.println(generarOpcion(generarMenu(i), i));
        }
        seleccionarMenu();
    }

    public void seleccionarMenu() {
        int opcion;
        double cargo;
        opcion = validarEntradaNumerica(0, 6, "Seleccione su ubicación:");
        if (opcion >= 0 && opcion < 6) {
            Ubic = generarMenu(opcion);
            Cargo = aplicarCargo(opcion);
        } else {
            Random rand = new Random();
            opcion = rand.nextInt(6);
            Ubic = generarMenu(opcion);
            Cargo = aplicarCargo(opcion);
        }
    }

    public double aplicarCargo(int i) {
        ArrayList <Integer> km = new ArrayList<>();
        km.add(3);
        km.add(8);
        km.add(5);
        km.add(6);
        km.add(0);
        km.add(9);
        return km.get(i) * 0.3;
    }

    public double cargoEntrega() {
        int opcion;
        double cargo;
        opcion = validarEntradaNumerica(1, 2, "Seleccione entre:\n(1)-Entrega a Domicilio\n(2)-Recoger en local");
        switch (opcion) {
            case 1:
                System.out.println("El cargo de entrega a domicilio es: s/." + Cargo);
                TOTAL = TOTAL + Cargo;
                return Cargo;
            case 2:
                System.out.println("Lo esperamos en: Av. Horizonte Sur 1234, Salida Arequipa, Juliaca");
                return 0;
            default:
                System.out.println("Error inesperado");
                return 0;
        }
    }


    //

    ArrayList<ArrayList<String>> todosMenus = new ArrayList<>();
    ArrayList<ArrayList<Double>> todosPrecios = new ArrayList<>();
    ArrayList<ArrayList<Integer>> todosCarritos = new ArrayList<>();
    ArrayList<ArrayList<Double>> todosSubtotales = new ArrayList<>();

    private void inicializarDatos() {

        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Criolla (Ají, carne y choclo)",
                        "Lasagna de Espinaca y Ricotta",
                        "Lasagna de Espinaca y Ricotta")),
                new ArrayList<>(Arrays.asList(47.9, 38.5, 19.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediana de Pepperoni + Extra",
                        "Combo Express (Pizza personal + gaseosa)",
                        "Alitas BBQ (6 unidades)")),
                new ArrayList<>(Arrays.asList(49.6, 25.2, 15.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pack Amistad (Pizza + alitas + papas + gaseosa)",
                        "Dúo Familiar (2 Pizzas Grandes + 2 Bebidas)",
                        "Super Combo Pizza + Postre")),
                new ArrayList<>(Arrays.asList(43.6, 35.6, 12.9))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Trufa y Queso",
                        "Pizza Premium de Espinaca y Champiñones",
                        "Lasagna de Carne Especial")),
                new ArrayList<>(Arrays.asList(45.0, 35.0, 26.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Ensalada César con Pollo",
                        "Wrap Mediterráneo",
                        "Pasta Alfredo con Pollo")),
                new ArrayList<>(Arrays.asList(48.6, 25.0, 16.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Papas con Queso Cheddar",
                        "Churros con Caramelo",
                        "Mini Empanadas de Queso")),
                new ArrayList<>(Arrays.asList(45.6, 23.5, 13.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Gaseosa Personal",
                        "Jugo Natural",
                        "Agua Mineral")),
                new ArrayList<>(Arrays.asList(6.2, 9.2, 10.9))
        );

        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza BBQ Suprema",
                        "Pasta Bolognesa con Queso",
                        "Papas Rústicas con Tocino")),
                new ArrayList<>(Arrays.asList(47.9, 38.5, 19.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediana Cuatro Quesos",
                        "Pizza Individual de Pollo BBQ",
                        "Alitas Picantes (8 unidades)")),
                new ArrayList<>(Arrays.asList(45.8, 36.2, 15.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Mega Pack (3 Pizzas + 4 Bebidas)",
                        "Postre del Día (Brownie + Helado)",
                        "Súper Combo Pizza + Bebida + Alitas")),
                new ArrayList<>(Arrays.asList(46.2, 36.9, 15.6))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza de Trufa y Espárragos",
                        "Pasta Carbonara",
                        "Pizza Gourmet de Mariscos")),
                new ArrayList<>(Arrays.asList(49.5, 35.2, 12.5))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Wrap de Pollo BBQ",
                        "Ensalada Mediterránea",
                        "Sándwich de Pollo y Aguacate")),
                new ArrayList<>(Arrays.asList(43.2, 35.2, 16.5))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Palitos de Queso Frito",
                        "Mini Pizzas Margarita (4 unidades)",
                        "Churros con Chocolate")),
                new ArrayList<>(Arrays.asList(46.2, 39.2, 18.9))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Malteada de Fresa",
                        "Té Helado de Limón",
                        "Gaseosa de 500ml")),
                new ArrayList<>(Arrays.asList(7.6, 5.3, 12.9))
        );

        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediterránea (Aceitunas, tomate seco y queso feta)",
                        "Pasta Alfredo con Camarones",
                        "Papas Gajo con Salsa de Pesto")),
                new ArrayList<>(Arrays.asList(45.3, 35.1, 14.5))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediana Napolitana",
                        "Pizza Individual Hawaiana",
                        "Alitas BBQ (8 unidades)")),
                new ArrayList<>(Arrays.asList(48.5, 35.6, 15.2))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Super Combo Pizza + Bebidas",
                        "Pack Amistad 2 (Pizza + alitas + papas + 2 gaseosas)",
                        "Brownie con Helado")),
                new ArrayList<>(Arrays.asList(47.6, 38.1, 16.2))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza de Mariscos",
                        "Lasagna de Espinaca y Ricotta",
                        "Pasta Carbonara Premium")),
                new ArrayList<>(Arrays.asList(46.5, 37.2, 15.2))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Wrap Mediterráneo",
                        "Ensalada César con Pollo",
                        "Sándwich de Roast Beef y Queso")),
                new ArrayList<>(Arrays.asList(49.2, 35.1, 16.3))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Palitos de Queso",
                        "Papas con Cheddar y Tocino",
                        "Mini Pizzas Margarita")),
                new ArrayList<>(Arrays.asList(46.3, 35.2, 17.8))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Malteada de Café",
                        "Frapuccino de Vainilla",
                        "Gaseosa de 500ml")),
                new ArrayList<>(Arrays.asList(9.9, 14.5, 8.4))
        );

        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Ahumada con Tocino",
                        "Pasta Napolitana con Albóndigas",
                        "Papas Rústicas con Salsa BBQ")),
                new ArrayList<>(Arrays.asList(47.9, 38.5, 19.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediana Cuatro Quesos",
                        "Pizza Pepperoni Extra Grande",
                        "Alitas Picantes con Miel")),
                new ArrayList<>(Arrays.asList(46.5, 35.1, 14.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Dúo Pizza + Bebida",
                        "Pack Mega Pizza + Papas + Bebidas",
                        "Brownie con Helado")),
                new ArrayList<>(Arrays.asList(48.5, 35.0, 15.6))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Trufa y Espárragos",
                        "Lasagna de Carne Premium",
                        "Pasta Alfredo Especial")),
                new ArrayList<>(Arrays.asList(46.5, 38.0, 18.9))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Wrap de Pollo BBQ",
                        "Ensalada Mediterránea",
                        "Sándwich de Pollo y Aguacate")),
                new ArrayList<>(Arrays.asList(48.0, 15.6, 12.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Nachos con Salsa de Queso",
                        "Mini Pizzas Margarita",
                        "Churros con Chocolate")),
                new ArrayList<>(Arrays.asList(45.2, 32.1, 16.7))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Limonada Refrescante",
                        "Té Helado de Limón",
                        "Jarra de Chicha Morada")),
                new ArrayList<>(Arrays.asList(5.1, 8.0, 14.8))
        );

        // Ubicación 5: CENTRO DE JULIACA
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Cuatro Carnes",
                        "Pasta Alfredo con Champiñones",
                        "Papas Rústicas con Salsa Especial")),
                new ArrayList<>(Arrays.asList(44.9, 33.5, 11.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediana Margarita",
                        "Pizza Individual de Pollo BBQ",
                        "Alitas BBQ Clásicas")),
                new ArrayList<>(Arrays.asList(44.9, 31.6, 31.1))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Súper Combo Pizza + Postre",
                        "Pack Amistad 3 (Pizza + alitas + papas + 4 gaseosas)",
                        "Postre Especial del Día")),
                new ArrayList<>(Arrays.asList(46.8, 24.5, 12.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Gourmet Espinaca y Ricotta",
                        "Pasta Carbonara Deluxe",
                        "Pizza Premium de Champiñones")),
                new ArrayList<>(Arrays.asList(40.6, 32.5, 15.2))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Wrap de Pollo Teriyaki",
                        "Ensalada César con Pollo",
                        "Sándwich de Roast Beef")),
                new ArrayList<>(Arrays.asList(43.5, 38.6, 17.5))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Papas Gajo con Salsa Especial",
                        "Palitos de Queso Frito",
                        "Churros con Pasta")),
                new ArrayList<>(Arrays.asList(47.2, 38.1, 16.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Malteada de Chocolate",
                        "Gaseosa de 500ml",
                        "Jarra de Té Frío")),
                new ArrayList<>(Arrays.asList(8.3, 4.21, 10.28))
        );

        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Especial de la Casa",
                        "Pasta Bolognesa con Queso",
                        "Papas Rústicas con Tocino y Queso")),
                new ArrayList<>(Arrays.asList(47.9, 38.5, 19.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza Mediana Napolitana",
                        "Pizza Extra Carne",
                        "Alitas Picantes (8 unidades)")),
                new ArrayList<>(Arrays.asList(46.5, 39.2, 16.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Combo Pizza + Postre + Bebida",
                        "Pack Dúo Pizza + Bebidas",
                        "Mega Combo Pizza + Alitas")),
                new ArrayList<>(Arrays.asList(49.2, 36.5, 15.0))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Pizza de Mariscos Premium",
                        "Pasta Napolitana Gourmet",
                        "Pizza Cuatro Quesos Deluxe")),
                new ArrayList<>(Arrays.asList(51.2, 38.50, 12.4))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Wrap Mediterráneo",
                        "Ensalada César con Pollo",
                        "Sándwich de Roast Beef y Aguacate")),
                new ArrayList<>(Arrays.asList(52.4, 38.2, 14.6))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Papas con Cheddar y Tocino",
                        "Nachos con Salsa Mexicana",
                        "Mini Pizzas Margarita")),
                new ArrayList<>(Arrays.asList(48.5, 41.2, 15.2))
        );
        agregarMenu(new ArrayList<>(Arrays.asList(
                        "Malteada de Café",
                        "Té Helado de Frutas",
                        "Jarra de Chicha Morada")),
                new ArrayList<>(Arrays.asList(12.3, 5.2, 8.7))
        );
    }

    private void agregarMenu(ArrayList<String> menu, ArrayList<Double> precios) {
        todosMenus.add(menu);
        todosPrecios.add(precios);

        ArrayList<Integer> carrito = new ArrayList<>();
        ArrayList<Double> subtotales = new ArrayList<>();
        for (int i = 0; i < menu.size(); i++) {
            carrito.add(0);
            subtotales.add(0.0);
        }
        todosCarritos.add(carrito);
        todosSubtotales.add(subtotales);
    }

    public void menuPrincipal() {
        System.out.println("En Pizza Hut cerca a " + Ubic + " tenemos los siguientes menús: ");

        int opcionCategoria = opcciones();
        int indiceMenu = obtenerIndiceMenu(opcionCategoria);

        if (indiceMenu >= 0 && indiceMenu < todosMenus.size()) {
            int opcionProducto = mostrarMenu(todosMenus.get(indiceMenu), todosPrecios.get(indiceMenu));
            procesarCompra(indiceMenu, opcionProducto);
        }
        menusito();
    }

    private int obtenerIndiceMenu( int categoria) {
        int indiceUbicacion = -1;
        switch (Ubic.toUpperCase()) {
            case "SALIDA HUANCANE": indiceUbicacion = 0; break;
            case "SALIDA CUSCO": indiceUbicacion = 1; break;
            case "SALIDA PUNO": indiceUbicacion = 2; break;
            case "SALIDA AREQUIPA": indiceUbicacion = 3; break;
            case "CENTRO DE JULIACA": indiceUbicacion = 4; break;
            case "SALIDA LAMPA": indiceUbicacion = 5; break;
            default:
                System.out.println("Ubicación no reconocida. Usando menú por defecto.");
                indiceUbicacion = 0;
        }
        return indiceUbicacion * 7 + (categoria - 1);
    }

    public int mostrarMenu(ArrayList<String> menu, ArrayList<Double> precios) {
        System.out.println("\n--- MENÚ DISPONIBLE ---");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i) + " - S/." + precios.get(i));
        }
        return validarEntradaNumerica(1, menu.size(), "Seleccione un producto (1-" + menu.size() + ")") - 1;
    }

    public int opcciones() {
        System.out.println("\nCATEGORÍAS DISPONIBLES:");
        System.out.println("1. Lo nuevo");
        System.out.println("2. Pide ahora");
        System.out.println("3. Megapromos");
        System.out.println("4. Exclusivas web");
        System.out.println("5. Para mí");
        System.out.println("6. Antojitos");
        System.out.println("7. Bebidas");
        return validarEntradaNumerica(1, 7, "Seleccione una categoría (1-7)");
    }

    public void procesarCompra(int indiceMenu, int opcionProducto) {
        ArrayList<String> menu = todosMenus.get(indiceMenu);
        ArrayList<Double> precios = todosPrecios.get(indiceMenu);
        ArrayList<Integer> carrito = todosCarritos.get(indiceMenu);
        ArrayList<Double> subtotales = todosSubtotales.get(indiceMenu);

        System.out.println("¿Cuántos comidas de '" + menu.get(opcionProducto) + "'? ");
        int cantidad = validarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");

        int nuevaCantidad = carrito.get(opcionProducto) + cantidad;
        carrito.set(opcionProducto, nuevaCantidad);
        subtotales.set(opcionProducto, nuevaCantidad * precios.get(opcionProducto));

        System.out.println("✓ " + cantidad + " x " + menu.get(opcionProducto) + " añadido al carrito");
    }

    public void menusito() {
        System.out.println("\n¿Qué desea hacer ahora?");
        System.out.println("1. Elegir otro producto");
        System.out.println("2. Pagar");
        System.out.println("3. Volver al menú principal");
        System.out.println("4. Salir");

        int opcion = validarEntradaNumerica(1, 4, "Seleccione una opción (1-4)");
        switch (opcion) {
            case 1: menuPrincipal(); break;
            case 2: pagar(); break;
            case 3: mostrarMenu(); break;
            case 4: System.exit(0);
        }
    }

    private void pagar() {
        System.out.println("\n--- RESUMEN DE COMPRA ---");
        double total = 0;
        boolean vacio = true;

        for (int i = 0; i < todosMenus.size(); i++) {
            for (int j = 0; j < todosCarritos.get(i).size(); j++) {
                int cantidad = todosCarritos.get(i).get(j);
                if (cantidad > 0) {
                    vacio = false;
                    String producto = todosMenus.get(i).get(j);
                    double precio = todosPrecios.get(i).get(j);
                    double subtotal = todosSubtotales.get(i).get(j);
                    System.out.printf("%d x %-40s S/.%-6.2f = S/.%6.2f\n",
                            cantidad, producto, precio, subtotal);
                    total += subtotal;
                }
            }
        }

        if (vacio) {
            System.out.println("El carrito está vacío");
            menusito();
            return;
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.printf("TOTAL A PAGAR: S/.%.2f\n", total);
        System.out.println("=".repeat(60));
        System.out.println("¡Gracias por su compra en Pizza Hut!");

        for (ArrayList<Integer> carrito : todosCarritos) {
            for (int i = 0; i < carrito.size(); i++) {
                carrito.set(i, 0);
            }
        }
        menusito();
    }

    public void sistema() {
    }

//

    String emailGuardado, contraseñaGuardada;

    private boolean validarCorreo(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.com$";
        return Pattern.compile(regex).matcher(email).matches();
    }

    private boolean validarPassword(String password) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@&%$#!?*])[A-Za-z\\d@&%$#!?*]{8,}$";
        return Pattern.compile(regex).matcher(password).matches();
    }

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
            email = sc.nextLine();
            if (!validarCorreo(email)) {
                System.out.println("El correo ingresado no es válido. Debe contener '@' y terminar en .com");
            }
        } while (!validarCorreo(email));
        do {
            System.out.println("Ingrese su contraseña (mínimo 8 caracteres, letras, números y caracteres especiales):");
            contraseña = sc.nextLine();
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
            email = sc.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña = sc.nextLine();
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

//

    private void login() {
        switch (validarEntradaNumerica(1,3,"Inicie sesión como:\n(1)-Administrador\n(2)-Vendedor\n(3)-Cliente")){
            case 1:
                ventanaAdministrador();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public void menu() {
        mostrarMenu();
    }

    public void ventanaAdministrador(){
        int contador=3;
        int swt;
        String email, contraseña;
        do{
            System.out.println("Ingrese su correo electrónico");
            email = sc.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña = sc.nextLine();
            if(email!=email_admin||contraseña!=pass_admin){
                System.out.println("Datos incorrectos");
                contador--;
                System.out.println("Intentos restantes "+contador);
            }
            if(contador==0){
                sc.close();
            }
        }while (email!=email_admin||contraseña!=pass_admin);
        inicializarDatos();
        do{
            switch (swt= validarEntradaNumerica(1,4,"(1)-Ver productos\n(2)-Agregar producto\n(3)-Modificar producto\n(4)-Salir")){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal");
                    break;
            }
        }while (swt!=4);
    }

    public void verProducto (){

    }

    public static void main (String[]args){
        PizzaHut pizzaHut = new PizzaHut();
        System.out.println("--BIENVENIDO A PIZZA HUT--");
        System.out.println("Número de ayuda: tel:(01)505-1111");
        pizzaHut.mostrarMenu();
        pizzaHut.login();
    }
}
