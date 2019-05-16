package com.cgi.api.facile;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/utilisateur/{id}")
public class UtilisateurResource {

	@GET
	@Produces({"application/json", "application/xml"})
	public Utilisateur get(@PathParam("id") long id) {
		System.out.println("On fait comme si on allait chercher l'utilisateur " + id + " dans la base de données.");
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom("David");
		utilisateur.setAge(45);
		utilisateur.setVivant(true);
		return utilisateur;
	}
	
	@DELETE
	public void supprimer(@PathParam("id") long id) {

	}

}
