
package package1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the package1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidInputException_QNAME = new QName("http://package1/", "InvalidInputException");
    private final static QName _GetHelloWorldAsString_QNAME = new QName("http://package1/", "getHelloWorldAsString");
    private final static QName _GetProductsResponse_QNAME = new QName("http://package1/", "getProductsResponse");
    private final static QName _GetHelloDarknessMyOldFriendResponse_QNAME = new QName("http://package1/", "getHelloDarknessMyOldFriendResponse");
    private final static QName _GetHelloWorldAsStringResponse_QNAME = new QName("http://package1/", "getHelloWorldAsStringResponse");
    private final static QName _GetHelloDarknessMyOldFriend_QNAME = new QName("http://package1/", "getHelloDarknessMyOldFriend");
    private final static QName _GetProducts_QNAME = new QName("http://package1/", "getProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: package1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloWorldAsString }
     * 
     */
    public GetHelloWorldAsString createGetHelloWorldAsString() {
        return new GetHelloWorldAsString();
    }

    /**
     * Create an instance of {@link InvalidInputException }
     * 
     */
    public InvalidInputException createInvalidInputException() {
        return new InvalidInputException();
    }

    /**
     * Create an instance of {@link GetHelloDarknessMyOldFriendResponse }
     * 
     */
    public GetHelloDarknessMyOldFriendResponse createGetHelloDarknessMyOldFriendResponse() {
        return new GetHelloDarknessMyOldFriendResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetHelloDarknessMyOldFriend }
     * 
     */
    public GetHelloDarknessMyOldFriend createGetHelloDarknessMyOldFriend() {
        return new GetHelloDarknessMyOldFriend();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetHelloWorldAsStringResponse }
     * 
     */
    public GetHelloWorldAsStringResponse createGetHelloWorldAsStringResponse() {
        return new GetHelloWorldAsStringResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidInputException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "InvalidInputException")
    public JAXBElement<InvalidInputException> createInvalidInputException(InvalidInputException value) {
        return new JAXBElement<InvalidInputException>(_InvalidInputException_QNAME, InvalidInputException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "getHelloWorldAsString")
    public JAXBElement<GetHelloWorldAsString> createGetHelloWorldAsString(GetHelloWorldAsString value) {
        return new JAXBElement<GetHelloWorldAsString>(_GetHelloWorldAsString_QNAME, GetHelloWorldAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloDarknessMyOldFriendResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "getHelloDarknessMyOldFriendResponse")
    public JAXBElement<GetHelloDarknessMyOldFriendResponse> createGetHelloDarknessMyOldFriendResponse(GetHelloDarknessMyOldFriendResponse value) {
        return new JAXBElement<GetHelloDarknessMyOldFriendResponse>(_GetHelloDarknessMyOldFriendResponse_QNAME, GetHelloDarknessMyOldFriendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "getHelloWorldAsStringResponse")
    public JAXBElement<GetHelloWorldAsStringResponse> createGetHelloWorldAsStringResponse(GetHelloWorldAsStringResponse value) {
        return new JAXBElement<GetHelloWorldAsStringResponse>(_GetHelloWorldAsStringResponse_QNAME, GetHelloWorldAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloDarknessMyOldFriend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "getHelloDarknessMyOldFriend")
    public JAXBElement<GetHelloDarknessMyOldFriend> createGetHelloDarknessMyOldFriend(GetHelloDarknessMyOldFriend value) {
        return new JAXBElement<GetHelloDarknessMyOldFriend>(_GetHelloDarknessMyOldFriend_QNAME, GetHelloDarknessMyOldFriend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://package1/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

}
