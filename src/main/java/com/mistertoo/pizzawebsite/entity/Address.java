package com.mistertoo.pizzawebsite.entity;

import javax.persistence.*;


@Entity(name="address")
@Table(name = "addresses", indexes = {
        @Index(name = "customerID_idx", columnList = "customerID")
})
public class Address {
    @Id
    @Column(name = "AddressID", nullable = false)
    private Integer id;

    @Column(name = "address", length = 45)
    private String address;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "ID")


    private Customer customerID;

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}