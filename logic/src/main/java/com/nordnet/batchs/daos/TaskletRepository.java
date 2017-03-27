

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.Tasklet;

public interface TaskletRepository  extends CrudRepository<Tasklet, Integer>  {

}
