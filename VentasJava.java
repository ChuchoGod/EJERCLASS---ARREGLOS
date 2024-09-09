import java.util.Scanner;

public class VentasJava {
    static int[][] ventas = new int[3][12];  // Arreglo para almacenar las ventas
    static String[] departamentos = {"Ropa", "Deportes", "Juguetería"};  // Nombres de los departamentos
    static Scanner sc = new Scanner(System.in);  // Scanner para capturar la entrada del usuario

    public static void main(String[] args) {
        menu();  // Llamar al menú principal
    }

    // Método para insertar las ventas por departamento
    public static void insertarVentas() {
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("Inserte las ventas del departamento de " + departamentos[i] + ":");
            for (int j = 0; j < 12; j++) {
                while (true) {
                    try {
                        System.out.print("Mes " + (j + 1) + ": ");
                        int venta = Integer.parseInt(sc.nextLine());
                        if (venta >= 0) {
                            ventas[i][j] = venta;
                            break;
                        } else {
                            System.out.println("Por favor, ingrese un valor válido (venta positiva).");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese un número válido.");
                    }
                }
            }
        }
    }

    // Método para buscar una venta específica por departamento y mes
    public static void buscarVenta() {
        while (true) {
            try {
                System.out.print("Ingrese el número del departamento (0=Ropa, 1=Deportes, 2=Juguetería): ");
                int departamento = Integer.parseInt(sc.nextLine());
                System.out.print("Ingrese el número del mes (1-12): ");
                int mes = Integer.parseInt(sc.nextLine());

                if (departamento >= 0 && departamento < ventas.length && mes >= 1 && mes <= 12) {
                    System.out.println("La venta del departamento de " + departamentos[departamento] +
                            " en el mes " + mes + " es: " + ventas[departamento][mes - 1]);
                    break;
                } else {
                    System.out.println("Datos incorrectos, por favor inténtelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese números válidos.");
            }
        }
    }

    // Método para eliminar (poner a 0) todas las ventas de un departamento
    public static void eliminarVentas() {
        while (true) {
            try {
                System.out.print("Ingrese el número del departamento que desea eliminar (0=Ropa, 1=Deportes, 2=Juguetería): ");
                int departamento = Integer.parseInt(sc.nextLine());
                if (departamento >= 0 && departamento < ventas.length) {
                    for (int j = 0; j < 12; j++) {
                        ventas[departamento][j] = 0;  // Poner todas las ventas a 0
                    }
                    System.out.println("Las ventas del departamento de " + departamentos[departamento] + " han sido eliminadas.");
                    break;
                } else {
                    System.out.println("Departamento no encontrado, por favor inténtelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    // Menú principal para ejecutar las funciones
    public static void menu() {
        while (true) {
            System.out.println("\n--- Menú de Ventas ---");
            System.out.println("1. Insertar ventas");
            System.out.println("2. Buscar venta");
            System.out.println("3. Eliminar ventas de un departamento");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    insertarVentas();
                    break;
                case "2":
                    buscarVenta();
                    break;
                case "3":
                    eliminarVentas();
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida, por favor elija una opción correcta.");
            }
        }
    }
}