
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchStepExecutionContext;

@Repository
public interface BatchStepExecutionContextRepository extends CrudRepository<BatchStepExecutionContext, Integer> {

}
