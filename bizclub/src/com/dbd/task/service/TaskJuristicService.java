/**
 * TaskJuristicService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.service;

public interface TaskJuristicService extends java.rmi.Remote {
    public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByRegisterDate(java.lang.String userId, java.lang.String inputDataStartDate, java.lang.String inputdataFinishDate) throws java.rmi.RemoteException;
    public com.dbd.task.model.main.JuristicMain juristicShareholderInfo(java.lang.String userId, java.lang.String inputDataName, java.lang.String inputDataLastName) throws java.rmi.RemoteException;
    public com.dbd.task.model.main.JuristicMain juristicCommitteeInfo(java.lang.String userId, java.lang.String inputDataName, java.lang.String inputDataLastName) throws java.rmi.RemoteException;
    public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByName(java.lang.String userId, java.lang.String inputData) throws java.rmi.RemoteException;
    public com.dbd.task.model.main.JuristicMain juristicDetailByJuristicId(java.lang.String userId, java.lang.String inputData) throws java.rmi.RemoteException;
    public com.dbd.task.model.main.JuristicMain juristicByProvince(java.lang.String userId, java.lang.String province, java.lang.String dateStart, java.lang.String dateEnd) throws java.rmi.RemoteException;
    public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByCapitalRange(java.lang.String userId, java.lang.String inputData, java.lang.String inputData2) throws java.rmi.RemoteException;
}
