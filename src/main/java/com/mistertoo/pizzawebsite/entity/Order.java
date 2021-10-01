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
    private String size;
    private String toppings;
    private boolean pickup;
    private String address;
    private int CustomerID;
}
