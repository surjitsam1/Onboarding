package designPatterns.compositePattern.composite;

import designPatterns.compositePattern.component.IComponent;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    String name;
    List<IComponent> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name=name;
    }

    public void addComponent(IComponent component){
        componentList.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(IComponent c:componentList){
            c.showPrice();
        }
    }
}
