import java.util.Scanner;

public class Menu {
    Scanner scanner;
    public static void show(){
        System.out.println("—- Places Finder —");
        System.out.println("1. Buscar un local");
        System.out.println("2. Estadísticas");
        System.out.println("3. Salir");
    }
    public static void showLocal(){
        System.out.println("1. Tienda / museo / discoteca ");
        System.out.println("2. Restaurante");
    }
    public int getOption(Scanner scanner){
        System.out.println("Escriba la accion que desea realizar:");
        int option = scanner.nextInt();
        return option;
    }
}
