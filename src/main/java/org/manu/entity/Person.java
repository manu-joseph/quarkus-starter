package org.manu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person {

    @Id
    @SequenceGenerator(name = "personIdSeq", sequenceName = "person_id_seq", allocationSize = 1, initialValue = 3)
    @GeneratedValue(generator = "personIdSeq")
    private Long personId;

    private String name;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
