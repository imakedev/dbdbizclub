/**
 * SubmitStatementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class SubmitStatementInfo  implements java.io.Serializable {
    private java.lang.String auditorID;

    private java.lang.String auditorName;

    private java.lang.String auditorStatus;

    private java.lang.String receiveDate;

    private java.lang.String statementYear;

    public SubmitStatementInfo() {
    }

    public SubmitStatementInfo(
           java.lang.String auditorID,
           java.lang.String auditorName,
           java.lang.String auditorStatus,
           java.lang.String receiveDate,
           java.lang.String statementYear) {
           this.auditorID = auditorID;
           this.auditorName = auditorName;
           this.auditorStatus = auditorStatus;
           this.receiveDate = receiveDate;
           this.statementYear = statementYear;
    }


    /**
     * Gets the auditorID value for this SubmitStatementInfo.
     * 
     * @return auditorID
     */
    public java.lang.String getAuditorID() {
        return auditorID;
    }


    /**
     * Sets the auditorID value for this SubmitStatementInfo.
     * 
     * @param auditorID
     */
    public void setAuditorID(java.lang.String auditorID) {
        this.auditorID = auditorID;
    }


    /**
     * Gets the auditorName value for this SubmitStatementInfo.
     * 
     * @return auditorName
     */
    public java.lang.String getAuditorName() {
        return auditorName;
    }


    /**
     * Sets the auditorName value for this SubmitStatementInfo.
     * 
     * @param auditorName
     */
    public void setAuditorName(java.lang.String auditorName) {
        this.auditorName = auditorName;
    }


    /**
     * Gets the auditorStatus value for this SubmitStatementInfo.
     * 
     * @return auditorStatus
     */
    public java.lang.String getAuditorStatus() {
        return auditorStatus;
    }


    /**
     * Sets the auditorStatus value for this SubmitStatementInfo.
     * 
     * @param auditorStatus
     */
    public void setAuditorStatus(java.lang.String auditorStatus) {
        this.auditorStatus = auditorStatus;
    }


    /**
     * Gets the receiveDate value for this SubmitStatementInfo.
     * 
     * @return receiveDate
     */
    public java.lang.String getReceiveDate() {
        return receiveDate;
    }


    /**
     * Sets the receiveDate value for this SubmitStatementInfo.
     * 
     * @param receiveDate
     */
    public void setReceiveDate(java.lang.String receiveDate) {
        this.receiveDate = receiveDate;
    }


    /**
     * Gets the statementYear value for this SubmitStatementInfo.
     * 
     * @return statementYear
     */
    public java.lang.String getStatementYear() {
        return statementYear;
    }


    /**
     * Sets the statementYear value for this SubmitStatementInfo.
     * 
     * @param statementYear
     */
    public void setStatementYear(java.lang.String statementYear) {
        this.statementYear = statementYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitStatementInfo)) return false;
        SubmitStatementInfo other = (SubmitStatementInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auditorID==null && other.getAuditorID()==null) || 
             (this.auditorID!=null &&
              this.auditorID.equals(other.getAuditorID()))) &&
            ((this.auditorName==null && other.getAuditorName()==null) || 
             (this.auditorName!=null &&
              this.auditorName.equals(other.getAuditorName()))) &&
            ((this.auditorStatus==null && other.getAuditorStatus()==null) || 
             (this.auditorStatus!=null &&
              this.auditorStatus.equals(other.getAuditorStatus()))) &&
            ((this.receiveDate==null && other.getReceiveDate()==null) || 
             (this.receiveDate!=null &&
              this.receiveDate.equals(other.getReceiveDate()))) &&
            ((this.statementYear==null && other.getStatementYear()==null) || 
             (this.statementYear!=null &&
              this.statementYear.equals(other.getStatementYear())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuditorID() != null) {
            _hashCode += getAuditorID().hashCode();
        }
        if (getAuditorName() != null) {
            _hashCode += getAuditorName().hashCode();
        }
        if (getAuditorStatus() != null) {
            _hashCode += getAuditorStatus().hashCode();
        }
        if (getReceiveDate() != null) {
            _hashCode += getReceiveDate().hashCode();
        }
        if (getStatementYear() != null) {
            _hashCode += getStatementYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitStatementInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "SubmitStatementInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statementYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
