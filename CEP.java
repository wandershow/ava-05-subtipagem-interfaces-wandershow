package cobaia;

public class CEP implements Documentos {
	private String valor;
	private String tipo = "CEP";
	private int tamanho = 8;
	private int numini = 0;
	private int numfim = 7;
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
		if (valor.length() != 8)
			throw new IllegalArgumentException("CEP inválido");
		for (char c : valor.toCharArray())
			if (c < 48 || c > 57)
				throw new IllegalArgumentException("Somente números");

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