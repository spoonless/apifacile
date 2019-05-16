package com.cgi.api.facile;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/utilisateur")
public class ListeUtilisateursResource {
	
	@GET
	@Produces({"application/json", "application/xml"})
	public List<Utilisateur> getAll() {
		return new ArrayList<Utilisateur>();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(Utilisateur utilisateur, @Context UriInfo uriInfo) {
		// appelle à la couche métier pour créer l'utilisateur
		// imaginons que la couche métier crée l'utilisateur avec un id
		int id = 1234;
		Utilisateur utilisateurCree = new Utilisateur();
		
		URI uri = uriInfo.getRequestUriBuilder().path(String.valueOf(id)).build();
		return Response.created(uri)
				       .entity(utilisateurCree)
				       .build();
	}


}
