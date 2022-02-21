package designPatterns.factoryPattern;

public class OSFactory {
    public OS getInstance(String s){
        if (s.equals("utility"))
            return new Android();
        else if (s.equals("hype"))
            return new IOS();
        else
            return new WindowsOS();
    }
}
