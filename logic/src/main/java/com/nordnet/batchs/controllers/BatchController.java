package com.nordnet.batchs.controllers;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.services.BatchService;

@RestController
@RequestMapping(value = "batchs")
public class BatchController {

	private static final Log LOGGER = LogFactory.getLog(BatchController.class);

	@Autowired
	private BatchService batchService;

	/**
	 * 
	 * @return
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public List<BatchDTO> listingBatchs() {
		List<BatchDTO> batchs = batchService.listBatchs();
		return batchs;
	}

	/**
	 * 
	 * @param projectId
	 * @return
	 */

	@RequestMapping(method = RequestMethod.GET)
	public List<BatchDTO> listBatchsByProject(@RequestParam(value = "projectId", required = true) int projectId) {
		List<BatchDTO> batchs = batchService.listBatchesByProject(projectId);
		return batchs;
	}

	/**
	 * 
	 * @param batchId
	 * @return
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/{batchId}")
	public BatchDTO getById(@PathVariable(value = "batchId", required = true) int batchId) {
		BatchDTO batch = batchService.listBatchesById(batchId);
		return batch;
	}

	/**
	 * 
	 * @param batchdto
	 * @return
	 */

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public BatchDTO create(@RequestBody BatchDTO batchdto) {
		try {

			BatchDTO createdBatch = this.batchService.createBatch(batchdto);
			return createdBatch;
		} catch (Exception ex) {
			LOGGER.debug("An exception has occured " + ex.getMessage());
			return null;
		}
	}

	/**
	 * 
	 * @param batchdto
	 * @return
	 */

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public BatchDTO update(@RequestBody BatchDTO batchdto) {
		try {
			BatchDTO updatedBatch = this.batchService.updateBatch(batchdto);
			return updatedBatch;
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 
	 * @param batchId
	 * @return
	 */

	@RequestMapping(method = RequestMethod.DELETE, value = "/{batchId}")
	public boolean delete(@PathVariable(value = "batchId") int batchId) {
		boolean isDeletedSuccessfully = batchService.deleteBatchById(batchId);
		return isDeletedSuccessfully;
	}

}