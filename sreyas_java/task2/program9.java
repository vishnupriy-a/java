import java.util.*;
public class program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1 :");
		String s1=sc.next();
		System.out.println();
		System.out.println("enter the string2 :");
		String s2=sc.next();
		System.out.println();
		if(s1.compareTo(s2)>0){
			System.out.println(s2+ "is greater");
		}
		else if(s1.compareTo(s2)==0){
			System.out.println(s1+"and"+s2+ "are equal");
		}
		else{
			System.out.println(s2+ "is greater");
		}
		System.out.println();
		System.out.println(s1.concat(s2));
		System.out.println();
		String s3= "Hello Everyone"; 
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.length());
        System.out.println(s3.replace("y", "i"));
        System.out.println(s3.charAt(3));
}
}	 
				

