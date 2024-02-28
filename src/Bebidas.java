public class Bebidas implements Menu {

    private int numeroBebidas;

    public Bebidas(int numeroBebidas) {
        this.numeroBebidas = numeroBebidas;
    }

    @Override
    public void preparar() {
        System.out.println("Se preparará " + numeroBebidas + " bebida(s)");
    }

}
