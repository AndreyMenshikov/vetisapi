
package ru.vetrf.api.schema.cdm.registry.product.service.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByGuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByGuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByTypeListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByTypeListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByUuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByUuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductChangesListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductChangesListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemByGuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemByGuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemByUuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemByUuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemChangesListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemChangesListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByGuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByGuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByProductListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByProductListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByUuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByUuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductChangesListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductChangesListResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductServicePortType", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/product/service/v2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ru.vetrf.api.schema.cdm.dictionary.v2.ObjectFactory.class,
    ru.vetrf.api.schema.cdm.base.ObjectFactory.class,
    ru.vetrf.api.schema.cdm.base.ws_definitions.ObjectFactory.class,
    ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.ObjectFactory.class
})
public interface ProductServicePortType {


    /**
     * Получение типа продукции по его глобальному идентификатору.
     *                 Критериями поиска являются глобальный идентификатор и поле last (т.е. запись должна быть последний в
     *                 истории).
     *                 Выполнение операции заканчивается либо возвратом искомого типа продукции,
     *                 либо ошибкой, в случае если тип продукции не найден или произошла иная ошибка выполнения запроса.
     *             
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByGuidResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws EntityNotFoundFault
     */
    @WebMethod(operationName = "GetProductByGuid", action = "GetProductByGuid")
    @WebResult(name = "getProductByGuidResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductByGuidResponse getProductByGuid(
        @WebParam(name = "getProductByGuidRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductByGuidRequest request)
        throws EntityNotFoundFault, IncorrectRequestFault, InternalServiceFault
    ;

    /**
     * Получение записи типа продукции по его идентификатору.
     *                 Выполнение операции заканчивается либо возвратом искомого типа продукции,
     *                 либо ошибкой, в случае если тип продукции не найден или произошла иная ошибка выполнения запроса.
     *             
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByUuidResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws EntityNotFoundFault
     */
    @WebMethod(operationName = "GetProductByUuid", action = "GetProductByUuid")
    @WebResult(name = "getProductByUuidResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductByUuidResponse getProductByUuid(
        @WebParam(name = "getProductByUuidRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductByUuidRequest request)
        throws EntityNotFoundFault, IncorrectRequestFault, InternalServiceFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByTypeListResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetProductByTypeList", action = "GetProductByTypeList")
    @WebResult(name = "getProductByTypeListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductByTypeListResponse getProductByTypeList(
        @WebParam(name = "getProductByTypeListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductByTypeListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductChangesListResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetProductChangesList", action = "GetProductChangesList")
    @WebResult(name = "getProductChangesListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductChangesListResponse getProductChangesList(
        @WebParam(name = "getProductChangesListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductChangesListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * Получение типа продукции по его глобальному идентификатору.
     *                 Критериями поиска являются глобальный идентификатор и поле last (т.е. запись должна быть последний в
     *                 истории).
     *                 Выполнение операции заканчивается либо возвратом искомого типа продукции,
     *                 либо ошибкой, в случае если тип продукции не найден или произошла иная ошибка выполнения запроса.
     *             
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByGuidResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws EntityNotFoundFault
     */
    @WebMethod(operationName = "GetSubProductByGuid", action = "GetSubProductByGuid")
    @WebResult(name = "getSubProductByGuidResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetSubProductByGuidResponse getSubProductByGuid(
        @WebParam(name = "getSubProductByGuidRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetSubProductByGuidRequest request)
        throws EntityNotFoundFault, IncorrectRequestFault, InternalServiceFault
    ;

    /**
     * Получение записи типа продукции по его идентификатору.
     *                 Выполнение операции заканчивается либо возвратом искомого типа продукции,
     *                 либо ошибкой, в случае если тип продукции не найден или произошла иная ошибка выполнения запроса.
     *             
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByUuidResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws EntityNotFoundFault
     */
    @WebMethod(operationName = "GetSubProductByUuid", action = "GetSubProductByUuid")
    @WebResult(name = "getSubProductByUuidResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetSubProductByUuidResponse getSubProductByUuid(
        @WebParam(name = "getSubProductByUuidRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetSubProductByUuidRequest request)
        throws EntityNotFoundFault, IncorrectRequestFault, InternalServiceFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByProductListResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetSubProductByProductList", action = "GetSubProductByProductList")
    @WebResult(name = "getSubProductByProductListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetSubProductByProductListResponse getSubProductByProductList(
        @WebParam(name = "getSubProductByProductListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetSubProductByProductListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductChangesListResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetSubProductChangesList", action = "GetSubProductChangesList")
    @WebResult(name = "getSubProductChangesListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetSubProductChangesListResponse getSubProductChangesList(
        @WebParam(name = "getSubProductChangesListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetSubProductChangesListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemByGuidResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws EntityNotFoundFault
     */
    @WebMethod(operationName = "GetProductItemByGuid", action = "GetProductItemByGuid")
    @WebResult(name = "getProductItemByGuidResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductItemByGuidResponse getProductItemByGuid(
        @WebParam(name = "getProductItemByGuidRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductItemByGuidRequest request)
        throws EntityNotFoundFault, IncorrectRequestFault, InternalServiceFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemByUuidResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws EntityNotFoundFault
     */
    @WebMethod(operationName = "GetProductItemByUuid", action = "GetProductItemByUuid")
    @WebResult(name = "getProductItemByUuidResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductItemByUuidResponse getProductItemByUuid(
        @WebParam(name = "getProductItemByUuidRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductItemByUuidRequest request)
        throws EntityNotFoundFault, IncorrectRequestFault, InternalServiceFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemListResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetProductItemList", action = "GetProductItemList")
    @WebResult(name = "getProductItemListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductItemListResponse getProductItemList(
        @WebParam(name = "getProductItemListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductItemListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

    /**
     * 
     * @param request
     * @return
     *     returns ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductItemChangesListResponse
     * @throws InternalServiceFault
     * @throws IncorrectRequestFault
     * @throws OffsetOutOfRangeFault
     */
    @WebMethod(operationName = "GetProductItemChangesList", action = "GetProductItemChangesList")
    @WebResult(name = "getProductItemChangesListResponse", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "response")
    public GetProductItemChangesListResponse getProductItemChangesList(
        @WebParam(name = "getProductItemChangesListRequest", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/ws-definitions/v2", partName = "request")
        GetProductItemChangesListRequest request)
        throws IncorrectRequestFault, InternalServiceFault, OffsetOutOfRangeFault
    ;

}