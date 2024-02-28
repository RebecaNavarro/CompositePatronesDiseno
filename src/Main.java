public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos al restaurante de Las Lindas Chiquillas");

        MenuComposite menu = new MenuComposite();
        MenuComposite menu1 = new MenuComposite();
        MenuComposite menu2 = new MenuComposite();

        Menu plato1 = new Platos(2);
        Menu plato2 = new Platos(1);
        Menu bebida1 = new Bebidas(2);
        Menu bebida2 = new Bebidas(1);

        //hojas del principio
        plato1.preparar();
        plato1.tipo("Plato fuerte");

        menu1.tipo("Jugo de naranja");
        menu1.add(bebida1);
        menu1.add(plato2);
        menu1.tipo("Postres");

        menu2.add(bebida2);
        menu2.tipo("Café");

        menu1.add(menu2);

        menu.add(menu1);

        menu.preparar();

        System.out.println("Ya se preparó todo");
    }


}