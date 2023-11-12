
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://service/", className = "proxy.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://service/", className = "proxy.ConversionResponse")
    @Action(input = "http://service/BanqueService/conversionRequest", output = "http://service/BanqueService/conversionResponse")
    public double conversion(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://service/", className = "proxy.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://service/", className = "proxy.GetComptesResponse")
    @Action(input = "http://service/BanqueService/getComptesRequest", output = "http://service/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

}
