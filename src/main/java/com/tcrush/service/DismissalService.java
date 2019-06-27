package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.dismissal.Dismissal;

public interface DismissalService {
    BackRest insertDismissalService(Dismissal dismissal);
    BackRest selectDismissalService(String number);
}
