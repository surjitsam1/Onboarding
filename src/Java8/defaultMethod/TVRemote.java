package Java8.defaultMethod;

public class TVRemote implements GenericRemote{

    @Override
    public void startDevice(){
        System.out.println("Starting TV");
    }

    @Override
    public void stopDevice(){
        System.out.println("stopping TV");
    }
}
