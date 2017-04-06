
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchJobExecutionParams;

@Repository
public interface BatchJobExecutionParamsRepository extends CrudRepository<BatchJobExecutionParams, Integer> {

}
