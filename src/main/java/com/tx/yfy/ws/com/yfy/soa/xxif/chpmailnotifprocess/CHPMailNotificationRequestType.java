
package com.yfy.soa.xxif.chpmailnotifprocess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHPMailNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHPMailNotificationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailParameter01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailParameter02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailParameter03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailParameter04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailParameter05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHPMailNotificationRequestType", propOrder = {
    "processCode",
    "serverCode",
    "batchId",
    "mailCode",
    "mailContent",
    "mailParameter01",
    "mailParameter02",
    "mailParameter03",
    "mailParameter04",
    "mailParameter05"
})
public class CHPMailNotificationRequestType {

    @XmlElement(name = "ProcessCode", required = true)
    protected String processCode;
    @XmlElement(name = "ServerCode", required = true)
    protected String serverCode;
    @XmlElement(name = "BatchId", required = true)
    protected String batchId;
    @XmlElement(name = "MailCode", required = true)
    protected String mailCode;
    @XmlElement(name = "MailContent")
    protected String mailContent;
    @XmlElement(name = "MailParameter01")
    protected String mailParameter01;
    @XmlElement(name = "MailParameter02")
    protected String mailParameter02;
    @XmlElement(name = "MailParameter03")
    protected String mailParameter03;
    @XmlElement(name = "MailParameter04")
    protected String mailParameter04;
    @XmlElement(name = "MailParameter05")
    protected String mailParameter05;

    /**
     * Gets the value of the processCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessCode() {
        return processCode;
    }

    /**
     * Sets the value of the processCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessCode(String value) {
        this.processCode = value;
    }

    /**
     * Gets the value of the serverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerCode() {
        return serverCode;
    }

    /**
     * Sets the value of the serverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerCode(String value) {
        this.serverCode = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the mailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCode() {
        return mailCode;
    }

    /**
     * Sets the value of the mailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCode(String value) {
        this.mailCode = value;
    }

    /**
     * Gets the value of the mailContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContent() {
        return mailContent;
    }

    /**
     * Sets the value of the mailContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContent(String value) {
        this.mailContent = value;
    }

    /**
     * Gets the value of the mailParameter01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailParameter01() {
        return mailParameter01;
    }

    /**
     * Sets the value of the mailParameter01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailParameter01(String value) {
        this.mailParameter01 = value;
    }

    /**
     * Gets the value of the mailParameter02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailParameter02() {
        return mailParameter02;
    }

    /**
     * Sets the value of the mailParameter02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailParameter02(String value) {
        this.mailParameter02 = value;
    }

    /**
     * Gets the value of the mailParameter03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailParameter03() {
        return mailParameter03;
    }

    /**
     * Sets the value of the mailParameter03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailParameter03(String value) {
        this.mailParameter03 = value;
    }

    /**
     * Gets the value of the mailParameter04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailParameter04() {
        return mailParameter04;
    }

    /**
     * Sets the value of the mailParameter04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailParameter04(String value) {
        this.mailParameter04 = value;
    }

    /**
     * Gets the value of the mailParameter05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailParameter05() {
        return mailParameter05;
    }

    /**
     * Sets the value of the mailParameter05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailParameter05(String value) {
        this.mailParameter05 = value;
    }

}
