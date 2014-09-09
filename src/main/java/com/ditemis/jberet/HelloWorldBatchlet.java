package com.ditemis.jberet;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;

public class HelloWorldBatchlet extends AbstractBatchlet {
	@Inject
	StepContext stepContext;

	@Override
	public String process() {
		String say = stepContext.getProperties().getProperty("say");
		System.out.println(say);
		return "COMPLETED";
	}
}
