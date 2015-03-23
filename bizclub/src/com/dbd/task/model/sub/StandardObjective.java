/**
 * StandardObjective.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model.sub;

public class StandardObjective  implements java.io.Serializable {
    private java.lang.String objectiveDescription;

    private java.lang.String standdardId;

    public StandardObjective() {
    }

    public StandardObjective(
           java.lang.String objectiveDescription,
           java.lang.String standdardId) {
           this.objectiveDescription = objectiveDescription;
           this.standdardId = standdardId;
    }


    /**
     * Gets the objectiveDescription value for this StandardObjective.
     * 
     * @return objectiveDescription
     */
    public java.lang.String getObjectiveDescription() {
        return objectiveDescription;
    }


    /**
     * Sets the objectiveDescription value for this StandardObjective.
     * 
     * @param objectiveDescription
     */
    public void setObjectiveDescription(java.lang.String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }


    /**
     * Gets the standdardId value for this StandardObjective.
     * 
     * @return standdardId
     */
    public java.lang.String getStanddardId() {
        return standdardId;
    }


    /**
     * Sets the standdardId value for this StandardObjective.
     * 
     * @param standdardId
     */
    public void setStanddardId(java.lang.String standdardId) {
        this.standdardId = standdardId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StandardObjective)) return false;
        StandardObjective other = (StandardObjective) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectiveDescription==null && other.getObjectiveDescription()==null) || 
             (this.objectiveDescription!=null &&
              this.objectiveDescription.equals(other.getObjectiveDescription()))) &&
            ((this.standdardId==null && other.getStanddardId()==null) || 
             (this.standdardId!=null &&
              this.standdardId.equals(other.getStanddardId())));
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
        if (getObjectiveDescription() != null) {
            _hashCode += getObjectiveDescription().hashCode();
        }
        if (getStanddardId() != null) {
            _hashCode += getStanddardId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StandardObjective.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "StandardObjective"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectiveDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectiveDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standdardId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standdardId"));
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
