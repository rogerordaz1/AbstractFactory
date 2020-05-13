import Chair.IChair;


public class Client {

    public static void main (String [] args) {
        // example to modern factory
        MuebleriaAbstractFactory modernFactory = new MuebleriaModernFactory();
        // instance of Chair from the modern factory
        IChair modernChair =  modernFactory.createChair();
        System.out.println(modernChair.toString());

        //example to victorian factory
        MuebleriaAbstractFactory victorianFactory = new MuebleriaVictorianFactory();
        // instance of Chair from the victorian factory
        IChair victorianChair = victorianFactory.createChair();
        System.out.println(victorianChair.toString());
    }
}
