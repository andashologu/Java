# software-engineering

The Button element declares an event listener via its onAction attribute. The attribute value declares a call to the reactToClick() function which is defined in the script element further down the FXML file.

The second concept is the reference of a JavaFX component via its ID from within the FXML file. Inside the reactToClick() method declared in the script element, the Label element is referenced via its ID label1, via this statement:

label1.setText("Button clicked");