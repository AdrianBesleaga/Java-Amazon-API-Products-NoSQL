
package com.amazon.webservices.awsecommerceservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="SwatchImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="SmallImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="ThumbnailImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="TinyImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="MediumImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="LargeImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="HiResImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swatchImage",
    "smallImage",
    "thumbnailImage",
    "tinyImage",
    "mediumImage",
    "largeImage",
    "hiResImage"
})
@XmlRootElement(name = "ImageSet")
public class ImageSet {

    @XmlElement(name = "SwatchImage")
    protected Image swatchImage;
    @XmlElement(name = "SmallImage")
    protected Image smallImage;
    @XmlElement(name = "ThumbnailImage")
    protected Image thumbnailImage;
    @XmlElement(name = "TinyImage")
    protected Image tinyImage;
    @XmlElement(name = "MediumImage")
    protected Image mediumImage;
    @XmlElement(name = "LargeImage")
    protected Image largeImage;
    @XmlElement(name = "HiResImage")
    protected Image hiResImage;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Gets the value of the swatchImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSwatchImage() {
        return swatchImage;
    }

    /**
     * Sets the value of the swatchImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSwatchImage(Image value) {
        this.swatchImage = value;
    }

    /**
     * Gets the value of the smallImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSmallImage() {
        return smallImage;
    }

    /**
     * Sets the value of the smallImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSmallImage(Image value) {
        this.smallImage = value;
    }

    /**
     * Gets the value of the thumbnailImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Sets the value of the thumbnailImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setThumbnailImage(Image value) {
        this.thumbnailImage = value;
    }

    /**
     * Gets the value of the tinyImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getTinyImage() {
        return tinyImage;
    }

    /**
     * Sets the value of the tinyImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setTinyImage(Image value) {
        this.tinyImage = value;
    }

    /**
     * Gets the value of the mediumImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getMediumImage() {
        return mediumImage;
    }

    /**
     * Sets the value of the mediumImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setMediumImage(Image value) {
        this.mediumImage = value;
    }

    /**
     * Gets the value of the largeImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLargeImage() {
        return largeImage;
    }

    /**
     * Sets the value of the largeImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLargeImage(Image value) {
        this.largeImage = value;
    }

    /**
     * Gets the value of the hiResImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getHiResImage() {
        return hiResImage;
    }

    /**
     * Sets the value of the hiResImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setHiResImage(Image value) {
        this.hiResImage = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
