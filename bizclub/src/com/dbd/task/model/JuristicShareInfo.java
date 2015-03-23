/**
 * JuristicShareInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicShareInfo  implements java.io.Serializable {
    private com.dbd.task.model.JuristicShareInfo[] juristicShareInfo;

    private java.lang.String id;

    private java.lang.String meetingDate;

    private java.lang.String receiveDate;

    private double totalNumberOfShare;

    private double parValue;

    public JuristicShareInfo() {
    }

    public JuristicShareInfo(
           com.dbd.task.model.JuristicShareInfo[] juristicShareInfo,
           java.lang.String id,
           java.lang.String meetingDate,
           java.lang.String receiveDate,
           double totalNumberOfShare,
           double parValue) {
           this.juristicShareInfo = juristicShareInfo;
           this.id = id;
           this.meetingDate = meetingDate;
           this.receiveDate = receiveDate;
           this.totalNumberOfShare = totalNumberOfShare;
           this.parValue = parValue;
    }


    /**
     * Gets the juristicShareInfo value for this JuristicShareInfo.
     * 
     * @return juristicShareInfo
     */
    public com.dbd.task.model.JuristicShareInfo[] getJuristicShareInfo() {
        return juristicShareInfo;
    }


    /**
     * Sets the juristicShareInfo value for this JuristicShareInfo.
     * 
     * @param juristicShareInfo
     */
    public void setJuristicShareInfo(com.dbd.task.model.JuristicShareInfo[] juristicShareInfo) {
        this.juristicShareInfo = juristicShareInfo;
    }


    /**
     * Gets the id value for this JuristicShareInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this JuristicShareInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the meetingDate value for this JuristicShareInfo.
     * 
     * @return meetingDate
     */
    public java.lang.String getMeetingDate() {
        return meetingDate;
    }


    /**
     * Sets the meetingDate value for this JuristicShareInfo.
     * 
     * @param meetingDate
     */
    public void setMeetingDate(java.lang.String meetingDate) {
        this.meetingDate = meetingDate;
    }


    /**
     * Gets the receiveDate value for this JuristicShareInfo.
     * 
     * @return receiveDate
     */
    public java.lang.String getReceiveDate() {
        return receiveDate;
    }


    /**
     * Sets the receiveDate value for this JuristicShareInfo.
     * 
     * @param receiveDate
     */
    public void setReceiveDate(java.lang.String receiveDate) {
        this.receiveDate = receiveDate;
    }


    /**
     * Gets the totalNumberOfShare value for this JuristicShareInfo.
     * 
     * @return totalNumberOfShare
     */
    public double getTotalNumberOfShare() {
        return totalNumberOfShare;
    }


    /**
     * Sets the totalNumberOfShare value for this JuristicShareInfo.
     * 
     * @param totalNumberOfShare
     */
    public void setTotalNumberOfShare(double totalNumberOfShare) {
        this.totalNumberOfShare = totalNumberOfShare;
    }


    /**
     * Gets the parValue value for this JuristicShareInfo.
     * 
     * @return parValue
     */
    public double getParValue() {
        return parValue;
    }


    /**
     * Sets the parValue value for this JuristicShareInfo.
     * 
     * @param parValue
     */
    public void setParValue(double parValue) {
        this.parValue = parValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicShareInfo)) return false;
        JuristicShareInfo other = (JuristicShareInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.juristicShareInfo==null && other.getJuristicShareInfo()==null) || 
             (this.juristicShareInfo!=null &&
              java.util.Arrays.equals(this.juristicShareInfo, other.getJuristicShareInfo()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.meetingDate==null && other.getMeetingDate()==null) || 
             (this.meetingDate!=null &&
              this.meetingDate.equals(other.getMeetingDate()))) &&
            ((this.receiveDate==null && other.getReceiveDate()==null) || 
             (this.receiveDate!=null &&
              this.receiveDate.equals(other.getReceiveDate()))) &&
            this.totalNumberOfShare == other.getTotalNumberOfShare() &&
            this.parValue == other.getParValue();
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
        if (getJuristicShareInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJuristicShareInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJuristicShareInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMeetingDate() != null) {
            _hashCode += getMeetingDate().hashCode();
        }
        if (getReceiveDate() != null) {
            _hashCode += getReceiveDate().hashCode();
        }
        _hashCode += new Double(getTotalNumberOfShare()).hashCode();
        _hashCode += new Double(getParValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicShareInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicShareInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicShareInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicShareInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicShareInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "JuristicShareInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meetingDate"));
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
        elemField.setFieldName("totalNumberOfShare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalNumberOfShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parValue"));
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
