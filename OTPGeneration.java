import java.math.*;
import java.util.Scanner;
public class OTPGeneration{

public static void main(String[] args){	
String allNumbers = "0123456789";
int indexSize = allNumbers.length()-1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of digit for OTP");
int OTPDigits = sc.nextInt();
StringBuilder sb = new StringBuilder();
// write a logic to randomly pick the number without any patter and form 6 digit code

for(int i = 0; i<OTPDigits;i++){
int randomIndex = (int)(Math.random()*indexSize);
char value = allNumbers.charAt(randomIndex);
sb.append(value);
}
System.out.println(sb.toString());
}
}
