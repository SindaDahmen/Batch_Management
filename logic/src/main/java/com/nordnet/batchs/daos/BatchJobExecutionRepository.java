
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchJobExecution;


@Repository
public interface BatchJobExecutionRepository extends CrudRepository<BatchJobExecution, Integer>  {

}
