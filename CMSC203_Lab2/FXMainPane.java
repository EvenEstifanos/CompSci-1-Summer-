


import javafx.application.Platform; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {
	
	private DataManager data;
	private TextField input;
	

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() 
	{
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		Button button1 = new Button("Hello");
		Button button2 = new Button ("Howdy");
		Button button3 = new Button("Chinese");
		Button button4 = new Button("Clear");
		Button button5 = new Button("Exit");
		
		button1.setOnAction(new ButtonClickHandler());
		button2.setOnAction(new ButtonClickHandler());
		button3.setOnAction(new ButtonClickHandler());
		button4.setOnAction(new ButtonClickHandler());
		button5.setOnAction(new ButtonClickHandler());
		
		Label text = new Label("Feedback:");
		input = new TextField();
		
		//  instantiate the HBoxes
		HBox hBox1 = new HBox();
		HBox hBox2 = new HBox();
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		 data = new DataManager();
		
		//  set margins and set alignment of the components
		 hBox1.setAlignment(Pos.CENTER);
		 hBox2.setAlignment(Pos.CENTER);
		 HBox.setMargin(button1, new Insets(5));
		 HBox.setMargin(button2, new Insets(5));
		 HBox.setMargin(button3, new Insets(5));
		 HBox.setMargin(button4, new Insets(5));
		 HBox.setMargin(button5, new Insets(5));
		 HBox.setMargin(text,new Insets(5));
		 HBox.setMargin(input,new Insets(5));
		
		//student Task #3:
		
	    // add the buttons to the other HBox
		hBox1.getChildren().addAll(button1,button2,button3,button4,button5);
			
		//  add the label and textfield to one of the HBoxes
		hBox2.getChildren().addAll(text, input);
		
		
		

		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1,hBox2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	class ButtonClickHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle (ActionEvent event)
		{
			Button target = (Button) event.getTarget();
			
			if(target.getText().equals("Hello"))
			{
				input.setText(data.getHello());
				
			}
			else if(target.getText().equals("Howdy"))
			{
				input.setText(data.getHowdy());
				
			}
			else if(target.getText().equals("Chinese"))
			{
				input.setText(data.getChinese());
				
			}
			else if(target.getText().equals("Clear"))
			{
				input.setText("");
				
			}
			else
			{
				Platform.exit();
				System.exit(0);
			}
			
 			
			
			
		}
	}
}
	
