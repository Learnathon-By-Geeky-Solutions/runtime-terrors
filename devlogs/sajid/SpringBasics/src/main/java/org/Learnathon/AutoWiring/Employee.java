package org.Learnathon.AutoWiring;

public class Employee {

    private Address address;

    public Employee(Address address) {
        this.address = address;
        System.out.println("Employee Constructor called Parametrized");
    }

    public Employee() {
        System.out.println("Employee Constructor called");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", address=" + address +
                '}';
    }
}
