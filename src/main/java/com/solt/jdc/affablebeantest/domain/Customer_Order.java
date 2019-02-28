package com.solt.jdc.affablebeantest.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Customer_Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_created;
    private int confirmation_number;
    @ManyToOne
    private Customer customer;

    public Customer_Order(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDate date_created) {
        this.date_created = date_created;
    }

    public int getConfirmation_number() {
        return confirmation_number;
    }

    public void setConfirmation_number(int confirmation_number) {
        this.confirmation_number = confirmation_number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
