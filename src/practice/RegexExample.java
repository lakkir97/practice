package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	
	public static void main(String []args){
		String regex = args[0];
		String content = args[1];
		
		if(!RegexUtil.isRegex(regex)){
			System.err.println("Invalid Input:"+regex);
			
			return;
		}
		
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(content);
		
		System.out.println("Group 1:"+mat.group(1));
	}
}
