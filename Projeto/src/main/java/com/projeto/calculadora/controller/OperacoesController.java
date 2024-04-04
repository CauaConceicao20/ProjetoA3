package com.projeto.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacao")
public class OperacoesController {
	
	public int soma(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}
	
	public int subtracao(@RequestParam int a, @RequestParam int b) {
		return a - b;
	}

	public int divisao(@RequestParam int a, @RequestParam int b) {
		return a / b;
	}

	public int multiplicacao(@RequestParam int a, @RequestParam int b) {
		return a * b;
	}

	public double restoDeDivisao(@RequestParam int a, @RequestParam int b) {
		return a % b;
	}

}
