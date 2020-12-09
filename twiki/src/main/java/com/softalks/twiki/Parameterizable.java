package com.softalks.twiki;

import java.util.Map;
import java.util.function.Consumer;

import com.softalks.fluent.Alias;
import com.softalks.fluent.Terminal;

public interface Parameterizable {

	@Terminal
	@Alias("parameters")
	<T> T using(Consumer<Map<Object, Object>> using);
	
	@Terminal
	<T> T asIs();

}
