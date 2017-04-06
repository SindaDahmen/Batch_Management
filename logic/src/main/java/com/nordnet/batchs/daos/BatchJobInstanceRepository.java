
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.BatchJobInstance;


@Repository
public interface BatchJobInstanceRepository  extends CrudRepository<BatchJobInstance, Integer>  {

}
