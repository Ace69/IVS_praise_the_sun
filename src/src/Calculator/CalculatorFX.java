/************************************************************************
* Název projektu: Kalkulačka                                            *
* Balíček: Calculator                                                   *
* Soubor: CalculatorFX.java                                             *
* Datum: 15.4.2018                                                      *
* Autor: František Policar (xpolic04)                                   *
*                                                                       *
* Popis: Spouštění kalkulačky                                           *
*                                                                       *
************************************************************************/

/**
 * @file CalculatorFX.java 
 * 
 * @brief Spouštění kalkulačky
 */

/**
 * @package Calculator
 * 
 * @brief GUI a funkce kalkulačky
 */
package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @brief Třída spouštící kalkulačku.
 * @author František Policat (xpolic04)
 * @date 15.4.2018
 * @version 1.0
 */
public class CalculatorFX extends Application {
    
    /**
     * @brief Vytvoření okna aplikace.
     * @param stage Tělo aplikace
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Kalkulačka v1.0");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @Brief Spouští celou aplikaci.
     * @param args Argumenty příkazové řádky
     */
    public static void main(String[] args) {
        launch(args);
    }
} // public class CalculatorFX
