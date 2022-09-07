package com.example.bookmyshow.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T> extends JpaRepository<T, Long> {
}
