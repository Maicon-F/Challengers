package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class TwoDigitNumberNode implements Node {
	
	  private List<Character> chars = new ArrayList<>();;

	    public TwoDigitNumberNode(Integer  twoDigitNumber){
	        if(twoDigitNumber == null || twoDigitNumber > 99 || twoDigitNumber < 0){
	            throw new IllegalArgumentException("This node must only containing from 0-99 numbers");
	        }
	        for(char ch : String.valueOf(twoDigitNumber).toCharArray()){
	            chars.add(Character.valueOf(ch));
	        }
	    }


	    @Override
	    public List<Character> getChars() {
	        return chars;
	    }
	

}
