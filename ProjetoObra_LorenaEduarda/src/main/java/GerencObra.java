import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerencObra {
    private Livro l;
    private Filme f;
    private Serie s;
    
    private List<Livro> bdLivro;
    private List<Filme> bdFilme;
    private List<Serie> bdSerie;
    
    // SINGLETON
    private static GerencObra gerencObraUnic;
    
    private GerencObra() {
        l = new Livro();
        f = new Filme();
        s = new Serie();
        bdLivro = new ArrayList<Livro>();
        bdFilme = new ArrayList<Filme>();
        bdSerie = new ArrayList<Serie>();
    }
    
    public static GerencObra getGerencObraUnic() {
        if (gerencObraUnic == null) {
            gerencObraUnic = new GerencObra();
        }
        return gerencObraUnic;
    }
    
    public List<Livro> getBdLivro() {
        return bdLivro;
    }
    
    public List<Filme> getBdFilme() {
        return bdFilme;
    }
    
    public List<Serie> getBdSerie() {
        return bdSerie;
    }
    
    // MÉTODOS DE CADASTRO
    public Livro cadLivroGer(Livro l) {
        if (consultarLivroGer(l) == null) {
            bdLivro.add(l);
            return l;
        }
        else {
            return null;
        }
    }
    
    public Filme cadFilmeGer(Filme f) {
        if (consultarFilmeGer(f) == null) {
            bdFilme.add(f);
            return f;
        }
        else {
            return null;
        }
    }
    
    public Serie cadSerieGer(Serie s) {
        if (consultarSerieGer(s) == null) {
            bdSerie.add(s);
            return s;
        }
        else {
            return null;
        }
    }
    
    // MÉTODOS DE CONSULTA
    public Livro consultarLivroGer(Livro l) {
        for (int i = 0; i < bdLivro.size(); i++) {
            if (l.getTitulo().equalsIgnoreCase(bdLivro.get(i).getTitulo())) {
                return bdLivro.get(i);
            }
        }
        return null;
    }
    
    public Filme consultarFilmeGer(Filme f) {
        for (int i = 0; i < bdFilme.size(); i++) {
            if (f.getTitulo().equalsIgnoreCase(bdFilme.get(i).getTitulo())) {
                return bdFilme.get(i);
            }
        }
        return null;
    }
    
    public Serie consultarSerieGer(Serie s) {
        for (int i = 0; i < bdSerie.size(); i++) {
            if (s.getTitulo().equalsIgnoreCase(bdSerie.get(i).getTitulo())) {
                return bdSerie.get(i);
            }
        }
        return null;
    }
    
    // MÉTODOS DE EXCLUSÃO
    public Livro excluirLivroGer(Livro l) {
        Livro l1 = consultarLivroGer(l);
        
        if (l1 != null) {
            bdLivro.remove(l1);
            return null;
        }
        else {
            return l;
        }
    }
    
    public Filme excluirFilmeGer(Filme f) {
        Filme f1 = consultarFilmeGer(f);
        
        if (f1 != null) {
            bdFilme.remove(f1);
            return null;
        }
        else {
            return f;
        }
    }
    
    public Serie excluirSerieGer(Serie s) {
        Serie s1 = consultarSerieGer(s);
        
        if (s1 != null) {
            bdSerie.remove(s1);
            return null;
        }
        else {
            return s;
        }
    }
    
    // MÉTODOS DE ALTERAÇÃO
    public Livro atualizarLivroGer(Livro l) {
        for (int i = 0; i < bdLivro.size(); i++) {
            if (l.getTitulo().equalsIgnoreCase(bdLivro.get(i).getTitulo())) {
                l = bdLivro.get(i);
                
                String titulo = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo título",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String anoLancamento = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo ano de lançamento",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String genero = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo gênero",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo nome do autor",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String nacionalidade = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova nacionalidade do autor",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String num_paginas = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo número de páginas do livro",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String editora = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova editora do livro",
                    "Atualização de livro",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                try {
                    if (!titulo.equals("")) l.setTitulo(titulo);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o título",
                        "Erro ao atualizar o título",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!anoLancamento.equals("")) l.setAnoLancamento(Integer.parseInt(anoLancamento));
                }
                catch(ValorMinException exv) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o ano de lançamento deve ser maior que 0",
                        "Erro ao atualizar o ano de lançamento",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                catch(NumberFormatException nfex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o ano de lançamento deve ser um número inteiro",
                        "Erro ao atualizar o ano de lançamento",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                
                try {
                    if (!genero.equals("")) l.setGenero(genero);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o gênero",
                        "Erro ao atualizar o gênero",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!nome.equals("")) l.getAut().setNome(nome); // Reflexividade
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o nome do autor",
                        "Erro ao atualizar o nome do autor",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!nacionalidade.equals("")) l.getAut().setNacionalidade(nacionalidade);  // Reflexividade
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite a nacionalidade do autor",
                        "Erro ao atualizar a nacionalidade do autor",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!num_paginas.equals("")) l.setNumPaginas(Integer.parseInt(num_paginas));
                }
                catch(ValorMinException exv) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o número de páginas deve ser maior que 0",
                        "Erro ao atualizar o número de páginas do livro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                catch(NumberFormatException nfex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o número de páginas deve ser do tipo inteiro",
                        "Erro ao atualizar o número de páginas do livro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!editora.equals("")) l.setEditora(editora);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite a editora",
                        "Erro ao atualizar a editora do livro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                bdLivro.set(i, l);
                return bdLivro.get(i);
            }
        }
        return null;
    }
    
    public Filme atualizarFilmeGer(Filme f) {
        for (int i = 0; i < bdFilme.size(); i++) {
            if (f.getTitulo().equalsIgnoreCase(bdFilme.get(i).getTitulo())) {
                f = bdFilme.get(i);
                
                String titulo = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo título",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String anoLancamento = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo ano de lançamento",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String genero = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo gênero",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo nome do autor",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String nacionalidade = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova nacionalidade do autor",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String duracao = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova duração do filme",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String diretor = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova direção do filme",
                    "Atualização de filme",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                try {
                    if (!titulo.equals("")) f.setTitulo(titulo);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o título",
                        "Erro ao atualizar o título",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!anoLancamento.equals("")) f.setAnoLancamento(Integer.parseInt(anoLancamento));
                }
                catch(ValorMinException exv) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o ano de lançamento deve ser maior que 0",
                        "Erro ao atualizar o ano de lançamento",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                catch(NumberFormatException nfex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o ano de lançamento deve ser um número inteiro",
                        "Erro ao atualizar o ano de lançamento",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                
                try {
                    if (!genero.equals("")) f.setGenero(genero);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o gênero",
                        "Erro ao atualizar o gênero",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!nome.equals("")) f.getAut().setNome(nome); // Reflexividade
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o nome do autor",
                        "Erro ao atualizar o nome do autor",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!nacionalidade.equals("")) f.getAut().setNacionalidade(nacionalidade);  // Reflexividade
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite a nacionalidade do autor",
                        "Erro ao atualizar a nacionalidade do autor",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!duracao.equals("")) f.setDuracao(duracao);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite a duração do filme no formato HH:MM:SS",
                        "Erro ao atualizar a duração do filme",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!diretor.equals("")) f.setDiretor(diretor);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o nome do(a) diretor(a) do filme",
                        "Erro ao atualizar a direção do filme",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                bdFilme.set(i, f);
                return bdFilme.get(i);
            }
        }
        return null;
    }
        
    public Serie atualizarSerieGer(Serie s) {
        for (int i = 0; i < bdSerie.size(); i++) {
            if (s.getTitulo().equalsIgnoreCase(bdSerie.get(i).getTitulo())) {
                s = bdSerie.get(i);
                        
                String titulo = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo título",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String anoLancamento = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo ano de lançamento",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String genero = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo gênero",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo nome do autor",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String nacionalidade = JOptionPane.showInputDialog(
                    null,
                    "Informe a nova nacionalidade do autor",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String num_temporadas = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo número de temporadas da série",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                String total_episodios = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo número total de episódios da série",
                    "Atualização de série",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                try {
                    if (!titulo.equals("")) s.setTitulo(titulo);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o título",
                        "Erro ao atualizar o título",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!anoLancamento.equals("")) s.setAnoLancamento(Integer.parseInt(anoLancamento));
                }
                catch(ValorMinException exv) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o ano de lançamento deve ser maior que 0",
                        "Erro ao atualizar o ano de lançamento",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                catch(NumberFormatException nfex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o ano de lançamento deve ser um número inteiro",
                        "Erro ao atualizar o ano de lançamento",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                
                try {
                    if (!genero.equals("")) s.setGenero(genero);
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o gênero",
                        "Erro ao atualizar o gênero",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!nome.equals("")) s.getAut().setNome(nome); // Reflexividade
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite o nome do autor",
                        "Erro ao atualizar o nome do autor",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!nacionalidade.equals("")) s.getAut().setNacionalidade(nacionalidade);  // Reflexividade
                }
                catch(EntradaStrException estr) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite a nacionalidade do autor",
                        "Erro ao atualizar a nacionalidade do autor",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                try {
                    if (!num_temporadas.equals("")) s.setNumTemporadas(Integer.parseInt(num_temporadas));
                }
                catch(ValorMinException exv) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o número de temporadas deve ser maior que 0",
                        "Erro ao atualizar o número de temporadas da série",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                catch(NumberFormatException nfex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o número de temporadas deve ser do tipo inteiro",
                        "Erro ao atualizar o número de temporadas da série",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                
                try {
                    if (!total_episodios.equals("")) s.setTotalEpisodios(Integer.parseInt(total_episodios));
                }
                catch(ValorMinException exv) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o número total de episódios deve ser maior que 0",
                        "Erro ao atualizar o número total de episódios da série",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                catch(NumberFormatException nfex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Erro: o número total de episódios deve ser do tipo inteiro",
                        "Erro ao atualizar o número total de episódios da série",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return null;
                }
                
                bdSerie.set(i, s);
                return bdSerie.get(i);
            }
        }
        return null;
    }
}
