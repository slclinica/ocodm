//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.10 at 04:46:43 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31_sb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-MultiSelectListRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-MultiSelectListRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}MultiSelectListRefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}MultiSelectListRefAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}MultiSelectListRefAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-MultiSelectListRef")
public class OCodmComplexTypeDefinitionMultiSelectListRef {

    @XmlAttribute(name = "MultiSelectListID", required = true)
    protected String multiSelectListID;

    /**
     * Gets the value of the multiSelectListID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiSelectListID() {
        return multiSelectListID;
    }

    /**
     * Sets the value of the multiSelectListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiSelectListID(String value) {
        this.multiSelectListID = value;
    }

}