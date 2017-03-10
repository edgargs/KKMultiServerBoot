package com.gs.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@SpringBootApplication
class Application {
	
	
	static KKConfig kkConfig;

	@Autowired
	void setConfig(KKConfig kkConfig){
		this.kkConfig = kkConfig 
	}

	static main(args) {
		SpringApplication.run(Application.class, args)

		KKMultiServer.main(kkConfig.port)
	}
}

@Component
@ConfigurationProperties("kkserver")
class KKConfig {

    String port
}