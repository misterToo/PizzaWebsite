package com.mistertoo.pizzawebsite.entity;

import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.*;

@Entity(name="Customer")
@Table(name="customers")
public class Customer {
    @Column(name="user_name")
    private String uName;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="to_next_reward")
    private int toNextReward;
    @Column(name="rewards")
    private int rewards;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private int ID;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders = new ArrayList<>();
    public Customer(){

    }
    public Customer(String uName, String email){
        this.uName = uName;
        this.email = email;
    }
    //Getters and Setters

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getToNextReward() {
        return toNextReward;
    }

    public void setToNextReward(int toNextReward) {
        this.toNextReward = toNextReward;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
