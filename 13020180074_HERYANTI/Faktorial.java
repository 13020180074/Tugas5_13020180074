import java.util.Scanner;

public class Faktorial {

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
		
		
System.out.print("Masukan bilangan bulat (n) : ");
		
int n = scan.nextInt();
		
		
int i = 1;
		
long hasil = 1;
		
while (i <= n) {
			
hasil = hasil * i;
			
i = i + 1;
		
}
		
System.out.println(n+"! = "+hasil);
		
scan.close();
	
}

}