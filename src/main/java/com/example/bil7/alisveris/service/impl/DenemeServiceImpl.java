package com.example.bil7.alisveris.service.impl;

import com.example.bil7.alisveris.entity.Deneme;
import com.example.bil7.alisveris.repo.DenemeRepo;
import com.example.bil7.alisveris.service.DenemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DenemeServiceImpl implements DenemeService {

    private final DenemeRepo repo;

    @Override
    public List<Deneme> findById() {
        return (List<Deneme>) repo.findAll();
    }

}