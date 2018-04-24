/************************************************************************
* N�zev projektu: Kalkula�ka                                            *
* Bal��ek: Calculator                                                   *
* Soubor: CalculatorFX.java                                             *
* Datum: 15.4.2018                                                      *
* Autor: Franti�ek Policar (xpolic04)                                   *
*                                                                       *
* Popis: Spou�t�n� kalkula�ky                                           *
*                                                                       *
************************************************************************/

/**
 * @file CalculatorFX.java 
 * 
 * @brief Spou�t�n� kalkula�ky
 */

/**
 * @package Calculator
 * 
 * @brief GUI a funkce kalkula�ky
 */
package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @brief T��da spou�t�c� kalkula�ku.
 * @author Franti�ek Policar (xpolic04)
 * @date 15.4.2018
 * @version 1.0
 */
public class CalculatorFX extends Application {
    
    /**
     * @brief Vytvo�en� okna aplikace.
     * @param stage T�lo aplikace
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Kalkula�ka v1.0");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @Brief Spou�t� celou aplikaci.
     * @param args Argumenty p��kazov� ��dky
     */
    public static void main(String[] args) {
        launch(args);
    }
} // public class CalculatorFX
