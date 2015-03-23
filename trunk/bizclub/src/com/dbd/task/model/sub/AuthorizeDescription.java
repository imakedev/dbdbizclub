/**
 * AuthorizeDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model.sub;

public class AuthorizeDescription  implements java.io.Serializable {
    private java.lang.String authorizeDescription;

    public AuthorizeDescription() {
    }

    public AuthorizeDescription(
           java.lang.String authorizeDescription) {
           this.authorizeDescription = authorizeDescription;
    }


    /**
     * Gets the authorizeDescription value for this AuthorizeDescription.
     * 
     * @return authorizeDescription
     */
    public java.lang.String getAuthorizeDescription() {
        return authorizeDescription;
    }


    /**
     * Sets the authorizeDescription value for this AuthorizeDescription.
     * 
     * @param authorizeDescription
     */
    public void setAuthorizeDescription(java.lang.String authorizeDescription) {
        this.authorizeDescription = authorizeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorizeDescription)) return false;
        AuthorizeDescription other = (AuthorizeDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizeDescription==null && other.getAuthorizeDescription()==null) || 
             (this.authorizeDescription!=null &&
              this.authorizeDescription.equals(other.getAuthorizeDescription())));
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
        if (getAuthorizeDescription() != null) {
            _hashCode += getAuthorizeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorizeDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "AuthorizeDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeDescription"));
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
