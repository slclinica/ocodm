//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 12:05:52 PM EST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-AuditRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-AuditRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}UserRef"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}LocationRef"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}DateTimeStamp"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ReasonForChange" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}SourceID" minOccurs="0"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecordElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecordAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecordAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AuditRecord", propOrder = {
    "userRef",
    "locationRef",
    "dateTimeStamp",
    "reasonForChange",
    "sourceID"
})
public class ODMcomplexTypeDefinitionAuditRecord {

    @XmlElement(name = "UserRef", required = true)
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef", required = true)
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "DateTimeStamp", required = true)
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "ReasonForChange")
    protected ODMcomplexTypeDefinitionReasonForChange reasonForChange;
    @XmlElement(name = "SourceID")
    protected ODMcomplexTypeDefinitionSourceID sourceID;
    @XmlAttribute(name = "EditPoint")
    protected EditPointType editPoint;
    @XmlAttribute(name = "UsedImputationMethod")
    protected YesOrNo usedImputationMethod;

    /**
     * Gets the value of the userRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public ODMcomplexTypeDefinitionUserRef getUserRef() {
        return userRef;
    }

    /**
     * Sets the value of the userRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public void setUserRef(ODMcomplexTypeDefinitionUserRef value) {
        this.userRef = value;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public ODMcomplexTypeDefinitionLocationRef getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public void setLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public ODMcomplexTypeDefinitionDateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public void setDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the reasonForChange property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionReasonForChange }
     *     
     */
    public ODMcomplexTypeDefinitionReasonForChange getReasonForChange() {
        return reasonForChange;
    }

    /**
     * Sets the value of the reasonForChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionReasonForChange }
     *     
     */
    public void setReasonForChange(ODMcomplexTypeDefinitionReasonForChange value) {
        this.reasonForChange = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSourceID }
     *     
     */
    public ODMcomplexTypeDefinitionSourceID getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSourceID }
     *     
     */
    public void setSourceID(ODMcomplexTypeDefinitionSourceID value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the editPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EditPointType }
     *     
     */
    public EditPointType getEditPoint() {
        return editPoint;
    }

    /**
     * Sets the value of the editPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditPointType }
     *     
     */
    public void setEditPoint(EditPointType value) {
        this.editPoint = value;
    }

    /**
     * Gets the value of the usedImputationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getUsedImputationMethod() {
        return usedImputationMethod;
    }

    /**
     * Sets the value of the usedImputationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setUsedImputationMethod(YesOrNo value) {
        this.usedImputationMethod = value;
    }

}
