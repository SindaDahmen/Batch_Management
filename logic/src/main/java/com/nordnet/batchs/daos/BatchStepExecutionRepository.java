
package com.nordnet.batchs.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchStepExecution;

@Repository
public interface BatchStepExecutionRepository extends CrudRepository<BatchStepExecution, Long> {

	@Query(" SELECT s FROM BatchStepExecution s  JOIN s.batchJobExecution b WHERE b.jobExecutionId = :jobExecutionId ")
	List<BatchStepExecution> findByJobExecutionId(@Param(value = "jobExecutionId") Long jobExecutionId);

}
