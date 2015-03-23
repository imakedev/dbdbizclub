/**
 * CheckJuristicInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class CheckJuristicInformation  implements java.io.Serializable {
    private java.lang.String address;

    private com.dbd.task.model.sub.CommitteeInformation[] committeeInformation;

    private java.lang.String juristicID;

    private java.lang.String juristicName;

    private java.lang.String juristicStatus;

    private java.lang.String juristicType;

    private java.lang.String oldJuristicID;

    private java.lang.Double registerCapital;

    private java.lang.String registerDate;

    private java.lang.String juristicAmpur;

    private java.lang.String juristicProvince;

    private java.lang.String juristicTumbol;

    private com.dbd.task.model.sub.SubmitStatementInformation[] submitStatementInformation;

    private com.dbd.task.model.sub.AuthorizeDescription[] authorizeDescription;

    private com.dbd.task.model.sub.HistoryDescription[] historyDescription;

    private com.dbd.task.model.sub.LimitAuthorize[] limitAuthorize;

    private com.dbd.task.model.sub.Description[] description;

    public CheckJuristicInformation() {
    }

    public CheckJuristicInformation(
           java.lang.String address,
           com.dbd.task.model.sub.CommitteeInformation[] committeeInformation,
           java.lang.String juristicID,
           java.lang.String juristicName,
           java.lang.String juristicStatus,
           java.lang.String juristicType,
           java.lang.String oldJuristicID,
           java.lang.Double registerCapital,
           java.lang.String registerDate,
           java.lang.String juristicAmpur,
           java.lang.String juristicProvince,
           java.lang.String juristicTumbol,
           com.dbd.task.model.sub.SubmitStatementInformation[] submitStatementInformation,
           com.dbd.task.model.sub.AuthorizeDescription[] authorizeDescription,
           com.dbd.task.model.sub.HistoryDescription[] historyDescription,
           com.dbd.task.model.sub.LimitAuthorize[] limitAuthorize,
           com.dbd.task.model.sub.Description[] description) {
           this.address = address;
           this.committeeInformation = committeeInformation;
           this.juristicID = juristicID;
           this.juristicName = juristicName;
           this.juristicStatus = juristicStatus;
           this.juristicType = juristicType;
           this.oldJuristicID = oldJuristicID;
           this.registerCapital = registerCapital;
           this.registerDate = registerDate;
           this.juristicAmpur = juristicAmpur;
           this.juristicProvince = juristicProvince;
           this.juristicTumbol = juristicTumbol;
           this.submitStatementInformation = submitStatementInformation;
           this.authorizeDescription = authorizeDescription;
           this.historyDescription = historyDescription;
           this.limitAuthorize = limitAuthorize;
           this.description = description;
    }


    /**
     * Gets the address value for this CheckJuristicInformation.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CheckJuristicInformation.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the committeeInformation value for this CheckJuristicInformation.
     * 
     * @return committeeInformation
     */
    public com.dbd.task.model.sub.CommitteeInformation[] getCommitteeInformation() {
        return committeeInformation;
    }


    /**
     * Sets the committeeInformation value for this CheckJuristicInformation.
     * 
     * @param committeeInformation
     */
    public void setCommitteeInformation(com.dbd.task.model.sub.CommitteeInformation[] committeeInformation) {
        this.committeeInformation = committeeInformation;
    }


    /**
     * Gets the juristicID value for this CheckJuristicInformation.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this CheckJuristicInformation.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the juristicName value for this CheckJuristicInformation.
     * 
     * @return juristicName
     */
    public java.lang.String getJuristicName() {
        return juristicName;
    }


    /**
     * Sets the juristicName value for this CheckJuristicInformation.
     * 
     * @param juristicName
     */
    public void setJuristicName(java.lang.String juristicName) {
        this.juristicName = juristicName;
    }


    /**
     * Gets the juristicStatus value for this CheckJuristicInformation.
     * 
     * @return juristicStatus
     */
    public java.lang.String getJuristicStatus() {
        return juristicStatus;
    }


    /**
     * Sets the juristicStatus value for this CheckJuristicInformation.
     * 
     * @param juristicStatus
     */
    public void setJuristicStatus(java.lang.String juristicStatus) {
        this.juristicStatus = juristicStatus;
    }


    /**
     * Gets the juristicType value for this CheckJuristicInformation.
     * 
     * @return juristicType
     */
    public java.lang.String getJuristicType() {
        return juristicType;
    }


    /**
     * Sets the juristicType value for this CheckJuristicInformation.
     * 
     * @param juristicType
     */
    public void setJuristicType(java.lang.String juristicType) {
        this.juristicType = juristicType;
    }


    /**
     * Gets the oldJuristicID value for this CheckJuristicInformation.
     * 
     * @return oldJuristicID
     */
    public java.lang.String getOldJuristicID() {
        return oldJuristicID;
    }


    /**
     * Sets the oldJuristicID value for this CheckJuristicInformation.
     * 
     * @param oldJuristicID
     */
    public void setOldJuristicID(java.lang.String oldJuristicID) {
        this.oldJuristicID = oldJuristicID;
    }


    /**
     * Gets the registerCapital value for this CheckJuristicInformation.
     * 
     * @return registerCapital
     */
    public java.lang.Double getRegisterCapital() {
        return registerCapital;
    }


    /**
     * Sets the registerCapital value for this CheckJuristicInformation.
     * 
     * @param registerCapital
     */
    public void setRegisterCapital(java.lang.Double registerCapital) {
        this.registerCapital = registerCapital;
    }


    /**
     * Gets the registerDate value for this CheckJuristicInformation.
     * 
     * @return registerDate
     */
    public java.lang.String getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this CheckJuristicInformation.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.lang.String registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the juristicAmpur value for this CheckJuristicInformation.
     * 
     * @return juristicAmpur
     */
    public java.lang.String getJuristicAmpur() {
        return juristicAmpur;
    }


    /**
     * Sets the juristicAmpur value for this CheckJuristicInformation.
     * 
     * @param juristicAmpur
     */
    public void setJuristicAmpur(java.lang.String juristicAmpur) {
        this.juristicAmpur = juristicAmpur;
    }


    /**
     * Gets the juristicProvince value for this CheckJuristicInformation.
     * 
     * @return juristicProvince
     */
    public java.lang.String getJuristicProvince() {
        return juristicProvince;
    }


    /**
     * Sets the juristicProvince value for this CheckJuristicInformation.
     * 
     * @param juristicProvince
     */
    public void setJuristicProvince(java.lang.String juristicProvince) {
        this.juristicProvince = juristicProvince;
    }


    /**
     * Gets the juristicTumbol value for this CheckJuristicInformation.
     * 
     * @return juristicTumbol
     */
    public java.lang.String getJuristicTumbol() {
        return juristicTumbol;
    }


    /**
     * Sets the juristicTumbol value for this CheckJuristicInformation.
     * 
     * @param juristicTumbol
     */
    public void setJuristicTumbol(java.lang.String juristicTumbol) {
        this.juristicTumbol = juristicTumbol;
    }


    /**
     * Gets the submitStatementInformation value for this CheckJuristicInformation.
     * 
     * @return submitStatementInformation
     */
    public com.dbd.task.model.sub.SubmitStatementInformation[] getSubmitStatementInformation() {
        return submitStatementInformation;
    }


    /**
     * Sets the submitStatementInformation value for this CheckJuristicInformation.
     * 
     * @param submitStatementInformation
     */
    public void setSubmitStatementInformation(com.dbd.task.model.sub.SubmitStatementInformation[] submitStatementInformation) {
        this.submitStatementInformation = submitStatementInformation;
    }


    /**
     * Gets the authorizeDescription value for this CheckJuristicInformation.
     * 
     * @return authorizeDescription
     */
    public com.dbd.task.model.sub.AuthorizeDescription[] getAuthorizeDescription() {
        return authorizeDescription;
    }


    /**
     * Sets the authorizeDescription value for this CheckJuristicInformation.
     * 
     * @param authorizeDescription
     */
    public void setAuthorizeDescription(com.dbd.task.model.sub.AuthorizeDescription[] authorizeDescription) {
        this.authorizeDescription = authorizeDescription;
    }


    /**
     * Gets the historyDescription value for this CheckJuristicInformation.
     * 
     * @return historyDescription
     */
    public com.dbd.task.model.sub.HistoryDescription[] getHistoryDescription() {
        return historyDescription;
    }


    /**
     * Sets the historyDescription value for this CheckJuristicInformation.
     * 
     * @param historyDescription
     */
    public void setHistoryDescription(com.dbd.task.model.sub.HistoryDescription[] historyDescription) {
        this.historyDescription = historyDescription;
    }


    /**
     * Gets the limitAuthorize value for this CheckJuristicInformation.
     * 
     * @return limitAuthorize
     */
    public com.dbd.task.model.sub.LimitAuthorize[] getLimitAuthorize() {
        return limitAuthorize;
    }


    /**
     * Sets the limitAuthorize value for this CheckJuristicInformation.
     * 
     * @param limitAuthorize
     */
    public void setLimitAuthorize(com.dbd.task.model.sub.LimitAuthorize[] limitAuthorize) {
        this.limitAuthorize = limitAuthorize;
    }


    /**
     * Gets the description value for this CheckJuristicInformation.
     * 
     * @return description
     */
    public com.dbd.task.model.sub.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CheckJuristicInformation.
     * 
     * @param description
     */
    public void setDescription(com.dbd.task.model.sub.Description[] description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckJuristicInformation)) return false;
        CheckJuristicInformation other = (CheckJuristicInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.committeeInformation==null && other.getCommitteeInformation()==null) || 
             (this.committeeInformation!=null &&
              java.util.Arrays.equals(this.committeeInformation, other.getCommitteeInformation()))) &&
            ((this.juristicID==null && other.getJuristicID()==null) || 
             (this.juristicID!=null &&
              this.juristicID.equals(other.getJuristicID()))) &&
            ((this.juristicName==null && other.getJuristicName()==null) || 
             (this.juristicName!=null &&
              this.juristicName.equals(other.getJuristicName()))) &&
            ((this.juristicStatus==null && other.getJuristicStatus()==null) || 
             (this.juristicStatus!=null &&
              this.juristicStatus.equals(other.getJuristicStatus()))) &&
            ((this.juristicType==null && other.getJuristicType()==null) || 
             (this.juristicType!=null &&
              this.juristicType.equals(other.getJuristicType()))) &&
            ((this.oldJuristicID==null && other.getOldJuristicID()==null) || 
             (this.oldJuristicID!=null &&
              this.oldJuristicID.equals(other.getOldJuristicID()))) &&
            ((this.registerCapital==null && other.getRegisterCapital()==null) || 
             (this.registerCapital!=null &&
              this.registerCapital.equals(other.getRegisterCapital()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.juristicAmpur==null && other.getJuristicAmpur()==null) || 
             (this.juristicAmpur!=null &&
              this.juristicAmpur.equals(other.getJuristicAmpur()))) &&
            ((this.juristicProvince==null && other.getJuristicProvince()==null) || 
             (this.juristicProvince!=null &&
              this.juristicProvince.equals(other.getJuristicProvince()))) &&
            ((this.juristicTumbol==null && other.getJuristicTumbol()==null) || 
             (this.juristicTumbol!=null &&
              this.juristicTumbol.equals(other.getJuristicTumbol()))) &&
            ((this.submitStatementInformation==null && other.getSubmitStatementInformation()==null) || 
             (this.submitStatementInformation!=null &&
              java.util.Arrays.equals(this.submitStatementInformation, other.getSubmitStatementInformation()))) &&
            ((this.authorizeDescription==null && other.getAuthorizeDescription()==null) || 
             (this.authorizeDescription!=null &&
              java.util.Arrays.equals(this.authorizeDescription, other.getAuthorizeDescription()))) &&
            ((this.historyDescription==null && other.getHistoryDescription()==null) || 
             (this.historyDescription!=null &&
              java.util.Arrays.equals(this.historyDescription, other.getHistoryDescription()))) &&
            ((this.limitAuthorize==null && other.getLimitAuthorize()==null) || 
             (this.limitAuthorize!=null &&
              java.util.Arrays.equals(this.limitAuthorize, other.getLimitAuthorize()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCommitteeInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommitteeInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommitteeInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJuristicID() != null) {
            _hashCode += getJuristicID().hashCode();
        }
        if (getJuristicName() != null) {
            _hashCode += getJuristicName().hashCode();
        }
        if (getJuristicStatus() != null) {
            _hashCode += getJuristicStatus().hashCode();
        }
        if (getJuristicType() != null) {
            _hashCode += getJuristicType().hashCode();
        }
        if (getOldJuristicID() != null) {
            _hashCode += getOldJuristicID().hashCode();
        }
        if (getRegisterCapital() != null) {
            _hashCode += getRegisterCapital().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getJuristicAmpur() != null) {
            _hashCode += getJuristicAmpur().hashCode();
        }
        if (getJuristicProvince() != null) {
            _hashCode += getJuristicProvince().hashCode();
        }
        if (getJuristicTumbol() != null) {
            _hashCode += getJuristicTumbol().hashCode();
        }
        if (getSubmitStatementInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubmitStatementInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubmitStatementInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorizeDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorizeDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorizeDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistoryDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimitAuthorize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitAuthorize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitAuthorize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckJuristicInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "CheckJuristicInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("committeeInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "committeeInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "CommitteeInformation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CommitteeInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldJuristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldJuristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicAmpur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicAmpur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicTumbol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicTumbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitStatementInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitStatementInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "SubmitStatementInformation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SubmitStatementInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "AuthorizeDescription"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AuthorizeDescription"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "HistoryDescription"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HistoryDescription"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitAuthorize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitAuthorize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "LimitAuthorize"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "LimitAuthorize"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "Description"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Description"));
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
