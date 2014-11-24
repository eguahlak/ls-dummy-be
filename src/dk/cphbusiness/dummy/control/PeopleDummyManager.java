package dk.cphbusiness.dummy.control;

import dk.cphbusiness.people.contract.PeopleManager;
import dk.cphbusiness.people.contract.dto.PersonDetail;
import dk.cphbusiness.people.contract.dto.PersonIdentifier;
import dk.cphbusiness.people.contract.dto.PersonSummary;
import static dk.cphbusiness.dummy.control.PeopleAssembler.*;
import dk.cphbusiness.dummy.model.Person;
import java.util.Collection;

public class PeopleDummyManager implements PeopleManager{
  
  public PeopleDummyManager() {
    new Person("aka", "Anders", "Kalhauge", 55);
    new Person("irf", "Ivan", "Frederiksen", 62);
    }

  @Override
  public Collection<PersonSummary> listPeople() {
    return createPersonSummaries(Person.list());
    }

  @Override
  public PersonDetail findPerson(PersonIdentifier id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  @Override
  public void savePerson(PersonDetail person) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  }
