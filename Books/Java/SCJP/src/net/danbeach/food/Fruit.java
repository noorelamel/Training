package net.danbeach.food;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/29/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Fruit {
    private double price;
    private String name;
    private String color;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
//-----------------------------------------------------------------------------


    public Fruit() {
        this.price = 0.0;
        this.name = "";
        this.color = "Red";
    }

    public Fruit(double price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }
}
