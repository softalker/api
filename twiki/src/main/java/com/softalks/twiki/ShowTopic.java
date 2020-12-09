package com.softalks.twiki;

public interface ShowTopic extends Parameterizable {

	interface IfNotExists {
		
		AsChildOf createItUsingTemplate(String templateName);

		interface AsChildOf extends Parameterizable {
			Parameterizable asChildOf(String parentDocument);
		}
		
	}

	IfNotExists ifNotExists();
	
}
