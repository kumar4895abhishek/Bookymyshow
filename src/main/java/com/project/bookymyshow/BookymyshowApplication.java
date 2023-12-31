package com.project.bookymyshow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
// Adjust the package path to where your entities are located
public class BookymyshowApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(BookymyshowApplication.class, args);
		System.out.println("SB APPLN");
	}

}
