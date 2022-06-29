package com.cg.demos;

public class AddCharacters {
	public char splitAddAndReturnCharacter(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum+=(str.charAt(i)-'a'+1);
		}
		if(sum%26==0) {
			return 'z';
		}else {
			sum=sum%26;
			return(char)('a'+sum-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
