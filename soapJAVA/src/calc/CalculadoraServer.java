package calc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {
    @WebMethod float soma(float num1, float num2);
    @WebMethod float sub(float num1, float num2);
    @WebMethod float mult(float num1, float num2);
    @WebMethod float div(float num1, float num2);
};
