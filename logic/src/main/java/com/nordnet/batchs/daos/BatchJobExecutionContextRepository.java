package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.BatchJobExecutionContext;

public interface BatchJobExecutionContextRepository  extends CrudRepository<BatchJobExecutionContext, Long>  {

}
