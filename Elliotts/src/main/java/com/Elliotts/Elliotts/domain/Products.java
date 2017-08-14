package com.Elliotts.Elliotts.domain;

import javax.persistence.*;

/**
 * Created by Jerry on 8/10/2017.
 */
//This is the Entity(table) used for the products webpage.
@Entity
public class Products {

    //Auto incrementing id field for Products
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @javax.persistence.Version
    private Integer Version;

    //The fields that are located in the products table.
    String productName;
    String productWeight;
    String productCode;

    //region CONSTRUCTORS
    public Products() {

    }

    public Products(String productName, String productCode) {
        this.productCode = productCode;
        this.productName = productName;
    }

    public Products(String productName, String productCode, String productWeight) {
        this.productCode = productCode;
        this.productName = productName;
        this.productWeight = productWeight;
    }
    //endregion

    //region GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer version) {
        Version = version;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    //endregion
}
