package com.softalks.text;

import java.util.function.Function;
import java.util.function.Supplier;

public interface Text {
	
	interface Join extends Replaceable, Delimited {}
	
	interface Replaceable extends Supplier<String> {
		Delimited replacing(Function<String, String> replace);
	}
	
	interface Delimited extends Supplier<String> {
		Supplier<String> delimitedBy(String separator);
	}

	String replace(String source, String separator, int position, String substitution);

	Join join(String[] tokens);

	String replaceLast(String source, String separator, String substitution);

	String replaceLast(String source, char separator, String substitution);

	String replace(String names, String string, Function<String, String> transformation);

	Delimited repeat(int length, char c);
	
}
