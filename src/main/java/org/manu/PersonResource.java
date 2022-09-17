package org.manu;

import org.manu.entity.Person;
import org.manu.service.PersonService;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("v1/persons")
public class PersonResource {

    private static final Logger LOG = Logger.getLogger(PersonResource.class);

    @Inject
    private PersonService personService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Person createPerson() {
        LOG.info("Creating Person");
        return personService.storePerson();
    }
}
