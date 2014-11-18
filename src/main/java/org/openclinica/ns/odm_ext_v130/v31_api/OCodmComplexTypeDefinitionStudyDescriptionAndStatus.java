//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 12:05:52 PM EST 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OCodmComplexTypeDefinition-StudyDescriptionAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-StudyDescriptionAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudySytemStatus" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/>
 *         &lt;element name="PrincipalInvestigator" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/>
 *         &lt;element name="DetailedDescription" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Sponsor" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/>
 *         &lt;element name="Collaborators" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="StudyPhase" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/>
 *         &lt;element name="ProtocolType" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="ProtocolVerificationDate" type="{http://www.cdisc.org/ns/odm/v1.3-api}date" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Selection" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Timing" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Allocation" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Masking" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Control" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="InterventionModel" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="StudyClassification" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDescriptionAndStatusElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDescriptionAndStatusAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDescriptionAndStatusAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-StudyDescriptionAndStatus", propOrder = {
    "studySytemStatus",
    "principalInvestigator",
    "detailedDescription",
    "sponsor",
    "collaborators",
    "studyPhase",
    "protocolType",
    "protocolVerificationDate",
    "purpose",
    "duration",
    "selection",
    "timing",
    "allocation",
    "masking",
    "control",
    "interventionModel",
    "studyClassification"
})
public class OCodmComplexTypeDefinitionStudyDescriptionAndStatus {

    @XmlElement(name = "StudySytemStatus", required = true)
    protected String studySytemStatus;
    @XmlElement(name = "PrincipalInvestigator", required = true)
    protected String principalInvestigator;
    @XmlElement(name = "DetailedDescription")
    protected String detailedDescription;
    @XmlElement(name = "Sponsor", required = true)
    protected String sponsor;
    @XmlElement(name = "Collaborators")
    protected String collaborators;
    @XmlElement(name = "StudyPhase", required = true)
    protected String studyPhase;
    @XmlElement(name = "ProtocolType")
    protected String protocolType;
    @XmlElement(name = "ProtocolVerificationDate")
    protected XMLGregorianCalendar protocolVerificationDate;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "Duration")
    protected String duration;
    @XmlElement(name = "Selection")
    protected String selection;
    @XmlElement(name = "Timing")
    protected String timing;
    @XmlElement(name = "Allocation")
    protected String allocation;
    @XmlElement(name = "Masking")
    protected String masking;
    @XmlElement(name = "Control")
    protected String control;
    @XmlElement(name = "InterventionModel")
    protected String interventionModel;
    @XmlElement(name = "StudyClassification")
    protected String studyClassification;
    @XmlAttribute(name = "OfficialTitle")
    protected String officialTitle;
    @XmlAttribute(name = "SecondaryIDs")
    protected String secondaryIDs;
    @XmlAttribute(name = "DateCreated")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "StartDate", required = true)
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "StudyCompletionDate")
    protected XMLGregorianCalendar studyCompletionDate;

    /**
     * Gets the value of the studySytemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudySytemStatus() {
        return studySytemStatus;
    }

    /**
     * Sets the value of the studySytemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudySytemStatus(String value) {
        this.studySytemStatus = value;
    }

    /**
     * Gets the value of the principalInvestigator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInvestigator() {
        return principalInvestigator;
    }

    /**
     * Sets the value of the principalInvestigator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInvestigator(String value) {
        this.principalInvestigator = value;
    }

    /**
     * Gets the value of the detailedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * Sets the value of the detailedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedDescription(String value) {
        this.detailedDescription = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsor(String value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the collaborators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaborators() {
        return collaborators;
    }

    /**
     * Sets the value of the collaborators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaborators(String value) {
        this.collaborators = value;
    }

    /**
     * Gets the value of the studyPhase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyPhase() {
        return studyPhase;
    }

    /**
     * Sets the value of the studyPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyPhase(String value) {
        this.studyPhase = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * Gets the value of the protocolVerificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolVerificationDate() {
        return protocolVerificationDate;
    }

    /**
     * Sets the value of the protocolVerificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolVerificationDate(XMLGregorianCalendar value) {
        this.protocolVerificationDate = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiming(String value) {
        this.timing = value;
    }

    /**
     * Gets the value of the allocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocation(String value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the masking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasking() {
        return masking;
    }

    /**
     * Sets the value of the masking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasking(String value) {
        this.masking = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControl(String value) {
        this.control = value;
    }

    /**
     * Gets the value of the interventionModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterventionModel() {
        return interventionModel;
    }

    /**
     * Sets the value of the interventionModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterventionModel(String value) {
        this.interventionModel = value;
    }

    /**
     * Gets the value of the studyClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyClassification() {
        return studyClassification;
    }

    /**
     * Sets the value of the studyClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyClassification(String value) {
        this.studyClassification = value;
    }

    /**
     * Gets the value of the officialTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialTitle() {
        return officialTitle;
    }

    /**
     * Sets the value of the officialTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialTitle(String value) {
        this.officialTitle = value;
    }

    /**
     * Gets the value of the secondaryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIDs() {
        return secondaryIDs;
    }

    /**
     * Sets the value of the secondaryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIDs(String value) {
        this.secondaryIDs = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the studyCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudyCompletionDate() {
        return studyCompletionDate;
    }

    /**
     * Sets the value of the studyCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudyCompletionDate(XMLGregorianCalendar value) {
        this.studyCompletionDate = value;
    }

}
