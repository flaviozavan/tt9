package io.github.sspanak.tt9.languages.definitions;

import java.util.Arrays;
import java.util.Locale;

import io.github.sspanak.tt9.R;

public class Dutch extends English {
	public Dutch() {
		super();

		name = "Nederlands";
		locale = new Locale("nl","NL");
		dictionaryFile = "nl-utf8.csv";
		icon = R.drawable.ime_lang_nl;

		isPunctuationPartOfWords = true;

		characterMap.get(2).addAll(Arrays.asList("à", "ä", "ç"));
		characterMap.get(3).addAll(Arrays.asList("é", "è", "ê", "ë"));
		characterMap.get(4).addAll(Arrays.asList("î", "ï"));
		characterMap.get(6).add("ö");
		characterMap.get(8).addAll(Arrays.asList("û", "ü"));
	}
}
