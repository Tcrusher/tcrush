package com.tcrush.dao;

import com.tcrush.entity.retirement.Retirement;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RetirementDao {
    void InsertRetire(Retirement retirement);
    List<Retirement> SelectRetire(String number);
}
