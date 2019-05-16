package com.cgi.api.facile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloResource {

	@GET
	public String sayHello(@QueryParam("nom") String someone, @QueryParam("age") int age) {
		String suffixe = age > 30 ? " le vieux" : " le jeune";
		return "hello " + someone + suffixe;
	}
}
