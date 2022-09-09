package petclinicproject.springdemo.services;

import petclinicproject.springdemo.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
