

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Property;


@Repository
public interface PropertyRepository  extends CrudRepository<Property, Integer>  {

}
