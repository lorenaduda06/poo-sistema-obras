import java.util.GregorianCalendar;

public abstract class Obra {
    private String titulo;
    private int anoLancamento;
    private String genero;

    private Autor aut = new Autor();

    public Obra() {
        this.titulo = "";
        this.anoLancamento = 0;
        this.genero = "";
    }

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

    public void setTitulo(String titulo) throws EntradaStrException {
	if (titulo != null && !titulo.equals("")) {
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
	if (genero != null && !genero.equals("")) {
            this.genero = genero;
	}
	else {
            throw new EntradaStrException();
        }
    }

    public void setAut(Autor aut) {
	this.aut = aut;
    }

    // Polimorfismo de sobrecarga
    public int calcVal(String titulo) {
        int tam_titulo = titulo.length();
        return tam_titulo;
    }
    
    // Polimorfismo de sobrecarga
    public int calcVal(int anoLancamento) {
        GregorianCalendar data = new GregorianCalendar();
        
        int ano_atual = data.get(data.YEAR);
        
        int idade_obra = ano_atual - anoLancamento;
        return idade_obra;
    }
}