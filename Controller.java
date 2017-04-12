	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.text.Font;
	
public class Controller {

	public class CoffeeController {
		
		@FXML private Button blackCoffee, coffeeWithSugar, coffeeWithSugarAndCreamer;
		@FXML private Label headerText, currentSelection, amountPaid;
		@FXML private TextField moneyPutIn;
		
		private CoffeeController cc; // model
		
		public void initialize( ) {
			cc = new Model( );
			
			headerText.setFont(new Font(20));
			
		}
		
		@FXML protected void setSelection( ActionEvent ae ) {
			if( ae.getSource( ) == blackCoffee) {
				cc.setCoffeeType( "Black"); 
			} else if (ae.getSource( )) == coffeeWithSugar) {
				cc.setCoffeeType( "Sugar");
			} else if (ae.getSource( ) ) == coffeeWithCreamerAndSugar) {
				cc.setCoffeeType( "Sugar and Creamer");
			}
		}
		
		
	}

}
