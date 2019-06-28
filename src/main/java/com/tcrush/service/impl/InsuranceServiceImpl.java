package com.tcrush.service.impl;

import com.tcrush.dao.InsuranceDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.insurance.Insurance;
import com.tcrush.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    InsuranceDao insuranceDao;

    BackRest backRest = new BackRest();

    @Override
    public BackRest insertInsurance(Insurance insurance) {
        try {
            insuranceDao.insertInsurance(insurance);
            backRest.setCode(200);
            backRest.setMassage("增添社会保障成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添社会保障失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest deleteInsurance(String number) {
        try {
            insuranceDao.deleteInsurance(number);
            backRest.setCode(200);
            backRest.setMassage("删除社会保障成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("删除社会保障失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest selectInsurance(String number) {
        try {
            List<Insurance> insurances = insuranceDao.selectInsurance(number);
            backRest.setCode(200);
            backRest.setMassage("查询社会保障成功");
            backRest.setData(insurances);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("查询社会保障失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest upDateInsurance(Insurance insurance) {
        try {
            insuranceDao.upDateInsurance(insurance);
            backRest.setCode(200);
            backRest.setMassage("更新社会保障成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("更新社会保障失败");
            backRest.setData(null);
        }
        return backRest;
    }
}
