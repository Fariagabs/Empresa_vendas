package modelo;

import java.util.Comparator;

public class ComparaNome implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Venda a = (Venda) o1;
		Venda b = (Venda) o2;
		return a.getNomeProduto().compareTo(b.getNomeProduto()) * -1;
		
	}
	
}
