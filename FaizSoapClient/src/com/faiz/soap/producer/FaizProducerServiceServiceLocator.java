/**
 * FaizProducerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.faiz.soap.producer;

public class FaizProducerServiceServiceLocator extends org.apache.axis.client.Service implements com.faiz.soap.producer.FaizProducerServiceService {

    public FaizProducerServiceServiceLocator() {
    }


    public FaizProducerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FaizProducerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FaizProducerService
    private java.lang.String FaizProducerService_address = "http://localhost:8080/FaizSoapProducer/services/FaizProducerService";

    public java.lang.String getFaizProducerServiceAddress() {
        return FaizProducerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FaizProducerServiceWSDDServiceName = "FaizProducerService";

    public java.lang.String getFaizProducerServiceWSDDServiceName() {
        return FaizProducerServiceWSDDServiceName;
    }

    public void setFaizProducerServiceWSDDServiceName(java.lang.String name) {
        FaizProducerServiceWSDDServiceName = name;
    }

    public com.faiz.soap.producer.FaizProducerService getFaizProducerService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FaizProducerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFaizProducerService(endpoint);
    }

    public com.faiz.soap.producer.FaizProducerService getFaizProducerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.faiz.soap.producer.FaizProducerServiceSoapBindingStub _stub = new com.faiz.soap.producer.FaizProducerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFaizProducerServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFaizProducerServiceEndpointAddress(java.lang.String address) {
        FaizProducerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.faiz.soap.producer.FaizProducerService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.faiz.soap.producer.FaizProducerServiceSoapBindingStub _stub = new com.faiz.soap.producer.FaizProducerServiceSoapBindingStub(new java.net.URL(FaizProducerService_address), this);
                _stub.setPortName(getFaizProducerServiceWSDDServiceName());
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
        if ("FaizProducerService".equals(inputPortName)) {
            return getFaizProducerService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://producer.soap.faiz.com", "FaizProducerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://producer.soap.faiz.com", "FaizProducerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FaizProducerService".equals(portName)) {
            setFaizProducerServiceEndpointAddress(address);
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
