package designPatterns.factoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS os = osf.getInstance("dead");
        os.spec();
    }
}
