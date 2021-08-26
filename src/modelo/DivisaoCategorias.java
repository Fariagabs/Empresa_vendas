package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DivisaoCategorias {
	private Map<Cliente, CategoriasDeCompras> divisao = new HashMap();
	
	public boolean estaVazia() {
		return divisao.isEmpty();
	}
	
	public void categoriza (Cliente cliente, CategoriasDeCompras CategoriasDeCompras) {
		this.divisao.put(cliente, CategoriasDeCompras);
	}
	
	public CategoriasDeCompras getCategoriasDeCompras(Cliente cliente) {
		return this.divisao.get(cliente);
	}
	
	public String getCategoria(Cliente cliente) {
		return "Cliente " + cliente.getNome() + " - Categoria: " + getCategoriasDeCompras(cliente).getDescricao();
	}
	
	public Set<Cliente> getLista(){
		Set<Cliente> lista = this.divisao.keySet();
		return lista;
	}
	
	public String gastosTotalCliente(Cliente cliente) {
		return "Cliente " + cliente.getNome() + " gastou um total de " + cliente.getGastos() + " reais.";
	}
}
