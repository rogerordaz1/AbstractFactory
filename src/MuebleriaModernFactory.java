import Chair.IChair;
import Chair.ModernChair;
import CoffeeTable.ICoffeeTable;
import CoffeeTable.MordernCoffeeTable;
import Sofa.ISofa;
import Sofa.ModernSofa;

public class MuebleriaModernFactory implements MuebleriaAbstractFactory {
    @Override
    public IChair createChair() {
        IChair chair = new ModernChair();
        return chair;
    }

    @Override
    public ISofa createSofa() {
        ISofa sofa = new ModernSofa();
        return sofa;
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        ICoffeeTable coffeeTable = new MordernCoffeeTable();
        return coffeeTable;
    }
}
