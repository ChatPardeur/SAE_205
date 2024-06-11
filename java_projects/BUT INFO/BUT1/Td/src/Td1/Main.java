package Td1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ligne;
		Scanner entree=new Scanner(System.in);
		
		System.out.println("tapez une ligne");
		ligne = entree.next();


		
		int len = ligne.length();
		StringBuffer ligne_modif = new StringBuffer(ligne);
		
		for(int i = 0; i < len; i++)
		{
			char c = ligne_modif.charAt(i);
			int code = (int)(c+2);
			if (c == 'z')
			{
				code = 'b';
			}
			else if (c == 'y')
			{
				code = 'a';
			}
			c = (char)code;
			ligne_modif.setCharAt(i, c);
		}
		
		System.out.println(ligne_modif);
		
		
		/*
		int i = 0;
		int len = ligne.length();
		char[] tab_ligne = new char[len];
		tab_ligne = ligne.toCharArray();
		
		boolean palindrome = true;
		while (palindrome && i < len/2)
		{
			if (tab_ligne[i] != tab_ligne[len-i-1])
			{
				palindrome = false;
			}
			i++;
		}
		
		if (palindrome)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("pas palindrome");
		}*/
	}
}

