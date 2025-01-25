package org.Learnathon.BeanLifecycle;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
public class Coke implements InitializingBean, DisposableBean {
    private double price;

    public Coke() {
        System.out.println("Coke Constructor called");
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "price=" + price +
                '}';
    }
    public void afterPropertiesSet(){
        System.out.println("This is our init method from InitializingBean interface");
    }
    public void destroy(){
        System.out.println("This is our destroy method from DisposableBean interface");
    }
}
