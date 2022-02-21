package designPatterns.compositePattern.main;

import designPatterns.compositePattern.component.IComponent;
import designPatterns.compositePattern.composite.Composite;
import designPatterns.compositePattern.leaf.Leaf;

public class Test {
    public static void main(String[] args) {
        IComponent hd = new Leaf(3000, "Hard Disk Drive");
        IComponent mouse = new Leaf(200, "Mouse");
        IComponent keyboard = new Leaf(300, "Keyboard");
        IComponent monitor = new Leaf(5000, "Monitor");
        IComponent ram = new Leaf(3000, "RAM");
        IComponent cpu = new Leaf(10000, "CPU");

        Composite peripherals = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);
        peripherals.addComponent(monitor);

        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);

        cabinet.addComponent(hd);
        cabinet.addComponent(motherboard);

        computer.addComponent(peripherals);
        computer.addComponent(cabinet);


        ram.showPrice();
        peripherals.showPrice();
        computer.showPrice();
    }
}
