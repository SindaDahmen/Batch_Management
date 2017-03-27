
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.BatchJobInstance;

public interface BatchJobInstanceRepository  extends CrudRepository<BatchJobInstance, Long>  {

}
