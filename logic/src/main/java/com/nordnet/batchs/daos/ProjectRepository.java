
package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nordnet.batchs.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
