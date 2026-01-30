package com.tracebox;

import org.springframework.boot.SpringApplication;

public class TestTraceboxApplication {

	public static void main(String[] args) {
		SpringApplication.from(TraceboxApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
