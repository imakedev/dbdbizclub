/**
 * JuristicCertificateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.model;

public class JuristicCertificateInfo  implements java.io.Serializable {
    private java.lang.String juristicType;

    private java.lang.String juristicID;

    private java.lang.String registerDate;

    private java.lang.String oldJuristicID;

    private java.lang.String juristicName;

    private java.lang.String juristicNameEng;

    private int numberOfCommittee;

    private com.dbd.task.model.sub.CommitteeInformation[] committeeInformation;

    private double registerCapital;

    private double paidRegisterCapital;

    private java.lang.String juristicBuilding;

    private java.lang.String juristicRoomNo;

    private java.lang.String juristicFloor;

    private java.lang.String juristicVillageName;

    private java.lang.String juristicAddressNo;

    private java.lang.String juristicMoo;

    private java.lang.String juristicSoi;

    private java.lang.String juristicRoad;

    private java.lang.String juristicTumbol;

    private java.lang.String juristicAmpur;

    private java.lang.String juristicProvince;

    private java.lang.String numberOfObjective;

    private java.lang.String numberOfPageOfObjective;

    private com.dbd.task.model.sub.AuthorizeDescription[] authorizeDescription;

    private java.lang.String address;

    private com.dbd.task.model.sub.BfileFromDB[] bfileFromDB;

    private com.dbd.task.model.sub.StandardObjective standardObjective;

    private java.lang.String juristicStatus;

    public JuristicCertificateInfo() {
    }

    public JuristicCertificateInfo(
           java.lang.String juristicType,
           java.lang.String juristicID,
           java.lang.String registerDate,
           java.lang.String oldJuristicID,
           java.lang.String juristicName,
           java.lang.String juristicNameEng,
           int numberOfCommittee,
           com.dbd.task.model.sub.CommitteeInformation[] committeeInformation,
           double registerCapital,
           double paidRegisterCapital,
           java.lang.String juristicBuilding,
           java.lang.String juristicRoomNo,
           java.lang.String juristicFloor,
           java.lang.String juristicVillageName,
           java.lang.String juristicAddressNo,
           java.lang.String juristicMoo,
           java.lang.String juristicSoi,
           java.lang.String juristicRoad,
           java.lang.String juristicTumbol,
           java.lang.String juristicAmpur,
           java.lang.String juristicProvince,
           java.lang.String numberOfObjective,
           java.lang.String numberOfPageOfObjective,
           com.dbd.task.model.sub.AuthorizeDescription[] authorizeDescription,
           java.lang.String address,
           com.dbd.task.model.sub.BfileFromDB[] bfileFromDB,
           com.dbd.task.model.sub.StandardObjective standardObjective,
           java.lang.String juristicStatus) {
           this.juristicType = juristicType;
           this.juristicID = juristicID;
           this.registerDate = registerDate;
           this.oldJuristicID = oldJuristicID;
           this.juristicName = juristicName;
           this.juristicNameEng = juristicNameEng;
           this.numberOfCommittee = numberOfCommittee;
           this.committeeInformation = committeeInformation;
           this.registerCapital = registerCapital;
           this.paidRegisterCapital = paidRegisterCapital;
           this.juristicBuilding = juristicBuilding;
           this.juristicRoomNo = juristicRoomNo;
           this.juristicFloor = juristicFloor;
           this.juristicVillageName = juristicVillageName;
           this.juristicAddressNo = juristicAddressNo;
           this.juristicMoo = juristicMoo;
           this.juristicSoi = juristicSoi;
           this.juristicRoad = juristicRoad;
           this.juristicTumbol = juristicTumbol;
           this.juristicAmpur = juristicAmpur;
           this.juristicProvince = juristicProvince;
           this.numberOfObjective = numberOfObjective;
           this.numberOfPageOfObjective = numberOfPageOfObjective;
           this.authorizeDescription = authorizeDescription;
           this.address = address;
           this.bfileFromDB = bfileFromDB;
           this.standardObjective = standardObjective;
           this.juristicStatus = juristicStatus;
    }


    /**
     * Gets the juristicType value for this JuristicCertificateInfo.
     * 
     * @return juristicType
     */
    public java.lang.String getJuristicType() {
        return juristicType;
    }


    /**
     * Sets the juristicType value for this JuristicCertificateInfo.
     * 
     * @param juristicType
     */
    public void setJuristicType(java.lang.String juristicType) {
        this.juristicType = juristicType;
    }


    /**
     * Gets the juristicID value for this JuristicCertificateInfo.
     * 
     * @return juristicID
     */
    public java.lang.String getJuristicID() {
        return juristicID;
    }


    /**
     * Sets the juristicID value for this JuristicCertificateInfo.
     * 
     * @param juristicID
     */
    public void setJuristicID(java.lang.String juristicID) {
        this.juristicID = juristicID;
    }


    /**
     * Gets the registerDate value for this JuristicCertificateInfo.
     * 
     * @return registerDate
     */
    public java.lang.String getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this JuristicCertificateInfo.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.lang.String registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the oldJuristicID value for this JuristicCertificateInfo.
     * 
     * @return oldJuristicID
     */
    public java.lang.String getOldJuristicID() {
        return oldJuristicID;
    }


    /**
     * Sets the oldJuristicID value for this JuristicCertificateInfo.
     * 
     * @param oldJuristicID
     */
    public void setOldJuristicID(java.lang.String oldJuristicID) {
        this.oldJuristicID = oldJuristicID;
    }


    /**
     * Gets the juristicName value for this JuristicCertificateInfo.
     * 
     * @return juristicName
     */
    public java.lang.String getJuristicName() {
        return juristicName;
    }


    /**
     * Sets the juristicName value for this JuristicCertificateInfo.
     * 
     * @param juristicName
     */
    public void setJuristicName(java.lang.String juristicName) {
        this.juristicName = juristicName;
    }


    /**
     * Gets the juristicNameEng value for this JuristicCertificateInfo.
     * 
     * @return juristicNameEng
     */
    public java.lang.String getJuristicNameEng() {
        return juristicNameEng;
    }


    /**
     * Sets the juristicNameEng value for this JuristicCertificateInfo.
     * 
     * @param juristicNameEng
     */
    public void setJuristicNameEng(java.lang.String juristicNameEng) {
        this.juristicNameEng = juristicNameEng;
    }


    /**
     * Gets the numberOfCommittee value for this JuristicCertificateInfo.
     * 
     * @return numberOfCommittee
     */
    public int getNumberOfCommittee() {
        return numberOfCommittee;
    }


    /**
     * Sets the numberOfCommittee value for this JuristicCertificateInfo.
     * 
     * @param numberOfCommittee
     */
    public void setNumberOfCommittee(int numberOfCommittee) {
        this.numberOfCommittee = numberOfCommittee;
    }


    /**
     * Gets the committeeInformation value for this JuristicCertificateInfo.
     * 
     * @return committeeInformation
     */
    public com.dbd.task.model.sub.CommitteeInformation[] getCommitteeInformation() {
        return committeeInformation;
    }


    /**
     * Sets the committeeInformation value for this JuristicCertificateInfo.
     * 
     * @param committeeInformation
     */
    public void setCommitteeInformation(com.dbd.task.model.sub.CommitteeInformation[] committeeInformation) {
        this.committeeInformation = committeeInformation;
    }


    /**
     * Gets the registerCapital value for this JuristicCertificateInfo.
     * 
     * @return registerCapital
     */
    public double getRegisterCapital() {
        return registerCapital;
    }


    /**
     * Sets the registerCapital value for this JuristicCertificateInfo.
     * 
     * @param registerCapital
     */
    public void setRegisterCapital(double registerCapital) {
        this.registerCapital = registerCapital;
    }


    /**
     * Gets the paidRegisterCapital value for this JuristicCertificateInfo.
     * 
     * @return paidRegisterCapital
     */
    public double getPaidRegisterCapital() {
        return paidRegisterCapital;
    }


    /**
     * Sets the paidRegisterCapital value for this JuristicCertificateInfo.
     * 
     * @param paidRegisterCapital
     */
    public void setPaidRegisterCapital(double paidRegisterCapital) {
        this.paidRegisterCapital = paidRegisterCapital;
    }


    /**
     * Gets the juristicBuilding value for this JuristicCertificateInfo.
     * 
     * @return juristicBuilding
     */
    public java.lang.String getJuristicBuilding() {
        return juristicBuilding;
    }


    /**
     * Sets the juristicBuilding value for this JuristicCertificateInfo.
     * 
     * @param juristicBuilding
     */
    public void setJuristicBuilding(java.lang.String juristicBuilding) {
        this.juristicBuilding = juristicBuilding;
    }


    /**
     * Gets the juristicRoomNo value for this JuristicCertificateInfo.
     * 
     * @return juristicRoomNo
     */
    public java.lang.String getJuristicRoomNo() {
        return juristicRoomNo;
    }


    /**
     * Sets the juristicRoomNo value for this JuristicCertificateInfo.
     * 
     * @param juristicRoomNo
     */
    public void setJuristicRoomNo(java.lang.String juristicRoomNo) {
        this.juristicRoomNo = juristicRoomNo;
    }


    /**
     * Gets the juristicFloor value for this JuristicCertificateInfo.
     * 
     * @return juristicFloor
     */
    public java.lang.String getJuristicFloor() {
        return juristicFloor;
    }


    /**
     * Sets the juristicFloor value for this JuristicCertificateInfo.
     * 
     * @param juristicFloor
     */
    public void setJuristicFloor(java.lang.String juristicFloor) {
        this.juristicFloor = juristicFloor;
    }


    /**
     * Gets the juristicVillageName value for this JuristicCertificateInfo.
     * 
     * @return juristicVillageName
     */
    public java.lang.String getJuristicVillageName() {
        return juristicVillageName;
    }


    /**
     * Sets the juristicVillageName value for this JuristicCertificateInfo.
     * 
     * @param juristicVillageName
     */
    public void setJuristicVillageName(java.lang.String juristicVillageName) {
        this.juristicVillageName = juristicVillageName;
    }


    /**
     * Gets the juristicAddressNo value for this JuristicCertificateInfo.
     * 
     * @return juristicAddressNo
     */
    public java.lang.String getJuristicAddressNo() {
        return juristicAddressNo;
    }


    /**
     * Sets the juristicAddressNo value for this JuristicCertificateInfo.
     * 
     * @param juristicAddressNo
     */
    public void setJuristicAddressNo(java.lang.String juristicAddressNo) {
        this.juristicAddressNo = juristicAddressNo;
    }


    /**
     * Gets the juristicMoo value for this JuristicCertificateInfo.
     * 
     * @return juristicMoo
     */
    public java.lang.String getJuristicMoo() {
        return juristicMoo;
    }


    /**
     * Sets the juristicMoo value for this JuristicCertificateInfo.
     * 
     * @param juristicMoo
     */
    public void setJuristicMoo(java.lang.String juristicMoo) {
        this.juristicMoo = juristicMoo;
    }


    /**
     * Gets the juristicSoi value for this JuristicCertificateInfo.
     * 
     * @return juristicSoi
     */
    public java.lang.String getJuristicSoi() {
        return juristicSoi;
    }


    /**
     * Sets the juristicSoi value for this JuristicCertificateInfo.
     * 
     * @param juristicSoi
     */
    public void setJuristicSoi(java.lang.String juristicSoi) {
        this.juristicSoi = juristicSoi;
    }


    /**
     * Gets the juristicRoad value for this JuristicCertificateInfo.
     * 
     * @return juristicRoad
     */
    public java.lang.String getJuristicRoad() {
        return juristicRoad;
    }


    /**
     * Sets the juristicRoad value for this JuristicCertificateInfo.
     * 
     * @param juristicRoad
     */
    public void setJuristicRoad(java.lang.String juristicRoad) {
        this.juristicRoad = juristicRoad;
    }


    /**
     * Gets the juristicTumbol value for this JuristicCertificateInfo.
     * 
     * @return juristicTumbol
     */
    public java.lang.String getJuristicTumbol() {
        return juristicTumbol;
    }


    /**
     * Sets the juristicTumbol value for this JuristicCertificateInfo.
     * 
     * @param juristicTumbol
     */
    public void setJuristicTumbol(java.lang.String juristicTumbol) {
        this.juristicTumbol = juristicTumbol;
    }


    /**
     * Gets the juristicAmpur value for this JuristicCertificateInfo.
     * 
     * @return juristicAmpur
     */
    public java.lang.String getJuristicAmpur() {
        return juristicAmpur;
    }


    /**
     * Sets the juristicAmpur value for this JuristicCertificateInfo.
     * 
     * @param juristicAmpur
     */
    public void setJuristicAmpur(java.lang.String juristicAmpur) {
        this.juristicAmpur = juristicAmpur;
    }


    /**
     * Gets the juristicProvince value for this JuristicCertificateInfo.
     * 
     * @return juristicProvince
     */
    public java.lang.String getJuristicProvince() {
        return juristicProvince;
    }


    /**
     * Sets the juristicProvince value for this JuristicCertificateInfo.
     * 
     * @param juristicProvince
     */
    public void setJuristicProvince(java.lang.String juristicProvince) {
        this.juristicProvince = juristicProvince;
    }


    /**
     * Gets the numberOfObjective value for this JuristicCertificateInfo.
     * 
     * @return numberOfObjective
     */
    public java.lang.String getNumberOfObjective() {
        return numberOfObjective;
    }


    /**
     * Sets the numberOfObjective value for this JuristicCertificateInfo.
     * 
     * @param numberOfObjective
     */
    public void setNumberOfObjective(java.lang.String numberOfObjective) {
        this.numberOfObjective = numberOfObjective;
    }


    /**
     * Gets the numberOfPageOfObjective value for this JuristicCertificateInfo.
     * 
     * @return numberOfPageOfObjective
     */
    public java.lang.String getNumberOfPageOfObjective() {
        return numberOfPageOfObjective;
    }


    /**
     * Sets the numberOfPageOfObjective value for this JuristicCertificateInfo.
     * 
     * @param numberOfPageOfObjective
     */
    public void setNumberOfPageOfObjective(java.lang.String numberOfPageOfObjective) {
        this.numberOfPageOfObjective = numberOfPageOfObjective;
    }


    /**
     * Gets the authorizeDescription value for this JuristicCertificateInfo.
     * 
     * @return authorizeDescription
     */
    public com.dbd.task.model.sub.AuthorizeDescription[] getAuthorizeDescription() {
        return authorizeDescription;
    }


    /**
     * Sets the authorizeDescription value for this JuristicCertificateInfo.
     * 
     * @param authorizeDescription
     */
    public void setAuthorizeDescription(com.dbd.task.model.sub.AuthorizeDescription[] authorizeDescription) {
        this.authorizeDescription = authorizeDescription;
    }


    /**
     * Gets the address value for this JuristicCertificateInfo.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this JuristicCertificateInfo.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the bfileFromDB value for this JuristicCertificateInfo.
     * 
     * @return bfileFromDB
     */
    public com.dbd.task.model.sub.BfileFromDB[] getBfileFromDB() {
        return bfileFromDB;
    }


    /**
     * Sets the bfileFromDB value for this JuristicCertificateInfo.
     * 
     * @param bfileFromDB
     */
    public void setBfileFromDB(com.dbd.task.model.sub.BfileFromDB[] bfileFromDB) {
        this.bfileFromDB = bfileFromDB;
    }


    /**
     * Gets the standardObjective value for this JuristicCertificateInfo.
     * 
     * @return standardObjective
     */
    public com.dbd.task.model.sub.StandardObjective getStandardObjective() {
        return standardObjective;
    }


    /**
     * Sets the standardObjective value for this JuristicCertificateInfo.
     * 
     * @param standardObjective
     */
    public void setStandardObjective(com.dbd.task.model.sub.StandardObjective standardObjective) {
        this.standardObjective = standardObjective;
    }


    /**
     * Gets the juristicStatus value for this JuristicCertificateInfo.
     * 
     * @return juristicStatus
     */
    public java.lang.String getJuristicStatus() {
        return juristicStatus;
    }


    /**
     * Sets the juristicStatus value for this JuristicCertificateInfo.
     * 
     * @param juristicStatus
     */
    public void setJuristicStatus(java.lang.String juristicStatus) {
        this.juristicStatus = juristicStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JuristicCertificateInfo)) return false;
        JuristicCertificateInfo other = (JuristicCertificateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.juristicType==null && other.getJuristicType()==null) || 
             (this.juristicType!=null &&
              this.juristicType.equals(other.getJuristicType()))) &&
            ((this.juristicID==null && other.getJuristicID()==null) || 
             (this.juristicID!=null &&
              this.juristicID.equals(other.getJuristicID()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.oldJuristicID==null && other.getOldJuristicID()==null) || 
             (this.oldJuristicID!=null &&
              this.oldJuristicID.equals(other.getOldJuristicID()))) &&
            ((this.juristicName==null && other.getJuristicName()==null) || 
             (this.juristicName!=null &&
              this.juristicName.equals(other.getJuristicName()))) &&
            ((this.juristicNameEng==null && other.getJuristicNameEng()==null) || 
             (this.juristicNameEng!=null &&
              this.juristicNameEng.equals(other.getJuristicNameEng()))) &&
            this.numberOfCommittee == other.getNumberOfCommittee() &&
            ((this.committeeInformation==null && other.getCommitteeInformation()==null) || 
             (this.committeeInformation!=null &&
              java.util.Arrays.equals(this.committeeInformation, other.getCommitteeInformation()))) &&
            this.registerCapital == other.getRegisterCapital() &&
            this.paidRegisterCapital == other.getPaidRegisterCapital() &&
            ((this.juristicBuilding==null && other.getJuristicBuilding()==null) || 
             (this.juristicBuilding!=null &&
              this.juristicBuilding.equals(other.getJuristicBuilding()))) &&
            ((this.juristicRoomNo==null && other.getJuristicRoomNo()==null) || 
             (this.juristicRoomNo!=null &&
              this.juristicRoomNo.equals(other.getJuristicRoomNo()))) &&
            ((this.juristicFloor==null && other.getJuristicFloor()==null) || 
             (this.juristicFloor!=null &&
              this.juristicFloor.equals(other.getJuristicFloor()))) &&
            ((this.juristicVillageName==null && other.getJuristicVillageName()==null) || 
             (this.juristicVillageName!=null &&
              this.juristicVillageName.equals(other.getJuristicVillageName()))) &&
            ((this.juristicAddressNo==null && other.getJuristicAddressNo()==null) || 
             (this.juristicAddressNo!=null &&
              this.juristicAddressNo.equals(other.getJuristicAddressNo()))) &&
            ((this.juristicMoo==null && other.getJuristicMoo()==null) || 
             (this.juristicMoo!=null &&
              this.juristicMoo.equals(other.getJuristicMoo()))) &&
            ((this.juristicSoi==null && other.getJuristicSoi()==null) || 
             (this.juristicSoi!=null &&
              this.juristicSoi.equals(other.getJuristicSoi()))) &&
            ((this.juristicRoad==null && other.getJuristicRoad()==null) || 
             (this.juristicRoad!=null &&
              this.juristicRoad.equals(other.getJuristicRoad()))) &&
            ((this.juristicTumbol==null && other.getJuristicTumbol()==null) || 
             (this.juristicTumbol!=null &&
              this.juristicTumbol.equals(other.getJuristicTumbol()))) &&
            ((this.juristicAmpur==null && other.getJuristicAmpur()==null) || 
             (this.juristicAmpur!=null &&
              this.juristicAmpur.equals(other.getJuristicAmpur()))) &&
            ((this.juristicProvince==null && other.getJuristicProvince()==null) || 
             (this.juristicProvince!=null &&
              this.juristicProvince.equals(other.getJuristicProvince()))) &&
            ((this.numberOfObjective==null && other.getNumberOfObjective()==null) || 
             (this.numberOfObjective!=null &&
              this.numberOfObjective.equals(other.getNumberOfObjective()))) &&
            ((this.numberOfPageOfObjective==null && other.getNumberOfPageOfObjective()==null) || 
             (this.numberOfPageOfObjective!=null &&
              this.numberOfPageOfObjective.equals(other.getNumberOfPageOfObjective()))) &&
            ((this.authorizeDescription==null && other.getAuthorizeDescription()==null) || 
             (this.authorizeDescription!=null &&
              java.util.Arrays.equals(this.authorizeDescription, other.getAuthorizeDescription()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.bfileFromDB==null && other.getBfileFromDB()==null) || 
             (this.bfileFromDB!=null &&
              java.util.Arrays.equals(this.bfileFromDB, other.getBfileFromDB()))) &&
            ((this.standardObjective==null && other.getStandardObjective()==null) || 
             (this.standardObjective!=null &&
              this.standardObjective.equals(other.getStandardObjective()))) &&
            ((this.juristicStatus==null && other.getJuristicStatus()==null) || 
             (this.juristicStatus!=null &&
              this.juristicStatus.equals(other.getJuristicStatus())));
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
        if (getJuristicType() != null) {
            _hashCode += getJuristicType().hashCode();
        }
        if (getJuristicID() != null) {
            _hashCode += getJuristicID().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getOldJuristicID() != null) {
            _hashCode += getOldJuristicID().hashCode();
        }
        if (getJuristicName() != null) {
            _hashCode += getJuristicName().hashCode();
        }
        if (getJuristicNameEng() != null) {
            _hashCode += getJuristicNameEng().hashCode();
        }
        _hashCode += getNumberOfCommittee();
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
        _hashCode += new Double(getRegisterCapital()).hashCode();
        _hashCode += new Double(getPaidRegisterCapital()).hashCode();
        if (getJuristicBuilding() != null) {
            _hashCode += getJuristicBuilding().hashCode();
        }
        if (getJuristicRoomNo() != null) {
            _hashCode += getJuristicRoomNo().hashCode();
        }
        if (getJuristicFloor() != null) {
            _hashCode += getJuristicFloor().hashCode();
        }
        if (getJuristicVillageName() != null) {
            _hashCode += getJuristicVillageName().hashCode();
        }
        if (getJuristicAddressNo() != null) {
            _hashCode += getJuristicAddressNo().hashCode();
        }
        if (getJuristicMoo() != null) {
            _hashCode += getJuristicMoo().hashCode();
        }
        if (getJuristicSoi() != null) {
            _hashCode += getJuristicSoi().hashCode();
        }
        if (getJuristicRoad() != null) {
            _hashCode += getJuristicRoad().hashCode();
        }
        if (getJuristicTumbol() != null) {
            _hashCode += getJuristicTumbol().hashCode();
        }
        if (getJuristicAmpur() != null) {
            _hashCode += getJuristicAmpur().hashCode();
        }
        if (getJuristicProvince() != null) {
            _hashCode += getJuristicProvince().hashCode();
        }
        if (getNumberOfObjective() != null) {
            _hashCode += getNumberOfObjective().hashCode();
        }
        if (getNumberOfPageOfObjective() != null) {
            _hashCode += getNumberOfPageOfObjective().hashCode();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getBfileFromDB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBfileFromDB());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBfileFromDB(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStandardObjective() != null) {
            _hashCode += getStandardObjective().hashCode();
        }
        if (getJuristicStatus() != null) {
            _hashCode += getJuristicStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JuristicCertificateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicCertificateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
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
        elemField.setFieldName("juristicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicNameEng");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicNameEng"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfCommittee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfCommittee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("committeeInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "committeeInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "CommitteeInformation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CommitteeInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidRegisterCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidRegisterCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicBuilding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicBuilding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicRoomNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicRoomNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicFloor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicFloor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicVillageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicVillageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicAddressNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicAddressNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicMoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicMoo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicSoi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicSoi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicRoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicRoad"));
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
        elemField.setFieldName("numberOfObjective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfObjective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPageOfObjective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPageOfObjective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "AuthorizeDescription"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AuthorizeDescription"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bfileFromDB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bfileFromDB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BfileFromDB"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "BfileFromDB"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardObjective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standardObjective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "StandardObjective"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juristicStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "juristicStatus"));
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
