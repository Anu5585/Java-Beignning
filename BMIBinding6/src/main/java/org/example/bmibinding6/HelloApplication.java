package org.example.bmibinding6;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = fxmlLoader.load();

        TextField txtWeight = (TextField) root.lookup("#txtWeight");
        TextField txtHeight = (TextField) root.lookup("#txtHeight");

        RadioButton metric = (RadioButton) root.lookup("#metric");
        ToggleGroup group = metric.getToggleGroup();

        Label bmiOutput = (Label) root.lookup("#bmiOutput");
        Label bmiCategory = (Label) root.lookup("#bmiCategory");

        // Properties to hold parsed double values
        DoubleProperty weightProperty = new SimpleDoubleProperty();
        DoubleProperty heightProperty = new SimpleDoubleProperty();

        // Bind properties to text fields
        weightProperty.bind(Bindings.createDoubleBinding(() -> {
            try {
                return Double.parseDouble(txtWeight.getText());
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }, txtWeight.textProperty()));

        heightProperty.bind(Bindings.createDoubleBinding(() -> {
            try {
                return Double.parseDouble(txtHeight.getText());
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }, txtHeight.textProperty()));

        // Bind BMI calculation to output label
        DoubleBinding bmiBinding = Bindings.createDoubleBinding(() -> {
            double weight = weightProperty.get();
            double height = heightProperty.get();
            RadioButton selectedUnit = (RadioButton) group.getSelectedToggle();
            if (selectedUnit != null && "metric".equals(selectedUnit.getId())) {
                return calculateMetricBMI(weight, height);
            } else if (selectedUnit != null && "english".equals(selectedUnit.getId())) {
                return calculateEnglishBMI(weight, height);
            } else {
                return 0.0; // Default case
            }
        }, weightProperty, heightProperty, group.selectedToggleProperty());

        bmiOutput.textProperty().bind(Bindings.format("%.15f", bmiBinding));
        bmiCategory.textProperty().bind(Bindings.createStringBinding(() -> determineCategory(bmiBinding.get()), bmiBinding));

        Scene scene = new Scene(root);
        stage.setTitle("BMI Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private double calculateMetricBMI(double weight, double height) {
        return weight / ((height / 100) * (height / 100));
    }



    private double calculateEnglishBMI(double weight, double height) {
        return height > 0 ? (weight * 703) / Math.pow(height, 2) : 0;
    }

    private String determineCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal Weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
