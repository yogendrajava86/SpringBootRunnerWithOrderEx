package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is App Runner and implement Ordered Interface, and use override getOrder method, set return 2. Order is 2nd.");

	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

}
