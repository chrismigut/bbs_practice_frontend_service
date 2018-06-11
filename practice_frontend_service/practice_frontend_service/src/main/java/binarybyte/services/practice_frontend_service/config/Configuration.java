package binarybyte.services.practice_frontend_service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("frontend-service")
public class Configuration {

	private String backendServiceUrl;

	public String getBackendServiceUrl() {
		return backendServiceUrl;
	}

	public void setBackendServiceUrl(String backendServiceUrl) {
		this.backendServiceUrl = backendServiceUrl;
	}

}
