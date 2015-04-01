package com.polaris.fulfillment.services.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.polaris.fulfillment.services.FulFillmentService;
import com.polaris.fulfillment.webservices.FulFillment;
import com.polaris.fulfillment.webservices.accountservice.FulFillmentDetailsRequest;
import com.polaris.fulfillment.webservices.accountservice.FulFillmentDetailsResponse;


/**
 * The Class FulFillmentService.
 */
@Endpoint
public class FulFillmentServiceEndpoint {
	private static final String TARGET_NAMESPACE = "http://com/polaris/fulfillment/webservices/accountservice";

	@Autowired
	private FulFillmentService fulfillmentService_i;
	
	/**
	 * Gets the fulfillment details.
	 *
	 * @param fulfillmentNumber
	 *            the fulfillment number
	 * @return the fulfillment details
	 */
	@PayloadRoot(localPart = "FulFillmentDetailsRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload FulFillmentDetailsResponse getFulFillmentDetails(
			@RequestPayload FulFillmentDetailsRequest request) {
		FulFillmentDetailsResponse response = new FulFillmentDetailsResponse();

		/* call Spring injected service implementation to retrieve fulfillment data */
		FulFillment fulfillment = fulfillmentService_i.getFulFillmentDetails(request
				.getFulfillmentNumber());
		response.setFulFillmentDetails(fulfillment);
		return response;
	}

	public void setFulFillmentService(FulFillmentService fulfillmentService_p) {
		this.fulfillmentService_i = fulfillmentService_p;
	}
}