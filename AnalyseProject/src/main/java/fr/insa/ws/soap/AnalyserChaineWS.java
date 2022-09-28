package fr.insa.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName="analyzer")
public class AnalyserChaineWS {
    @WebMethod(operationName="compare")
    public int analyse(@WebParam(name="chain") String chaine){
        return chaine.length() ;
    }
}
