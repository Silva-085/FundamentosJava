package fundamentos;

public class conversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		
		 double a = 1;
		 System.out.println(a);
		 
		 float b = (float) 1.494995999; //explicita (CASTD)
		 System.out.println(b);
		 
		 int c= 127;
		 byte d = (byte) c; //explicita (CAST)
		 System.out.println(d);
		 
		 double e = 1.9999999;
		 int f = (int) e;
		 System.out.println(f);
		 
		 byte j = 12;
		 int x = j; //explicito (CAST)
		 System.out.println(x);
	}
}
