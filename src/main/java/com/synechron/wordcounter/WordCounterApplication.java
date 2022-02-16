package com.synechron.wordcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.synechron.wordcounter")
public class WordCounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordCounterApplication.class, args);
	}

}
