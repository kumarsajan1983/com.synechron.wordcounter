package com.synechron.wordcounter.library.outside;

/**
 * 
 * Outside API library. Tried: <!--
 * https://mvnrepository.com/artifact/com.google.api/google-api-translate-java
 * -->
 * 
 * @author ksajan
 *
 */
public class TranslateToEnglish {

	private static TranslateToEnglish instance;

	private TranslateToEnglish() {
	}

	public static TranslateToEnglish getInstance() {
		if (instance == null) {
			synchronized (TranslateToEnglish.class) {
				if (instance == null) {
					instance = new TranslateToEnglish();
				}
			}
		}
		return instance;
	}

	public String translate(String word) {
		// TODO - use external libarry or an API or a service to translate the given
		// word into
		// english

		String result = word; // Process and return the result

		return result;
	}
}
