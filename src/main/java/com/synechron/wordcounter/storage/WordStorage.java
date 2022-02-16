package com.synechron.wordcounter.storage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Storage singleton class, in real time storage will be replaced by some
 * database / files etc.
 * 
 * @author ksajan
 *
 */
public class WordStorage {

	private static WordStorage instance;
	private static Map<String, Integer> wordToCountMap;

	private WordStorage() {

	}

	public static WordStorage getInstance() {
		if (instance == null) {
			synchronized (WordStorage.class) {
				if (instance == null) {
					instance = new WordStorage();
					wordToCountMap = new ConcurrentHashMap<>();
				}
			}
		}
		return instance;
	}

	public Map<String, Integer> getWordToCountMap() {
		return wordToCountMap;
	}
}
