import javax.xml.ws.Endpoint;

public class Deploiement {
public static void main(String[] args) {
	String url = "http://localhost:8686/"; 
	Endpoint.publish(url, new Conversion()); 
	System.out.println("http://localhost:8686/?wsdl");
	}
}
