//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.30 at 06:46:14 PM PDT 
//


package com.polaris.fulfillment.webservices.accountservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.polaris.fulfillment.webservices.FulFillment;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FulFillmentDetails" type="{http://webservices.fulfillment.polaris.com}FulFillment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fulFillmentDetails"
})
@XmlRootElement(name = "FulFillmentDetailsResponse")
public class FulFillmentDetailsResponse {

    @XmlElement(name = "FulFillmentDetails", required = true)
    protected FulFillment fulFillmentDetails;

    /**
     * Gets the value of the fulFillmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FulFillment }
     *     
     */
    public FulFillment getFulFillmentDetails() {
        return fulFillmentDetails;
    }

    /**
     * Sets the value of the fulFillmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulFillment }
     *     
     */
    public void setFulFillmentDetails(FulFillment value) {
        this.fulFillmentDetails = value;
    }

}
