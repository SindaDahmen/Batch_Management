package com.nordnet.batchs.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Batch;

@Repository
public interface BatchRepository extends CrudRepository<Batch, Integer> {

	@Query(" SELECT b FROM Batch b  JOIN b.project p WHERE p.id = :projectId ")
	List<Batch> findByProjectId(@Param(value = "projectId") int projectId);

}