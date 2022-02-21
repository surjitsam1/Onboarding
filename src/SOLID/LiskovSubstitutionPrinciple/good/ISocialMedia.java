package SOLID.LiskovSubstitutionPrinciple.good;

/*
   This parent Interface (ISocialMedia) only has methods(functionalities) that are COMMON TO ALL THE CLIENTS (Facebook, Instagram, WhatsApp)
*/
public interface ISocialMedia {

    public void chatWithFriends();

    public void sendPhotosAndVideos();

}
