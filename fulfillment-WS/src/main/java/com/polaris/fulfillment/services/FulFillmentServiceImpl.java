package com.polaris.fulfillment.services;

import org.springframework.stereotype.Service;

import com.polaris.fulfillment.webservices.FulFillment;
import com.polaris.fulfillment.webservices.EnumFulFillmentStatus;

/**
 * The Class FulFillmentService.
 */
@Service
public class FulFillmentServiceImpl implements FulFillmentService {

	/**
	 * Gets the fulfillment details.
	 *
	 * @param fulfillmentNumber
	 *            the fulfillment number
	 * @return the fulfillment details
	 */
	public FulFillment getFulFillmentDetails(String fulfillmentNumber) {

		/*
		 * hard coded fulfillment data - in reality this data would be retrieved
		 * from a database or back end system of some sort
		 */
		FulFillment fulfillment = new FulFillment();
		fulfillment.setFulFillmentNumber("12345");
		fulfillment.setFulFillmentStatus(EnumFulFillmentStatus.ACTIVE);
		fulfillment.setFulFillmentName("Joe Bloggs");
		fulfillment.setFulFillmentBalance(3400);

		return fulfillment;
		
	}
}
