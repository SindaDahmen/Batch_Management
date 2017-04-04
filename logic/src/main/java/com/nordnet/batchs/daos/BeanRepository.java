
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Bean;


@Repository
public interface BeanRepository  extends CrudRepository<Bean, Integer>  {

}
