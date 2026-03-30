/**

        * File: Lesson 3.3 - else if

        * Author: Nithin.A

        * Date Created: March 29, 2026

        * Date Last Modified: March 30, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String evenOrOdd(int num) {
		if (0 == num){
			return "Zero";
		}
		else if (0 == num%2){
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	public static String positiveOrNegative(int num){
		if (num>0){
			return "Positive";
		}
		else if (num<0){
			return "Negative";
		}
		else{
			return "Zero";
		}
	}

	public static String pluralize(String word){
		word = word.toLowerCase();
		if (0 < word.lastIndexOf("ey")) {
			return "eys";
		}
		else if (0 < word.lastIndexOf("y")){
			return "ies";
		}
		else if (0 < word.lastIndexOf("ife")){
			return "ives";
		}
		return "s";
	}

	

	

}
