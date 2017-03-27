package com.nordnet.batchs.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.nordnet.batchs.daos.BatchStepExecutionContextRepository;
//import com.nordnet.batchs.daos.JobRepository;
import com.nordnet.batchs.entities.BatchStepExecutionContext;
//import com.nordnet.batchs.entities.Job;


@RunWith(SpringRunner.class)
@SpringBootTest

public class DemoApplicationTests {

//	@Autowired
//	private BeanRepository beanRepository;
	@Autowired
	private BatchStepExecutionContextRepository batchStepExecutionContextRepository;

	@Test
	public void testLoadBatch() {
		 List<BatchStepExecutionContext> batchs = (List<BatchStepExecutionContext>) batchStepExecutionContextRepository.findAll();
		 //System.out.println(""+ batchs.get(0).getName());
		//assertEquals("Did not get all batchs", 2, batchs.size());
	}
//	@Test
//	public void testLoadBatch() {
//		List<Batch> Batches = (ArrayList<Batch>) batchRepository.findAll();
//		//assertEquals("Did not get all games", 2, Batches.size());
//	}
	
	
	 

}
