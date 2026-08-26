public final class Livro extends Obra {
	private int num_paginas;
	private String editora;

	// Construtor vazio
	public Livro() {
		this.num_paginas = 0;
		this.editora = "";
	};
	
	// Metodos getters
	public int getNumPaginas() {
		return num_paginas;
	}

	public String getEditora() {
		return editora;
	}

	// Metodos setters
	public void setNumPaginas(int num_paginas) throws ValorMinException {
		if (num_paginas > 0) {
			this.num_paginas = num_paginas;
		}
		else {
			throw new ValorMinException();
		}
	}

	public void setEditora(String editora) throws EntradaStrException {
		if (!editora.equals("") && editora != null) {
			this.editora = editora;
		}
		else {
			throw new EntradaStrException();
		}
	}

	// Uso do método abstrato
	public void apresentacao() {
		System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
	}

	// Polimorfismo de sobrecarga
	public void apresentacao(String msg) {
		System.out.println("\n\t\t\t** DADOS DO " + msg +" **\n");
	}

	// @Override - polimorfismo de sobrescrita
	public void exibirInfo() {
		System.out.println("\n\t\tINFORMACOES GERAIS\n");
		super.exibirInfo();
		System.out.println();
		System.out.println("\n\t\tINFORMACOES ESPECIFICAS\n");
		System.out.println("NUMERO DE PAGINAS: " +num_paginas);
		System.out.println("EDITORA: " +editora);
	}
}