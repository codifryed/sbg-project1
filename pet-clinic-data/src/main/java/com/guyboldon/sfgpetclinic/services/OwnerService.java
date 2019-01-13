package com.guyboldon.sfgpetclinic.services;

import com.guyboldon.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
