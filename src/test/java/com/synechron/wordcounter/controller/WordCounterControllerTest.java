package com.synechron.wordcounter.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.synechron.wordcounter.model.AlphabetWord;
import com.synechron.wordcounter.service.WordCounterService;

public class WordCounterControllerTest {

	@InjectMocks
	private WordCounterController subject;

	@Mock
	private WordCounterService mockWordCounterService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testCountZero() {
		int expected = 0;
		when(mockWordCounterService.getWordCount("Hello")).thenReturn(expected);
		int actual = subject.getWordCount("Hello");
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void testAddWord() {
		String expected = "Successfully added";
		AlphabetWord aWord = new AlphabetWord("AnotherWord");
		when(mockWordCounterService.addWord(aWord)).thenReturn(expected);
		String actual = subject.addWord(aWord);
		Assertions.assertEquals(expected, actual);
	}
}
