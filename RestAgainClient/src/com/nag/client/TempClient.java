package com.nag.client;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

public class TempClient {
	
	
	public static String URL = "http://localhost:8080/RestAgain/temp";
	
	 private static URI getBaseURI() 
	 {
		    return UriBuilder.fromUri(URL).build();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String response = 
				ClientBuilder.newClient().target(getBaseURI()).path("cent").path("32").request().accept(MediaType.APPLICATION_JSON).get(String.class).toString();
		
		System.out.println(response);
		
		
		String fResponse = 
				ClientBuilder.newClient().target(getBaseURI()).path("faren").path("32").request().accept(MediaType.APPLICATION_JSON).get(String.class).toString();
		
		System.out.println(fResponse);


	}

}
