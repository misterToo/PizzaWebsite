package com.mistertoo.pizzawebsite.entity;
import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.annotations.GenericGenerator;

@Entity(name="order")
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private int orderID;
    @Column(name = "Size")
    private String size;
    @Column(name="Toppings")
    private String toppings;
    @Column(name = "pickup")
    private boolean pickup;
    @Column(name = "address")
    private String address;
    @Column(name = "customer_id")
    private int customerID;

    @ManyToOne
    private Customer customer;
    //no argument constructor
    public Order(){

    }

    //constructor
    public Order(String size, String toppings, boolean pickup, String address){
        this.size=size;
        this.toppings=toppings;
        this.pickup=pickup;
        this.address=address;
    }

    //getters and setters
    public int getID() {
        return orderID;
    }

    public void setID(int orderID) {
        this.orderID = orderID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public boolean isPickup() {
        return pickup;
    }

    public void setPickup(boolean pickup) {
        this.pickup = pickup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        customerID = customerID;
    }
}
