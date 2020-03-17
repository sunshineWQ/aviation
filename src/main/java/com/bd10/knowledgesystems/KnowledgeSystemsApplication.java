package com.bd10.knowledgesystems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.bd10.knowledgesystems.dao")
@EnableSwagger2
public class KnowledgeSystemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowledgeSystemsApplication.class, args);
	}

}
