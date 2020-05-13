import Chair.IChair;
import Chair.VictorianChair;
import CoffeeTable.ICoffeeTable;
import CoffeeTable.VictorianCoffeeTable;
import Sofa.ISofa;
import Sofa.VictorianSofa;

public class MuebleriaVictorianFactory extends MuebleriaAbstractFactory {
    @Override
    public IChair createChair() {
        IChair chair = new VictorianChair();
        return chair;
    }

    @Override
    public ISofa createSofa() {
        ISofa sofa = new VictorianSofa();
        return sofa;
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        ICoffeeTable coffeeTable = new VictorianCoffeeTable();
        return coffeeTable;
    }
}
