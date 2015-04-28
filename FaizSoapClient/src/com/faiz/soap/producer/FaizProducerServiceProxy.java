package com.faiz.soap.producer;

public class FaizProducerServiceProxy implements com.faiz.soap.producer.FaizProducerService {
  private String _endpoint = null;
  private com.faiz.soap.producer.FaizProducerService faizProducerService = null;
  
  public FaizProducerServiceProxy() {
    _initFaizProducerServiceProxy();
  }
  
  public FaizProducerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFaizProducerServiceProxy();
  }
  
  private void _initFaizProducerServiceProxy() {
    try {
      faizProducerService = (new com.faiz.soap.producer.FaizProducerServiceServiceLocator()).getFaizProducerService();
      if (faizProducerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)faizProducerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)faizProducerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (faizProducerService != null)
      ((javax.xml.rpc.Stub)faizProducerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.faiz.soap.producer.FaizProducerService getFaizProducerService() {
    if (faizProducerService == null)
      _initFaizProducerServiceProxy();
    return faizProducerService;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (faizProducerService == null)
      _initFaizProducerServiceProxy();
    return faizProducerService.add(a, b);
  }
  
  public int multiply(int a, int b) throws java.rmi.RemoteException{
    if (faizProducerService == null)
      _initFaizProducerServiceProxy();
    return faizProducerService.multiply(a, b);
  }
  
  
}