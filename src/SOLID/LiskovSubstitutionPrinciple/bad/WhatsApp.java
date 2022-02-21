package SOLID.LiskovSubstitutionPrinciple.bad;

/*
   This child class (WhatsApp) CAN NOT fully substitute its parent class (SocialMedia) as all methods in the parent class are NOT applicable for the child class

   publishPost() functionality is not present in WhatsApp

   Hence this class VIOLATES Liskov Substitution Principle
*/
public class WhatsApp extends SocialMedia{

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost() {
        // ***** THIS FEATURE IS NOT AVAILABLE IN WHATSAPP *****
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void videoCall() {

    }
}
