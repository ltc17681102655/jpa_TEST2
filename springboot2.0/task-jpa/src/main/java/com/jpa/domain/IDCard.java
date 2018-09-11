package com.jpa.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IDCARD")
public class IDCard implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String idNo;
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "IDCard [id=" + id + ", idNo=" + idNo + ", person=" + person + "]";
    }


}
