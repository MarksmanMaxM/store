package com.sky.store.controller.controller;

import com.sky.store.controller.Service.BasketServiceImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class BasketController {

    private final BasketServiceImpl service;


    public BasketController(BasketServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String addOrder(@RequestParam("orders") String orders) {

        int order = Integer.parseInt(orders);

        service.add(order);
        return "Заказ добавлен!";
    }

    @GetMapping("/get")
    public String getOrders() {

        return service.get();
    }

}
