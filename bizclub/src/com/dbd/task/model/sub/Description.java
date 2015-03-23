/**
 * Description.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model.sub;

public class Description  implements java.io.Serializable {
    private java.lang.String objectiveDesc;

    public Description() {
    }

    public Description(
           java.lang.String objectiveDesc) {
           this.objectiveDesc = objectiveDesc;
    }


    /**
     * Gets the objectiveDesc value for this Description.
     * 
     * @return objectiveDesc
     */
    public java.lang.String getObjectiveDesc() {
        return objectiveDesc;
    }


    /**
     * Sets the objectiveDesc value for this Description.
     * 
     * @param objectiveDesc
     */
    public void setObjectiveDesc(java.lang.String objectiveDesc) {
        this.objectiveDesc = objectiveDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Description)) return false;
        Description other = (Description) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectiveDesc==null && other.getObjectiveDesc()==null) || 
             (this.objectiveDesc!=null &&
              this.objectiveDesc.equals(other.getObjectiveDesc())));
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
        if (getObjectiveDesc() != null) {
            _hashCode += getObjectiveDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Description.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "Description"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectiveDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectiveDesc"));
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
