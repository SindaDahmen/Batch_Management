

package com.nordnet.batchs.daos;

import org.springframework.data.repository.CrudRepository;

import com.nordnet.batchs.entities.Project;

public interface ProjectRepository  extends CrudRepository<Project, Integer>  {

}
