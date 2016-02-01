package com.bigfoot.rundev.web;

import org.springframework.ui.ModelMap;

public abstract class ABaseModel {
	
	public abstract void reset();
	
	public abstract String getKey();

	public void retrieveOrCreate(ModelMap model) {
		ABaseModel instanceModel;
		if (model.containsKey(getKey())) {
			instanceModel = (ABaseModel)model.get(getKey());
		} else {
			instanceModel = this;
		}
		model.put(getKey(), instanceModel); 
	}
}
