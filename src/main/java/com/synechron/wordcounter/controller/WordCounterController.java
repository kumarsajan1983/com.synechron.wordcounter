package com.synechron.wordcounter.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.wordcounter.model.AlphabetWord;
import com.synechron.wordcounter.service.WordCounterService;

@RestController
@Validated
public class WordCounterController {

	@Autowired(required = true)
	private WordCounterService wordCounterService;

	@GetMapping("/word-count/{word}")
	int getWordCount(@PathVariable String word) {

		return wordCounterService.getWordCount(word);
	}

//	@PostMapping("/word-add")
	@PostMapping(path = "/word-add", consumes = "application/json", produces = "application/json")
	public String addWord(@Valid @RequestBody AlphabetWord request) {
		System.out.println("WordCounterController.class - Called [addWord]");

		return wordCounterService.addWord(request);
	}

}
