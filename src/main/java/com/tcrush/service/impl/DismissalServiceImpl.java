package com.tcrush.service.impl;

import com.tcrush.dao.DismissalDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.dismissal.Dismissal;
import com.tcrush.service.DismissalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DismissalServiceImpl implements DismissalService {

    @Autowired
    DismissalDao dismissalDao;

    BackRest backRest = new BackRest();
    @Override
    public BackRest InsertDismissalService(Dismissal dismissal) {
        try {
            dismissalDao.InsertDismissal(dismissal);
            backRest.setCode(200);
            backRest.setMassage("增添离职信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添离职信息失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest SelectDismissalService(String number) {
        return null;
    }
}
