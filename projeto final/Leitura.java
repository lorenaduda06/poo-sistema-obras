import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {
	public String entDados(String input) {
		System.out.println(input);

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader ent = new BufferedReader(entrada);

		String inp = "";

		try {
			inp = ent.readLine();
		}
		catch(IOException e) {
			System.out.println("\nErro: entrada incorreta\n");
		}

		return inp;
	}
}