
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchStepExecution;


@Repository
public interface BatchStepExecutionRepository  extends CrudRepository<BatchStepExecution, Long>  {

}
