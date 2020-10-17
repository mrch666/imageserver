package ru.insnstrumentstore.imageserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import ru.insnstrumentstore.imageserver.controllers.StorageProperties;
import ru.insnstrumentstore.imageserver.repo.StorageService;

@EnableConfigurationProperties(StorageProperties.class)
@SpringBootApplication
public class ImageserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageserverApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
//			storageService.deleteAll();
			storageService.init();
		};
	}
}
