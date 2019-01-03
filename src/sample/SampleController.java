package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController
{
    int counter = 0;
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent) {
        counter = counter + 1;
        helloWorld.setText("You Have Clicked " + counter + " Times in " + now);
    }
}

