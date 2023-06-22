import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private String direccion;
    private ArrayList<Tablets> catalogo_tablets = new ArrayList<Tablets>();
    private ArrayList<Notebook> catalogo_notebooks = new ArrayList<Notebook>();
    private ArrayList<Computador> catalogo_computador = new ArrayList<Computador>();
    private ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();


    public void agregarClientes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Registro de Cliente");
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido");
        String apellido = sc.next();
        System.out.println("Ingrese su correo electronico");
        String correo = sc.next();
        System.out.println("Ingrese su telefono");
        String telefono = sc.next();
        System.out.println("Ingrese su estado civil");
        String estado = sc.next();
        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = sc.next();

        Cliente cliente = new Cliente(nombre, apellido, correo, telefono, estado, ciudad);

        for (Cliente a :lista_clientes) {
            if (cliente == a){
                System.out.println("Cliente ya existente");
            }
            else lista_clientes.add(cliente);
        }
    }

    public void agregarObjTec() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que objeto desea agregar");
        System.out.println("[1] Tablets");
        System.out.println("[2] Notebook");
        System.out.println("[3] Computador");
        int a = sc.nextInt();
        switch(a){
            case 1:
                agregarTablet();
                break;
            case 2:
                agregarNotebook();
                break;
            case 3:
                agregarComputador();
                break;
            default:
                System.out.println("opcion incorrecta, intentar de nuevo");
                agregarObjTec();
        }
    }

    private void agregarTablet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingreso de Tablets");
        System.out.println("Ingrese marca");
        String marca = sc.next();
        System.out.println("Ingrese RAM");
        String RAM = sc.next();
        System.out.println("Ingrese almacenamiento");
        String almacenamiento = sc.next();
        System.out.println("Ingrese procesador");
        String procesador = sc.next();
        System.out.println("Ingrese modelo");
        String modelo = sc.next();
        System.out.println("Ingrese año");
        int year = sc.nextInt();
        System.out.println("Ingrese precio");
        int precio = sc.nextInt();
        System.out.println("Ingrese stock");
        int stock = sc.nextInt();
        System.out.println("Ingrese la resolucion de pantalla");
        String resolucion_pantalla = sc.next();
        System.out.println("Ingrese un accesorio");
        String accesorio = sc.next();

        Tablets tablet = new Tablets(marca, RAM, almacenamiento, procesador, modelo, year, precio, stock, resolucion_pantalla, accesorio);
        catalogo_tablets.add(tablet);
    }

    private void agregarNotebook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingreso de Tablets");
        System.out.println("Ingrese marca");
        String marca = sc.next();
        System.out.println("Ingrese RAM");
        String RAM = sc.next();
        System.out.println("Ingrese almacenamiento");
        String almacenamiento = sc.next();
        System.out.println("Ingrese procesador");
        String procesador = sc.next();
        System.out.println("Ingrese modelo");
        String modelo = sc.next();
        System.out.println("Ingrese año");
        int year = sc.nextInt();
        System.out.println("Ingrese precio");
        int precio = sc.nextInt();
        System.out.println("Ingrese stock");
        int stock = sc.nextInt();
        System.out.println("Ingrese la resolucion de pantalla");
        String resolucion_pantalla = sc.next();
        System.out.println("Ingrese un accesorio");
        String accesorio = sc.next();

        Notebook notebook = new Notebook(marca, RAM, almacenamiento, procesador, modelo, year, precio, stock, resolucion_pantalla, accesorio);
        catalogo_tablets.add(notebook);
    }



}
