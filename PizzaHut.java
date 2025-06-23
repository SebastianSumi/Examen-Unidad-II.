import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.Random;

public class PizzaHut {
    Scanner sc = new Scanner(System.in);
    final String email_admin = "admin@pizzahut.com";
    final String pass_admin = "1@holaHOLA";


    ArrayList<ArrayList<String>> todosMenus = new ArrayList<>();
    ArrayList<ArrayList<Double>> todosPrecios = new ArrayList<>();
    ArrayList<ArrayList<Integer>> todosCarritos = new ArrayList<>();
    ArrayList<ArrayList<Double>> todosSubtotales = new ArrayList<>();
    ArrayList<String> Correos=new ArrayList<>();
    ArrayList<String> Contraseña=new ArrayList<>();
    String Ubic;
    double Cargo;

    private void inicializarDatos() {
        // Ubicación 1: SALIDA HUANCANE
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

        // Ubicación 2: SALIDA CUSCO
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

        // Ubicación 3: SALIDA PUNO
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

        // Ubicación 4: SALIDA AREQUIPA
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

        // Ubicación 6: SALIDA LAMPA
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

        // Inicializar carrito y subtotales con ceros
        ArrayList<Integer> carrito = new ArrayList<>();
        ArrayList<Double> subtotales = new ArrayList<>();
        for (int i = 0; i < menu.size(); i++) {
            carrito.add(0);
            subtotales.add(0.0);
        }
        todosCarritos.add(carrito);
        todosSubtotales.add(subtotales);
    }

