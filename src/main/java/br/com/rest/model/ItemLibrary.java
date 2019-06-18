package br.com.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemLibrary {
	
	private String titulo;
	private String tipo;
	private String data;
	private String numeroEdicao;
	private String autor;
	private String editora;
	private String descricao;
	//private String imagem;

	public ItemLibrary() {
		super();
	}

	public ItemLibrary(String titulo, String tipo, String data, String numeroEdicao, String autor, String editora, String descricao) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.data = data;
		this.numeroEdicao = numeroEdicao;
		this.editora = editora;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNumeroEdicao() {
		return edicao;
	}

	public void setNumeroEdicao(String numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ItemLibrary [titulo=" + titulo + "tipo=" + tipo + "data=" + data + "numeroEdicao=" + numeroEdicao + "autor=" + autor + "editora=" + editora + "descricao=" + descricao + "]";
	}
	
}
