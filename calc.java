import java.util.Scanner;

public class calculator{
	private int num1;
	private char op;
	private int num2;

	public calculator(){
	}
	public void setNum1(int data){num1 = data;}
	public void setOP(char data){op = data;}
	public void setNum2(int data){num2 = data;}
	public int getNum1(){return num1;}
	public char getOP(){return op;}
	public int getNum2(){return num2;}
	public int plus(){return num1 + num2;}
	public int min(){return num1 - num2;}
	public int mul(){return num1 * num2;}
	public int div(){return num1 / num2;}
	public static void main(String[] args){
		calculator calc = new calculator();
		Scanner sc = new Scanner(System.in);

		System.out.println("first number : ");
		calc.setNum1(sc.nextInt());

		System.out.println(Op : );
		calc.setOP(sc.next().charAt(0));

		System.out.println("second number : ");
		calc.setNum2(sc.nextInt());


		if(calc.getOP()=='+'){
			System.out.println(calc.plus());
		}
		else if(calc.getOp()=='-'){
			System.out.println(calc.min());
		}
		else if(calc.getOp()=='/'){
			System.out.println(calc.div());
		}
		else if(calc.getOP()=='*'){
			System.out.println(calc.mul());
		}
		else{
			System.out.println("wrong op");
		}
	}
}










