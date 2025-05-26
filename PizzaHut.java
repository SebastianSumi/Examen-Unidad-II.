import java.util.Scanner;
import java.util.Random;

public class PizzaHut {
    public Scanner sc = new Scanner(System.in);
    private String Ubic;

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
                "Centro de Juliaca",
                "Salida Huancane",
                "Salida Cusco",
                "Salida Puno",
                "Salida Arequipa",
                "Salida Lampa",
                "Encuentre mi ubicación"
        };
        Ubi = ubicaciones[i - 1];
        return Ubi;
    }

    public void mostrarMenu (){
        for (int i = 1; i <= 7; i++) {
            System.out.println(generarOpcion(generarMenu(i),i));
        }
        seleccionarMenu();
    }

    public String seleccionarMenu (){
        String Ubi;
        int opcion;
        double cargo;
        opcion = ValidarEntradaNumerica(1,6,"Seleccione su ubicación:");
        if (opcion >= 1 && opcion <= 6) {
            Ubi = generarMenu(opcion);
            Ubic = Ubi;
            sistema();
            cargo= aplicarCargo(opcion);
            cargoEntrega(Ubi, cargo);
            return Ubi;
        }
        else {
            Random rand = new Random();
            opcion = rand.nextInt(6)+1;
            Ubi = generarMenu(opcion);
            Ubic = Ubi;
            sistema();
            cargo = aplicarCargo(opcion);
            cargoEntrega(Ubi, cargo);
            return Ubi;
        }
    }

    public double aplicarCargo (int cargo){
        int km [] = {3,8,5,6,0,9};
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


    //


    Scanner entrada=new Scanner (System.in);
    //Menu 1.- Favoritos del mes
    String[] LoNuevo1 = {"Pizza Criolla (Ají, carne y choclo)", "Lasagna de Espinaca y Ricotta ", "Lasagna de Espinaca y Ricotta "};
    double[] PrecioLoNuevo1 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo1 = new int[3]; //cantidad pedida
    double[] subtotal_LoNuevo1= {0, 0, 0}; //se almacenan los precios por compra
    String[] PideAhora1 = {"Pizza Mediana de Pepperoni + Extra ", "Combo Express (Pizza personal + gaseosa)", "Alitas BBQ (6 unidades)"};
    double[] PrecioPideAhora1 = {49.6, 25.2, 15.4};
    int [] carritomenuPideAhora1 =new int [3];
    double[] subtotal_PideAhora1= {0, 0, 0};
    String[] MegaPromos1 = {"Pack Amistad (Pizza + alitas + papas + gaseosa) ", "Dúo Familiar (2 Pizzas Grandes + 2 Bebidas)", "Super Combo Pizza + Postre"};
    double[] PrecioMegaPromos1 = {43.6, 35.6, 12.9};
    int [] carritomenuMegaPromos1 = new int [3];
    double[] subtotal_MegaPromos1= {0, 0, 0};
    String[] ExclusivasWeb1 = {"Pizza Trufa y Queso ", "Pizza Premium de Espinaca y ChampiñonesLasagna de Carne Especial",""};
    double[] PrecioExclusivasWeb1 = {45, 35, 26};
    int [] carritomenuExclusivasWeb1 =new int [3];
    double[] subtotal_ExclusivasWeb1= {0, 0, 0};
    String[] ParaMí1 = {"Ensalada César con Pollo", "Wrap Mediterráneo", "Pasta Alfredo con Pollo"};
    double[] PrecioParaMí1 = {48.6, 25, 16};
    int [] carritomenuParamí1 =new int[3];
    double[] subtotal_Paramí1 = {0, 0, 0};
    String[] Antojitos1 = {"Papas con Queso Cheddar ","Churros con Caramelo","Mini Empanadas de Queso"};
    double[] PrecioAntojitos1 = {45.6,23.5,13};
    int [] carritomenuAntojitos1=new int[3];
    double[] subtotal_Antojitos1= {0, 0, 0};
    String[] Bebidas1 = {"Pizza BBQ Suprema","Pasta Bolognesa con Queso","Papas Rústicas con Tocino"};
    double[] PrecioBebidas1 = {6.2,9.2,10.9};
    int [] carritoBebidas1=new int [3];
    double[] subtotal_Bebidas1= {0, 0, 0};
    //Menu 2.- Para Compaartir
    String[] LoNuevo2 = {"Pizza BBQ Suprema ","Pasta Bolognesa con Queso ","Papas Rústicas con Tocino"};
    double[] PrecioLoNuevo2 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo2 = new int[3];
    double[] subtotal_LoNuevo2= {0, 0, 0};
    String[] PideAhora2 = {"Pizza Mediana Cuatro Quesos ","Pizza Individual de Pollo BBQ","Alitas Picantes (8 unidades)"};
    double[] PrecioPideAhora2 = {45.8,36.2,15};
    int [] carritomenuPideAhora2 =new int [3];
    double[] subtotal_PideAhora2 = {0, 0, 0};
    String[] MegaPromos2 = {"Mega Pack (3 Pizzas + 4 Bebidas)","Postre del Día (Brownie + Helado)","Súper Combo Pizza + Bebida + Alitas"};
    double[] PrecioMegaPromos2 = {46.2,36.9,15.6};
    int [] carritomenuMegaPromos2 = new int [3];
    double[] subtotal_MegaPromos2= {0, 0, 0};
    String[] ExclusivasWeb2 = {"Pizza de Trufa y Espárragos ","Pasta Carbonara","Pizza Gourmet de Mariscos"};
    double[] PrecioExclusivasWeb2 = {49.5,35.2,12.5};
    int [] carritomenuExclusivasWeb2 =new int [3];
    double[] subtotal_ExclusivasWeb2= {0, 0, 0};
    String[] ParaMí2 = {"Wrap de Pollo BBQ", "Ensalada Mediterránea", "Sándwich de Pollo y Aguacate"};
    double[] PrecioParaMí2 = {43.2,35.2,16.5};
    int [] carritomenuParamí2 =new int[3];
    double[] subtotal_Paramí2= {0, 0, 0};
    String[] Antojitos2 = {"Palitos de Queso Frito","Mini Pizzas Margarita (4 unidades)","Churros con Chocolate"};
    double[] PrecioAntojitos2 = {46.2,39.2,18.9};
    int [] carritomenuAntojitos2=new int[3];
    double[] subtotal_Antojitos2 = {0, 0, 0};
    String[] Bebidas2 = {"Malteada de Fresa","Té Helado de Limón","Gaseosa de 500ml"};
    double[] PrecioBebidas2 = {7.6,5.3,12.9};
    int [] carritoBebidas2=new int [3];
    double[] subtotal_Bebidas2= {0, 0, 0};
    //Menu 3.-Sabores Exclusivos
    String[] LoNuevo3 = {"Pizza Mediterránea (Aceitunas, tomate seco y queso feta) ","Pasta Alfredo con Camarones","Papas Gajo con Salsa de Pesto"};
    double[] PrecioLoNuevo3 = {45.3, 35.1, 14.5};
    int[] carritomenuLoNuevo3 = new int[3];
    double[] subtotal_LoNuevo3= {0, 0, 0};
    String[] PideAhora3 = {"Pizza Mediana Napolitana ","Pizza Individual Hawaiana","Alitas BBQ (8 unidades)"};
    double[] PrecioPideAhora3 = {48.5,35.6,15.2};
    int [] carritomenuPideAhora3 =new int [3];
    double[] subtotal_PideAhora3= {0, 0, 0};
    String[] MegaPromos3 = {"Super Combo Pizza + Bebidas", "Pack Amistad 2 (Pizza + alitas + papas + 2 gaseosas)", "Brownie con Helado"};
    double[] PrecioMegaPromos3 = {47.6,38.1,16.2};
    int [] carritomenuMegaPromos3 = new int [3];
    double[] subtotal_MegaPromos3= {0, 0, 0};
    String[] ExclusivasWeb3 = {"Pizza de Mariscos", "Lasagna de Espinaca y Ricotta", "Pasta Carbonara Premium"};
    double[] PrecioExclusivasWeb3 = {46.5,37.2,15.2};
    int [] carritomenuExclusivasWeb3=new int [3];
    double[] subtotal_ExclusivasWeb3= {0, 0, 0};
    String[] ParaMí3 = {"Wrap Mediterráneo", "Ensalada César con Pollo", "Sándwich de Roast Beef y Queso"};
    double[] PrecioParaMí3 = {49.2,35.1,16.3};
    int [] carritomenuParamí3 =new int[3];
    double []subtotal_Paramí3= {0, 0, 0};
    String[] Antojitos3 = {"Palitos de Queso", "Papas con Cheddar y Tocino", "Mini Pizzas Margarita"};
    double[] PrecioAntojitos3 = {46.3,35.2,17.8};
    int [] carritomenuAntojitos3=new int[3];
    double [] subtotal_Antojitos3 ={0, 0, 0};
    String[] Bebidas3 = {"Malteada de Café","Frapuccino de Vainilla","Gaseosa de 500ml"};
    double[] PrecioBebidas3 = {9.9,14.5,8.4};
    int [] carritoBebidas3=new int [3];
    double [] subtotal_Bebidas3={0, 0, 0};
    //Menu 4.-Satisfaccion Total
    String[] LoNuevo4 = {"Pizza Ahumada con Tocino ","Pasta Napolitana con Albóndigas","Papas Rústicas con Salsa BBQ"};
    double[] PrecioLoNuevo4 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo4 = new int[3];
    double[] subtotal_LoNuevo4= {0, 0, 0};
    String[] PideAhora4 = {"Pizza Mediana Cuatro Quesos","Pizza Pepperoni Extra Grande","Alitas Picantes con Miel"};
    double[] PrecioPideAhora4 = {46.5,35.1,14};
    int [] carritomenuPideAhora4 =new int [3];
    double [] subtotal_PideAhora4={0, 0, 0};
    String[] MegaPromos4 = {"Dúo Pizza + Bebida","Pack Mega Pizza + Papas + Bebidas","Brownie con Helado"};
    double[] PrecioMegaPromos4 = {48.5,35,15.6};
    int [] carritomenuMegaPromos4 = new int [3];
    double [] subtotal_MegaPromos4={0, 0, 0};
    String[] ExclusivasWeb4 = {"Pizza Trufa y Espárragos","Lasagna de Carne Premium","Pasta Alfredo Especial"};
    double[] PrecioExclusivasWeb4 = {46.5,38,18.9};
    int [] carritomenuExclusivasWeb4 =new int [3];
    double [] subtotal_ExclusivasWeb4 ={0, 0, 0};
    String[] ParaMí4 = {"Wrap de Pollo BBQ","Ensalada Mediterránea","Sándwich de Pollo y Aguacate"};
    double[] PrecioParaMí4 = {48,15.6,12.4};
    int [] carritomenuParamí4 =new int[3];
    double []subtotal_Paramí4={0, 0, 0};
    String[] Antojitos4 = {"Nachos con Salsa de Queso", "Mini Pizzas Margarita", "Churros con Chocolate"};
    double[] PrecioAntojitos4 = {45.2,32.1,16.7};
    int [] carritomenuAntojitos4=new int[3];
    double [] subtotal_Antojitos4={0, 0, 0};
    String[] Bebidas4 = {"Limonada Refrescante", "Té Helado de Limón", "Jarra de Chicha Morada"};
    double[] PrecioBebidas4 = {5.1,8.0,14.8};
    int [] carritoBebidas4=new int [3];
    double []subtotal_Bebidas4={0, 0, 0};
    //menu 5.- Gourment Express
    String[] LoNuevo5 = {"Pizza Cuatro Carnes ","Pasta Alfredo con Champiñones","Papas Rústicas con Salsa Especial"};
    double[] PrecioLoNuevo5 = {44.9, 33.5, 11.4};
    int[] carritomenuLoNuevo5 = new int[3];
    double [] subtotal_LoNuevo5={0, 0, 0};
    String[] PideAhora5 = {"Pizza Mediana Margarita","Pizza Individual de Pollo BBQ","Alitas BBQ Clásicas"};
    double[] PrecioPideAhora5 = {44.9,31.6,31.1};
    int [] carritomenuPideAhora5 =new int [3];
    double [] subtotal_PideAhora5={0, 0, 0};
    String[] MegaPromos5 = {"Súper Combo Pizza + Postre","Pack Amistad 3 (Pizza + alitas + papas + 4 gaseosas)","Postre Especial del Día"};
    double[] PrecioMegaPromos5 = {46.8,24.5,12};
    int [] carritomenuMegaPromos5 = new int [3];
    double [] subtotal_MegaPromos5={ 0, 0 , 0 };
    String[] ExclusivasWeb5 = {"Pizza Gourmet Espinaca y Ricotta", "Pasta Carbonara Deluxe", "Pizza Premium de Champiñones"};
    double[] PrecioExclusivasWeb5 = {40.6,32.5,15.2};
    int [] carritomenuExclusivasWeb5 =new int [3];
    double []subtotal_ExclusivasWeb5 ={0, 0, 0};
    String[] ParaMí5 = {"Wrap de Pollo Teriyaki", "Ensalada César con Pollo", "Sándwich de Roast Beef"};
    double[] PrecioParaMí5 = {43.5,38.6,17.5};
    int [] carritomenuParamí5 =new int[3];
    double []subtotal_Paramí5={0, 0, 0};
    String[] Antojitos5 = {"Papas Gajo con Salsa Especial", "Palitos de Queso Frito", "Churros con Pasta"};
    double[] PrecioAntojitos5 = {47.2,38.1,16.4};
    int [] carritomenuAntojitos5=new int[3];
    double []subtotal_Antojitos5={0, 0, 0};
    String[] Bebidas5 = {"Malteada de Chocolate", "Gaseosa de 500ml", "Jarra de Té Frío"};
    double[] PrecioBebidas5 = {8.3,4.21,10.28};
    int [] carritoBebidas5=new int [3];
    double []subtotal_Bebidas5={0, 0, 0};
    //Menu 6.- Experiencia Completa
    String[] LoNuevo6 = {"Pizza Especial de la Casa ","Pasta Bolognesa con Queso","Papas Rústicas con Tocino y Queso"};
    double[] PrecioLoNuevo6 = {47.9, 38.5, 19.4};
    int[] carritomenuLoNuevo6 = new int[3];
    double [] subtotal_LoNuevo6={0, 0, 0};
    String[] PideAhora6 = {"Pizza Mediana Napolitana","Pizza Extra Carne","Alitas Picantes (8 unidades)"};
    double[] PrecioPideAhora6 = {46.5,39.2,16.4};
    int [] carritomenuPideAhora6 =new int [3];
    double [] subtotal_PideAhora6 ={0, 0, 0};
    String[] MegaPromos6 = {"Combo Pizza + Postre + Bebida ","Pack Dúo Pizza + Bebidas","Mega Combo Pizza + Alitas"};
    double[] PrecioMegaPromos6 = {49.2,36.5,15.0};
    int [] carritomenuMegaPromos6 = new int [3];
    double [] subtotal_MegaPromos6={0, 0, 0};
    String[] ExclusivasWeb6 = {"Pizza de Mariscos Premium","Pasta Napolitana Gourmet","Pizza Cuatro Quesos Deluxe"};
    double[] PrecioExclusivasWeb6 = {51.2,38.50,12.4};
    int [] carritomenuExclusivasWeb6 =new int [3];
    double []subtotal_ExclusivasWeb6={0, 0, 0};
    String[] ParaMí6 = {"Wrap Mediterráneo ","Ensalada César con Pollo","Sándwich de Roast Beef y Aguacate"};
    double[] PrecioParaMí6 = {52.4,38.2,14.6};
    int [] carritomenuParamí6 =new int[3];
    double []subtotal_Paramí6={0,0,0};
    String[] Antojitos6 = {"Papas con Cheddar y Tocino","Nachos con Salsa Mexicana","Mini Pizzas Margarita"};
    double[] PrecioAntojitos6 = {48.5,41.2,15.2};
    int [] carritomenuAntojitos6=new int[3];
    double []subtotal_Antojitos6={0, 0, 0};
    String[] Bebidas6 = {"Malteada de Café","Té Helado de Frutas","Jarra de Chicha Morada"};
    double[] PrecioBebidas6 = {12.3,5.2,8.7};
    int [] carritoBebidas6=new int [3];
    double []subtotal_Bebidas6={0, 0, 0};
    public void MenuPrincipal(String Ubicaccion){
        System.out.println("---Bienvenido a Pizza Hut---");
        int opcciones;
        int hola;
        switch (Ubicaccion.toUpperCase()) {
            case "SALIDA HUANCANE":
                System.out.println("En Pizza Hut cerca a " +Ubicaccion+" tenemos los siguientes menus: ");
                opcciones=Opcciones();
                switch (opcciones){
                    case 1:
                        hola =Menus(LoNuevo1,PrecioLoNuevo1);
                        CompraLoNuevo1(hola,LoNuevo1,PrecioLoNuevo1);
                        menusito();
                        break;
                    case 2:
                        hola=Menus(PideAhora1,PrecioPideAhora1);
                        CompraPideAhora1(hola,PideAhora1,PrecioPideAhora1);
                        menusito();
                        break;
                    case 3:
                        hola=Menus(MegaPromos1,PrecioMegaPromos1);
                        CompraMegaPromos1(hola,MegaPromos1,PrecioMegaPromos1);
                        menusito();
                        break;
                    case 4:
                        hola=Menus(ExclusivasWeb1,PrecioExclusivasWeb1);
                        CompraExclusivasWeb1(hola,ExclusivasWeb1,PrecioExclusivasWeb1);
                        menusito();
                        break;
                    case 5:
                        hola=Menus(ParaMí1,PrecioParaMí1);
                        CompraParamí1(hola,ParaMí1,PrecioParaMí1);
                        menusito();
                        break;
                    case 6:
                        hola =Menus(Antojitos1,PrecioAntojitos1);
                        Antojitos1(hola,Antojitos1,PrecioAntojitos1);
                        menusito();
                        break;
                    case 7:
                        hola =Menus(Bebidas1,PrecioBebidas1);
                        CompraBebidas1(hola,Bebidas1,PrecioBebidas1);
                        menusito();
                        break;
                }
                break;
            case "SALIDA CUSCO":
                System.out.println("En Pizza Hut cerca a " +Ubicaccion+" tenemos los siguientes menus: ");
                opcciones=Opcciones();
                switch (opcciones){
                    case 1:
                        hola =Menus(LoNuevo2,PrecioLoNuevo2);
                        CompraLoNuevo2(hola,LoNuevo2,PrecioLoNuevo2);
                        menusito();
                        break;
                    case 2:
                        hola=Menus(PideAhora2,PrecioPideAhora2);
                        CompraPideAhora2(hola,PideAhora2,PrecioPideAhora2);
                        menusito();
                        break;
                    case 3:
                        hola=Menus(MegaPromos2,PrecioMegaPromos2);
                        CompraMegaPromos2(hola,MegaPromos2,PrecioMegaPromos2);
                        menusito();
                        break;
                    case 4:
                        hola=Menus(ExclusivasWeb2,PrecioExclusivasWeb2);
                        CompraExclusivasWeb2(hola,ExclusivasWeb2,PrecioExclusivasWeb2);
                        menusito();
                        break;
                    case 5:
                        hola=Menus(ParaMí2,PrecioParaMí2);
                        CompraParamí2(hola,ParaMí2,PrecioParaMí2);
                        menusito();
                        break;
                    case 6:
                        hola =Menus(Antojitos2,PrecioAntojitos2);
                        Antojitos2(hola,Antojitos2,PrecioAntojitos2);
                        menusito();
                        break;
                    case 7:
                        hola =Menus(Bebidas2,PrecioBebidas2);
                        CompraBebidas2(hola,Bebidas2,PrecioBebidas2);
                        menusito();
                        break;
                }
                break;
            case "SALIDA PUNO":
                System.out.println("En Pizza Hut cerca a " +Ubicaccion+" tenemos los siguientes menus: ");
                opcciones=Opcciones();
                switch (opcciones){
                    case 1:
                        hola =Menus(LoNuevo3,PrecioLoNuevo3);
                        CompraLoNuevo3(hola,LoNuevo3,PrecioLoNuevo3);
                        menusito();
                        break;
                    case 2:
                        hola=Menus(PideAhora3,PrecioPideAhora3);
                        CompraPideAhora3(hola,PideAhora3,PrecioPideAhora3);
                        menusito();
                        break;
                    case 3:
                        hola=Menus(MegaPromos3,PrecioMegaPromos3);
                        CompraMegaPromos3(hola,MegaPromos3,PrecioMegaPromos3);
                        menusito();
                        break;
                    case 4:
                        hola=Menus(ExclusivasWeb3,PrecioExclusivasWeb3);
                        CompraExclusivasWeb3(hola,ExclusivasWeb3,PrecioExclusivasWeb3);
                        menusito();
                        break;
                    case 5:
                        hola=Menus(ParaMí3,PrecioParaMí3);
                        CompraParamí3(hola,ParaMí3,PrecioParaMí3);
                        menusito();
                        break;
                    case 6:
                        hola =Menus(Antojitos3,PrecioAntojitos3);
                        Antojitos3(hola,Antojitos3,PrecioAntojitos3);
                        menusito();
                        break;
                    case 7:
                        hola =Menus(Bebidas3,PrecioBebidas3);
                        CompraBebidas3(hola,Bebidas3,PrecioBebidas3);
                        menusito();
                        break;
                }
                break;
            case "SALIDA AREQUIPA":
                System.out.println("En Pizza Hut cerca a " +Ubicaccion+" tenemos los siguientes menus: ");
                opcciones=Opcciones();
                switch (opcciones){
                    case 1:
                        hola =Menus(LoNuevo4,PrecioLoNuevo4);
                        CompraLoNuevo4(hola,LoNuevo4,PrecioLoNuevo4);
                        menusito();
                        break;
                    case 2:
                        hola=Menus(PideAhora4,PrecioPideAhora4);
                        CompraPideAhora4(hola,PideAhora4,PrecioPideAhora4);
                        menusito();
                        break;
                    case 3:
                        hola=Menus(MegaPromos4,PrecioMegaPromos4);
                        CompraMegaPromos4(hola,MegaPromos4,PrecioMegaPromos4);
                        menusito();
                        break;
                    case 4:
                        hola=Menus(ExclusivasWeb4,PrecioExclusivasWeb4);
                        CompraExclusivasWeb4(hola,ExclusivasWeb4,PrecioExclusivasWeb4);
                        menusito();
                        break;
                    case 5:
                        hola=Menus(ParaMí4,PrecioParaMí4);
                        CompraParamí4(hola,ParaMí4,PrecioParaMí4);
                        menusito();
                        break;
                    case 6:
                        hola =Menus(Antojitos4,PrecioAntojitos4);
                        Antojitos4(hola,Antojitos4,PrecioAntojitos4);
                        menusito();
                        break;
                    case 7:
                        hola =Menus(Bebidas4,PrecioBebidas4);
                        CompraBebidas4(hola,Bebidas4,PrecioBebidas4);
                        menusito();
                        break;
                }
                break;
            case "CENTRO DE JULIACA":
                System.out.println("En Pizza Hut cerca a " +Ubicaccion+" tenemos los siguientes menus: ");
                opcciones=Opcciones();
                switch (opcciones){
                    case 1:
                        hola =Menus(LoNuevo5,PrecioLoNuevo5);
                        CompraLoNuevo5(hola,LoNuevo5,PrecioLoNuevo5);
                        menusito();
                        break;
                    case 2:
                        hola=Menus(PideAhora5,PrecioPideAhora5);
                        CompraPideAhora5(hola,PideAhora5,PrecioPideAhora5);
                        menusito();
                        break;
                    case 3:
                        hola=Menus(MegaPromos1,PrecioMegaPromos1);
                        CompraMegaPromos5(hola,MegaPromos5,PrecioMegaPromos5);
                        menusito();
                        break;
                    case 4:
                        hola=Menus(ExclusivasWeb5,PrecioExclusivasWeb5);
                        CompraExclusivasWeb5(hola,ExclusivasWeb5,PrecioExclusivasWeb5);
                        menusito();
                        break;
                    case 5:
                        hola=Menus(ParaMí5,PrecioParaMí5);
                        CompraParamí5(hola,ParaMí5,PrecioParaMí5);
                        menusito();
                        break;
                    case 6:
                        hola =Menus(Antojitos5,PrecioAntojitos5);
                        Antojitos5(hola,Antojitos5,PrecioAntojitos5);
                        menusito();
                        break;
                    case 7:
                        hola =Menus(Bebidas5,PrecioBebidas5);
                        CompraBebidas5(hola,Bebidas5,PrecioBebidas5);
                        menusito();
                        break;
                }
                break;
            case "SALIDA LAMPA":
                System.out.println("En Pizza Hut cerca a " +Ubicaccion+" tenemos los siguientes menus: ");
                opcciones=Opcciones();
                switch (opcciones){
                    case 1:
                        hola =Menus(LoNuevo6,PrecioLoNuevo6);
                        CompraLoNuevo6(hola,LoNuevo6,PrecioLoNuevo6);
                        menusito();
                        break;
                    case 2:
                        hola=Menus(PideAhora6,PrecioPideAhora6);
                        CompraPideAhora6(hola,PideAhora6,PrecioPideAhora6);
                        menusito();
                        break;
                    case 3:
                        hola=Menus(MegaPromos6,PrecioMegaPromos6);
                        CompraMegaPromos6(hola,MegaPromos6,PrecioMegaPromos6);
                        menusito();
                        break;
                    case 4:
                        hola=Menus(ExclusivasWeb6,PrecioExclusivasWeb6);
                        CompraExclusivasWeb6(hola,ExclusivasWeb6,PrecioExclusivasWeb6);
                        menusito();
                        break;
                    case 5:
                        hola=Menus(ParaMí6,PrecioParaMí6);
                        CompraParamí6(hola,ParaMí6,PrecioParaMí6);
                        menusito();
                        break;
                    case 6:
                        hola =Menus(Antojitos6,PrecioAntojitos6);
                        Antojitos6(hola,Antojitos6,PrecioAntojitos6);
                        menusito();
                        break;
                    case 7:
                        hola =Menus(Bebidas6,PrecioBebidas6);
                        CompraBebidas6(hola,Bebidas6,PrecioBebidas6);
                        menusito();
                        break;
                }
                break;
        }
    }
    public int Menus(String [] menu, double [] precio){
        int opccion;
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Opción " + (i + 1) + " : " + menu[i] + " - Precio: S/." + precio[i]);
        }
        opccion=ValidarEntradaNumerica(1,3,"Ingrese una opccio del 1-3");
        int opccionSeleccionada=opccion-1;
        return opccionSeleccionada;
    }
    public int Opcciones (){
        int opccion;
        System.out.println("1.- Lo nuevo");
        System.out.println("2.- Pide ahora");
        System.out.println("3.- Megapromos");
        System.out.println("4.- Exclusivas web");
        System.out.println("5.- Para mí");
        System.out.println("6.- Antojitos");
        System.out.println("7.- Bebidas");
        opccion = ValidarEntradaNumerica(1,6,"Ingrese un valor del 1 al 6");
        return opccion;
    }
    public void compras(int opccion){

    }
    public void CompraLoNuevo1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo1[opccion] += cantidad;
        subtotal_LoNuevo1[opccion]=carritomenuLoNuevo1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuLoNuevo1[opccion]+" de " +menu[opccion]);
    }
    public void CompraLoNuevo2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo2[opccion] += cantidad;
        subtotal_LoNuevo2[opccion]=carritomenuLoNuevo2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuLoNuevo2[opccion]+" de " +menu[opccion]);
    }
    public void CompraLoNuevo3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo3[opccion] += cantidad;
        subtotal_LoNuevo3[opccion]=carritomenuLoNuevo3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuLoNuevo3[opccion]+" de " +menu[opccion]);
    }
    public void CompraLoNuevo4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo4[opccion] += cantidad;
        subtotal_LoNuevo4[opccion]=carritomenuLoNuevo4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuLoNuevo4[opccion]+" de " +menu[opccion]);
    }
    public void CompraLoNuevo5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo5[opccion] += cantidad;
        subtotal_LoNuevo5[opccion]=carritomenuLoNuevo5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuLoNuevo5[opccion]+" de " +menu[opccion]);
    }
    public void CompraLoNuevo6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuLoNuevo6[opccion] += cantidad;
        subtotal_LoNuevo6[opccion]=carritomenuLoNuevo6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuLoNuevo6[opccion]+" de " +menu[opccion]);
    }
    //PideAhora
    public void CompraPideAhora1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora1[opccion] += cantidad;
        subtotal_PideAhora1[opccion]=carritomenuPideAhora1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuPideAhora1[opccion]+" de " +menu[opccion]);
    }
    public void CompraPideAhora2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora2[opccion] += cantidad;
        subtotal_PideAhora2[opccion]=carritomenuPideAhora2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuPideAhora2[opccion]+" de " +menu[opccion]);
    }
    public void CompraPideAhora3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora3[opccion] += cantidad;
        subtotal_PideAhora3[opccion]=carritomenuPideAhora3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuPideAhora3[opccion]+" de " +menu[opccion]);
    }
    public void CompraPideAhora4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora4[opccion] += cantidad;
        subtotal_PideAhora4[opccion]=carritomenuPideAhora4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuPideAhora4[opccion]+" de " +menu[opccion]);
    }
    public void CompraPideAhora5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora5[opccion] += cantidad;
        subtotal_PideAhora5[opccion]=carritomenuPideAhora5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuPideAhora5[opccion]+" de " +menu[opccion]);
    }
    public void CompraPideAhora6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuPideAhora6[opccion] += cantidad;
        subtotal_PideAhora6[opccion]=carritomenuPideAhora6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuPideAhora6[opccion]+" de " +menu[opccion]);
    }
    //MegaPrmos
    public void CompraMegaPromos1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos1[opccion] += cantidad;
        subtotal_MegaPromos1[opccion]=carritomenuMegaPromos1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuMegaPromos1[opccion]+" de " +menu[opccion]);
    }
    public void CompraMegaPromos2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos2[opccion] += cantidad;
        subtotal_MegaPromos2[opccion]=carritomenuMegaPromos2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuMegaPromos2[opccion]+" de " +menu[opccion]);
    }
    public void CompraMegaPromos3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos3[opccion] += cantidad;
        subtotal_MegaPromos3[opccion]=carritomenuMegaPromos3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuMegaPromos3[opccion]+" de " +menu[opccion]);
    }
    public void CompraMegaPromos4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos4[opccion] += cantidad;
        subtotal_MegaPromos4[opccion]=carritomenuMegaPromos4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuMegaPromos4[opccion]+" de " +menu[opccion]);
    }
    public void CompraMegaPromos5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos5[opccion] += cantidad;
        subtotal_MegaPromos5[opccion]=carritomenuMegaPromos5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuMegaPromos5[opccion]+" de " +menu[opccion]);

    }
    public void CompraMegaPromos6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuMegaPromos6[opccion] += cantidad;
        subtotal_MegaPromos6[opccion]=carritomenuMegaPromos6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuMegaPromos6[opccion]+" de " +menu[opccion]);

    }
    //ExclusivasWeb
    public void CompraExclusivasWeb1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb1[opccion] += cantidad;
        subtotal_ExclusivasWeb1[opccion]=carritomenuExclusivasWeb1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuExclusivasWeb1[opccion]+" de " +menu[opccion]);

    }
    public void CompraExclusivasWeb2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb2[opccion] += cantidad;
        subtotal_ExclusivasWeb2[opccion]=carritomenuExclusivasWeb2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuExclusivasWeb2[opccion]+" de " +menu[opccion]);
    }
    public void CompraExclusivasWeb3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb3[opccion] += cantidad;
        subtotal_ExclusivasWeb3[opccion]=carritomenuExclusivasWeb3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuExclusivasWeb3[opccion]+" de " +menu[opccion]);
    }
    public void CompraExclusivasWeb4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb4[opccion] += cantidad;
        subtotal_ExclusivasWeb4[opccion]=carritomenuExclusivasWeb4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuExclusivasWeb4[opccion]+" de " +menu[opccion]);
    }
    public void CompraExclusivasWeb5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb5[opccion] += cantidad;
        subtotal_ExclusivasWeb5[opccion]=carritomenuExclusivasWeb5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuExclusivasWeb5[opccion]+" de " +menu[opccion]);
    }
    public void CompraExclusivasWeb6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuExclusivasWeb6[opccion] += cantidad;
        subtotal_ExclusivasWeb6[opccion]=carritomenuExclusivasWeb6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuExclusivasWeb6[opccion]+" de " +menu[opccion]);
    }
    //Paramí
    public void CompraParamí1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí1[opccion] += cantidad;
        subtotal_Paramí1[opccion]=carritomenuParamí1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuParamí1[opccion]+" de " +menu[opccion]);
    }
    public void CompraParamí2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí2[opccion] += cantidad;
        subtotal_Paramí2[opccion]=carritomenuParamí2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuParamí2[opccion]+" de " +menu[opccion]);
    }
    public void CompraParamí3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí3[opccion] += cantidad;
        subtotal_Paramí3[opccion]=carritomenuParamí3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuParamí3[opccion]+" de " +menu[opccion]);
    }
    public void CompraParamí4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí4[opccion] += cantidad;
        subtotal_Paramí4[opccion]=carritomenuParamí4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuParamí4[opccion]+" de " +menu[opccion]);
    }
    public void CompraParamí5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí5[opccion] += cantidad;
        subtotal_Paramí5[opccion]=carritomenuParamí5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuParamí5[opccion]+" de " +menu[opccion]);
    }
    public void CompraParamí6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuParamí6[opccion] += cantidad;
        subtotal_Paramí6[opccion]=carritomenuParamí6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuParamí6[opccion]+" de " +menu[opccion]);
    }
    //Antojitos
    public void Antojitos1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos1[opccion] += cantidad;
        subtotal_Antojitos1[opccion]=carritomenuAntojitos1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuAntojitos1[opccion]+" de " +menu[opccion]);
    }
    public void Antojitos2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos2[opccion] += cantidad;
        subtotal_Antojitos2[opccion]=carritomenuAntojitos2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuAntojitos2[opccion]+" de " +menu[opccion]);
    }
    public void Antojitos3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos3[opccion] += cantidad;
        subtotal_Antojitos3[opccion]=carritomenuAntojitos3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuAntojitos3[opccion]+" de " +menu[opccion]);
    }
    public void Antojitos4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos4[opccion] += cantidad;
        subtotal_Antojitos4[opccion]=carritomenuAntojitos4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuAntojitos4[opccion]+" de " +menu[opccion]);
    }
    public void Antojitos5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos5[opccion] += cantidad;
        subtotal_Antojitos5[opccion]=carritomenuAntojitos5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuAntojitos5[opccion]+" de " +menu[opccion]);
    }
    public void Antojitos6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritomenuAntojitos6[opccion] += cantidad;
        subtotal_Antojitos6[opccion]=carritomenuAntojitos6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritomenuAntojitos6[opccion]+" de " +menu[opccion]);
    }

    //Bebidas
    public void CompraBebidas1(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas1[opccion] += cantidad;
        subtotal_Bebidas1[opccion]=carritoBebidas1[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritoBebidas1[opccion]+" de " +menu[opccion]);
    }
    public void CompraBebidas2(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas2[opccion] += cantidad;
        subtotal_Bebidas2[opccion]=carritoBebidas2[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritoBebidas2[opccion]+" de " +menu[opccion]);
    }
    public void CompraBebidas3(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas3[opccion] += cantidad;
        subtotal_Bebidas3[opccion]=carritoBebidas3[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritoBebidas3[opccion]+" de " +menu[opccion]);
    }
    public void CompraBebidas4(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas4[opccion] += cantidad;
        subtotal_Bebidas4[opccion]=carritoBebidas4[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritoBebidas4[opccion]+" de " +menu[opccion]);
    }
    public void CompraBebidas5(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas5[opccion] += cantidad;
        subtotal_Bebidas5[opccion]=carritoBebidas5[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritoBebidas5[opccion]+" de " +menu[opccion]);
    }
    public void CompraBebidas6(int opccion, String [] menu,double [] precio){
        int cantidad;
        System.out.println("Cuantas comidas comprara de "+menu[opccion]+"?.  Ingrese la cantidad");
        cantidad=ValidarEntradaNumerica(0,15,"Para compras mayores a 15 platos llamar al +51 974 261 517");
        carritoBebidas6[opccion] += cantidad;
        subtotal_Bebidas6[opccion]=carritoBebidas6[opccion]*precio[opccion];
        System.out.println("Compra realizada con exito!!..");
        System.out.println("Ud a compradao"+ carritoBebidas6[opccion]+" de " +menu[opccion]);
    }
    public void menusito(){
        int opccion;
        System.out.println("Que desea hacer ahora??");
        System.out.println("1.- Elegir otra pizza cerca de mi ubicaccion");
        System.out.println("2.- Pagar");
        System.out.println("3.- Seleccionar otra ubicación");
        opccion=ValidarEntradaNumerica(1,3,"Ingrese una opccion del 1-3");
        switch (opccion){
            case 1:
                MenuPrincipal(Ubic);
                break;
            case 2:
                System.out.println("Comida gratis para todos!!");
                break;
            case 3:
                mostrarMenu();
                break;
        }
    }
    public void sistema(){
        MenuPrincipal(Ubic);
    }

    public static void main(String[] args) {
        PizzaHut pizzaHut = new PizzaHut();
        pizzaHut.mostrarMenu();
    }
}
