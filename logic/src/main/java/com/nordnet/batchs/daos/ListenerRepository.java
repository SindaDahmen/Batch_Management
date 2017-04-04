

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Listener;


@Repository
public interface ListenerRepository  extends CrudRepository<Listener, Integer>  {

}
