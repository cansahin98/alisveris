package com.example.bil7.alisveris.controller;

import com.example.bil7.alisveris.entity.Items;
import com.example.bil7.alisveris.entity.User;
import com.example.bil7.alisveris.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@CrossOrigin(origins = "http://localhost:3000/")
public class BasketController {
    private final BasketService basketService;

    @PostMapping(value = "/add")
    public ResponseEntity<User> addItemOnBasket(@RequestBody Items items)
    {
        if (basketService.saveItems(items) == null)
        {
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new  ResponseEntity<>(HttpStatus.OK);
    }

}
