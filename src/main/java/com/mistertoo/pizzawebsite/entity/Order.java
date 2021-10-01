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
    private int ID;
    @Column(name = "Size")
    private String size;
    @Column(name="Toppings")
    private String toppings;
    @Column(name = "pickup")
    private boolean pickup;
    @Column(name = "address")
    private String address;
    @Column(name = "CustomerID")
    private int CustomerID;

    public Order(){

    }
}
