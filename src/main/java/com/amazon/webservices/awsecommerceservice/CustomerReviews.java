
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
 *         &lt;element name="IFrameURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "iFrameURL",
    "hasReviews"
})
@XmlRootElement(name = "CustomerReviews")
public class CustomerReviews {

    @XmlElement(name = "IFrameURL")
    protected String iFrameURL;
    @XmlElement(name = "HasReviews")
    protected Boolean hasReviews;

    /**
     * Gets the value of the iFrameURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrameURL() {
        return iFrameURL;
    }

    /**
     * Sets the value of the iFrameURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrameURL(String value) {
        this.iFrameURL = value;
    }

    /**
     * Gets the value of the hasReviews property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReviews() {
        return hasReviews;
    }

    /**
     * Sets the value of the hasReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReviews(Boolean value) {
        this.hasReviews = value;
    }

}
