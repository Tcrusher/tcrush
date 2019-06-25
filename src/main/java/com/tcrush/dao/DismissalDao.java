package com.tcrush.dao;

import com.tcrush.entity.dismissal.Dismissal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DismissalDao {
    void InsertDismissal(Dismissal dismissal);
    List<Dismissal> SelctDismissal(String number);
}
