package com.tcrush.dao;

import com.tcrush.entity.insurance.Insurance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsuranceDao {
    void insertInsurance(Insurance insurance);
    void deleteInsurance(String number);
    List<Insurance> selectInsurance(String number);
    void upDateInsurance(Insurance insurance);
}
