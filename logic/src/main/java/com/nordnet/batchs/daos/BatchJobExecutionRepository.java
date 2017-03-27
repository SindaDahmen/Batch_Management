
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.BatchJobExecution;

public interface BatchJobExecutionRepository extends CrudRepository<BatchJobExecution, Long>  {

}
