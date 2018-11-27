package cobaia;

public class Placa implements Documentos {
	 private String valor;
	  private String tipo = "Placa";
	  private int tamanho = 7;
	  private int numini = 3;
	  private int numfim = 6;
	  private int alfaini = 0;
	  private int alfafim =2;
	  
	  
	 

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
		if (valor.length() != 7) throw new IllegalArgumentException("Placa inválida");
	    for (int i = 0; i <= 2; i++) {		
	      if (valor.charAt(i) < 97 || valor.charAt(i) > 122) throw new IllegalArgumentException("Somente letras");
	    //System.out.println(i);
	    }
	    for (int i = 3; i <= 6; i++) {
	    	if (valor.charAt(i) < 48 || valor.charAt(i) > 57) throw new IllegalArgumentException("Somente números");
		    	    	
	    }
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
