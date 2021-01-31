package br.com.sbs.compras.beans;

import javax.faces.bean.ManagedBean;

import br.com.sbs.compras.models.Produto;

@ManagedBean
public class ProdutoBean {

	private Produto produto = new Produto();
	
	public Produto getProduto() {
		return produto;
	}

	public void gravar() {
		System.out.println("Gravando produto ...");
	}

	

}
