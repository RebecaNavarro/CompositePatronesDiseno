import java.util.ArrayList;
import java.util.List;

public class MenuComposite implements Menu{

    private List<Menu> items = new ArrayList<>();

    public void add(Menu item) {
        items.add(item);
    }

    public void remove(Menu item) {
        items.remove(item);
    }

    @Override
    public void preparar() {
        for (Menu item : items) { //itera en la lista
            item.preparar();
        }
    }

}
