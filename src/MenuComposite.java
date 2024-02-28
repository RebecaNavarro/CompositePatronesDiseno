import java.util.ArrayList;
import java.util.List;

public class MenuComposite implements Menu{

    private List<Menu> items = new ArrayList<>();

    private List<String> itemsTipo = new ArrayList<>();

    public void add(Menu item) {
        items.add(item);
    }

    @Override
    public void tipo(String tipo) {
        itemsTipo.add(tipo);
    }

    public void remove(Menu item) {
        items.remove(item);
        itemsTipo.remove(item);
    }

    @Override
    public void preparar() {

        for (int i = 0; i < items.size(); i++) {
            Menu item = items.get(i);
            item.preparar();
            if (i < itemsTipo.size()) {
                item.tipo(itemsTipo.get(i));
            } else { //cuando ya acabemos todos los tipos
                System.out.print("");
            }

        }
    }
}
