package com.nordnet.batchs.tests;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nordnet.batchs.daos.BatchRepository;
import com.nordnet.batchs.entities.Batch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private BatchRepository batchRepository;

	@Test
	public void testLoadBatchJobExecutionContext() {
		List<Batch> batchs = (List<Batch>) batchRepository.findAll();
		assertNotNull(batchs);
	}

}
