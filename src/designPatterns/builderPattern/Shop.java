package designPatterns.builderPattern;

public class Shop {
    public static void main(String[] args) {
//        Phone phone = new Phone("Android", 6, "Snapdragon", 6.4, 5000);
        Phone phone1 = new PhoneBuilder().setOs("Android").setBattery(5000).setProcessor("Snapdragon").setRam(6).setScreenSize(6.4).getPhone();
        Phone phone2 = new PhoneBuilder().setOs("Android").setBattery(5000).setProcessor("Snapdragon").getPhone();
        Phone phone3 = new PhoneBuilder().setOs("Android").setBattery(5000).getPhone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

    }
}
