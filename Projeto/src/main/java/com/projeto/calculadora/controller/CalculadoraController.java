package com.projeto.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/adicao")
	public double adicao(@RequestParam double num1, @RequestParam double num2) {
		return num1 + num2;
	}

	@GetMapping("/subtracao")
	public double subtracao(@RequestParam double num1, @RequestParam double num2) {
		return num1 - num2;
	}

	@GetMapping("/multiplicacao")
	public double multiplicacao(@RequestParam double num1, @RequestParam double num2) {
		return num1 * num2;
	}

	@GetMapping("/divisao")
	public double divisao(@RequestParam double num1, @RequestParam double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Não é possível dividir por zero.");
		}
		return num1 / num2;
	}
}
