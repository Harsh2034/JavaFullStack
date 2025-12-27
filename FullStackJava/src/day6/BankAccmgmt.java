package day6;
import java.util.*;
public class BankAccmgmt {
	public static void main(String[] args) {
		Map<Integer,String> account =new HashMap<>();
		account.put(1000,"spyrec");
		account.put(2000, "Ayushi");
		account.put(3000, "Parjwala");
		System.out.println("Account Details: ");
		for(Map.Entry<Integer, String> e: account.entrySet()) {
			System.out.println("Account No: "+e.getKey()+"Name:"+e.getValue());
		}
		System.out.println("\n Account Holder Name for 1000 :"+account.get(1000));
	}

}
