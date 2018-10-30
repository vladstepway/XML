package by.stepovoy.entity;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nameCategory;
    // private Product product = new Product();
    private List<Product> listProducts = new ArrayList<>();

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\ncategory : " + nameCategory);
        stringBuilder.append(getListProducts());

        return stringBuilder.toString();
    }

    public String[][] toStringArray() {
        // ListString[] str = new String[8];
        //str[0] = this.getNameCategory();
        //str[1] = this.

        List<String[]> A = new ArrayList<String[]>();
        for (Product prod : this.getListProducts()) {
            A.add(prod.toStringArray());
        }
        int r;
        r = A.size();
        String [][] str;
        str = new String[r][];

        int i = 0;
        for (Product prod : this.getListProducts()) {
            str[i] = prod.toStringArray();
            i++;
        }

        return str;
    }
}
