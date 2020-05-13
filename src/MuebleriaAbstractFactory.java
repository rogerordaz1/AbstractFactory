import Chair.IChair;
import CoffeeTable.ICoffeeTable;
import Sofa.ISofa;

public abstract class MuebleriaAbstractFactory {
    public abstract IChair createChair();
    public abstract ISofa createSofa();
    public abstract ICoffeeTable createCoffeeTable();
}