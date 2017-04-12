	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.text.Font;
	
public class Controller {

private double amountNumber;
	
	@FXML private Button blackCoffee, coffeeWithSugar, coffeeWithSugarAndCreamer, enter, go;
	@FXML private Label headerText, currentSelection, amountPaid, change;
	@FXML private TextField moneyPutIn;
	
	private CoffeeModel cc; // model
	
	public void initialize( ) {
		cc = new CoffeeModel( );
		
		headerText.setFont(new Font(20));
		go.setDisable(true);
	}
	
	@FXML protected void setSelection( ActionEvent ae ) {
		if( ae.getSource( ) == blackCoffee) {
			cc.setCoffeeType( "Black"); 
		} else if (ae.getSource( ) == coffeeWithSugar) {
			cc.setCoffeeType( "Sugar");
		} else if (ae.getSource( )  == coffeeWithSugarAndCreamer) {
			cc.setCoffeeType( "Sugar and Creamer");
		}
	}
	
	@FXML protected void calculateAmountPaid( ActionEvent ae ) {
		double price = .35;
		String amountPaid = moneyPutIn.getText();
		 amountNumber += Double.parseDouble( amountPaid);

		 if( amountNumber >= price){
			 go.setDisable(false);			 
		 }
	}
	
	@FXML protected void go( ActionEvent ae) {
		
		cc.calculateChange(amountNumber);
		
	}

}
