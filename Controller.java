	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.text.Font;
	
public class Controller {

	public class Controller {

		private double amountNumber;
			
			@FXML private Button enter, go, cancel;
			@FXML private RadioButton blackCoffee, coffeeWithSugar, coffeeWithSugarAndCreamer;
			@FXML private Label headerText, currentSelection, amountPaid, change;
			@FXML private TextField moneyPutIn;
			
			public static final NumberFormat MONEY = NumberFormat.getCurrencyInstance(); 
			private Model cc; 
			
			public void initialize( ) {
				cc = new Model( ); 
				
				headerText.setFont(new Font(20));
				go.setDisable(true);
				moneyPutIn.setDisable(true); 
				amountPaid.setText(MONEY.format(amountNumber));
				cancel.setDisable(true);
				change.setText("");
				enter.setDisable(true);
				
			}
			
			@FXML protected void setSelection( ActionEvent ae ) {
				if( ae.getSource( ) == blackCoffee) {
					cc.setCoffeeType( "Black"); 
				} else if (ae.getSource( ) == coffeeWithSugar) {
					cc.setCoffeeType( "Sugar");
				} else if (ae.getSource( )  == coffeeWithSugarAndCreamer) {
					cc.setCoffeeType( "Sugar and Creamer");
				}
				moneyPutIn.setDisable(false); 
				enter.setDisable(false);
			}
			
			@FXML protected void calculateAmountPaid( ActionEvent ae ) {
				double price = .35;
				String amount = moneyPutIn.getText()
						amountNumber += Double.parseDouble( amount);

				 if( amountNumber >= price){
					 go.setDisable(false);	
					 amountPaid.setText(MONEY.format(amountNumber)); 
					 
				 }
			}
			
			@FXML protected void go( ActionEvent ae) {
				
				cc.calculateChange(amountNumber);
				
				change.setText(MONEY.format(cc.calculateChange(amountNumber)));
				cancel.setDisable(false); 	
			}
			@FXML protected void reset(ActionEvent ae){
				amountNumber = 0.00;
				initialize();
			}

		}
