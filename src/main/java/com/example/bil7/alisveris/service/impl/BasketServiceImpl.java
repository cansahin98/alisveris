package com.example.bil7.alisveris.service.impl;

import com.example.bil7.alisveris.entity.Basket;
import com.example.bil7.alisveris.entity.Items;
import com.example.bil7.alisveris.repo.BasketRepo;
import com.example.bil7.alisveris.repo.ItemsRepo;
import com.example.bil7.alisveris.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BasketServiceImpl implements BasketService {
    private final BasketRepo repo;

    Basket basket = new Basket();


    @Override
    public Basket saveItems(Items items) {
        basket.setItems(items);
        if (repo.findById(items.getId()) != null)
        {
            return null;
        }
        return repo.save(basket);
    }
}
