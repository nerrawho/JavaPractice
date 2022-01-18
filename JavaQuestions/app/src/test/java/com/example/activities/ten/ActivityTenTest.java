package com.example.activities.ten;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class ActivityTenTest {

    CollectionsActivity ca = new CollectionsActivity();

    @Test
    public void returnPalidromesTest1(){
        ArrayList<String> words = new ArrayList<>();
        words.add("redivider");
        words.add("ha");
        words.add("he");
        words.add("racecar");
        words.add("civic");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("redivider");
        expected.add("racecar");
        expected.add("civic");

        List<String> test = ca.returnPalindromes(words);

        assertTrue(test.equals(expected));
    }

    @Test
    public void returnPalindromesTest2(){
        ArrayList<String> words = new ArrayList<>();
        words.add("ha");
        words.add("he");

        ArrayList<String> expected = new ArrayList<>();

        List<String> test = ca.returnPalindromes(words);

        assertTrue(test.equals(expected));
    }

    @Test
    public void palindromeMapTest(){
        List<String> words = new ArrayList<>();
        words.add("redivider");
        words.add("ha");
        words.add("he");
        words.add("racecar");
        words.add("civic");

        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("redivider", 0);
        expected.put("racecar", 3);
        expected.put("civic", 4);

        Map<String, Integer> test = ca.palindromeMap(words);

        assertTrue(test.equals(expected));
    }

    @Test
    public void iteratorTest1(){
        List<Integer> numberList = new ArrayList<>();
        for(int i=0; i<30; i++){
            numberList.add(i+1);
        }

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(10);
        expected.add(15);
        expected.add(20);
        expected.add(25);
        expected.add(30);

        List<Integer> test = ca.iteratorFun(numberList);
    }
}
