package org.manu.service;

import org.eclipse.microprofile.opentracing.Traced;
import org.manu.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
@Traced
public class PersonService {

    @Inject
    private EntityManager entityManager;

    @Transactional
    public Person storePerson() {
        Person person = new Person();
        person.setName("Tessa");
        entityManager.persist(person);
        return person;
    }

}
