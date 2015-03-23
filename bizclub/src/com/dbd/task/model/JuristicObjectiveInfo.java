/**
 * JuristicObjectiveInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicObjectiveInfo  implements java.io.Serializable {
    private java.lang.String objectiveDescription;

    private int objectiveID;

    private java.lang.String objectiveTopic;

    public JuristicObjectiveInfo() {
    }

    public JuristicObjectiveInfo(
           java.lang.String objectiveDescription,
           int objectiveID,
           java.lang.String objectiveTopic) {
           this.objectiveDescription = objectiveDescription;
           this.objectiveID = objectiveID;
           this.objectiveTopic = objectiveTopic;
    }


    /**
     * Gets the objectiveDescription value for this JuristicObjectiveInfo.
     * 
     * @return objectiveDescription
     */
    public java.lang.String getObjectiveDescription() {
        return objectiveDescription;
    }


    /**
     * Sets the objectiveDescription value for this JuristicObjectiveInfo.
     * 
     * @param objectiveDescription
     */
    public void setObjectiveDescription(java.lang.String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }


    /**
     * Gets the objectiveID value for this JuristicObjectiveInfo.
     * 
     * @return objectiveID
     */
    public int getObjectiveID() {
        return objectiveID;
    }


    /**
     * Sets the objectiveID value for this JuristicObjectiveInfo.
     * 
     * @param objectiveID
     */
    public void setObjectiveID(int objectiveID) {
        this.objectiveID = objectiveID;
    }


    /**
     * Gets the objectiveTopic value for this JuristicObjectiveInfo.
     * 
     * @return objectiveTopic
     */
    public java.lang.String getObjectiveTopic() {
        return objectiveTopic;
    }


    /**
     * Sets the objectiveTopic value for this JuristicObjectiveInfo.
     * 
     * @param objectiveTopic
     */
    public void setObjectiveTopic(java.lang.String objectiveTopic) {
        this.objectiveTopic = objectiveTopic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicObjectiveInfo)) return false;
        JuristicObjectiveInfo other = (JuristicObjectiveInfo) obj;
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
            this.objectiveID == other.getObjectiveID() &&
            ((this.objectiveTopic==null && other.getObjectiveTopic()==null) || 
             (this.objectiveTopic!=null &&
              this.objectiveTopic.equals(other.getObjectiveTopic())));
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
        _hashCode += getObjectiveID();
        if (getObjectiveTopic() != null) {
            _hashCode += getObjectiveTopic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicObjectiveInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicObjectiveInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectiveDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectiveDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectiveID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectiveID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectiveTopic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectiveTopic"));
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
