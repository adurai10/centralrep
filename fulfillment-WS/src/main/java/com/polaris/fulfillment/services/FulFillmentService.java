package com.polaris.fulfillment.services;

import com.polaris.fulfillment.webservices.FulFillment;

/**
 * The Interface FulFillmentService.
 */
public interface FulFillmentService {

	/**
	 * Gets the fulfillment details.
	 *
	 * @param fulfillmentNumber
	 *            the fulfillment number
	 * @return the fulfillment details
	 */
	public FulFillment getFulFillmentDetails(String fulfillmentNumber);
}
