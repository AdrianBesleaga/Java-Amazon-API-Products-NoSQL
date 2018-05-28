
package com.amazon.webservices.awsecommerceservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Price" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}NonNegativeIntegerWithUnits" minOccurs="0"/>
 *         &lt;element name="IsFulfilledByAmazon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "price",
    "period",
    "isFulfilledByAmazon",
    "disclaimer"
})
@XmlRootElement(name = "RentalListing")
public class RentalListing {

    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "Period")
    protected NonNegativeIntegerWithUnits period;
    @XmlElement(name = "IsFulfilledByAmazon")
    protected Boolean isFulfilledByAmazon;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerWithUnits }
     *     
     */
    public NonNegativeIntegerWithUnits getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerWithUnits }
     *     
     */
    public void setPeriod(NonNegativeIntegerWithUnits value) {
        this.period = value;
    }

    /**
     * Gets the value of the isFulfilledByAmazon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFulfilledByAmazon() {
        return isFulfilledByAmazon;
    }

    /**
     * Sets the value of the isFulfilledByAmazon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFulfilledByAmazon(Boolean value) {
        this.isFulfilledByAmazon = value;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

}
