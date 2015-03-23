/**
 * BfileFromDB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model.sub;

public class BfileFromDB  implements java.io.Serializable {
    private java.lang.String bfileData;

    private java.lang.String bfileName;

    public BfileFromDB() {
    }

    public BfileFromDB(
           java.lang.String bfileData,
           java.lang.String bfileName) {
           this.bfileData = bfileData;
           this.bfileName = bfileName;
    }


    /**
     * Gets the bfileData value for this BfileFromDB.
     * 
     * @return bfileData
     */
    public java.lang.String getBfileData() {
        return bfileData;
    }


    /**
     * Sets the bfileData value for this BfileFromDB.
     * 
     * @param bfileData
     */
    public void setBfileData(java.lang.String bfileData) {
        this.bfileData = bfileData;
    }


    /**
     * Gets the bfileName value for this BfileFromDB.
     * 
     * @return bfileName
     */
    public java.lang.String getBfileName() {
        return bfileName;
    }


    /**
     * Sets the bfileName value for this BfileFromDB.
     * 
     * @param bfileName
     */
    public void setBfileName(java.lang.String bfileName) {
        this.bfileName = bfileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BfileFromDB)) return false;
        BfileFromDB other = (BfileFromDB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bfileData==null && other.getBfileData()==null) || 
             (this.bfileData!=null &&
              this.bfileData.equals(other.getBfileData()))) &&
            ((this.bfileName==null && other.getBfileName()==null) || 
             (this.bfileName!=null &&
              this.bfileName.equals(other.getBfileName())));
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
        if (getBfileData() != null) {
            _hashCode += getBfileData().hashCode();
        }
        if (getBfileName() != null) {
            _hashCode += getBfileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BfileFromDB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BfileFromDB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bfileData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bfileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bfileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bfileName"));
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
