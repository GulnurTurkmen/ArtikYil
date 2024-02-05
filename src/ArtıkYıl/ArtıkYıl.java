package ArtıkYıl;
import java.util.Scanner;
public class ArtıkYıl {
	public static void main(String[]args) {
		int yil;
		Scanner inp = new Scanner(System.in);
		System.out.print("yıl giriniz:");
		yil = inp.nextInt();
		if(yil<400) {
		 if(yil%4==0) {
			 System.out.print(yil+" bir artık yildir");
		}else {
			 System.out.print(yil+" bir artık yil değildir!");
		}}
		else{
			 if(yil%400==0) {
				 System.out.print(yil+" bir artık yildir"); 
		 }else {
			 System.out.print(yil+" bir artık yil değildir!");
		}}
	}
}


