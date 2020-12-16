
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object objCompared) {
        if (this == objCompared) {
            return true;
        }      
        if (!(objCompared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) objCompared;
        if (this.name.equals(comparedItem.getName())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    
    
}
