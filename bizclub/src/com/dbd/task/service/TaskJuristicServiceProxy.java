package com.dbd.task.service;

public class TaskJuristicServiceProxy implements com.dbd.task.service.TaskJuristicService {
  private String _endpoint = null;
  private com.dbd.task.service.TaskJuristicService taskJuristicService = null;
  
  public TaskJuristicServiceProxy() {
    _initTaskJuristicServiceProxy();
  }
  
  public TaskJuristicServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTaskJuristicServiceProxy();
  }
  
  private void _initTaskJuristicServiceProxy() {
    try {
      taskJuristicService = (new com.dbd.task.service.TaskJuristicServiceServiceLocator()).getTaskJuristicService();
      if (taskJuristicService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)taskJuristicService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)taskJuristicService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (taskJuristicService != null)
      ((javax.xml.rpc.Stub)taskJuristicService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dbd.task.service.TaskJuristicService getTaskJuristicService() {
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService;
  }
  
  public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByRegisterDate(java.lang.String userId, java.lang.String inputDataStartDate, java.lang.String inputdataFinishDate) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicGeneralInfoByRegisterDate(userId, inputDataStartDate, inputdataFinishDate);
  }
  
  public com.dbd.task.model.main.JuristicMain juristicShareholderInfo(java.lang.String userId, java.lang.String inputDataName, java.lang.String inputDataLastName) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicShareholderInfo(userId, inputDataName, inputDataLastName);
  }
  
  public com.dbd.task.model.main.JuristicMain juristicCommitteeInfo(java.lang.String userId, java.lang.String inputDataName, java.lang.String inputDataLastName) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicCommitteeInfo(userId, inputDataName, inputDataLastName);
  }
  
  public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByName(java.lang.String userId, java.lang.String inputData) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicGeneralInfoByName(userId, inputData);
  }
  
  public com.dbd.task.model.main.JuristicMain juristicDetailByJuristicId(java.lang.String userId, java.lang.String inputData) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicDetailByJuristicId(userId, inputData);
  }
  
  public com.dbd.task.model.main.JuristicMain juristicByProvince(java.lang.String userId, java.lang.String province, java.lang.String dateStart, java.lang.String dateEnd) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicByProvince(userId, province, dateStart, dateEnd);
  }
  
  public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByCapitalRange(java.lang.String userId, java.lang.String inputData, java.lang.String inputData2) throws java.rmi.RemoteException{
    if (taskJuristicService == null)
      _initTaskJuristicServiceProxy();
    return taskJuristicService.juristicGeneralInfoByCapitalRange(userId, inputData, inputData2);
  }
  
  
}