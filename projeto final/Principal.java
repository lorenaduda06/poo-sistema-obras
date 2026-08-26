import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;	// para criar o array que permite a consulta dos cadastros

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Livro> livros = new ArrayList<>();
		ArrayList<Filme> filmes = new ArrayList<>();
		ArrayList<Serie> series = new ArrayList<>();

		Leitura read = new Leitura();

		// Variável para opção do usuário (cadastrar ou listar)
		int opcaoInicial = 0;

		// Variável para opção do usuário (cadastrar filme, série ou livro)
		int opcao = 0;

		// Variável para verificar se usuario deseja cadastrar mais alguma obra desse mesmo tipo
		String resp = "";
		
		// Variável para ajudar no tratamento de exceções do menu inicial
		boolean verMenuInicial = false;	

		// Variável para ajudar no tratamento de exceções do menu de cadastro
		boolean verificadoMenu = false;		

		// Variável para ajudar no tratamento de outras exceções
		boolean verificado = false;

		do {
			verMenuInicial = false;

			System.out.println("\n=========== MENU ===========\n");
			System.out.println("\n1 - Cadastrar obra\n");
			System.out.println("\n2 - Listar cadastros\n");
			System.out.println("\n3 - Sair\n");
				
			do {
				try {
					opcaoInicial = Integer.parseInt(read.entDados("\nDigite a acao do menu que deseja realizar: "));

					if (opcaoInicial >= 1 && opcaoInicial <= 3) {
						verMenuInicial = true;
					}
					else {
						throw new MenuInicialException();
					}
				}
				catch(MenuInicialException excInicial) {
					System.out.println("\nErro: digite um numero de 1-3\n");
				}
				catch(NumberFormatException nfex) {
					System.out.println("\nErro: a entrada deve ser um numero de 1-3\n");
				}
			} while (!verMenuInicial);

			switch(opcaoInicial) {
				case 1:
					do {
						verificadoMenu = false;

						System.out.println("\n\n** CADASTRO **\n");
						System.out.println("\n1 - Livro\n");
						System.out.println("\n2 - Filme\n");
						System.out.println("\n3 - Serie\n");
				
						try {
							opcao = Integer.parseInt(read.entDados("\nQual tipo de obra deseja cadastrar (1 - 3): "));
							if (opcao >= 1 && opcao <= 3) {
								verificadoMenu = true;
							}
							else {
								throw new EntradaMenuException();
							}
						}
						catch(EntradaMenuException eMenu) {
							System.out.println("\nErro: digite um numero de 1-3\n");
						}	
						catch(NumberFormatException nfex) {
							System.out.println("\nErro: a entrada deve ser um numero de 1-3\n");
						}
					} while (!verificadoMenu);

					do {
						switch(opcao) {
							case 1:
								Livro l = new Livro();
								
								verificado = false;

								do {
									try {
										// Atributos herdados
										l.setTitulo(read.entDados("\nDigite o titulo da obra: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o titulo\n");
									}
								} while(!verificado);

								verificado = false;
						
								do {
									try {
										l.setAnoLancamento(Integer.parseInt(read.entDados("\nDigite o ano de lancamento: ")));
										verificado = true;
									}
									catch(ValorMinException exv) {
										System.out.println("\nErro: o valor deve ser maior que 0\n");
									}
									catch(NumberFormatException nfex) {
										System.out.println("\nErro: o ano deve ser um valor numerico\n");
									}
								} while (!verificado);
							
								verificado = false;
								do {
									try {
										l.getAut().setNome(read.entDados("\nDigite o nome do autor: "));			// Reflexividade
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome do autor\n");
									}
								} while(!verificado);
						
								verificado = false;
								do {
									try {
										l.getAut().setNacionalidade(read.entDados("\nDigite a nacionalidade do autor da obra: "));	// Reflexividade
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite a nacionalidade do autor\n");
									}
								} while (!verificado);

								verificado = false;
								do {
									try {
										l.setGenero(read.entDados("\nDigite o genero da obra: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome do gênero\n");
									}
								} while (!verificado);
					
								// Atributos individuais (da propria classe)
								verificado = false;

								do {
									try {
										l.setNumPaginas(Integer.parseInt(read.entDados("\nDigite o numero de paginas: ")));
										verificado = true;
									}
									catch(ValorMinException exv) {
										System.out.println("\nErro: o valor deve ser maior que 0\n");
									}
									catch(NumberFormatException nfex) {
										System.out.println("\nErro: o numero de paginas deve ser um valor numerico\n");
									}
								} while(!verificado);
	
								verificado = false;
					
								do {
									try {					
										l.setEditora(read.entDados("\nDigite o nome da editora: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome da editora\n");
									}
								} while (!verificado);

								livros.add(l);
	
								// Mensagem
								l.apresentacao();

							break; 

							case 2:
								Filme f = new Filme();

								verificado = false;

								do {
									try {
										// Atributos herdados
										f.setTitulo(read.entDados("\nDigite o titulo da obra: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o titulo\n");
									}
								} while (!verificado);

								verificado = false;
	
								do {
									try {
										f.setAnoLancamento(Integer.parseInt(read.entDados("\nDigite o ano de lancamento: ")));
										verificado = true;
									}
									catch(ValorMinException exv) {
										System.out.println("\nErro: o valor deve ser maior que 0\n");
									}
									catch(NumberFormatException nfex) {
										System.out.println("\nErro: o ano de lancamento deve ser um valor numerico\n");
									}
								} while (!verificado);

								verificado = false;
					
								do {
									try {
										f.getAut().setNome(read.entDados("\nDigite o nome do autor: "));			// Reflexividade
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome do autor\n");
									}
								} while (!verificado);

								verificado = false;
	
								do {
									try {
										f.getAut().setNacionalidade(read.entDados("\nDigite a nacionalidade do autor da obra: "));	// Reflexividade
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite a nacionalidade do autor\n");
									}
								} while (!verificado);

								verificado = false;

								do {
									try {
										f.setGenero(read.entDados("\nDigite o genero da obra: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome do genero\n");
									}
								} while(!verificado);

								// Atributos individuais (da propria classe)
								verificado = false;

								do {
									try {
										f.setDuracao(read.entDados("\nDigite a duracao do filme (formato HH:MM:SS): "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: a duracao deve estar no formato HH:MM:SS\n");
									}
								} while(!verificado);

								verificado = false;

								do {
									try {
										f.setDiretor(read.entDados("\nDigite o nome do diretor: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome do diretor\n");
									}
								} while (!verificado);

								filmes.add(f);

								// Mensagem
								f.apresentacao();

							break;

							case 3:
								Serie s = new Serie();

								verificado = false;

								do {
									try {
										// Atributos herdados
										s.setTitulo(read.entDados("Digite o titulo da obra: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o titulo\n");
									}
								} while(!verificado);

								verificado = false;
					
								do {
									try {
										s.setAnoLancamento(Integer.parseInt(read.entDados("\nDigite o ano de lancamento: ")));
										verificado = true;
									}
									catch(ValorMinException exv) {
										System.out.println("\nErro: o valor deve ser maior que 0\n");
									}
									catch(NumberFormatException nfex) {
										System.out.println("\nErro: o ano de lancamento deve ser um valor numerico\n");
									}
								} while(!verificado);

								verificado = false;

								do {
									try {
										s.getAut().setNome(read.entDados("\nDigite o nome do autor: "));			// Reflexividade
										verificado = true;
									}
									catch(EntradaStrException str) {
										System.out.println("\nErro: digite o nome do autor\n");
									}
								} while(!verificado);

								verificado = false;
	
								do {
									try {
										s.getAut().setNacionalidade(read.entDados("\nDigite a nacionalidade do autor da obra: "));	// Reflexividade
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite a nacionalidade do autor\n");
									}
								} while (!verificado);

								verificado = false;

								do {
									try {
										s.setGenero(read.entDados("\nDigite o genero da obra: "));
										verificado = true;
									}
									catch(EntradaStrException estr) {
										System.out.println("\nErro: digite o nome do genero\n");
									}
								} while (!verificado);
					
								// Atributos individuais (da propria classe)
								verificado = false;

								do {
									try {
										s.setNumTemporadas(Integer.parseInt(read.entDados("\nDigite o numero de temporadas: ")));
										verificado = true;
									}
									catch(ValorMinException exv) {
										System.out.println("\nErro: o valor deve ser maior que 0\n");
									}
									catch(NumberFormatException nfex) {
										System.out.println("\nErro: o numero de temporadas deve ser um valor numerico\n");
									}
								} while (!verificado);

								verificado = false;

								do {
									try {
										s.setTotalEpisodios(Integer.parseInt(read.entDados("\nDigite o numero total de episodios: ")));
										verificado = true;
									}
									catch(ValorMinException exv) {
										System.out.println("\nErro: o valor deve ser maior que 0\n");
									}
									catch(NumberFormatException nfex) {
										System.out.println("\nErro: o numero de total de episodios deve ser um valor numerico\n");
									}
								} while (!verificado); 

								series.add(s);
	
								// Mensagem
								s.apresentacao();
	
							break;
	
						}
	
					verificado = false;
					do {
						try {
							resp = read.entDados("\n\n\tDeseja cadastrar mais alguma obra desse mesmo genero (S/N): ");
							if (resp.equals("s") || resp.equals("S") || resp.equals("n") || resp.equals("N")) {
								verificado = true;
							}
							else {
								throw new VerificaOpcaoException();
							}
						}
						catch(VerificaOpcaoException vop) {
							System.out.println("Erro: digite 's' ou 'S' para 'sim' e 'n' ou 'N' para 'nao'");
						}
					} while (!verificado);
		
				} while (resp.equals("S") || resp.equals("s"));

				break; // fim do case 1 (cadastrar obra)
		
				case 2:
					System.out.println("\n\n\t\t============== LISTA DE CADASTROS ==============\n");
					if (livros.isEmpty()) {
						System.out.println("\n\nNenhum livro foi cadastrado ainda\n\n");
					}
					else {
						for (int i = 0; i < livros.size(); i++) {
							Livro l = livros.get(i);
							l.setMsg("LIVRO");
							l.apresentacao(l.getMsg());
							l.exibirInfo();
							System.out.println();
						}
					}

					if (filmes.isEmpty()) {
						System.out.println("\n\nNenhum filme foi cadastrado ainda\n\n");
					}
					else {
						for (int i = 0; i < filmes.size(); i++) {
							Filme f = filmes.get(i);
							f.setMsg("FILME");
							f.apresentacao(f.getMsg());
							f.exibirInfo();
							System.out.println();
						}
					}

					if (series.isEmpty()) {
						System.out.println("\n\nNenhuma serie foi cadastrada ainda\n\n");
					}
					else {
						for (int i = 0; i < series.size(); i++) {
							Serie s = series.get(i);
							s.setMsg("SERIE");
							s.apresentacao(s.getMsg());
							s.exibirInfo();
							System.out.println();
						}
					}
				break;
				
				case 3:
					System.out.println("\n\t\t** PROGRAMA ENCERRADO **\n");
				break;

			}
		} while (opcaoInicial != 3);
	}
}