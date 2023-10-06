package com.example;

import com.example.daos.CandidateDao;
import com.example.entity.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import java.util.UUID;

@SpringBootApplication
public class ThltwwwWeek4Application {

	@Autowired
	private CandidateDao candidateDao;
	public static void main(String[] args) {
		SpringApplication.run(ThltwwwWeek4Application.class, args);
	}

	@Bean
	public CommandLineRunner ex1 () {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				candidateDao.getAll().forEach(System.out::println);

			}
		};
	}


}
