
package com.amazon.webservices.awsecommerceservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TotalOffers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TotalOfferPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MoreOffersUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Offer" maxOccurs="unbounded" minOccurs="0"/>
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
    "totalOffers",
    "totalOfferPages",
    "moreOffersUrl",
    "offer"
})
@XmlRootElement(name = "Offers")
public class Offers {

    @XmlElement(name = "TotalOffers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalOffers;
    @XmlElement(name = "TotalOfferPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalOfferPages;
    @XmlElement(name = "MoreOffersUrl")
    protected String moreOffersUrl;
    @XmlElement(name = "Offer")
    protected List<Offer> offer;

    /**
     * Gets the value of the totalOffers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalOffers() {
        return totalOffers;
    }

    /**
     * Sets the value of the totalOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOffers(BigInteger value) {
        this.totalOffers = value;
    }

    /**
     * Gets the value of the totalOfferPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalOfferPages() {
        return totalOfferPages;
    }

    /**
     * Sets the value of the totalOfferPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOfferPages(BigInteger value) {
        this.totalOfferPages = value;
    }

    /**
     * Gets the value of the moreOffersUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreOffersUrl() {
        return moreOffersUrl;
    }

    /**
     * Sets the value of the moreOffersUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreOffersUrl(String value) {
        this.moreOffersUrl = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offer }
     * 
     * 
     */
    public List<Offer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<Offer>();
        }
        return this.offer;
    }

}
