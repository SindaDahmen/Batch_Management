

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Schedular;


@Repository
public interface SchedularRepository  extends CrudRepository<Schedular, Integer>  {

}
