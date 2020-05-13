package CoffeeTable;

public class VictorianCoffeeTable implements ICoffeeTable {
    @Override
    public String getType() {
        return "Vicotrian";
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
