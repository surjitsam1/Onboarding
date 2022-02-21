package designPatterns.compositePattern.leaf;

import designPatterns.compositePattern.component.IComponent;

public class Leaf implements IComponent {

    int price;
    String name;

    public Leaf(int price, String name) {
        this.price=price;
        this.name=name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + ":" + price);
    }
}
