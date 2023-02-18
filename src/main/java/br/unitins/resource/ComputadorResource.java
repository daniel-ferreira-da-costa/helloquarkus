package br.unitins.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.unitins.model.Computador;

// Retorna todos os objetos do banco
@Path("/Computador")
public class ComputadorResource {
    @GET
    @Path("/todos")
    @Produces(MediaType.APPLICATION_JSON)
     public List<Computador> getAllComputador(){
        return Computador.findAll().list();
     }

     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     @Transactional
     public Computador insert(Computador computador){
      computador.persist();
        return computador;

     }
}
