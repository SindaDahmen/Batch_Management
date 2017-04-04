package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchJobExecutionContext;


@Repository
public interface BatchJobExecutionContextRepository  extends CrudRepository<BatchJobExecutionContext, Long>  {

}
