package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Set;
 
public class D03P72 {
    private String productId;
    private String productName;
 
    public D03P72(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
 
    public String getProductId() {
        return productId;
    }
 
    public String getProductName() {
        return productName;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        D03P72 other = (D03P72) obj;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return productId + " " + productName;
    }
 
    public static void main(String[] args) {
        Set<D03P72> products = new HashSet<>();
 
        products.add(new D03P72("P001", "Maruti 800"));
        products.add(new D03P72("P002", "Maruti Zen"));
        products.add(new D03P72("P003", "Maruti Dezire"));
        products.add(new D03P72("P004", "Maruti Alto"));
 
        for (D03P72 product : products) {
            System.out.println(product);
        }
    }
}