package com.example.bil7.alisveris.controller;

import com.example.bil7.alisveris.entity.Items;
import com.example.bil7.alisveris.entity.User;
import com.example.bil7.alisveris.service.DenemeService;
import com.example.bil7.alisveris.service.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@CrossOrigin(origins = "http://localhost:3000/")
public class ItemsController {
    private final ItemsService itemsService;

    @GetMapping(value = "/save")
    public ResponseEntity<User> addItem(@RequestBody Items items)
    {
        if (itemsService.saveItems(items) == null)
        {
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new  ResponseEntity<>(HttpStatus.OK);
    }

}
