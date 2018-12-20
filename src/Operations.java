public class Operations {

    public void actions(int option){
        Menu menu = new Menu();
        switch (option){
            case 1:
                System.out.println("Tipo de locales ");
                menu.showLocal();
                break;
            case 2:

                break;
            default:

                break;
        }
    }
    public void localAction(int option){
        switch (option){
            case 1:
                System.out.println("Tienda / museo / discoteca");
                break;
            case 2:
                System.out.println("Restaurantes");
                break;
        }
    }
}
