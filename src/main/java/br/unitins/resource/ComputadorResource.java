package br.unitins.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.unitins.model.Computador;

// Retorna todos os objetos do banco
@Path("/Computador")
public class ComputadorResource {

   @GET
   @Path("/todos")
   @Produces(MediaType.APPLICATION_JSON)
   public List<Computador> getAllComputador() {
      return Computador.findAll().list();
   }

   // Consultar por id
   @GET
   @Path("/{id}")
   @Consumes(MediaType.APPLICATION_JSON)
   public Computador searchJogo(@PathParam("id") Long id) {
       return Computador.findById(id);
   }

   //insere pc
   @POST
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   @Transactional
   public Computador insert(Computador computador) {
      //adiciona o computador no banco de dados
      computador.persist();

      return computador;

   }

   //altera pc
   @PUT
   @Path("/{id}")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   @Transactional
   public Computador uptadte(@PathParam("id") Long id, Computador computador) {

      Computador entity = Computador.findById(id);

      entity.setNome(computador.getNome());
      entity.setPecas(computador.getPecas());
      entity.setValor(computador.getValor());
      entity.setPerifericos(computador.getPerifericos());
      entity.setEstoque(computador.getEstoque());

       return entity;
   }

   //deletar pc
   @DELETE
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   @Transactional
   public Computador deleteJogo(@PathParam("id") Long id, Computador jogo) {
      Computador computadorDeletado = Computador.findById(id);
         
      computadorDeletado.delete();
 
      return computadorDeletado;
   }


}
