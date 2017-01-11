package com.mkyong.customer.action;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Test;

import com.mkyong.customer.model.Customer;

public class CustomerActionTest extends TestCase {
	
	CustomerAction action = new CustomerAction(); 
	Customer customer=new Customer();

	
	@Test
	public void testAddCustomer() throws Exception {
		
		customer.setName("XXX");
		customer.setAddress("yyyy");
		action.addCustomer(customer);
		assertNotNull(customer.getCustomerId());
		
		String result=action.deleteCustomer(customer);
		assertEquals(result,"success");
	}

	@Test
	public void testListCustomer() throws Exception {
		String result=action.listCustomer();
		assertEquals(result, "success");
	}
	
}
