package CoffeeTable;

public interface ICoffeeTable {
    String getType();
    String getColor();
    static String me(){
        return "CoffeTable";
    }
}
