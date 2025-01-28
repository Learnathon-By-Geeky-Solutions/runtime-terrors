package org.Learnathon.BeanLifecycle;

public class Cake {
    private double price;

    public Cake() {
        System.out.println("Cake Constructor called");
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Init method called for Cake");
    }
    public void destroy(){
        System.out.println("Destroy method called for Cake");
    }
}
