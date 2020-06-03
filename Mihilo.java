
public class Mihilo extends Thread{

	private int n;
	private int num;
	
	
	


  public Mihilo(int n, int num) {
   super();
   this.n = n;
   this.num = num;
	}



		public void run()
	{

	  for(int i =1;i<=n;i++)
	  {

	
	    System.out.println("El auto "+num+" avanzo "+i+" km");

	  }
	  
	  System.out.println("El auto "+num+" finalizo el recorrido");
  }
	    
	    
	    
	   
	
	
		

}
