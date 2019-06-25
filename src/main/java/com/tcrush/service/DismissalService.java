package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.dismissal.Dismissal;

public interface DismissalService {
    BackRest InsertDismissalService(Dismissal dismissal);
    BackRest SelectDismissalService(String number);
}
