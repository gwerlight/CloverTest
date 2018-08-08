package com.company.clovertest.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.AfterInsertEntityListener;
import java.sql.Connection;
import com.company.clovertest.entity.RootEntity;

@Component("clovertest_RootEntityEntityListener")
public class RootEntityEntityListener implements AfterInsertEntityListener<RootEntity> {


    @Override
    public void onAfterInsert(RootEntity entity, Connection connection) {
        entity.setCode(entity.getCode() + "-T");
    }


}