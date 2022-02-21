package SOLID.LiskovSubstitutionPrinciple.bad;

/*
   This child class (Facebook) can fully substitute its parent class (SocialMedia) as all methods in the parent class is applicable for the child class also

   Hence this class OBEYS Liskov Substitution Principle
*/
public class Facebook extends SocialMedia{

    @Override
    public void chatWithFriends() {
        //do chat With Friends
    }

    @Override
    public void publishPost() {
        //do publish posts
    }

    @Override
    public void sendPhotosAndVideos() {
        //do send photos and videos
    }

    @Override
    public void videoCall() {
        //do video call
    }
}
