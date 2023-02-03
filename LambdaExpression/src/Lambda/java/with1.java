package Lambda.java;

interface inbox{
	void message();
};
public class with1 {

	public static void main(String[] args) {
      inbox in=()->{
    	System.out.println("hello java ");  
      };
		
      inbox in2=()->{
      	System.out.println("great ,go ahead ");  
        };
  		in.message();
  		in2.message();
		
	}

}
