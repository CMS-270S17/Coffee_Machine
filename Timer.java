import java.util.Timer;
import java.util.TimerTask;

public class TimerTester1 {

	public int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			int count = 0;
		    @Override
		    public void run() {
		        System.out.println("hello");
		        count++;
		        
		        if(count==30){
		        	System.out.println("Refund Money, Reset Machine");
		        }
		        
		    	if(count==5){ //This if or while should be looking the Go/make coffee button.
		    		t.cancel();//when the Go button is pressed the counter will cancel 
		    		System.out.println("end"); //This is where the coffee is being made/finsihed goes
		    	}
		    };
		    
		};
		
		t.schedule(tt,1000,1000);
		


}
}
