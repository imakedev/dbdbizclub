/**
 * JuristicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicInfo  implements java.io.Serializable {
    private java.lang.String juristicID;

    private java.lang.String juristicName;

    private java.lang.String juristicType;

    private java.lang.String registerDate;

    public JuristicInfo() {
    }

    public JuristicInfo(
           java.lang.String juristicID,
           java.lang.String juristicName,
           java.lang.String juristicType,
           java.lang.String registerDate) {
           this.juristicID = juristicID;
           this.juristicName = juristicName;
           this.juristicType = juristicType;
           this.registerDate = registerDate;
    }


    /**
     * Gets the juristicID value for this JuristicInfo.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this JuristicInfo.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the juristicName value for this JuristicInfo.
     * 
     * @return juristicName
     */
    public java.lang.String getJuristicName() {
        return juristicName;
    }


    /**
     * Sets the juristicName value for this JuristicInfo.
     * 
     * @param juristicName
     */
    public void setJuristicName(java.lang.String juristicName) {
        this.juristicName = juristicName;
    }


    /**
     * Gets the juristicType value for this JuristicInfo.
     * 
     * @return juristicType
     */
    public java.lang.String getJuristicType() {
        return juristicType;
    }


    /**
     * Sets the juristicType value for this JuristicInfo.
     * 
     * @param juristicType
     */
    public void setJuristicType(java.lang.String juristicType) {
        this.juristicType = juristicType;
    }


    /**
     * Gets the registerDate value for this JuristicInfo.
     * 
     * @return registerDate
     */
    public java.lang.String getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this JuristicInfo.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.lang.String registerDate) {
        this.registerDate = registerDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicInfo)) return false;
        JuristicInfo other = (JuristicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.juristicID==null && other.getJuristicID()==null) || 
             (this.juristicID!=null &&
              this.juristicID.equals(other.getJuristicID()))) &&
            ((this.juristicName==null && other.getJuristicName()==null) || 
             (this.juristicName!=null &&
              this.juristicName.equals(other.getJuristicName()))) &&
            ((this.juristicType==null && other.getJuristicType()==null) || 
             (this.juristicType!=null &&
              this.juristicType.equals(other.getJuristicType()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate())));
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
        if (getJuristicID() != null) {
            _hashCode += getJuristicID().hashCode();
        }
        if (getJuristicName() != null) {
            _hashCode += getJuristicName().hashCode();
        }
        if (getJuristicType() != null) {
            _hashCode += getJuristicType().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
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
