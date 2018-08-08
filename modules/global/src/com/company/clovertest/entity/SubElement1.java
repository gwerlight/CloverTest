package com.company.clovertest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|bezeichnung")
@Table(name = "CLOVERTEST_SUB_ELEMENT1")
@Entity(name = "clovertest$SubElement1")
public class SubElement1 extends StandardEntity {
    private static final long serialVersionUID = -8772344336445718560L;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "BEZEICHNUNG")
    protected String bezeichnung;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOT_ENTITY_ID")
    protected RootEntity rootEntity;

    public void setRootEntity(RootEntity rootEntity) {
        this.rootEntity = rootEntity;
    }

    public RootEntity getRootEntity() {
        return rootEntity;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }


}