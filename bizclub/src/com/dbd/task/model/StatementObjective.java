/**
 * StatementObjective.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class StatementObjective  implements java.io.Serializable {
    private java.lang.String juristicID;

    private com.dbd.task.model.StatementObjective[] statementObjective;

    private java.lang.String objectiveDescription;

    private int objectiveID;

    public StatementObjective() {
    }

    public StatementObjective(
           java.lang.String juristicID,
           com.dbd.task.model.StatementObjective[] statementObjective,
           java.lang.String objectiveDescription,
           int objectiveID) {
           this.juristicID = juristicID;
           this.statementObjective = statementObjective;
           this.objectiveDescription = objectiveDescription;
           this.objectiveID = objectiveID;
    }


    /**
     * Gets the juristicID value for this StatementObjective.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this StatementObjective.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the statementObjective value for this StatementObjective.
     * 
     * @return statementObjective
     */
    public com.dbd.task.model.StatementObjective[] getStatementObjective() {
        return statementObjective;
    }


    /**
     * Sets the statementObjective value for this StatementObjective.
     * 
     * @param statementObjective
     */
    public void setStatementObjective(com.dbd.task.model.StatementObjective[] statementObjective) {
        this.statementObjective = statementObjective;
    }


    /**
     * Gets the objectiveDescription value for this StatementObjective.
     * 
     * @return objectiveDescription
     */
    public java.lang.String getObjectiveDescription() {
        return objectiveDescription;
    }


    /**
     * Sets the objectiveDescription value for this StatementObjective.
     * 
     * @param objectiveDescription
     */
    public void setObjectiveDescription(java.lang.String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }


    /**
     * Gets the objectiveID value for this StatementObjective.
     * 
     * @return objectiveID
     */
    public int getObjectiveID() {
        return objectiveID;
    }


    /**
     * Sets the objectiveID value for this StatementObjective.
     * 
     * @param objectiveID
     */
    public void setObjectiveID(int objectiveID) {
        this.objectiveID = objectiveID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatementObjective)) return false;
        StatementObjective other = (StatementObjective) obj;
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
            ((this.statementObjective==null && other.getStatementObjective()==null) || 
             (this.statementObjective!=null &&
              java.util.Arrays.equals(this.statementObjective, other.getStatementObjective()))) &&
            ((this.objectiveDescription==null && other.getObjectiveDescription()==null) || 
             (this.objectiveDescription!=null &&
              this.objectiveDescription.equals(other.getObjectiveDescription()))) &&
            this.objectiveID == other.getObjectiveID();
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
        if (getStatementObjective() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatementObjective());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatementObjective(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjectiveDescription() != null) {
            _hashCode += getObjectiveDescription().hashCode();
        }
        _hashCode += getObjectiveID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatementObjective.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "StatementObjective"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementObjective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statementObjective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "StatementObjective"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "StatementObjective"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
