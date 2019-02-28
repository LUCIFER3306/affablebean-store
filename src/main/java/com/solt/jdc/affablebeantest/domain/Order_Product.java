package com.solt.jdc.affablebeantest.domain;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Order_Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Customer_Order customer_order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer_Order getCustomer_order() {
        return customer_order;
    }

    public void setCustomer_order(Customer_Order customer_order) {
        this.customer_order = customer_order;
    }
}
