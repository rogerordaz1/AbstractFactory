package Sofa;

public class VictorianSofa implements ISofa {
    @Override
    public String style() {
        return "Victorian";
    }

    @Override
    public String material() {
        return "leather";
    }

    @Override
    public String color() {
        return "brown";
    }
}
