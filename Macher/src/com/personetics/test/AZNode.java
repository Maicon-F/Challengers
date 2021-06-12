package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class AZNode implements Node {

    private List<Character> chars = new ArrayList<>();

    public AZNode(String azAZString){
        if(azAZString == null || !azAZString.matches("[a-z]+")){
            throw new IllegalArgumentException("This node must only containing from a-z characters");
        }
        for(char ch : azAZString.toCharArray()){
            chars.add(Character.valueOf(ch));
        }
    }


    @Override
    public List<Character> getChars() {
        return chars;
    }
}
