package com.mistertoo.pizzawebsite.entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * The type Order.
 */
@Entity(name="order")
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private int orderID;
    @Column(name = "Size")
    @NotNull
    private String size;
    @Column(name="Toppings")
    private String toppings;
    @Column(name = "pickup")
    @NotNull
    private boolean pickup;
    @Column(name = "address")
    private String address;
    @Column(name = "customer_id")
    @NotNull
    private int customerID;

    @ManyToOne
    @JoinColumn(name = "customer_id",insertable = false,updatable = false)
    private Customer customer;

    /**
     * Instantiates a new Order.
     */
//no argument constructor
    public Order(){

    }

    /**
     * Instantiates a new Order.
     *
     * @param size     the size
     * @param toppings the toppings
     * @param pickup   the pickup
     * @param address  the address
     */
//constructor
    public Order(String size, String toppings, boolean pickup, String address, int customerID){
        this.size=size;
        this.toppings=toppings;
        this.pickup=pickup;
        this.address=address;
        this.customerID = customerID;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
//getters and setters
    public int getID() {
        return orderID;
    }

    /**
     * Sets id.
     *
     * @param orderID the order id
     */
    public void setID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets toppings.
     *
     * @return the toppings
     */
    public String getToppings() {
        return toppings;
    }

    /**
     * Sets toppings.
     *
     * @param toppings the toppings
     */
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    /**
     * Is pickup boolean.
     *
     * @return the boolean
     */
    public boolean isPickup() {
        return pickup;
    }

    /**
     * Sets pickup.
     *
     * @param pickup the pickup
     */
    public void setPickup(boolean pickup) {
        this.pickup = pickup;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets customer id.
     *
     * @return the customer id
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets customer id.
     *
     * @param customerID the customer id
     */
    public void setCustomerID(int customerID) {
        customerID = customerID;
    }
}
