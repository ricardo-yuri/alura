package br.com.alura.screenmatch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.principal.Principal;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();
		
		// ConsumoApi consumoApi = new ConsumoApi();
		// String json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		// ConverteDados conversor = new ConverteDados();
		// DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		// System.out.println(dados);
		// json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
		// DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		// System.out.println(dadosEpisodio);

		// List<DadosTemporada> temporadas = new ArrayList<>();

		// for (int i = 1; i <= dados.totalTemporadas(); i++) {
        //     json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6585022c");
		// 	 DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
		// 	 temporadas.add(dadosTemporada);
		// }

		// temporadas.forEach(System.out::println);

		// System.out.println("RICARDO " + 12 % 2);
	}
}