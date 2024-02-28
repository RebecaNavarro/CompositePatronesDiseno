public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos al restaurante de Las Lindas Chiquillas");

        MenuComposite menu = new MenuComposite();

        Menu plato1 = new Platos(2);
        Menu plato2 = new Platos(1);

        Menu bebida1 = new Bebidas(3);
        Menu bebida2 = new Bebidas(2);

        menu.add(plato1);
        menu.add(plato2);
        menu.add(bebida1);
        menu.add(bebida2);

        menu.preparar();
    }


}