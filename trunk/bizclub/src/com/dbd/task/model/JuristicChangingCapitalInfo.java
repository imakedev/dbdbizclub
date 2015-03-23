/**
 * JuristicChangingCapitalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicChangingCapitalInfo  implements java.io.Serializable {
    private java.lang.String capitalChangeDate;

    private com.dbd.task.model.JuristicChangingCapitalInfo[] juristicChangingCapitalInfo;

    private java.lang.String juristicID;

    private double oldRegisterCapital;

    public JuristicChangingCapitalInfo() {
    }

    public JuristicChangingCapitalInfo(
           java.lang.String capitalChangeDate,
           com.dbd.task.model.JuristicChangingCapitalInfo[] juristicChangingCapitalInfo,
           java.lang.String juristicID,
           double oldRegisterCapital) {
           this.capitalChangeDate = capitalChangeDate;
           this.juristicChangingCapitalInfo = juristicChangingCapitalInfo;
           this.juristicID = juristicID;
           this.oldRegisterCapital = oldRegisterCapital;
    }


    /**
     * Gets the capitalChangeDate value for this JuristicChangingCapitalInfo.
     * 
     * @return capitalChangeDate
     */
    public java.lang.String getCapitalChangeDate() {
        return capitalChangeDate;
    }


    /**
     * Sets the capitalChangeDate value for this JuristicChangingCapitalInfo.
     * 
     * @param capitalChangeDate
     */
    public void setCapitalChangeDate(java.lang.String capitalChangeDate) {
        this.capitalChangeDate = capitalChangeDate;
    }


    /**
     * Gets the juristicChangingCapitalInfo value for this JuristicChangingCapitalInfo.
     * 
     * @return juristicChangingCapitalInfo
     */
    public com.dbd.task.model.JuristicChangingCapitalInfo[] getJuristicChangingCapitalInfo() {
        return juristicChangingCapitalInfo;
    }


    /**
     * Sets the juristicChangingCapitalInfo value for this JuristicChangingCapitalInfo.
     * 
     * @param juristicChangingCapitalInfo
     */
    public void setJuristicChangingCapitalInfo(com.dbd.task.model.JuristicChangingCapitalInfo[] juristicChangingCapitalInfo) {
        this.juristicChangingCapitalInfo = juristicChangingCapitalInfo;
    }


    /**
     * Gets the juristicID value for this JuristicChangingCapitalInfo.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this JuristicChangingCapitalInfo.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the oldRegisterCapital value for this JuristicChangingCapitalInfo.
     * 
     * @return oldRegisterCapital
     */
    public double getOldRegisterCapital() {
        return oldRegisterCapital;
    }


    /**
     * Sets the oldRegisterCapital value for this JuristicChangingCapitalInfo.
     * 
     * @param oldRegisterCapital
     */
    public void setOldRegisterCapital(double oldRegisterCapital) {
        this.oldRegisterCapital = oldRegisterCapital;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicChangingCapitalInfo)) return false;
        JuristicChangingCapitalInfo other = (JuristicChangingCapitalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.capitalChangeDate==null && other.getCapitalChangeDate()==null) || 
             (this.capitalChangeDate!=null &&
              this.capitalChangeDate.equals(other.getCapitalChangeDate()))) &&
            ((this.juristicChangingCapitalInfo==null && other.getJuristicChangingCapitalInfo()==null) || 
             (this.juristicChangingCapitalInfo!=null &&
              java.util.Arrays.equals(this.juristicChangingCapitalInfo, other.getJuristicChangingCapitalInfo()))) &&
            ((this.juristicID==null && other.getJuristicID()==null) || 
             (this.juristicID!=null &&
              this.juristicID.equals(other.getJuristicID()))) &&
            this.oldRegisterCapital == other.getOldRegisterCapital();
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
        if (getCapitalChangeDate() != null) {
            _hashCode += getCapitalChangeDate().hashCode();
        }
        if (getJuristicChangingCapitalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJuristicChangingCapitalInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJuristicChangingCapitalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJuristicID() != null) {
            _hashCode += getJuristicID().hashCode();
        }
        _hashCode += new Double(getOldRegisterCapital()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicChangingCapitalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingCapitalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capitalChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capitalChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicChangingCapitalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicChangingCapitalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingCapitalInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "JuristicChangingCapitalInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldRegisterCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldRegisterCapital"));
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
