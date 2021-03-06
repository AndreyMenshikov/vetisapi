
package ru.vetrf.api.schema.cdm.registry.r13n.service.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetActualR13NRegionStatusListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetActualR13NRegionStatusListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetActualR13NShippingRuleListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetActualR13NShippingRuleListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetR13NConditionListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetR13NConditionListResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RegionalizationServicePortType", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/r13n/service/v2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ru.vetrf.api.schema.cdm.dictionary.v2.ObjectFactory.class,
    ru.vetrf.api.schema.cdm.base.ObjectFactory.class,
    ru.vetrf.api.schema.cdm.base.ws_definitions.ObjectFactory.class,
    ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.ObjectFactory.class
})
public interface RegionalizationServicePortType {


    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetR13NConditionListResponse
     * @throws IncorrectRequestFault
     * @throws InternalServiceFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetR13nConditionList", action = "GetProductByTypeList")
    @WebResult(name = "getR13nConditionListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetR13NConditionListResponse getR13NConditionList(
        @WebParam(name = "getR13nConditionListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetR13NConditionListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetActualR13NRegionStatusListResponse
     * @throws IncorrectRequestFault
     * @throws InternalServiceFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetActualR13nRegionStatusList", action = "GetProductByTypeList")
    @WebResult(name = "getActualR13nRegionStatusListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetActualR13NRegionStatusListResponse getActualR13NRegionStatusList(
        @WebParam(name = "getActualR13nRegionStatusListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetActualR13NRegionStatusListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetActualR13NShippingRuleListResponse
     * @throws IncorrectRequestFault
     * @throws InternalServiceFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetActualR13nShippingRuleList", action = "GetProductByTypeList")
    @WebResult(name = "getActualR13nShippingRuleListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetActualR13NShippingRuleListResponse getActualR13NShippingRuleList(
        @WebParam(name = "getActualR13nShippingRuleListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetActualR13NShippingRuleListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

}
