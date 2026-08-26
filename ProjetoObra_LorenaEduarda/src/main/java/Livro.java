public final class Livro extends Obra implements Saida {
    private int num_paginas;
    private String editora;

    public Livro() {
        this.num_paginas = 0;
        this.editora = "";
    };
	
    public int getNumPaginas() {
	return num_paginas;
    }

    public String getEditora() {
	return editora;
    }

    public void setNumPaginas(int num_paginas) throws ValorMinException {
        if (num_paginas > 0) {
            this.num_paginas = num_paginas;
	}
	else {
            throw new ValorMinException();
        }
    }

    public void setEditora(String editora) throws EntradaStrException {
	if (editora != null && !editora.equals("")) {
            this.editora = editora;
	}
	else {
            throw new EntradaStrException();
        }
    }

    // Polimorfismo de sobrescrita
    public int processamentoVal() {
        int tempo_medio_min = num_paginas * 3;
        return tempo_medio_min;
    }
}