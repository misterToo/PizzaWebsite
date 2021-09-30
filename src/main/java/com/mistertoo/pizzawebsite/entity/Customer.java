package com.mistertoo.pizzawebsite.entity;

import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.annotations.GenericGenerator;

@Entity(name="Customer")
@Table(name="customers")
public class Customer {
    @Column(name="first_name")
    private String fName;
    @Column(name="last_name")
    private String lName;
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

    public Customer(){

    }
    public Customer(String fName, String lName, String email){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }
    //Getters and Setters

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
