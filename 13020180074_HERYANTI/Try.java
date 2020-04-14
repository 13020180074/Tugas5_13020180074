/**
*
* @author Eggs
*/
	public class Try {

	public static void main(String[] args) {
		try
		{
			int a=1/0;
			System.out.println("perintah selanjutnya");
		}
		catch (Exception kesalahan)
		{
			System.out.println(kesalahan) ;
		}
	}
}