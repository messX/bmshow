package com.example.bookmyshow.dao;

import com.example.bookmyshow.entities.Seat;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;

@Repository
public interface SeatDao extends BaseDao<Seat>{
    @Lock(LockModeType.PESSIMISTIC_READ)
    @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "5000")})
    @Query("SELECT s FROM Seat s WHERE s.id = ?1")
    Seat findWithLock(Long id);
}
