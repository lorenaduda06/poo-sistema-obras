public final class Filme extends Obra {
	private String duracao;
	private String diretor;

	// Construtor vazio
	public Filme() {
		this.duracao = "";
		this.diretor = "";
	}

	// Metodos getters
	public String getDuracao() {
		return duracao;
	}

	public String getDiretor() {
		return diretor;
	}

	// Metodos setters
	public void setDuracao(String duracao) throws EntradaStrException {
		if (!duracao.equals("") && duracao != null) {
			this.duracao = duracao;
		}
		else {
			throw new EntradaStrException();
		}
	}

	public void setDiretor(String diretor) throws EntradaStrException {
		if (!diretor.equals("") && diretor != null) {
			this.diretor = diretor;
		}
		else {
			throw new EntradaStrException();
		}
	}

	// Uso do método abstrato
	public void apresentacao() {
		System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
	}

	// Polimorfimo de sobrecarga
	public void apresentacao(String msg) {
		System.out.print("\n\t\t\t** DADOS DO " + msg + " **\n");
	}

	// @Override - polimorfismo de sobrescrita
	public void exibirInfo() {
		System.out.println("\n\t\tINFORMACOES GERAIS\n");
		super.exibirInfo();
		System.out.println("\n\t\tINFORMACOES ESPECIFICAS\n");
		System.out.println("DURACAO: " +duracao);
		System.out.println("DIRETOR: " +diretor);
	}
}