import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://www.kahina.fr")
public class Conversion {
	@WebMethod(operationName="convertionMethod")
	public double convertir(double mt) {
		return mt*0.9;
	}
}
