package com.company.clovertest.web.rootentity;

import com.company.clovertest.entity.SubElement1;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.clovertest.entity.RootEntity;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class RootEntityEdit extends AbstractEditor<RootEntity> {

    @Inject
    private CollectionDatasource<SubElement1, UUID> subListeDs;

    public void onNewUserAction(Component source) {

        if (source.isEnabled()) subListeDs.clear();
    }
}