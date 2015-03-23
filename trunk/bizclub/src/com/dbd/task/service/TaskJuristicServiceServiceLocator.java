/**
 * TaskJuristicServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.service;

public class TaskJuristicServiceServiceLocator extends org.apache.axis.client.Service implements com.dbd.task.service.TaskJuristicServiceService {

    public TaskJuristicServiceServiceLocator() {
    }


    public TaskJuristicServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaskJuristicServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaskJuristicService
    private java.lang.String TaskJuristicService_address = "https://webservices.dbd.go.th:443/webservice/services/TaskJuristicService";

    public java.lang.String getTaskJuristicServiceAddress() {
        return TaskJuristicService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaskJuristicServiceWSDDServiceName = "TaskJuristicService";

    public java.lang.String getTaskJuristicServiceWSDDServiceName() {
        return TaskJuristicServiceWSDDServiceName;
    }

    public void setTaskJuristicServiceWSDDServiceName(java.lang.String name) {
        TaskJuristicServiceWSDDServiceName = name;
    }

    public com.dbd.task.service.TaskJuristicService getTaskJuristicService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaskJuristicService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaskJuristicService(endpoint);
    }

    public com.dbd.task.service.TaskJuristicService getTaskJuristicService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dbd.task.service.TaskJuristicServiceSoapBindingStub _stub = new com.dbd.task.service.TaskJuristicServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTaskJuristicServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaskJuristicServiceEndpointAddress(java.lang.String address) {
        TaskJuristicService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dbd.task.service.TaskJuristicService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dbd.task.service.TaskJuristicServiceSoapBindingStub _stub = new com.dbd.task.service.TaskJuristicServiceSoapBindingStub(new java.net.URL(TaskJuristicService_address), this);
                _stub.setPortName(getTaskJuristicServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TaskJuristicService".equals(inputPortName)) {
            return getTaskJuristicService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.task.dbd.com", "TaskJuristicServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.task.dbd.com", "TaskJuristicService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaskJuristicService".equals(portName)) {
            setTaskJuristicServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