    public void MenuPrincipal(String ubicacion) {
        System.out.println("---Bienvenido a Pizza Hut---");
        System.out.println("En Pizza Hut cerca a " + ubicacion + " tenemos los siguientes menús: ");

        int opcionCategoria = Opcciones();
        int indiceMenu = obtenerIndiceMenu(ubicacion, opcionCategoria);

        if (indiceMenu >= 0 && indiceMenu < todosMenus.size()) {
            int opcionProducto = mostrarMenu(todosMenus.get(indiceMenu), todosPrecios.get(indiceMenu));
            procesarCompra(indiceMenu, opcionProducto);
        }
        menusito();
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
        opcion = sc.nextInt();
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

    private int obtenerIndiceMenu(String ubicacion, int categoria) {
        int indiceUbicacion = -1;
        switch (ubicacion.toUpperCase()) {
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
        return ValidarEntradaNumerica(1, menu.size(), "Seleccione un producto (1-" + menu.size() + ")") - 1;
    }

    public int Opcciones() {
        System.out.println("\nCATEGORÍAS DISPONIBLES:");
        System.out.println("1. Lo nuevo");
        System.out.println("2. Pide ahora");
        System.out.println("3. Megapromos");
        System.out.println("4. Exclusivas web");
        System.out.println("5. Para mí");
        System.out.println("6. Antojitos");
        System.out.println("7. Bebidas");
        return ValidarEntradaNumerica(1, 7, "Seleccione una categoría (1-7)");
    }

    public void procesarCompra(int indiceMenu, int opcionProducto) {
        ArrayList<String> menu = todosMenus.get(indiceMenu);
        ArrayList<Double> precios = todosPrecios.get(indiceMenu);
        ArrayList<Integer> carrito = todosCarritos.get(indiceMenu);
        ArrayList<Double> subtotales = todosSubtotales.get(indiceMenu);


        System.out.println("¿Cuántos comidas de '" + menu.get(opcionProducto) + "'? ");
        int cantidad = ValidarEntradaNumerica(0, 15, "Para compras mayores a 15 platos llamar al +51 974 261 517");

        // Actualizar carrito y subtotales
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

        int opcion = ValidarEntradaNumerica(1, 4, "Seleccione una opción (1-4)");
        switch (opcion) {
            case 1: MenuPrincipal(Ubic); break;
            case 2: pagar(); break;
            case 3: MenuPrincipal(Ubic); break;
            case 4: System.exit(0);
        }
    }
    public void metodosDePago(double total){
        System.out.println("elige el metodo de pago");
        System.out.println("1.- efectivo");
        System.out.println("2.- pago tarjeta");

        int opcion=ValidarEntradaNumerica(1,2,"ingrese una opcion del 1 al 2");
        switch (opcion){
            case 1:
                System.out.println("ingrese el monto a pagar");
                double pago = sc.nextDouble();
                BOLETA(total,pago);
                break;
        }

    }

    public static boolean esTarjetaValida(String tarjeta) {
        boolean esValida = tarjeta != null && tarjeta.matches("^[0-9]{16}$");
        return esValida;
    }
    public static boolean esCVVValido(String cvv) {
        boolean esValido = cvv != null && cvv.matches("^[0-9]{3}$");
        return esValido;
    }

    public void BOLETA(double totalApagar , double pago){

        double IGV = totalApagar * 0.18;
        double subtotal = totalApagar - IGV;
        double vuelto = pago - totalApagar;
        System.out.println("boleta de venta");
        System.out.println("total: "+ totalApagar);
        System.out.println("IGV: " + IGV);
        System.out.println("subtotal: " + subtotal);
        System.out.println("vuelto: " +vuelto);
        System.out.println("exportar boleta");
        exportarBoleta(Voleta(totalApagar,pago),"Boleta.txt");

    }
    public String Voleta(double totalPagar, double totalPagado ){
        double igv=0.18*totalPagar;
        double vuelto=totalPagado-totalPagar;
        double subtotal=totalPagado-igv;
        String contenido = "--------------------------------\n" +
                "VOLETA DE VENTA\n" +
                "--------------------------------\n" +
                "Total a pagar: " + totalPagar + "\n" +
                "Total pagado: " + totalPagado + "\n" +
                "Vuelto: " + vuelto + "\n" +
                "IGV: " + igv + "\n" +
                "Subtotal: " + subtotal + "\n" +
                "GRACIAS POR SU COMPRA\n" +
                "____________________________\n";
        System.out.println(contenido);
        return contenido;

    }
    public void Vendedor(){

        System.out.println("1.-vender productos");
        System.out.println("2.-generar boleta");
        System.out.println("3.-mostrar lista de productos");
        System.out.println("4.-esportar boleta");
        System.out.println("5.-imprimir boleta");

        int opcion = ValidarEntradaNumerica(1 , 5,"ingrese una opcion del 1 - 5");

        switch (opcion){

            case 1:

                MenuPrincipal(Ubic);

                break;

            case 2:

                pagar();

                break;

            case 3:

                MenuPrincipal(Ubic);

                break;


            case 4:

                pagar();

                break;

            default:

                System.out.println("imprimir boleta");

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
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.printf("TOTAL A PAGAR: S/.%.2f\n", total);
        System.out.println("=".repeat(60));
        metodosDePago(total);

        // Reiniciar carritos
        for (ArrayList<Integer> carrito : todosCarritos) {
            for (int i = 0; i < carrito.size(); i++) {
                carrito.set(i, 0);
            }
        }

        System.out.println("\nPresione Enter para continuar...");
        sc.nextLine();
        MenuPrincipal(Ubic);
    }

    private int ValidarEntradaNumerica(int min, int max, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: debe ingresar un número entero");
                sc.next();
            }
            valor = sc.nextInt();
            sc.nextLine();  // Limpiar buffer
        } while (valor < min || valor > max);
        return valor;
    }
    public void exportarBoleta(String contenido, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            writer.flush(); // Asegura que se escriba completamente
            System.out.println("Boleta exportada con éxito a " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al exportar la boleta: " + e.getMessage());
        }
    }

    public void sistema() {
        inicializarDatos();
        mostrarMenu();
    }
    private boolean validarCorreo(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.com$";
        return Pattern.compile(regex).matcher(email).matches();
    }
    private boolean validarPassword(String password) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@&%$#!?*])[A-Za-z\\d@&%$#!?*]{8,}$";
        return Pattern.compile(regex).matcher(password).matches();
    }
    public void soyCliente(){
        System.out.println("1.-Regisstrarse");
        System.out.println("2.-Iniciar sesion");
        int opccion=ValidarEntradaNumerica(1,2,"Ingrese una opccion del 1-2");
        switch (opccion){
            case 1:
                Registrarse();
                iniciarSesion();
                break;
            case 2:
                iniciarSesion();
                break;
        }
    }
    public void Registrarse(){
        System.out.println("----Registro de cuenta----");
        String correo, contraseña;
        do {
            System.out.println("Ingrese su correo electronico");
            correo = sc.nextLine();
            if (!validarCorreo(correo)){
                System.out.println("Correo invalido s correo deve contener @ y terminar en .com");
            }

        }while(!validarCorreo(correo));
        do{
            System.out.println("Ingrese su contraseña");
            contraseña = sc.nextLine();
            if (!validarPassword(contraseña)) {
                System.out.println("Contraseña invalida, su contraseña deve contener numeros, Maysculas y minusculas y caracteres especiales");
            }
        }while(!validarPassword(contraseña));
        Correos.add(correo);
        Contraseña.add(contraseña);

    }
    public void iniciarSesion(){
        String correo, contraseña;
        System.out.println("Inicio de sesion");
        System.out.print("Ingrese su correo electronico:");
        correo= sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        contraseña= sc.nextLine();
        int indiceContraseña=Contraseña.indexOf(contraseña);
        int indiceCorreo=Correos.indexOf(correo);
        if (correo.equals(Correos.get(indiceCorreo))&&contraseña.equals(Contraseña.get(indiceContraseña))){
            System.out.println("Inicio de sesion exitoso puede, acceder");
            Vendedor();
        }
        if (correo.equals(email_admin)&&contraseña.equals(pass_admin)){
            System.out.println("Inicio de sesion exitoso puede, acceder");
            administrador();
        }
        else {
            System.out.println("Inicio de sesion fallido");
            soyCliente();
        }
    }
    public void agregarProducto(){
        int opcion, swt;
        System.out.println("Ingrese la categoria en la que desea agregar productos");
        opcion = Opcciones();
        int indice = obtenerIndiceMenu(Ubic,opcion);
        do{
            System.out.println("1.-Agregar producto");
            System.out.println("2.-Eliminar producto");
            System.out.println("3.-Salir");
            switch (swt = sc.nextInt()){
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    todosMenus.get(indice).add(sc.nextLine());
                    System.out.println("Ingrese el precio del producto");
                    todosPrecios.get(indice).add(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto");
                    todosMenus.get(indice).indexOf(sc.nextLine());
                    todosMenus.get(indice).remove(sc.nextLine());
                    todosPrecios.get(indice).remove(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (swt!=3);
    }
    public void modificarProducto(){
        int opcion;
        System.out.println("Ingrese la categoria en la que desea agregar productos");
        opcion = Opcciones();
        int indice = obtenerIndiceMenu(Ubic,opcion);
        System.out.println("Ingrese el nombre del producto");
        int index = todosMenus.get(indice).indexOf(sc.nextLine());
        System.out.println("Ingrese el nuevo nombre del producto");
        todosMenus.get(indice).set(index,sc.nextLine());
        System.out.println("Ingrese el nuevo precio del producto");
        todosPrecios.get(indice).set(index,sc.nextDouble());
    }
    public void administrador(){
        int opcion;
        do{
            System.out.println("1.-Agregar usuario");
            System.out.println("2.-Agregar producto");
            System.out.println("2.-Modificar producto");
            System.out.println("4.-Salir");
            switch (opcion=sc.nextInt()){
                case 1:
                    Registrarse();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    modificarProducto();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (opcion!=3);
    }
    public static void main(String[] args) {
        PizzaHut PH = new PizzaHut();
        PH.sistema();
    }
}
