package com.epam.Java8LamdasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  Check If The List Of Strings Are Palindrome Or Not 
 */
public class CheckPalindrome
{
	public static boolean isPalindrome(String inputexample) {
		StringBuilder reversetoString = new StringBuilder(inputexample).reverse();
	    return (reversetoString.toString()).equals(inputexample);
	}
	public static List<String> palindromeStrings(List<String> examples){
		List<String> palindromeStrings = (List<String>) examples.stream()
				  .filter(string -> isPalindrome(string)).collect(Collectors.toList());
		return palindromeStrings;
	}
	public static void main(String[] args) {
		List<String> examples = Arrays.asList("praneeth","Sushmitha","madam","abcdcba","Rasmani","heyThere","sfeboiwebeft","fejoabf");
		List<String> palindromeStrings = palindromeStrings(examples);
		System.out.println(palindromeStrings);
	}
}
