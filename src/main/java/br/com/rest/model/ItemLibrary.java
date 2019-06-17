package br.com.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemLibrary {
	
	private String titulo;
	private String autor;
	private String assunto;
	
	public ItemLibrary() {
		super();
	}

	public ItemLibrary(String titulo, String autor, String assunto) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.assunto = assunto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	@Override
	public String toString() {
		return "ItemLibrary [titulo=" + titulo + ", autor=" + autor + ", assunto=" + assunto + "]";
	}
	
	
}
