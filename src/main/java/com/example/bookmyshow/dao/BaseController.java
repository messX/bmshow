package com.example.bookmyshow.dao;


import com.example.bookmyshow.services.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public abstract class BaseController<T, Long> {
    private BaseService<? extends T> service;
    public BaseController(BaseService<? extends T> service){
        this.service = service;
    }

    @RequestMapping
    public @ResponseBody List<T> listAll() {
        return (List<T>) service.findAll();
    }
}
