package coreJava.cloning;

public class ShallowCopy {
    int a;
    int b;

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        ShallowCopy obj = new ShallowCopy();
        obj.a = 5;
        obj.b = 10;
        System.out.println(obj);

        // performing shallow copy
        ShallowCopy obj1 = obj;
        obj1.a = 6;

        System.out.println("***** after performing shallow copy *****");
        System.out.println(obj1); // this object a value changes to 6
        System.out.println(obj); // this original object a value also changes to 6 -> because both obj and obj1 refereneces are pointing to the same object
    }
}
