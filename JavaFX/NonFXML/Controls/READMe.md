# software-engineering

https://docs.oracle.com/javafx/2/api/javafx/scene/control/Control.html

//set position
xcomponent.setLayoutX();
noxcomponentde.setLayoutY();

//set size
xcomponent.setMinWidth()
xcomponent.setMaxWidth()
xcomponent.setPrefWidth()

xcomponent.setMinHeight()
xcomponent.setMaxHeight()
xcomponent.setPrefHeight()

xcomponent.setMinSize()
xcomponent.setMaxSize()
xcomponent.setPrefSize()
The methods setMinWidth() and setMaxWidth() sets the minimum and maximum width the xcomponent should be allowed to have. 

The methods setMinHeight() and setMaxHeight() sets the minimum and maximum height the button should be allowed to have. 

xcomponent.setMaxSize(100, 200);
is equivalent to calling

xcomponent.setMaxWidth(100);
xcomponent.setMaxHeight(200);

FXML:

<StackPane xmlns:fx="http://javafx.com/fxml/1" prefWidth="" prefHeight="" ></StackPane>
