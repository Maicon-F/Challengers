package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChainValidator chainValidator = new ChainValidator();
		List<Node> twoDigitNumberNodes = new ArrayList<>();
		twoDigitNumberNodes.add(new TwoDigitNumberNode(36));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(6));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(24));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(4));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(47));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(7));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(2));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(3));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(27));
		twoDigitNumberNodes.add(new TwoDigitNumberNode(91));

		boolean validationOfStrings = chainValidator.validate(twoDigitNumberNodes);
		if (validationOfStrings == true) {
			System.out.println("\" Number Chain: This must be a valid number sequence.\"");
		} else {
			System.out.println("\" Number Chain: This must be a invalid number sequence.\"");
		}

		ChainValidator chainValidatorOfNumbers = new ChainValidator();
		List<Node> azNodes = new ArrayList<>();
		azNodes.add(new AZNode("p"));
		azNodes.add(new AZNode("aba"));
		azNodes.add(new AZNode("a"));
		azNodes.add(new AZNode("b"));
		azNodes.add(new AZNode("perso"));
		azNodes.add(new AZNode("o"));
		azNodes.add(new AZNode("r"));
		azNodes.add(new AZNode("e"));
		azNodes.add(new AZNode("s"));

		boolean validationOfNumbers = chainValidatorOfNumbers.validate(azNodes);
		if (validationOfNumbers == true) {
			System.out.println("\" String Chain: This must be a valid sequence of characters.\"");
		} else {
			System.out.println("\" String Chain: This must be a invalid sequence of characters.\"");
		}

	}
}