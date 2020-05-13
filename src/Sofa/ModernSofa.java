package Sofa;

public class ModernSofa implements ISofa {
    @Override
    public String style() {
        return "Modern";
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
