public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor() {
        this.nome = "";
	this.nacionalidade = "";
    }

    public String getNome() {
	return nome;
    }

    public String getNacionalidade() {
	return nacionalidade;
    }

    public void setNome(String nome) throws EntradaStrException {
	if (nome != null && !nome.equals("")) {
            this.nome = nome;
	}
	else {
            throw new EntradaStrException();
        }
    }

    public void setNacionalidade(String nacionalidade) throws EntradaStrException {
	if (nacionalidade != null && !nacionalidade.equals("")) {
            this.nacionalidade = nacionalidade;
	}
	else {
            throw new EntradaStrException();
        }
    }
}