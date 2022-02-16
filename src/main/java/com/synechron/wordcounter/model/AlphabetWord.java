package com.synechron.wordcounter.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;

public class AlphabetWord {

	@NotNull
	@Pattern(regexp = "^[A-Za-z]+$", flags = Flag.UNICODE_CASE)
	private String englishWord;

	public AlphabetWord() {

	}

	public AlphabetWord(String word) {
		this.englishWord = word;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public void setEnglishWord(String englishWord) {
		this.englishWord = englishWord;
	}
}
