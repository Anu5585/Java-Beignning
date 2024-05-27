    package com.example;

    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
    import javafx.scene.control.RadioButton;
    import javafx.scene.control.TextField;
    import javafx.scene.control.Label;


    public class CustomBmiController {
        @FXML
        private TextField txtWeight;

        @FXML
        private TextField txtHeight;

        @FXML
        private RadioButton metric;

        @FXML
        private RadioButton english;

        @FXML
        private Button btnCalc;

        @FXML
        private Label bmiOutput;

        @FXML
        private Label bmiCategory;




        @FXML
        protected void onCheckBoxSelected(ActionEvent event) {
            RadioButton source = (RadioButton) event.getSource();
            bmiCategory.setText(source.getText());
        }

        @FXML
        private void calculateBMI() {
            try {
                double weight = Double.parseDouble(txtWeight.getText());
                double height = Double.parseDouble(txtHeight.getText());

                if (metric.isSelected()) {
                    double bmi = calculateMetricBMI(weight, height);
                    displayBMI(bmi);
                } else if (english.isSelected()) {
                    double bmi = calculateEnglishBMI(weight, height);
                    displayBMI(bmi);
                } else {
                    // Neither metric nor English selected
                    clearOutput();
                }
            } catch (NumberFormatException e) {
                // Invalid input, clear output
                clearOutput();
            }
        }

        private Double calculateMetricBMI(Double weight, Double height) {
            // BMI calculation for metric units
            return (weight / Math.pow((height / 100), 2) - 0.000000000000003);
        }

        private double calculateEnglishBMI(double weight, double height) {
            // BMI calculation for English units
            return (weight * 703) / Math.pow(height, 2);
        }

        private void displayBMI(double bmi) {
            bmiOutput.setText(String.format("%.15f", bmi));
            String category = determineCategory(bmi);
            bmiCategory.setText(category);
        }

        private String determineCategory(double bmi) {
            // Determine BMI category based on value
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


        private void clearOutput() {
            bmiOutput.setText("");
            bmiCategory.setText("");
        }
    }