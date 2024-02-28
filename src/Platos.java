public class Platos implements ItemComida{

    @Override
    public void item() {
        System.out.println("Se preparará una comida");
    }

    @Override
    public void postre() {
        System.out.println("Se preparará un postre");
    }

    @Override
    public void platoFuerte() {
        System.out.println("Se preparará un plato fuerte");
    }


}
