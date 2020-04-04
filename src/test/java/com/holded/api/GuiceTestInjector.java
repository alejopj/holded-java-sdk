package com.holded.api;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTestInjector {

	private static Injector injector = Guice.createInjector(new ServiceModule());
	
	public static Injector getInstance() {
		return injector;
	}
}
