/**
 * FinancialStatementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class FinancialStatementInfo  implements java.io.Serializable {
    private com.dbd.task.model.sub.BalanceStatementInformation[] balanceStatementInformation;

    private java.lang.String juristicID;

    public FinancialStatementInfo() {
    }

    public FinancialStatementInfo(
           com.dbd.task.model.sub.BalanceStatementInformation[] balanceStatementInformation,
           java.lang.String juristicID) {
           this.balanceStatementInformation = balanceStatementInformation;
           this.juristicID = juristicID;
    }


    /**
     * Gets the balanceStatementInformation value for this FinancialStatementInfo.
     * 
     * @return balanceStatementInformation
     */
    public com.dbd.task.model.sub.BalanceStatementInformation[] getBalanceStatementInformation() {
        return balanceStatementInformation;
    }


    /**
     * Sets the balanceStatementInformation value for this FinancialStatementInfo.
     * 
     * @param balanceStatementInformation
     */
    public void setBalanceStatementInformation(com.dbd.task.model.sub.BalanceStatementInformation[] balanceStatementInformation) {
        this.balanceStatementInformation = balanceStatementInformation;
    }


    /**
     * Gets the juristicID value for this FinancialStatementInfo.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this FinancialStatementInfo.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinancialStatementInfo)) return false;
        FinancialStatementInfo other = (FinancialStatementInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceStatementInformation==null && other.getBalanceStatementInformation()==null) || 
             (this.balanceStatementInformation!=null &&
              java.util.Arrays.equals(this.balanceStatementInformation, other.getBalanceStatementInformation()))) &&
            ((this.juristicID==null && other.getJuristicID()==null) || 
             (this.juristicID!=null &&
              this.juristicID.equals(other.getJuristicID())));
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
        if (getBalanceStatementInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceStatementInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceStatementInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJuristicID() != null) {
            _hashCode += getJuristicID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FinancialStatementInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "FinancialStatementInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceStatementInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceStatementInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BalanceStatementInformation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "BalanceStatementInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
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
