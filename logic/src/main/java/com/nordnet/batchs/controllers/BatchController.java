package com.nordnet.batchs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.entities.Batch;
import com.nordnet.batchs.services.BatchService;

@RestController
@RequestMapping(value = "batchs")
public class BatchController extends GenericRestController<Batch, BatchDTO, BatchService> {

	@Autowired
	private BatchService batchService;

	/**
	 * 
	 * @param service
	 */
	public BatchController(BatchService service) {
		super(service);
	}
	
	/**
	 * 
	 * @param projectId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<BatchDTO> listAll(@RequestParam(value = "projectId", required = false) Integer projectId) {
		if (projectId == null) {
			return listAll();
		}
		return batchService.listBatchesByProject(projectId);
	}
}