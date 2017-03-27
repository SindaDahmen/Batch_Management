

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.Job;

public interface JobRepository  extends CrudRepository<Job, Integer>  {

}
