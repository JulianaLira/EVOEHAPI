package br.com.rest.dao;

import java.sql.SQLException;

import br.com.rest.model.ItemLibrary;

public class ItemLibraryDao extends Dao {
	
	public boolean cadastrar(ItemLibrary itemLibrary) throws Exception{
		boolean SUCESS = false;
		try{
			open();
			stmt = con.prepareStatement("insert into itemlibrary values(?,?,?,?,?,?,?)");

			stmt.setString(1, null);
			stmt.setString(2, itemLibrary.getTitulo());
			stmt.setString(3, itemLibrary.getTipo());
			stmt.setString(3, itemLibrary.getData());
			stmt.setString(3, itemLibrary.getNumeroEdicao());
			stmt.setString(3, itemLibrary.getAutor());
			stmt.setString(3, itemLibrary.getEditora());
			stmt.setString(4, itemLibrary.getDescricao());
			stmt.execute();
			SUCESS = true;	
		}catch(SQLException e){
			System.out.println("Código de erro: "+e.getErrorCode()+" Texto"
					+ " erro: "+e.getMessage());
		}			
		return SUCESS;
	}

	public boolean alterar(ItemLibrary itemLibrary) throws Exception{
		boolean SUCESS = false;
		try{
			open();
			stmt = con.prepareStatement("update itemlibrary set titulo=?, tipo=?, data=?, numeroEdicao=?, autor=?, editora=?, descricao=? where codigo=?");
			
			stmt.setString(1, itemLibrary.getTitulo());
			stmt.setString(2, itemLibrary.getTipo());
			stmt.setString(3, itemLibrary.getData());
			stmt.setString(4, itemLibrary.getNumeroEdicao());
			stmt.setString(5, itemLibrary.getAutor());
			stmt.setString(6, itemLibrary.getEditora());
			stmt.setString(7, itemLibrary.getDescricao());
			stmt.setString(8, itemLibrary.getCodigo());
			stmt.execute();
			SUCESS = true;	
		}catch(SQLException e){
			System.out.println("Código de erro: "+e.getErrorCode()+" Texto"
					+ " erro: "+e.getMessage());
		}			
		return SUCESS;
	}

	public boolean excluir(ItemLibrary itemLibrary) throws Exception{
		boolean SUCESS = false;
		try{
			open();
			stmt = con.prepareStatement("detete from itemlibrary where codigo=?");
			stmt.setString(1, itemLibrary.getCodigo());
			stmt.execute();
			SUCESS = true;	
		}catch(SQLException e){
			System.out.println("Código de erro: "+e.getErrorCode()+" Texto"
					+ " erro: "+e.getMessage());
		}			
		return SUCESS;
	}
}
