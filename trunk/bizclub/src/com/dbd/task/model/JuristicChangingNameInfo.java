/**
 * JuristicChangingNameInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicChangingNameInfo  implements java.io.Serializable {
    private com.dbd.task.model.JuristicChangingNameInfo[] juristicChangingNameInfo;

    private java.lang.String juristicID;

    private java.lang.String nameChangeDate;

    private java.lang.String oldJuristicName;

    public JuristicChangingNameInfo() {
    }

    public JuristicChangingNameInfo(
           com.dbd.task.model.JuristicChangingNameInfo[] juristicChangingNameInfo,
           java.lang.String juristicID,
           java.lang.String nameChangeDate,
           java.lang.String oldJuristicName) {
           this.juristicChangingNameInfo = juristicChangingNameInfo;
           this.juristicID = juristicID;
           this.nameChangeDate = nameChangeDate;
           this.oldJuristicName = oldJuristicName;
    }


    /**
     * Gets the juristicChangingNameInfo value for this JuristicChangingNameInfo.
     * 
     * @return juristicChangingNameInfo
     */
    public com.dbd.task.model.JuristicChangingNameInfo[] getJuristicChangingNameInfo() {
        return juristicChangingNameInfo;
    }


    /**
     * Sets the juristicChangingNameInfo value for this JuristicChangingNameInfo.
     * 
     * @param juristicChangingNameInfo
     */
    public void setJuristicChangingNameInfo(com.dbd.task.model.JuristicChangingNameInfo[] juristicChangingNameInfo) {
        this.juristicChangingNameInfo = juristicChangingNameInfo;
    }


    /**
     * Gets the juristicID value for this JuristicChangingNameInfo.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this JuristicChangingNameInfo.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the nameChangeDate value for this JuristicChangingNameInfo.
     * 
     * @return nameChangeDate
     */
    public java.lang.String getNameChangeDate() {
        return nameChangeDate;
    }


    /**
     * Sets the nameChangeDate value for this JuristicChangingNameInfo.
     * 
     * @param nameChangeDate
     */
    public void setNameChangeDate(java.lang.String nameChangeDate) {
        this.nameChangeDate = nameChangeDate;
    }


    /**
     * Gets the oldJuristicName value for this JuristicChangingNameInfo.
     * 
     * @return oldJuristicName
     */
    public java.lang.String getOldJuristicName() {
        return oldJuristicName;
    }


    /**
     * Sets the oldJuristicName value for this JuristicChangingNameInfo.
     * 
     * @param oldJuristicName
     */
    public void setOldJuristicName(java.lang.String oldJuristicName) {
        this.oldJuristicName = oldJuristicName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicChangingNameInfo)) return false;
        JuristicChangingNameInfo other = (JuristicChangingNameInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.juristicChangingNameInfo==null && other.getJuristicChangingNameInfo()==null) || 
             (this.juristicChangingNameInfo!=null &&
              java.util.Arrays.equals(this.juristicChangingNameInfo, other.getJuristicChangingNameInfo()))) &&
            ((this.juristicID==null && other.getJuristicID()==null) || 
             (this.juristicID!=null &&
              this.juristicID.equals(other.getJuristicID()))) &&
            ((this.nameChangeDate==null && other.getNameChangeDate()==null) || 
             (this.nameChangeDate!=null &&
              this.nameChangeDate.equals(other.getNameChangeDate()))) &&
            ((this.oldJuristicName==null && other.getOldJuristicName()==null) || 
             (this.oldJuristicName!=null &&
              this.oldJuristicName.equals(other.getOldJuristicName())));
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
        if (getJuristicChangingNameInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJuristicChangingNameInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJuristicChangingNameInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJuristicID() != null) {
            _hashCode += getJuristicID().hashCode();
        }
        if (getNameChangeDate() != null) {
            _hashCode += getNameChangeDate().hashCode();
        }
        if (getOldJuristicName() != null) {
            _hashCode += getOldJuristicName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicChangingNameInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingNameInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicChangingNameInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicChangingNameInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingNameInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "JuristicChangingNameInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldJuristicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldJuristicName"));
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
