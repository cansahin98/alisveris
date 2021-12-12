package com.example.bil7.alisveris.repo;

import com.example.bil7.alisveris.entity.Deneme;
import com.example.bil7.alisveris.entity.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepo extends CrudRepository<Items,Long> {
}
