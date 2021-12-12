package com.example.bil7.alisveris.service.impl;

import com.example.bil7.alisveris.entity.Items;
import com.example.bil7.alisveris.repo.ItemsRepo;
import com.example.bil7.alisveris.service.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemsServiceImpl implements ItemsService {
    private final ItemsRepo repo;

    @Override
    public Items saveItems(Items items) {
        if (repo.findById(items.getId()) != null)
        {
            return null;
        }
        return repo.save(items);
    }
}
