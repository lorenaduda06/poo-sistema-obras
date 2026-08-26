public final class Serie extends Obra {
    private int num_temporadas;
    private int total_episodios;

    public Serie(){
	this.num_temporadas = 0;
	this.total_episodios = 0;
    }

    public int getNumTemporadas() {
	return num_temporadas;
    }

    public int getTotalEpisodios() {
	return total_episodios;
    }

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
}