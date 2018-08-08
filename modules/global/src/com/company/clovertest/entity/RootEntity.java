package com.company.clovertest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("clovertest_RootEntityEntityListener")
@NamePattern("%s - |code,bezeichnung")
@Table(name = "CLOVERTEST_ROOT_ENTITY")
@Entity(name = "clovertest$RootEntity")
public class RootEntity extends StandardEntity {
    private static final long serialVersionUID = -4654474646949270879L;

    @Column(name = "CODE")
    protected String code;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "rootEntity")
    protected List<SubElement1> subListe;

    @Column(name = "BEZEICHNUNG")
    protected String bezeichnung;

    public void setSubListe(List<SubElement1> subListe) {
        this.subListe = subListe;
    }

    public List<SubElement1> getSubListe() {
        return subListe;
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