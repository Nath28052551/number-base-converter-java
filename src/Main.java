import java.util.*;//import Scanner class.
public class Main {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);//Create object of class Scanner.
		int decimal;//to store Decimal System number.
		int num2;//to store the Decimal System number input.
		String hexadecimal;//to store Hexadecimal System number.
		String num1;//to store the number that will converted.
		String ctype;//to store type of number you want to convert.
		String octalnumber;// to store Octal number System.
		String binary;// to store Binary System number.
		String type;
		while (true) { //keep looping until user enters 0
		    System.out.println("Enter the type of number :");
		    System.out.println("Enter 0 to EXIT the program :");
			System.out.println("BINARY for binary type system :");
			System.out.println("DECIMAL for binary type system :");
			System.out.println("OCTAL for binary type system :");
			System.out.println("HEXA for binary type system :");
			//System.out.println(type);//JUST FOR DEBUGGING
		    	type = obj.next();//to store the type of number you going to use as input.
		    	type = type.toUpperCase();
		    if (type.equals("0")) { 
		    	System.out.println("Exiting program. Goodbye!");
		        break;
		    }
		
		switch(type) {
		case "BINARY": 
			//System.out.println("Your number is BINARY TYPE NUMBER :"); JUST FOR DEBUGGING
			System.out.println("Enter the type of number you want to convert to :");
			System.out.println("BINARY for binary type system :");
			System.out.println("DECIMAL for binary type system :");
			System.out.println("OCTAL for binary type system :");
			System.out.println("HEXA for binary type system :");
			ctype = obj.next();
			ctype = ctype.toUpperCase();
			switch(ctype) {
			case "BINARY":
				System.out.println("The given number is already in Binary System :");
				System.out.println("Please try again :");
				break;
			case "DECIMAL":
				System.out.println("Enter the number : ");
				 num1 = obj.next();
				 decimal = Integer.parseInt(num1,2);//accept both positive and negative.
				 System.out.println("Binary number System : "+num1);
				 System.out.println("Decimal number System : "+decimal);
				break;
			case "OCTAL" :
				System.out.println("Enter the number : ");
				num1 = obj.next();
				decimal = Integer.parseInt(num1,2);//accept both positive and negative.
				//change the given number
				System.out.println("Binary number System : "+num1);
				octalnumber = Integer.toString(decimal,8).toUpperCase();
				System.out.println("Octaldecimal number System : "+octalnumber);
				
				break;
			case "HEXA" :
				System.out.println("Enter the number : ");
				num1 = obj.next();
				decimal = Integer.parseInt(num1,2);//accept both positive and negative.
				System.out.println("Binary number System : "+num1);
				
				
				hexadecimal = Integer.toString(decimal,16).toUpperCase();
				 System.out.println("Hexadecimal number System : "+hexadecimal);
				break;
				default:
					System.out.println("INVALID INPUT :");
					System.out.println("PLEASE TRY AGAIN :");
					break;
			}
			break;
		case "DECIMAL":
			//System.out.println("Your number is DECIMAL TYPE NUMBER :");
			System.out.println("Enter the type of number you want to convert to :");
			System.out.println("BINARY for binary type system :");
			System.out.println("DECIMAL for binary type system :");
			System.out.println("OCTAL for binary type system :");
			System.out.println("HEXA for binary type system :");
			ctype = obj.next();
			ctype=ctype.toUpperCase();
			switch(ctype) {
			case "BINARY":
				 System.out.println("Enter the number : ");
				 num2 = obj.nextInt();
				 System.out.println("Decimal number System : "+num2);
				 binary = Integer.toString(num2,2);
				 System.out.println("Binary number System : "+binary);
				break;
			case "DECIMAL":
				System.out.println("The Given number is already in Decimal number System :");
				System.out.println("Please try again : ");
				break;
			case "OCTAL" :
				System.out.println("Enter the number : ");
				num2 = obj.nextInt();
				System.out.println("Decinal number System : "+num2);
				octalnumber = Integer.toString(num2, 8);
		        System.out.println("Octal number System : " + octalnumber);
		        //i use toString because it can accept both negative and positive number.
		        break;
			case "HEXA" :
				System.out.println("Enter the number : ");
				num2 = obj.nextInt();
				System.out.println("Decinal number System : "+num2);
				hexadecimal = Integer.toString(num2, 16).toUpperCase();
		        System.out.println("Hexadecimal number System : " + hexadecimal);
				break;
			default:
				System.out.println("INVALID INPUT :");
				System.out.println("PLEASE TRY AGAIN :");
				break;
			}
			break;
		case "OCTAL":
			//System.out.println("Your number is OCTRAL TYPE NUMBER :");//for debugging
			System.out.println("Enter the type of number you want to convert to :");
			System.out.println("BINARY for binary type system :");
			System.out.println("DECIMAL for binary type system :");
			System.out.println("OCTAL for binary type system :");
			System.out.println("HEXA for binary type system :");
			ctype = obj.next();
			ctype=ctype.toUpperCase();
			switch(ctype) {
			case "BINARY":
				System.out.println("Enter the number : ");
				octalnumber  = obj.next();
				System.out.println("Octal number System : "+octalnumber);
				decimal = Integer.parseInt(octalnumber, 8);
				binary = Integer.toString(decimal,2);
				System.out.println("Binary number System : "+binary);
				break;
			case "DECIMAL":
				System.out.println("Enter the number : ");
				octalnumber  = obj.next();
				System.out.println("Octal number System : "+octalnumber);
				decimal = Integer.parseInt(octalnumber, 8);
				System.out.println("Decimal number System : "+decimal);
				break;
			case "OCTAL" :
				System.out.println("The given is already in Octal number System : ");
				System.out.println("Pleas try again : ");
				break;
			case "HEXA" :
				System.out.println("Enter the number : ");
				octalnumber  = obj.next();
				System.out.println("Octal number System : "+octalnumber);
				decimal = Integer.parseInt(octalnumber, 8);
				hexadecimal = Integer.toString(decimal,16).toUpperCase();
				System.out.println("Hexadecimal number System : "+hexadecimal);
				break;
				default:
					System.out.println("INVALID INPUT :");
					System.out.println("PLEASE TRY AGAIN :");
					break;
			}
			break;
		case "HEXA":
			//System.out.println("Your number is HEXADECIMAL TPYE NUMBER :");
			System.out.println("Enter the type of number you want to convert to :");
			System.out.println("BINARY for binary type system :");
			System.out.println("DECIMAL for binary type system :");
			System.out.println("OCTAL for binary type system :");
			System.out.println("HEXA for binary type system :");
			ctype = obj.next();
			ctype=ctype.toUpperCase();
			switch(ctype) {
			case "BINARY":
				System.out.println("Enter the number : ");
				hexadecimal  = obj.next();
				System.out.println("Hexadecimal number System : "+hexadecimal);
				decimal = Integer.parseInt(hexadecimal, 16);
				binary = Integer.toString(decimal,2);
				System.out.println("Binary number System : "+binary);
				break;
			case "DECIMAL":
				System.out.println("Enter the number : ");
				hexadecimal  = obj.next();
				System.out.println("Hexadecimal number System : "+hexadecimal);
				decimal = Integer.parseInt(hexadecimal, 16);
				System.out.println("Decimal number System : "+decimal);
				break;
			case "OCTAL" :
				System.out.println("Enter the number : ");
				hexadecimal  = obj.next();
				System.out.println("Hexadecimal number System : "+hexadecimal);
				decimal = Integer.parseInt(hexadecimal, 16);
				octalnumber = Integer.toString(decimal,8);
				System.out.println("Octal number System : "+octalnumber);
				break;
			case "HEXA" :
				System.out.println("The given number is already in Hexadecimal numnber System :");
				System.out.println("Please try again : ");
				break;
				default:
					System.out.println("INVALID INPUT :");
					System.out.println("PLEASE TRY AGAIN :");
					break;
			}
			break;
		default :
			System.out.println("INVALID INPUT PLEASE TRY AGAIN :");
			break;
		}
		}

	}
	

}
