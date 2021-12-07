package com.mistertoo.pizzawebsite.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity(name="address")
@Table(name = "addresses", indexes = {
        @Index(name = "customerID_idx", columnList = "customerID")
})
public class Address {
    @Id
    @Column(name = "AddressID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private Integer id;

    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "customerID")
    @NotNull
    private  int customerID;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "ID", insertable = false,updatable = false)
    private Customer customer;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
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