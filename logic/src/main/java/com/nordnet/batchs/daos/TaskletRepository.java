

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Tasklet;


@Repository
public interface TaskletRepository  extends CrudRepository<Tasklet, Integer>  {

}
