package com.samples.restclient;

import com.samples.restclient.services.JokeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith({SpringExtension.class})
public class JokeServiceTest {

	private Logger logger = LoggerFactory.getLogger(JokeServiceTest.class);
	@Autowired
	private JokeService service;

	public JokeServiceTest() {
	}

	@Test
	void getJoke() {
		String joke = this.service.getJoke("Craig", "Walls");
		this.logger.info(joke);
		Assertions.assertTrue(joke.contains("Craig") || joke.contains("Walls"));
	}
}