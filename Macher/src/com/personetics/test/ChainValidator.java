package com.personetics.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChainValidator {
	
	 private Set<Character> singleChars;
	    private Set<Character> toValidateChars;

	    boolean validate(List<Node> nodes) {
	        if(nodes == null){
	            return  true;
	        }
	        // In case someone wants to run it twice and avoid passing too many parameters as args
	        this.singleChars = new HashSet<>();
	        this.toValidateChars = new HashSet<>();

	        this.loadCharSets(nodes);
	        return this.validateChars();
	    }

	    private void loadCharSets(List<Node> nodes){
	        for (Node node: nodes) {
	            if(node == null || node.getChars() == null){
	                continue;
	            }
	            if(node.getChars().size()>1){
	                this.toValidateChars.addAll(node.getChars());
	            }else{
	                this.singleChars.addAll(node.getChars());
	            }
	        }

	    }

	    private boolean validateChars(){
	        for(Character value: toValidateChars){
	            if(!singleChars.contains(value)){
	                return false;
	            }
	        }
	        return true;
	    }
	
}
