package model;

public class Karatsuba {
	public Karatsuba() {
		
	}
	
	
	public long operation(String number1, String number2) {
		
		if(number1.length()==1 && number2.length()==1) {
			return Long.parseLong(number1)*Long.parseLong(number2);
		}else if(number1.equals("") || number2.equals("")) {
			return 0;
		}else {
			int midNumber1 = number1.length()/2;
			int midNumber2 = number2.length()/2;
			
			String a = number1.substring(0, midNumber1);
			String b = number1.substring(midNumber1);
			String c = number2.substring(0, midNumber2);
			String d = number2.substring(midNumber2);
			
			
			long step1 = operation(a,c);
			long step2 = operation(b,d);
			long step3 = operation(a,d) + operation(b,c) ;
			
			long x1 = (long) Math.pow(10,((number1.length()>=number2.length())? number1.length():number2.length()));
			long y2 = (long) Math.pow(10,((number1.length()>=number2.length())? number1.length()/2:number2.length()/2));
			
			return x1*(step1)+y2*(step3)+step2;
			
		}
		
	}
	
	public static void main(String[] args) {
		Karatsuba product = new Karatsuba();
		System.out.println(product.operation("150","002")+"");
		
	}
}
