public final class Serie extends Obra {
	private int num_temporadas;
	private int total_episodios;

	// Construtor vazio
	public Serie(){
		this.num_temporadas = 0;
		this.total_episodios = 0;
	}

	// Metodos getters
	public int getNumTemporadas() {
		return num_temporadas;
	}

	public int getTotalEpisodios() {
		return total_episodios;
	}

	// Metodos setters
	public void setNumTemporadas(int num_temporadas) throws ValorMinException {
		if (num_temporadas > 0) {
			this.num_temporadas = num_temporadas;
		}
		else {
			throw new ValorMinException();
		}
	}

	public void setTotalEpisodios(int total_episodios) throws ValorMinException {
		if (total_episodios > 0) {
			this.total_episodios = total_episodios;
		}
		else {
			throw new ValorMinException();
		}
	}

	// Uso do método abstrato
	public void apresentacao() {
		System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
	}

	// Polimorfismo de sobrecarga
	public void apresentacao(String msg) {
		System.out.println("\n\t\t\t** DADOS DA " + msg + " **");
	}

	// @Override - polimorfismo de sobrescrita
	public void exibirInfo() {
		System.out.println("\n\t\tINFORMACOES GERAIS\n");
		super.exibirInfo();
		System.out.println("\n\t\tINFORMACOES ESPECIFICAS\n");
		System.out.println("NUMERO DE TEMPORADAS: " +num_temporadas);
		System.out.println("NUMERO DE EPISODIOS: " +total_episodios);
	}
}