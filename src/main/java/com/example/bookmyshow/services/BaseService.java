package com.example.bookmyshow.services;

import com.example.bookmyshow.dao.BaseDao;
import lombok.Getter;

import java.util.List;
import java.util.Optional;

@Getter
public class BaseService<T> {
    BaseDao<T> dao;

    public T findById(Long id){
        return dao.findById(id).orElseThrow(()->new RuntimeException("Invalid id!!"));
    }

    public List<T> findAll(){
        return dao.findAll();
    }

    public T save(T entity) {
        return dao.save(entity);
    }

    public List<? extends T> saveAll(Iterable<? extends T> saveAll) {
        return dao.saveAll(saveAll);
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
