package com.example.demo.Controller;

import com.example.demo.DTO.LimitDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitConfigController {
    @Autowired
    LimitDto limitDto;
    @GetMapping("/limit")
    public LimitDto getLimit(){
        return new LimitDto(limitDto.getMinimum(),limitDto.getMaximum());
    }
}
