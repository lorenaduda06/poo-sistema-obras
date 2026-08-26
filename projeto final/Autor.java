public class Autor {
	private String nome;
	private String nacionalidade;

	// Método construtor default
	public Autor() {
		this.nome = "";
		this.nacionalidade = "";
	}

	// Métodos getters e setters
	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNome(String nome) throws EntradaStrException {
		if (!nome.equals("") && nome != null) {
			this.nome = nome;
		}
		else {
			throw new EntradaStrException();
		}
	}

	public void setNacionalidade(String nacionalidade) throws EntradaStrException {
		if (!nacionalidade.equals("") && nacionalidade != null) {
			this.nacionalidade = nacionalidade;
		}
		else {
			throw new EntradaStrException();
		}
	}
}