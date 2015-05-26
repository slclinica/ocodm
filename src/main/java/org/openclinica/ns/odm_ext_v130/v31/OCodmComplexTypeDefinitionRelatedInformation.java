//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.26 at 11:33:10 AM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-RelatedInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-RelatedInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MEDLINEIdentifier" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/>
 *         &lt;element name="ResultsReference" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/>
 *         &lt;element name="URLReference" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/>
 *         &lt;element name="URLDescription" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}RelatedInformationElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}RelatedInformationAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}RelatedInformationAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-RelatedInformation", propOrder = {
    "medlineIdentifier",
    "resultsReference",
    "urlReference",
    "urlDescription"
})
public class OCodmComplexTypeDefinitionRelatedInformation {

    @XmlElement(name = "MEDLINEIdentifier")
    protected String medlineIdentifier;
    @XmlElement(name = "ResultsReference")
    protected String resultsReference;
    @XmlElement(name = "URLReference")
    protected String urlReference;
    @XmlElement(name = "URLDescription")
    protected String urlDescription;

    /**
     * Gets the value of the medlineIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDLINEIdentifier() {
        return medlineIdentifier;
    }

    /**
     * Sets the value of the medlineIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDLINEIdentifier(String value) {
        this.medlineIdentifier = value;
    }

    /**
     * Gets the value of the resultsReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsReference() {
        return resultsReference;
    }

    /**
     * Sets the value of the resultsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsReference(String value) {
        this.resultsReference = value;
    }

    /**
     * Gets the value of the urlReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLReference() {
        return urlReference;
    }

    /**
     * Sets the value of the urlReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLReference(String value) {
        this.urlReference = value;
    }

    /**
     * Gets the value of the urlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDescription() {
        return urlDescription;
    }

    /**
     * Sets the value of the urlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDescription(String value) {
        this.urlDescription = value;
    }

}