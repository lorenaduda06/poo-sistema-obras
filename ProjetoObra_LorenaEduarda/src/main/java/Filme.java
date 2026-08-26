public final class Filme extends Obra {
    private String duracao;
    private String diretor;

    public Filme() {
	this.duracao = "";
        this.diretor = "";
    }

    public String getDuracao() {
	return duracao;
    }

    public String getDiretor() {
	return diretor;
    }

    public void setDuracao(String duracao) throws EntradaStrException {
        if (duracao != null && !duracao.equals("")) {
            this.duracao = duracao;
	}
	else {
            throw new EntradaStrException();
	}
    }

    public void setDiretor(String diretor) throws EntradaStrException {
	if (diretor != null && !diretor.equals("")) {
            this.diretor = diretor;
	}
	else {
            throw new EntradaStrException();
	}
    }
}