package com.archillec.mmg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@MapperScan("com.archillec.mmg.mapper")
public class MmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmgApplication.class, args);
	}

}
