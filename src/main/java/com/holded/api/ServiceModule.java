package com.holded.api;

import com.google.inject.AbstractModule;
import com.holded.api.invoicing.v1.documents.DocumentsService;
import com.holded.api.invoicing.v1.documents.DocumentsServiceImpl;

public class ServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DocumentsService.class).to(DocumentsServiceImpl.class).asEagerSingleton();
	}
}
