/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsiglassserverclientssl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import package1.IHelloWorld;
import package1.Product;

/**
 *
 * @author Slightom
 */
public class RSIGlassServerClientSSL {

    /**
     * @param args the command line arguments
     */
    private static final String WS_URL = "http://asuSLIGHTOM:8080/WebServicesGlass/HelloWorldService?wsdl";

    public static void main(String[] args) {

        String userName = "", password = "", response = "";
        List<Product> products = null;
        package1.HelloWorldService service = new package1.HelloWorldService();
        package1.IHelloWorld port = service.getHelloWorldPort();

        while (response.isEmpty() || response.contains("Unknown User!") || products == null) {
            /*
            * *****************UserName & Password*****************************
             */
            if(response.contains("Unknown User!")){
                System.out.println(response);
            }
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter username: ");
            userName = scan.next();
            System.out.print("Please enter password: ");
            password = scan.next();

            Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();
            req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

            Map<String, List<String>> headers = new HashMap<String, List<String>>();
            headers.put("Username", Collections.singletonList(userName));
            headers.put("Password", Collections.singletonList(password));
            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
            /*
            ********************************************************************
             */

            response = getHelloWorldAsString(userName, port);
            products = getProducts(port);
        }

        System.out.println("getHellowWorldAsString returns: " + response);
        for (Product p : products) {
            System.out.println("Product: " + p.getName());
        }
    }

    private static String getHelloWorldAsString(java.lang.String arg0, IHelloWorld port) {
        return port.getHelloWorldAsString(arg0);
    }

    private static java.util.List<Product> getProducts(IHelloWorld port) {
        return port.getProducts();
    }

}
