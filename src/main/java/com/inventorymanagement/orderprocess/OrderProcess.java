package com.inventorymanagement.orderprocess;

import javax.persistence.*;

@Entity
@Table(name="Orders")
public class OrderProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int categoryId;
    private String categoryName;
    private String categoryImageurl;
    private String categoryDiscription;

    public OrderProcess() {
    }

    public OrderProcess(int categoryId, String categoryName, String categoryImageurl, String categoryDiscription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryImageurl = categoryImageurl;
        this.categoryDiscription = categoryDiscription;

    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImageurl() {
        return categoryImageurl;
    }

    public void setCategoryImageurl(String categoryImageurl) {
        this.categoryImageurl = categoryImageurl;
    }

    public String getCategoryDiscription() {
        return categoryDiscription;
    }

    public void setCategoryDiscription(String categoryDiscription) {
        this.categoryDiscription = categoryDiscription;
    }
}
