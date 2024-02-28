public class Platos implements Menu{

    private int numeroPlatos;

    public Platos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    @Override
    public void preparar() {
        System.out.println("Se preparará " + numeroPlatos + " plato(s)");
    }
}
