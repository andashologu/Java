import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyFxmlController {

    @FXML
    public void buttonClicked(Event e){
        System.out.println("Button clicked");
    }

}
