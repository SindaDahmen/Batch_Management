package com.nordnet.batchs.controllers;

//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.nordnet.batchs.daos.BatchJobExecutionRepository;
//import com.nordnet.batchs.daos.BatchRepository;
//import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.services.impl.BatchJobExecutionServiceImpl;

@RestController

public class BatchJobExecutionController {

	// @Autowired
	// private BatchRepository batchRepository;
	// private BatchJobExecution batchJobExecution;

	@Autowired
	private BatchJobExecutionServiceImpl batchJobExecutionServiceImpl;

	@POST
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void create() {
		batchJobExecutionServiceImpl.createHistory();
	}

	@PUT
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public void update(@PathVariable long id) {
		batchJobExecutionServiceImpl.updateHistory(id);
	}
}
