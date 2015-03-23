/**
 * JuristicRegisterCapitalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicRegisterCapitalInfo  implements java.io.Serializable {
    private java.lang.String juristicID;

    private double paidUpCapital;

    private double registerCapital;

    public JuristicRegisterCapitalInfo() {
    }

    public JuristicRegisterCapitalInfo(
           java.lang.String juristicID,
           double paidUpCapital,
           double registerCapital) {
           this.juristicID = juristicID;
           this.paidUpCapital = paidUpCapital;
           this.registerCapital = registerCapital;
    }


    /**
     * Gets the juristicID value for this JuristicRegisterCapitalInfo.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this JuristicRegisterCapitalInfo.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the paidUpCapital value for this JuristicRegisterCapitalInfo.
     * 
     * @return paidUpCapital
     */
    public double getPaidUpCapital() {
        return paidUpCapital;
    }


    /**
     * Sets the paidUpCapital value for this JuristicRegisterCapitalInfo.
     * 
     * @param paidUpCapital
     */
    public void setPaidUpCapital(double paidUpCapital) {
        this.paidUpCapital = paidUpCapital;
    }


    /**
     * Gets the registerCapital value for this JuristicRegisterCapitalInfo.
     * 
     * @return registerCapital
     */
    public double getRegisterCapital() {
        return registerCapital;
    }


    /**
     * Sets the registerCapital value for this JuristicRegisterCapitalInfo.
     * 
     * @param registerCapital
     */
    public void setRegisterCapital(double registerCapital) {
        this.registerCapital = registerCapital;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicRegisterCapitalInfo)) return false;
        JuristicRegisterCapitalInfo other = (JuristicRegisterCapitalInfo) obj;
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
            this.paidUpCapital == other.getPaidUpCapital() &&
            this.registerCapital == other.getRegisterCapital();
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
        _hashCode += new Double(getPaidUpCapital()).hashCode();
        _hashCode += new Double(getRegisterCapital()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicRegisterCapitalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicRegisterCapitalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidUpCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidUpCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerCapital"));
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
