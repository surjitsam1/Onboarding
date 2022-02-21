package coreJava.cloning;

public class Clone implements Cloneable{
    int a;
    int b;

    @Override
    public String toString() {
        return "Clone{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {

        Clone obj = new Clone();
        obj.a = 5;
        obj.b = 10;
        System.out.println(obj);

        // performing clone
        try{
            Clone obj1 =(Clone) obj.clone();
            obj1.a=6;
            System.out.println("***** after performing clone *****");
            System.out.println(obj1); // Only this CLONED object a value changes to 6
            System.out.println(obj); // no change in this original object
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}



