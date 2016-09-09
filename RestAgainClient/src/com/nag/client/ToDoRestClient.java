package com.nag.client;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

public class ToDoRestClient {
	
	public static String URL = "http://localhost:8080/RestAgain/todo";
	
	 private static URI getBaseURI() 
	 {
		    return UriBuilder.fromUri(URL).build();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String response = ClientBuilder.newClient().target(getBaseURI()).request().accept(MediaType.APPLICATION_XML).get(String.class).toString();
		
		System.out.println(response);

	}

}
