package br.com.check.lab;

import br.com.check.lab.service.InicializarDadosTeste;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CheckLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckLabApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(InicializarDadosTeste initDataLoaderService) {
		return args -> {
			initDataLoaderService.inicializar();
		};
	}

}
