/**
 * TaskJuristicServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dbd.task.service;

public class TaskJuristicServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.dbd.task.service.TaskJuristicService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicGeneralInfoByRegisterDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputDataStartDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputdataFinishDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicGeneralInfoByRegisterDateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicShareholderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputDataName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputDataLastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicShareholderInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicCommitteeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputDataName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputDataLastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicCommitteeInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicGeneralInfoByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicGeneralInfoByNameReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicDetailByJuristicId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicDetailByJuristicIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicByProvince");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "province"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicByProvinceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("juristicGeneralInfoByCapitalRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inputData2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain"));
        oper.setReturnClass(com.dbd.task.model.main.JuristicMain.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "juristicGeneralInfoByCapitalRangeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public TaskJuristicServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TaskJuristicServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TaskJuristicServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://main.model.task.dbd.com", "JuristicMain");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.main.JuristicMain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "CheckJuristicInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.CheckJuristicInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "FinancialStatementInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.FinancialStatementInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicAddressInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicAddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicAndShareholderInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicAndShareholderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicCertificateInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicCertificateInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingCapitalInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicChangingCapitalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingNameInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicChangingNameInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicCommitteeInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicCommitteeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicInformationInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicInformationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicObjectiveInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicObjectiveInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicRegisterCapitalInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicRegisterCapitalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicRegisterDateInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicRegisterDateInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicShareInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicShareInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "ShareholderInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.ShareholderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "StatementObjective");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.StatementObjective.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "SubmitStatementInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.SubmitStatementInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_CheckJuristicInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.CheckJuristicInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "CheckJuristicInformation");
            qName2 = new javax.xml.namespace.QName("", "CheckJuristicInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_FinancialStatementInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.FinancialStatementInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "FinancialStatementInfo");
            qName2 = new javax.xml.namespace.QName("", "FinancialStatementInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicAddressInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicAddressInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicAddressInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicAddressInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicAndShareholderInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicAndShareholderInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicAndShareholderInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicAndShareholderInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicCertificateInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicCertificateInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicCertificateInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicCertificateInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicChangingCapitalInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicChangingCapitalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingCapitalInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicChangingCapitalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicChangingNameInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicChangingNameInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicChangingNameInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicChangingNameInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicCommitteeInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicCommitteeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicCommitteeInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicCommitteeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicInformationInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicInformationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicInformationInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicInformationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicObjectiveInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicObjectiveInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicObjectiveInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicObjectiveInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicRegisterCapitalInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicRegisterCapitalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicRegisterCapitalInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicRegisterCapitalInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicRegisterDateInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicRegisterDateInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicRegisterDateInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicRegisterDateInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_JuristicShareInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.JuristicShareInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "JuristicShareInfo");
            qName2 = new javax.xml.namespace.QName("", "JuristicShareInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_ShareholderInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.ShareholderInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "ShareholderInfo");
            qName2 = new javax.xml.namespace.QName("", "ShareholderInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_StatementObjective");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.StatementObjective[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "StatementObjective");
            qName2 = new javax.xml.namespace.QName("", "StatementObjective");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns3_nillable_SubmitStatementInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.SubmitStatementInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://model.task.dbd.com", "SubmitStatementInfo");
            qName2 = new javax.xml.namespace.QName("", "SubmitStatementInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_AuthorizeDescription");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.AuthorizeDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "AuthorizeDescription");
            qName2 = new javax.xml.namespace.QName("", "AuthorizeDescription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_BalanceStatementInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.BalanceStatementInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BalanceStatementInformation");
            qName2 = new javax.xml.namespace.QName("", "BalanceStatementInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_BfileFromDB");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.BfileFromDB[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BfileFromDB");
            qName2 = new javax.xml.namespace.QName("", "BfileFromDB");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_CommitteeInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.CommitteeInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "CommitteeInformation");
            qName2 = new javax.xml.namespace.QName("", "CommitteeInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_Description");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.Description[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "Description");
            qName2 = new javax.xml.namespace.QName("", "Description");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_HistoryDescription");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.HistoryDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "HistoryDescription");
            qName2 = new javax.xml.namespace.QName("", "HistoryDescription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_JuristicBranchAddressInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.JuristicBranchAddressInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "JuristicBranchAddressInformation");
            qName2 = new javax.xml.namespace.QName("", "JuristicBranchAddressInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_LimitAuthorize");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.LimitAuthorize[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "LimitAuthorize");
            qName2 = new javax.xml.namespace.QName("", "LimitAuthorize");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_ObjectiveDescription");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.ObjectiveDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "ObjectiveDescription");
            qName2 = new javax.xml.namespace.QName("", "ObjectiveDescription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.task.dbd.com", "ArrayOf_tns4_nillable_SubmitStatementInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.SubmitStatementInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "SubmitStatementInformation");
            qName2 = new javax.xml.namespace.QName("", "SubmitStatementInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "AuthorizeDescription");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.AuthorizeDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BalanceStatementInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.BalanceStatementInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "BfileFromDB");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.BfileFromDB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "CommitteeInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.CommitteeInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "DataAccessInfo");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.DataAccessInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "Description");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.Description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "HistoryDescription");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.HistoryDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "JuristicBranchAddressInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.JuristicBranchAddressInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "LimitAuthorize");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.LimitAuthorize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "ObjectiveDescription");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.ObjectiveDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "StandardObjective");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.StandardObjective.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sub.model.task.dbd.com", "SubmitStatementInformation");
            cachedSerQNames.add(qName);
            cls = com.dbd.task.model.sub.SubmitStatementInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByRegisterDate(java.lang.String userId, java.lang.String inputDataStartDate, java.lang.String inputdataFinishDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicGeneralInfoByRegisterDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicGeneralInfoByRegisterDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, inputDataStartDate, inputdataFinishDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dbd.task.model.main.JuristicMain juristicShareholderInfo(java.lang.String userId, java.lang.String inputDataName, java.lang.String inputDataLastName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicShareholderInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicShareholderInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, inputDataName, inputDataLastName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dbd.task.model.main.JuristicMain juristicCommitteeInfo(java.lang.String userId, java.lang.String inputDataName, java.lang.String inputDataLastName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicCommitteeInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicCommitteeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, inputDataName, inputDataLastName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByName(java.lang.String userId, java.lang.String inputData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicGeneralInfoByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicGeneralInfoByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, inputData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dbd.task.model.main.JuristicMain juristicDetailByJuristicId(java.lang.String userId, java.lang.String inputData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicDetailByJuristicId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicDetailByJuristicId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, inputData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dbd.task.model.main.JuristicMain juristicByProvince(java.lang.String userId, java.lang.String province, java.lang.String dateStart, java.lang.String dateEnd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicByProvince");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicByProvince"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, province, dateStart, dateEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dbd.task.model.main.JuristicMain juristicGeneralInfoByCapitalRange(java.lang.String userId, java.lang.String inputData, java.lang.String inputData2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("juristicGeneralInfoByCapitalRange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.task.dbd.com", "juristicGeneralInfoByCapitalRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, inputData, inputData2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dbd.task.model.main.JuristicMain) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dbd.task.model.main.JuristicMain) org.apache.axis.utils.JavaUtils.convert(_resp, com.dbd.task.model.main.JuristicMain.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
