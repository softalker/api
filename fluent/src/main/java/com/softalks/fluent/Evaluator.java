package com.softalks.fluent;

public interface Evaluator<T> {

	T evaluate(Provided parameters) throws Exception;
	
}
