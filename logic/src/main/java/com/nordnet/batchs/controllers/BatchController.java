package com.nordnet.batchs.controllers;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.services.BatchService;

@RestController
@RequestMapping(value = "batchs")
public class BatchController {

	@Autowired
	private BatchService batchService;

	// @GET
	// // @RequestMapping(method = RequestMethod.GET)
	// public List<BatchDTO> listBatchs() {
	// List<BatchDTO> batchs = batchService.listBatchs();
	// return batchs;
	// }
	//
	// @GET
	// @RequestMapping(value = "/{id}")
	// public BatchDTO getById(@PathParam(value = "id") int batchId) {
	// BatchDTO batch = batchService.listBatchesById(batchId);
	// return batch;
	// }
	//
	// @POST
	// public BatchDTO create(BatchDTO batchDTO) {
	// BatchDTO batch = batchService.createBatch(batchDTO);
	// return batch;
	// }
	//
	// @PUT
	// public BatchDTO update(BatchDTO batchDTO) {
	// BatchDTO batch = batchService.updateBatch(batchDTO);
	// return batch;
	// }
	//
	// @DELETE
	// @RequestMapping(value = "/{id}")
	// public boolean getById(@PathParam(value = "id") int batchId) {
	// boolean isDeletedSuccessfully = batchService.deleteBatchById(batchId);
	// return isDeletedSuccessfully;
	// }

	@GET
	public List<BatchDTO> listBatchsByProject(@RequestParam(value = "projectId", required = true) int projectId) {
		List<BatchDTO> batchs = batchService.listBatchesByProject(projectId);
		return batchs;
	}

}