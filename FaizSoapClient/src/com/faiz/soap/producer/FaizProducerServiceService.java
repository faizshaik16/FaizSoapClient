/**
 * FaizProducerServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.faiz.soap.producer;

public interface FaizProducerServiceService extends javax.xml.rpc.Service {
    public java.lang.String getFaizProducerServiceAddress();

    public com.faiz.soap.producer.FaizProducerService getFaizProducerService() throws javax.xml.rpc.ServiceException;

    public com.faiz.soap.producer.FaizProducerService getFaizProducerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
