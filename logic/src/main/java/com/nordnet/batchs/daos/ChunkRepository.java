
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Chunk;

@Repository
public interface ChunkRepository  extends CrudRepository<Chunk, Integer>  {

}
