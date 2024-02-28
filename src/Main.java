public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al resturante Las Lindas Chiquillas");

        Menu bebidas = new Bebidas();
        ItemComida comida = new Platos();

        bebidas.item();

        comida.platoFuerte();
        comida.postre();

    }
}