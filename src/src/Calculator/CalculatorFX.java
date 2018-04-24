/************************************************************************
* Název projektu: Kalkulaèka                                            *
* Balíèek: Calculator                                                   *
* Soubor: CalculatorFX.java                                             *
* Datum: 15.4.2018                                                      *
* Autor: František Policar (xpolic04)                                   *
*                                                                       *
* Popis: Spouštìní kalkulaèky                                           *
*                                                                       *
************************************************************************/

/**
 * @file CalculatorFX.java 
 * 
 * @brief Spouštìní kalkulaèky
 */

/**
 * @package Calculator
 * 
 * @brief GUI a funkce kalkulaèky
 */
package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @brief Tøída spouštící kalkulaèku.
 * @author František Policar (xpolic04)
 * @date 15.4.2018
 * @version 1.0
 */
public class CalculatorFX extends Application {
    
    /**
     * @brief Vytvoøení okna aplikace.
     * @param stage Tìlo aplikace
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Kalkulaèka v1.0");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @Brief Spouští celou aplikaci.
     * @param args Argumenty pøíkazové øádky
     */
    public static void main(String[] args) {
        launch(args);
    }
} // public class CalculatorFX
