
package com.amazon.webservices.awsecommerceservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SubTotal" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Price" minOccurs="0"/>
 *         &lt;element name="SavedForLaterItem" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}CartItem" maxOccurs="unbounded"/>
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
    "subTotal",
    "savedForLaterItem"
})
@XmlRootElement(name = "SavedForLaterItems")
public class SavedForLaterItems {

    @XmlElement(name = "SubTotal")
    protected Price subTotal;
    @XmlElement(name = "SavedForLaterItem", required = true)
    protected List<CartItem> savedForLaterItem;

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSubTotal(Price value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the savedForLaterItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedForLaterItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedForLaterItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartItem }
     * 
     * 
     */
    public List<CartItem> getSavedForLaterItem() {
        if (savedForLaterItem == null) {
            savedForLaterItem = new ArrayList<CartItem>();
        }
        return this.savedForLaterItem;
    }

}
