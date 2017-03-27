
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.BatchJobExecutionParams;

public interface BatchJobExecutionParamsRepository  extends CrudRepository<BatchJobExecutionParams, Long>  {

}
