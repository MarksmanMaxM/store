package com.sky.store.controller.Service;

import com.sky.store.controller.model.Basket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("session")
public class BasketServiceImpl implements BasketService {

    private final List<Basket> basket;

    public BasketServiceImpl(List<Basket> basket) {
        this.basket = basket;
    }

    @Override
    public void add(int order) {
        basket.add(new Basket(order));
    }

    @Override
    public String get() {
        String str = "Ваши заказы: \n";

        for (int i = 0; i < basket.size(); i++) {
            str += basket.get(i).toString();
        }

        return str;

    }


}
