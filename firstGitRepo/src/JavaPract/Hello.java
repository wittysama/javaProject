package JavaPract;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello World");
System.out.println("new line added");
int x = 0;
int y =0;
for(x=1; x<=10; x++){
	if(x<5){
	y=y-x;
	System.out.println("y value is "+y);
	}else if(x>5){
		y =y+x;
		System.out.println("y value is"+y);
	}else{
		y= y-x;
		System.out.println("y value is "+y);
	}
		
	
}


	}

}
