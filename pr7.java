class Qun{
	public static void main(String[] args){
		int num1=34;
		int num2=45;
		if(num1>0 && num2>0){
		 int multiply=num1*num2;
		 switch(multiply%2){
			 case 0:
			 System.out.println("Even");
                         break;
		          case 1:
			  System.out.println("Odd");
			  break;
}
		}
		else{
			 System.out.println("Sorry negative numbers not allowed");
		}
	}
}
