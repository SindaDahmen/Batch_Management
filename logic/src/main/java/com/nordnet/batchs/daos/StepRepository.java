


package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Step;


@Repository
public interface StepRepository  extends CrudRepository<Step, Integer>  {

}
