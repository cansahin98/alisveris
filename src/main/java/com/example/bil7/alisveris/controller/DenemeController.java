package com.example.bil7.alisveris.controller;

import com.example.bil7.alisveris.entity.Deneme;
import com.example.bil7.alisveris.service.DenemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deneme")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@CrossOrigin(origins = "http://localhost:3000/")
public class DenemeController {

    private final DenemeService denemeService;

    @GetMapping(value = "/list")
    public List<Deneme> list()
    {
        return denemeService.findById();
    }


}
