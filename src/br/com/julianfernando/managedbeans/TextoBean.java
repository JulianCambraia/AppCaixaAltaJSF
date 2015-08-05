package br.com.julianfernando.managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TextoBean {

	private String texto;
	
	// ação requisita após o ciclo jsf fase - 
	public String imprimeTextoCaixaAlta() {
		// seta o texto postado em caixa alta
		this.texto = this.texto.toUpperCase();
		// redireciona para a view resposta
		return "resposta";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
