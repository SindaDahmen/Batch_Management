package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.Batch;

public interface BatchRepository extends CrudRepository<Batch, Integer>  {

}
