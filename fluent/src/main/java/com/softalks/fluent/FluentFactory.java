package com.softalks.fluent;

public interface FluentFactory {

	<T> T getExpression(Class<T> api, Evaluator<?> implementation);
	
	<T> T getStatement(Class<T> api, Interpreter implementation);
	
}
