public class Bebidas implements Menu {

    private int numeroBebidas;

    public Bebidas(int numeroBebidas) {
        this.numeroBebidas = numeroBebidas;
    }

    @Override
    public void preparar() {
        System.out.print("Se preparará " + numeroBebidas + " bebida(s). ");
    }

    @Override
    public void tipo(String tipo) {
        System.out.println("Se preparará " + tipo);
    }


}
