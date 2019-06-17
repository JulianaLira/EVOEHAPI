package br.com.rest.dao;

import java.sql.SQLException;

import br.com.rest.model.ItemLibrary;

public class ItemLibraryDao extends Dao {
	
	public boolean cadastrar(ItemLibrary itemLibrary) throws Exception{
		boolean SUCESS = false;
		try{
			open();
			stmt = con.prepareStatement("insert into itemlibrary values(?,?,?,?)");
			stmt.setString(1, null);
			stmt.setString(2, itemLibrary.getTitulo());
			stmt.setString(3, itemLibrary.getAutor());
			stmt.setString(4, itemLibrary.getAssunto());
			stmt.execute();
			SUCESS = true;			
		}catch(SQLException e){
			System.out.println("Código de erro: "+e.getErrorCode()+" Texto"
					+ " erro: "+e.getMessage());
		}			
		return SUCESS;				
	}
	
}
