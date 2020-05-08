package com.holded.api;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.FileBasedBuilderParameters;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class Configurations {

	private static final String ENDPOINT_FILE = "endpoint.properties";
	private static final String APIKEY_FILE = "apikey.properties";
	private static final String ENDPOINT_KEY = "url";
	private static final String APIKEY_KEY = "key";
	private static final Configuration endpointConfiguration = getConfiguration(ENDPOINT_FILE);
	private static final Configuration apiKeyConfiguration = getConfiguration(APIKEY_FILE);
	
	public static String getEndpoint() {
		return endpointConfiguration.getString(ENDPOINT_KEY);
	}
	
	public static String getApiKey() {
		return apiKeyConfiguration.getString(APIKEY_KEY);
	}
	
	private static Configuration getConfiguration(String pathname) {
		
		Configuration configuration = null;
		
		try {
			File propertiesFile = new File(pathname);
			FileBasedBuilderParameters parameters = new Parameters().fileBased().setFile(propertiesFile);
			FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
					new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
							.configure(parameters);
		    configuration = builder.getConfiguration();
		} catch(ConfigurationException e) {
		    // TODO Log error.
			e.printStackTrace();
		}
		
		return configuration;
	}
}
