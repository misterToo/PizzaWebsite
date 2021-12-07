package com.mistertoo.pizzawebsite.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.*;

/**
 * The type Customer.
 */
@Entity(name="Customer")
@Table(name="customers")
public class Customer {
    @Column(name="user_name")
    @NotNull
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

    @OneToMany(mappedBy = "customerID", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    /**
     * Instantiates a new Customer.
     */
    public Customer(){

    }

    /**
     * Instantiates a new Customer.
     *
     * @param uName the user name
     * @param email the email
     */
    public Customer(String uName, String email){
        this.uName = uName;
        this.email = email;
    }
    //Getters and Setters

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getuName() {
        return uName;
    }

    /**
     * Sets name.
     *
     * @param uName the user name
     */
    public void setuName(String uName) {
        this.uName = uName;
    }


    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * Gets to next reward.
     *
     * @return the to next reward
     */
    public int getToNextReward() {
        return toNextReward;
    }

    /**
     * Sets to next reward.
     *
     * @param toNextReward the to next reward
     */
    public void setToNextReward(int toNextReward) {
        this.toNextReward = toNextReward;
    }

    /**
     * Gets rewards.
     *
     * @return the rewards
     */
    public int getRewards() {
        return rewards;
    }

    /**
     * Sets rewards.
     *
     * @param rewards the rewards
     */
    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets id.
     *
     * @param ID the id
     */
    public void setID(int ID) {
        this.ID = ID;
    }

}
