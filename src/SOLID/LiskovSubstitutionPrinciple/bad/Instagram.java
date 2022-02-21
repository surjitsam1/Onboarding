package SOLID.LiskovSubstitutionPrinciple.bad;

/*
   This child class (Instagram) CAN NOT fully substitute its parent class (SocialMedia) as all methods in the parent class are NOT applicable for the child class

   videoCall() functionality is not present in instagram

   Hence this class VIOLATES Liskov Substitution Principle
*/
public class Instagram extends SocialMedia{

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void videoCall() {
        // ***** THIS FEATURE IS NOT AVAILABLE IN INSTAGRAM *****
    }
}
