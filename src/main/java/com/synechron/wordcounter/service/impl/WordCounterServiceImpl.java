package com.synechron.wordcounter.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.synechron.wordcounter.library.outside.TranslateToEnglish;
import com.synechron.wordcounter.model.AlphabetWord;
import com.synechron.wordcounter.service.WordCounterService;
import com.synechron.wordcounter.storage.WordStorage;

/**
 * 
 * @author ksajan
 *
 */
@Service
public class WordCounterServiceImpl implements WordCounterService {

	private WordStorage wordStorage = WordStorage.getInstance();
	private TranslateToEnglish translator = TranslateToEnglish.getInstance();

	@Override
	public int getWordCount(String word) {
		// Business logic to get the word count

		Integer value = wordStorage.getWordToCountMap().get(word);
		int result = value == null ? 0 : value;
		return result;
	}

	@Override
	public String addWord(AlphabetWord alphabetWord) {
		// Business logic to add the word into storage
		// If word is new then add new entry into the storage map with count 1
		// If word already exists than increase the count

		// Translate the word into English, Google Translator
		String englishWord = translator.translate(alphabetWord.getEnglishWord());

		Map<String, Integer> wordToCount = wordStorage.getWordToCountMap();

		if (wordToCount.containsKey(englishWord)) {
			int oldWordCount = wordStorage.getWordToCountMap().get(englishWord);
			int newWordCount = oldWordCount + 1;
			wordToCount.put(englishWord, newWordCount);
		} else {
			wordToCount.put(englishWord, 1);
		}

		return "Successfully added";
	}

}
