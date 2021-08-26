package modelo;

import java.util.Comparator;

public class ComparaPreco implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Venda a = (Venda) o1;
		Venda b = (Venda) o2;
		
		if(a.getValor() > b.getValor()) {
			return +1;
		}else {
			if(a.getValor() < b.getValor()) {
				return -1;
			}else {
				return 0;
			}
		}
		
	}

}

