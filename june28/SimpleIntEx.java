package june28;

public class SimpleIntEx 
{
public static void main(String[] args) {
	
	int prin = 20000;
	int rate = 5;
	int year = 10;
	int intrest;
	
      intrest = prin*rate*year/100;
      
      System.out.println("You have pay total intrest : "+intrest);
      
      int ans = intrest+prin;
      
      System.out.println("You have to pay total Amount : "+ans); 
      
}
}
