package String_Programs;

import java.util.Scanner;

public class replacing_space_with_ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string.");
		String s=sc.nextLine();
				s=s.replace(' ', '_');
		
    System.out.println(s);
    // or we can use another in built method as s=s.replaceAll(' ','-');
    //        str1 = str1.replaceAll("\\s+", "");-This will remove all the white spaces    

	}

}
