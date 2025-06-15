package com.cicd.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {

	int a;
	int b;
	CalculatorController obj;

	@BeforeEach
	void init() {
		obj = new CalculatorController();
		a = 10;
		b = 5;
	}

	@Test
	void additionTest() {

		assertEquals(15, obj.addition(a, b));
	}

	void substractionTest() {

		assertEquals(5, obj.substraction(a, b));

	}

}
