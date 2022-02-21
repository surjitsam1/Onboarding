package coreJava.cloning;

public class DeepCopy {
    int a;
    int b;

    @Override
    public String toString() {
        return "DeepCopy{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        DeepCopy obj = new DeepCopy();
        obj.a = 5;
        obj.b = 10;
        System.out.println(obj);

        // performing deep copy
        DeepCopy obj1 = new DeepCopy();
        obj1.a = obj.a;
        obj1.b = obj.b;

        obj1.a = 6;
        System.out.println("***** after performing deep copy *****");
        System.out.println(obj1); // Only this object a value changes to 6
        System.out.println(obj); // no change in this original object
    }
}

