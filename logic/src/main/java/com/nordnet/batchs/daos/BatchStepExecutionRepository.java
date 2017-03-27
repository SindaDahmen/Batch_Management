
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.BatchStepExecution;

public interface BatchStepExecutionRepository  extends CrudRepository<BatchStepExecution, Long>  {

}
