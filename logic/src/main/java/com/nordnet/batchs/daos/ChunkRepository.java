
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.Chunk;

public interface ChunkRepository  extends CrudRepository<Chunk, Integer>  {

}
