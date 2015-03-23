/**
 * DataAccessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model.sub;

public class DataAccessInfo  implements java.io.Serializable {
    private java.lang.String errorDesc;

    private double getBytes;

    private int getRecords;

    private java.lang.String resultStatus;

    private double serviceFee;

    public DataAccessInfo() {
    }

    public DataAccessInfo(
           java.lang.String errorDesc,
           double getBytes,
           int getRecords,
           java.lang.String resultStatus,
           double serviceFee) {
           this.errorDesc = errorDesc;
           this.getBytes = getBytes;
           this.getRecords = getRecords;
           this.resultStatus = resultStatus;
           this.serviceFee = serviceFee;
    }


    /**
     * Gets the errorDesc value for this DataAccessInfo.
     * 
     * @return errorDesc
     */
    public java.lang.String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this DataAccessInfo.
     * 
     * @param errorDesc
     */
    public void setErrorDesc(java.lang.String errorDesc) {
        this.errorDesc = errorDesc;
    }


    /**
     * Gets the getBytes value for this DataAccessInfo.
     * 
     * @return getBytes
     */
    public double getGetBytes() {
        return getBytes;
    }


    /**
     * Sets the getBytes value for this DataAccessInfo.
     * 
     * @param getBytes
     */
    public void setGetBytes(double getBytes) {
        this.getBytes = getBytes;
    }


    /**
     * Gets the getRecords value for this DataAccessInfo.
     * 
     * @return getRecords
     */
    public int getGetRecords() {
        return getRecords;
    }


    /**
     * Sets the getRecords value for this DataAccessInfo.
     * 
     * @param getRecords
     */
    public void setGetRecords(int getRecords) {
        this.getRecords = getRecords;
    }


    /**
     * Gets the resultStatus value for this DataAccessInfo.
     * 
     * @return resultStatus
     */
    public java.lang.String getResultStatus() {
        return resultStatus;
    }


    /**
     * Sets the resultStatus value for this DataAccessInfo.
     * 
     * @param resultStatus
     */
    public void setResultStatus(java.lang.String resultStatus) {
        this.resultStatus = resultStatus;
    }


    /**
     * Gets the serviceFee value for this DataAccessInfo.
     * 
     * @return serviceFee
     */
    public double getServiceFee() {
        return serviceFee;
    }


    /**
     * Sets the serviceFee value for this DataAccessInfo.
     * 
     * @param serviceFee
     */
    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataAccessInfo)) return false;
        DataAccessInfo other = (DataAccessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorDesc==null && other.getErrorDesc()==null) || 
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc()))) &&
            this.getBytes == other.getGetBytes() &&
            this.getRecords == other.getGetRecords() &&
            ((this.resultStatus==null && other.getResultStatus()==null) || 
             (this.resultStatus!=null &&
              this.resultStatus.equals(other.getResultStatus()))) &&
            this.serviceFee == other.getServiceFee();
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
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        _hashCode += new Double(getGetBytes()).hashCode();
        _hashCode += getGetRecords();
        if (getResultStatus() != null) {
            _hashCode += getResultStatus().hashCode();
        }
        _hashCode += new Double(getServiceFee()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataAccessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "DataAccessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
