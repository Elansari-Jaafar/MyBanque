package com.MyBanque.MyBanque.ServiceRest;

import com.MyBanque.MyBanque.Repositories.CompteRepository;
import com.MyBanque.MyBanque.entities.Compte;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;

    //ReaD: Récupérer tous les comptes
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Compte> GetComptes() {
        return compteRepository.findAll();
    }

    //Read: Récupérer un compte par son id
    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte GetCompte(@PathParam("id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    //Create: Ajouter un compte
    @Path("/comptes")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    //Update: Mettre à jour un compte
    @Path("/comptes/{id}")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte updateCompte(@PathParam("id") Long id, Compte compte) {
        Compte existingcompte = compteRepository.findById(id).orElse(null);
        if (existingcompte != null) {
            existingcompte.setSolde(compte.getSolde());
            existingcompte.setDateCreation(compte.getDateCreation());
            existingcompte.setType(compte.getType());
            return compteRepository.save(existingcompte);
        }
        return null;
    }

    //DELETE: Supprimer un compte
    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteCompte(@PathParam("id") Long id) {
        compteRepository.deleteById(id);
    }
}


