package com.MyBanque.MyBanque;

import com.MyBanque.MyBanque.Enums.TypeCompte;
import com.MyBanque.MyBanque.Repositories.CompteRepository;
import com.MyBanque.MyBanque.entities.Compte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MyBanqueApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyBanqueApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null, Math.random()*9000 , new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, Math.random()*9000 , new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, Math.random()*9000 , new Date(), TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}

}
