package Java8.defaultMethod;

public interface GenericRemote {
    void startDevice();
    default void stopDevice(){
        System.out.println("This is a default method introduced in Java-8");
    }
}
