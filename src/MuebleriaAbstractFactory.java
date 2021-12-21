import Chair.IChair;
import CoffeeTable.ICoffeeTable;
import Sofa.ISofa;

public interface MuebleriaAbstractFactory {
    public  IChair createChair();
    public  ISofa createSofa();
    public  ICoffeeTable createCoffeeTable();
}