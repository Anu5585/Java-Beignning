package com.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;


import java.util.concurrent.TimeoutException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MyTest extends ApplicationTest {

    @Start
    public void start(Stage stage)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(CustomeBMI.class.getResource("custom-bmi.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        stage.setTitle("BMI Calculator");
        stage.setScene(scene);
        stage.show();

    }
    @BeforeAll
    static void beforeAll() {
        doNotDisplayGUIDuringTest();
    }

    private static void doNotDisplayGUIDuringTest() {
        System.setProperty("testfx.robot", "glass");
        System.setProperty("testfx.headless", "true");
        System.setProperty("prism.order", "sw");
        System.setProperty("prism.text", "t2k");
        System.setProperty("java.awt.headless", "true");
    }

    @BeforeEach
    void beforeEachTestFXBase() throws TimeoutException {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(CustomeBMI.class);
    }

    @Test
    public void should_calculate_BMI_english_system(){
        //weight (lbs) 152.119
        //height (inches) 69.6
        //22.075996044721897
        this.clickOn("#txtWeight").write("152.119").type(KeyCode.TAB);
        this.clickOn("#txtHeight").write("69.6").type(KeyCode.TAB);
        RadioButton english = this.lookup("#english").query();
        this.clickOn(english).type(KeyCode.TAB);
        this.clickOn("#btnCalc");
        FxAssert.verifyThat("#bmiOutput", LabeledMatchers.hasText("22.075996044721897"));
        FxAssert.verifyThat("#bmiCategory", LabeledMatchers.hasText("Normal Weight"));
    }


//    @Test
//    public void should_calculate_BMI_english_system(FxRobot robot){
//    //weight (lbs) 152.119
//    //height (inches) 69.6
//    //22.075996044721897
//        robot.clickOn("#txtWeight").write("152.119").type(KeyCode.TAB);
//        robot.clickOn("#txtHeight").write("69.6").type(KeyCode.TAB);
//        RadioButton english = robot.lookup("#english").query();
//        robot.clickOn(english).type(KeyCode.TAB);
//        robot.clickOn("#btnCalc");
//        FxAssert.verifyThat("#bmiOutput", LabeledMatchers.hasText("22.075996044721897"));
//        FxAssert.verifyThat("#bmiCategory", LabeledMatchers.hasText("Normal Weight"));
//    }


    @Test
    public void should_calculate_BMI_metric_system(){
        this.clickOn("#txtWeight").write("67").type(KeyCode.TAB);
        this.clickOn("#txtHeight").write("176.784").type(KeyCode.TAB);
        RadioButton english = this.lookup("#metric").query();
        this.clickOn(english).type(KeyCode.TAB);
        this.clickOn("#btnCalc");
        FxAssert.verifyThat("#bmiOutput", LabeledMatchers.hasText("21.438228237798793"));
        FxAssert.verifyThat("#bmiCategory", LabeledMatchers.hasText("Normal Weight"));
        //weight (kg) 67
        //height (cm) 176.784
        //21.438228237798789
        //Normal Weight
    }
x`
//    @Test
//    public void should_calculate_BMI_metric_system(FxRobot robot){
//        robot.clickOn("#txtWeight").write("67").type(KeyCode.TAB);
//        robot.clickOn("#txtHeight").write("176.784").type(KeyCode.TAB);
//        RadioButton english = robot.lookup("#metric").query();
//        robot.clickOn(english).type(KeyCode.TAB);
//        robot.clickOn("#btnCalc");
//        FxAssert.verifyThat("#bmiOutput", LabeledMatchers.hasText("21.438228237798793"));
//        FxAssert.verifyThat("#bmiCategory", LabeledMatchers.hasText("Normal Weight"));
//    //weight (kg) 67
//    //height (cm) 176.784
//    //21.438228237798789
//    //Normal Weight
//    }
}

