package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.169" , "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server0.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.58" , "Kali Linux", "16 GB", "Dell Tower", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.21" , "MS 2608", "32 GB", "Web Server", "http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.14" , "Red Hat Enterprise Linux", "64 GB", "Mail Server", "http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
		};
	}

}


