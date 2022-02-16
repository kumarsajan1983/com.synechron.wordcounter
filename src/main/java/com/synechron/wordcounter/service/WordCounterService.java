package com.synechron.wordcounter.service;

import org.springframework.stereotype.Service;

import com.synechron.wordcounter.model.AlphabetWord;

@Service
public interface WordCounterService {

	int getWordCount(String word);

	String addWord(AlphabetWord alphabetWord);
}
