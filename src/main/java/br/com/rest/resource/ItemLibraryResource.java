package br.com.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.rest.dao.ItemLibraryDao;
import br.com.rest.model.ItemLibrary;

@Path("/")
public class ItemLibraryResource {

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastrar")
	public Response cadastrarItem(ItemLibrary itemLibrary){
		try{
			boolean isItemGravado = new ItemLibraryDao().cadastrar(itemLibrary);
			if(isItemGravado){
				return Response.ok().entity(itemLibrary).build();
			}else{
				return Response.status(500).entity("Erro ao salvar o item no banco").build();
			}			
		}catch(Exception e){
			return Response.status(500).entity("Erro de banco").build();
		}
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{id}")
	public String getID(@PathParam("id") int id){
		return "<HTML><BODY>Fui no servidor e voltei - id="+id+"</BODY></HTML>";
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/alterar/{id}")
	public Response alterarItem(ItemLibrary itemLibrary){
		try{
			boolean isItemGravado = new ItemLibraryDao().alterar(itemLibrary);
			if(isItemGravado){
				return Response.ok().entity(itemLibrary).build();
			}else{
				return Response.status(500).entity("Erro ao alterar o item no banco").build();
			}
		}catch(Exception e){
			return Response.status(500).entity("Erro de banco").build();
		}
	}

	@DEL
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/excluir/{id}")
	public Response alterarItem(ItemLibrary itemLibrary){
		try{
			boolean isItemGravado = new ItemLibraryDao().excluir(itemLibrary);
			if(isItemGravado){
				return Response.ok().entity(itemLibrary).build();
			}else{
				return Response.status(500).entity("Erro ao excluir o item no banco").build();
			}
		}catch(Exception e){
			return Response.status(500).entity("Erro de banco").build();
		}
	}
}
