package de.tu_bs.cs.isf.e4cf.parser.antlr.test;

import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import de.tu_bs.cs.isf.e4cf.parser.antlr.grammar_check.GrammarCheckController;

class AntlrPluginTest {

	@Mock
	private Parser parser;

	@Mock
	private Lexer lexer;
	
	private GrammarCheckController<Lexer, Parser> controller;
	
	@BeforeEach
	void setUp() throws Exception {
	       MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		controller = new GrammarCheckController<Lexer, Parser>(lexer, parser);
		
		List<Token> tokens =  controller.compileTokens("");
		
		Assertions.assertTrue(tokens.isEmpty());
	}

}
