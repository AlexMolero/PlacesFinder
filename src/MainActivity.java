import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        menu.show();
        int option = menu.getOption(scanner);
        System.out.println(option);
    }
}
