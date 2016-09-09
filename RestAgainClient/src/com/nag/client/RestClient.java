package com.nag.client;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.xml.ws.Response;

import org.glassfish.jersey.client.ClientConfig;

public class RestClient {
	
	public static String URL = "http://localhost:8080/RestAgain/hello";
	
	
	public static void main(String ... args)
	{
		
		ClientConfig config = new ClientConfig();
		
		WebTarget webTarget = ClientBuilder.newClient(config).target(getBaseURI());
		
		String response = webTarget.request().accept(MediaType.TEXT_PLAIN).get(String.class).toString();
		
		System.out.println("Response is: "+response);
		
		
		String xmlAnswer = 
				webTarget.path("xml").request().accept(MediaType.TEXT_XML).get(String.class);
		    String htmlAnswer= 
		    		webTarget.path("html").request().accept(MediaType.TEXT_HTML).get(String.class);

		    System.out.println("XML Response is: "+xmlAnswer);
		    
		    System.out.println("HTML Response is: "+htmlAnswer);
		    
		    
	}

	
	 private static URI getBaseURI() 
	 {
		    return UriBuilder.fromUri(URL).build();
	 }
}
