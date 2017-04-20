
package com.nordnet.batchs.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchJobExecution;

@Repository
public interface BatchJobExecutionRepository extends CrudRepository<BatchJobExecution, Integer> {

	@Query(" SELECT b FROM BatchJobExecution b  JOIN b.batch ba WHERE ba.id = :batchId ")
	List<BatchJobExecution> findById(@Param(value = "batchId") Integer batchId);

	@Query(" SELECT b FROM BatchJobExecution b JOIN b.batch ba WHERE ba.id
	 =:batchId orderBy b.endTime desc")

	BatchJobExecution getLastExecution(@Param(value = "batchId") Integer batchId);

}
