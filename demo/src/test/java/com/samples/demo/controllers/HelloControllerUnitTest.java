package com.samples.demo.controllers;

import com.samples.demo.controllers.HelloController;
import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.assertEquals;

public class HelloControllerUnitTest {

	@Test
	public void sayHello() {
		HelloController controller = new HelloController();
		Model model = new BindingAwareModelMap();
		String result = controller.sayHello("World", model);
		assertEquals("hello", result);
		assertEquals("World", model.asMap().get("user"));
	}
}
