package com.adprog6.endomie.diy.model;


public class CartModel {

    private String id;
    private String menu;
    private int totalHarga;

    public String getId() {
        return id;
    }

    public String getMenu() {
        return menu;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
}