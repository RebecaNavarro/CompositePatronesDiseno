public class Platos implements Menu{

    private int numeroPlatos;

    public Platos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    @Override
    public void preparar() {
        System.out.print("Se preparará " + numeroPlatos + " plato(s). ");
    }

    @Override
    public void tipo(String tipo) {
        System.out.println("Se preparará " + tipo);
    }
}
