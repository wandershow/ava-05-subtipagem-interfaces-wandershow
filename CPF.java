package cobaia;

public class CPF implements Documentos{
  private String valor;
  private String tipo = "CPF";
  private int tamanho = 11;
  private int numini = 0;
  private int numfim = 10;
  private int alfaini = 0;
  private int alfafim = 0;
  
 
  @Override
  public String toString() {    
    return this.getTexto();
  }

  public String getNumero() {
    return valor;
  }
  
  public String getTexto() {
    return this.valor;
  }




@Override
public String getTipo() {
	return tipo;
}

@Override
public int getTamanho() {
	
	return tamanho;
}

@Override
public void setValor(String valor) {
	 if (valor.length() != 11) throw new IllegalArgumentException("CPF inválido");
	    for (char c : valor.toCharArray())
	      if (c < 48 || c > 57) throw new IllegalArgumentException("Somente números");
	    
	    this.valor = valor;
		
}

@Override
public int getAlfaIni() {
	// TODO Auto-generated method stub
	return alfaini;
}

@Override
public int getAlfaFim() {
	// TODO Auto-generated method stub
	return alfafim;
}

@Override
public int getNumIni() {
	// TODO Auto-generated method stub
	return numini;
}

@Override
public int getNumFim() {
	// TODO Auto-generated method stub
	return numfim;
}




}
