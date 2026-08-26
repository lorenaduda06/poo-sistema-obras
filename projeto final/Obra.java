public abstract class Obra implements Saida {
	private String titulo;
	private int anoLancamento;
	private String genero;
	private String msg;	// - será usado no polimorfismo de sobrecarga

	// Implementação da classe Autor para usar reflexividade
	private Autor aut = new Autor();

	// Construtor vazio
	public Obra() {
		this.titulo = "";
		this.anoLancamento = 0;
		this.genero = "";
		this.msg = "";
	}

	// Metodos getters
	public String getTitulo() {
		return titulo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public Autor getAut() {
		return aut;
	}

	public String getMsg() {
		return msg;
	}

	// Metodos setters
	public void setTitulo(String titulo) throws EntradaStrException {
		if (!titulo.equals("") && titulo != null) {
			this.titulo = titulo;
		}
		else {
			throw new EntradaStrException();
		}
	}

	public void setAnoLancamento(int anoLancamento) throws ValorMinException {
		if (anoLancamento > 0) {
			this.anoLancamento = anoLancamento;
		}
		else {
			throw new ValorMinException();
		}
	}

	public void setGenero(String genero) throws EntradaStrException {
		if (!genero.equals("") && genero != null) {
			this.genero = genero;
		}
		else {
			throw new EntradaStrException();
		}
	}

	public void setAut(Autor aut) {
		this.aut = aut;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// Método abstrato
	public abstract void apresentacao();

	// Método para aplicar polimorfismo de sobrecarga
	public void apresentacao(String msg) {
		System.out.println(msg);
	}

	// Método que será sobrescrito nas classes filhas
	public void exibirInfo() {
		System.out.println("TITULO: " +titulo);
		System.out.println("ANO DE LANCAMENTO: " +anoLancamento);
		System.out.println("GENERO: " +genero);
		System.out.println("AUTOR: " +aut.getNome());
		System.out.println("NACIONALIDADE DO AUTOR: " +aut.getNacionalidade());
	}
}