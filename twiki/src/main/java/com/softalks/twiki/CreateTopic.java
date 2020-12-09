package com.softalks.twiki;

import com.softalks.fluent.Alias;

public interface CreateTopic {

	@Alias("parent")
	FromTemplate asChildOf(String parentTopicName);
	
	@Alias("template")
	AndForm fromTemplate(String templateName);

	interface FromTemplate extends Parameterizable {
		@Alias("template")
		AndForm fromTemplate(String templateName);	
	}
	
	interface AndForm extends Parameterizable {
		@Alias("form")
		Parameterizable withForm(String formName);	
	}
	
}