from zeep import Client
client = Client("http://localhost:8686/?wsdl")
result = client.service.convertionMethod(11)
print("the result returned by the web service conversion is", result)