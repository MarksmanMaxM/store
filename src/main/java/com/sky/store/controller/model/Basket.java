package com.sky.store.controller.model;

import java.util.List;

public class Basket {
    private Integer basket;

    public Basket(Integer basket) {
        this.basket = basket;
    }

    public Integer getBasket() {
        return basket;
    }

    public void setBasket(Integer basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "№ заказа "+
                basket +
                "\n";
    }
}
