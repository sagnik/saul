/** This software is released under the University of Illinois/Research and Academic Use License. See
  * the LICENSE file in the root folder for details. Copyright (c) 2016
  *
  * Developed by: The Cognitive Computations Group, University of Illinois at Urbana-Champaign
  * http://cogcomp.cs.illinois.edu/
  */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.25 at 08:20:43 PM IRDT 
//


package edu.illinois.cs.cogcomp.saulexamples.nlp.SpatialRoleLabeling.SpRL2015;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MOTION")
public class MOTION {

    @XmlAttribute(name = "comment", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String comment;
    @XmlAttribute(name = "countable", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String countable;
    @XmlAttribute(name = "domain", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String domain;
    @XmlAttribute(name = "elevation", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String elevation;
    @XmlAttribute(name = "end", required = true)
    protected BigInteger end;
    @XmlAttribute(name = "gquant", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String gquant;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String id;
    @XmlAttribute(name = "latLong")
    @XmlSchemaType(name = "anySimpleType")
    protected String latLong;
    @XmlAttribute(name = "latlong")
    @XmlSchemaType(name = "anySimpleType")
    protected String latlong;
    @XmlAttribute(name = "mod", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String mod;
    @XmlAttribute(name = "motion_class", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String motionClass;
    @XmlAttribute(name = "motion_sense", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String motionSense;
    @XmlAttribute(name = "motion_type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String motionType;
    @XmlAttribute(name = "scopes", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String scopes;
    @XmlAttribute(name = "start", required = true)
    protected BigInteger start;
    @XmlAttribute(name = "text", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String text;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the countable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountable() {
        return countable;
    }

    /**
     * Sets the value of the countable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountable(String value) {
        this.countable = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevation(String value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnd(BigInteger value) {
        this.end = value;
    }

    /**
     * Gets the value of the gquant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGquant() {
        return gquant;
    }

    /**
     * Sets the value of the gquant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGquant(String value) {
        this.gquant = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the latLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatLong() {
        return latLong;
    }

    /**
     * Sets the value of the latLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatLong(String value) {
        this.latLong = value;
    }

    /**
     * Gets the value of the latlong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatlong() {
        return latlong;
    }

    /**
     * Sets the value of the latlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatlong(String value) {
        this.latlong = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMod(String value) {
        this.mod = value;
    }

    /**
     * Gets the value of the motionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionClass() {
        return motionClass;
    }

    /**
     * Sets the value of the motionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionClass(String value) {
        this.motionClass = value;
    }

    /**
     * Gets the value of the motionSense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionSense() {
        return motionSense;
    }

    /**
     * Sets the value of the motionSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionSense(String value) {
        this.motionSense = value;
    }

    /**
     * Gets the value of the motionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionType() {
        return motionType;
    }

    /**
     * Sets the value of the motionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionType(String value) {
        this.motionType = value;
    }

    /**
     * Gets the value of the scopes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopes() {
        return scopes;
    }

    /**
     * Sets the value of the scopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopes(String value) {
        this.scopes = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
