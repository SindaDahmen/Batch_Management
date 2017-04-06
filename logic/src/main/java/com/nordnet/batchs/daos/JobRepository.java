package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {

}
