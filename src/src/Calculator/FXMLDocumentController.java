
/************************************************************************
* Název projektu: Kalkulačka                                            *
* Balíček: Calculator                                                   *
* Soubor: FXMLDocumentController.java                                   *
* Datum: 15.4.2018                                                      *
* Autoři: David Bulawa (xbulaw01)                                       *
*         František Policar (xpolic04)                                  *
*                                                                       *
* Popis: Funkce GUI kalkulačky                                          *
*                                                                       *
************************************************************************/

/**
 * @file FXMLDocumentController.java 
 * 
 * @brief Funkce GUI kalkulačky kalkulačky
 */

/**
 * @package Calculator
 * 
 * @brief GUI a funkce kalkulačky
 */

package Calculator;

import Lib.MathLib;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.random;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * @brief Třída zabývající se funkcionalitou kalkulačky.
 * @author David Bulawa (xbulaw01)
 * @author František Policar (xpolic04)
 * @date 15.4.2018
 * @version 1.0
 */
public class FXMLDocumentController implements Initializable {
    Double data; /**<@brief Zadané číslo */
    int operation = -1; /**<@brief Početní operace která se bude provádět */
    boolean destecka = false; /**<@brief Nastaví true pokud už byla zadána des. tečka */
    Alert alert = new Alert(AlertType.ERROR, ""); /**<@brief Výpis chybové hlášky  */
    DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.ENGLISH); /**<@brief Přepnutí na desetinnou tečku */
    DecimalFormat df = new DecimalFormat("#############.####",formatSymbols); /**<@brief Upřesnění formátu čísel */
    Alert helpAlert = new Alert(AlertType.INFORMATION, "Napověda"); /**<@Vyskakovaci okno na nápovědu */
    
    /**
     * @brief Tlačítko pro desetinnou čárku
     */
    @FXML
    private Button cara;
    
    /**
     * @brief Tlačítko čísla 4
     */
    @FXML
    private Button ctyri;
    
    /**
     * @brief Tlačítko operace děleno
     */
    @FXML
    private Button deleno;
    
    /**
     * @brief Tlačítko čísla 9
     */
    @FXML
    private Button devet;
    
    /**
     * @brief Tlačítko čísla 2
     */
    @FXML
    private Button dva;
    
    /**
     * @brief Tlačítko pro faktoriál
     */
    @FXML
    private Button faktorial;
    
    /**
     * @brief Tlačítko čísla 1
     */
    @FXML
    private Button jedna;
    
    /**
     * Tlačítko operace násobení
     */
    @FXML
    private Button krat;
    
    /**
     * @brief Tlačítko operace odčítání
     */
    @FXML
    private Button minus;
    
    /**
     * @brief Tlačítko operace mocnina
     */
    @FXML
    private Button mocnina;
    
    /**
     * @brief Tlačítko operace modulo
     */
    @FXML
    private Button modulo;
    
    /**
     * @brief Tlačítko čísla 0
     */
    @FXML
    private Button nula;
    
    /**
     * @brief Tlačítko operace odmocnina
     */
    @FXML
    private Button odmocnina;
    
    /**
     * @brief Tlačítko čísla 8
     */
    @FXML
    private Button osm;
    
    /**
     * @brief Tlačítko čísla 5
     */
    @FXML
    private Button pet;
    
    /**
     * @brief Tlačítko operace sčítání
     */
    @FXML
    private Button plus;
    
    /**
     * @brief Tlačítko pro výpočet zadané operace
     */
    @FXML
    private Button rovno;
    
    /**
     * @brief Tlačítko čísla 7
     */
    @FXML
    private Button sedm;
    
    /**
     * @brief Tlačítko čísla 6
     */
    @FXML
    private Button sest;
    
    /**
     * @brief Tlačítko pro smazání zadávaných čísel
     */
    @FXML
    private Button smazat;
    
    /**
     * @brief Tlačítko čísla 3
     */
    @FXML
    private Button tri;
    
    /**
     * @brief Tlačítko pro nápovědu
     */
    @FXML
    private Button help;
    /**
     * @brief Spodní textové pole zobrazující výsledek
     */
    @FXML
    private TextField vysledek;
    
    /**
     * @brief Horní textové pole zobrazující mezivýpočet
     */
    @FXML
    private TextField vypocet;

    /**
     * @brief Akce které se provedou při stisknutí tlačítka
     * @param event Prováděná akce (kliknutí)
     */
    @FXML
    void handleButtonAction(ActionEvent event) {
    if(event.getSource() == jedna)
    {
        vysledek.setText(vysledek.getText() + "1");
        vypocet.setText(vypocet.getText() + "1");

    }
    else if(event.getSource() == dva)
    {
        vysledek.setText(vysledek.getText() + "2");
        vypocet.setText(vypocet.getText() + "2");
    }
    else if(event.getSource() == tri)
    {
        vysledek.setText(vysledek.getText() + "3");
        vypocet.setText(vypocet.getText() + "3");
    }
    else if(event.getSource() == ctyri)
    {
        vysledek.setText(vysledek.getText() + "4"); 
        vypocet.setText(vypocet.getText() + "4");
    }
    else if(event.getSource() == pet)
    {
        vysledek.setText(vysledek.getText() + "5");
        vypocet.setText(vypocet.getText() + "5");
    }
    else if(event.getSource() == sest)
    {
        vysledek.setText(vysledek.getText() + "6");
        vypocet.setText(vypocet.getText() + "6");
    }
    else if(event.getSource() == sedm)
    {
        vysledek.setText(vysledek.getText() + "7"); 
        vypocet.setText(vypocet.getText() + "7");
    }
    else if(event.getSource() == osm)
    {
        vysledek.setText(vysledek.getText() + "8");
        vypocet.setText(vypocet.getText() + "8");
    }
    else if(event.getSource() == devet)
    {
        vysledek.setText(vysledek.getText() + "9");
        vypocet.setText(vypocet.getText() + "9");
    }
    else if(event.getSource() == nula)
    {
        vysledek.setText(vysledek.getText() + "0"); 
        vypocet.setText(vypocet.getText() + "0");
    }
    else if(event.getSource() == cara && !vysledek.getText().isEmpty())
    {   
        if(destecka == false){
            vysledek.setText(vysledek.getText() + ".");
            vypocet.setText(vypocet.getText() + ".");
            destecka = true;
        }
    }
    //Mazani
    else if(event.getSource() == smazat)
    {
        vysledek.setText("");
        vypocet.setText("");
        destecka = false;
        operation = -1;
    }
    else if(event.getSource() == help){
        helpAlert.setContentText(
"Program Calculator je možné používat na jednoduché výpočty, \n" +
"jako je sčítání, odčítání, násobení, dělení, odmocnina, mocnina, faktoriál a modulo. \n" +
"\n" +
"Pro výběr čísel a operátorů používáme levé talčítko myši. \n" +
"Na výsledek a výpočty nám slouží dvě textové pole ve vrchní části kalkulačky. \n" +
"\n" +
"1. Sčítání \n" +
"Zadáme první číslo, poté vybereme operátor \"+\" a zadáme druhé číslo. \n" +
"Př: 4+4=8\n" +
"\n" +
"2. Odčítání \n" +
"Zadáme první číslo, poté vybereme operátor \"-\" a zadáme druhé číslo.\n" +
"Př: 8-4=4\n" +
"\n" +
"3. Násobení\n" +
"Zadáme první číslo, poté vybereme operátor \"*\" a zadáme druhé číslo.\n" +
"Př: 4*4=16\n" +
"\n" +
"4. Dělení\n" +
"Zadáme první číslo, poté vybereme operátor \"/\" a zadáme druhé číslo.\n" +
"Př: 8/4=2\n" +
"\n" +
"5. Odmocnina\n" +
"Zadáme první číslo, které bude pod odmocninou, poté vybereme operátor \"√\" a zadáme druhé číslo.\n" +
"Př: 2√16=4\n" +
"\n" +
"6. Mocnina\n" +
"Zadáme první číslo, poté vybereme operátor \"^\" a zadáme druhé číslo.\n" +
"Př: 4^2=16\n" +
"\n" +
"7. Faktorial\n" +
"Zadáme číslo a vybereme operátor \"!\", po stisku operátoru \"=\", vypočítá faktoriál zadaného čísla.\n" +
"Př: 4!=24\n" +
"\n" +
"8. Modulo\n" +
"Zadáme první číslo, poté vybereme operátor \"%\" a zadáme druhé číslo, výsledek je zbytek po dělení.\n" +
"Př: 5%3=2\n" +
"\n" +
"9. Rovná se\n" +
"Pro výsledek zadáváme operátor \"=\". \n" +
"");
        helpAlert.showAndWait();
    }
    //Pocetni operace
    else if(event.getSource() == plus && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 1; //Scitani
        vysledek.setText("");
        vypocet.setText(vypocet.getText() + "+");
        destecka = false;
    }
    else if(event.getSource() == minus)
    {
        if(vysledek.getText().isEmpty()){
            vysledek.setText("-");
            vypocet.setText(vypocet.getText() + "-");
        }else if(!vysledek.getText().matches("-")){
            data = Double.parseDouble(vysledek.getText());
            operation = 2; //Odcitni
            vysledek.setText("");
            vypocet.setText(vypocet.getText() + "-");
            destecka = false;
        }
    }
    else if(event.getSource() == krat && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 3; //Nasobeni
        vysledek.setText("");
        vypocet.setText(vypocet.getText() + "*");
        destecka = false;
    }
    else if(event.getSource() == deleno && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 4; //Deleni
        vysledek.setText("");
        vypocet.setText(vypocet.getText() + "/");
        destecka = false;
    }
    else if(event.getSource() == odmocnina && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 5; //Odmocnina
        vysledek.setText("");
        vypocet.setText( vypocet.getText() + " root " );
    }
    else if(event.getSource() == mocnina && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 6; //Mocnina
        vysledek.setText("");
        vypocet.setText(vypocet.getText() + "^");
        destecka = false;
    }
    else if(event.getSource() == modulo && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 7; //Modulo
        vysledek.setText("");
        vypocet.setText(vypocet.getText() + "%");
        destecka = false;
    }
    else if(event.getSource() == faktorial && operation == -1 && !vysledek.getText().isEmpty())
    {
        data = Double.parseDouble(vysledek.getText());
        destecka = false;
        Double ans = 0d;
        try{
            ans = MathLib.faktorial(data);
            if(ans.isInfinite() || ans.isNaN()){
                vysledek.setText("");
                vypocet.setText("");
            }else{
                vysledek.setText(String.valueOf(df.format(ans)));
                vypocet.setText(String.valueOf(df.format(ans)));
            }
        }catch(IllegalArgumentException e ){
            alert.setContentText("Faktorial musi byt nezaporny");
            vysledek.setText("");
            vypocet.setText("");
            alert.showAndWait();
        }
    }
    
    else if(event.getSource() == rovno)
    {
        if(!vypocet.getText().isEmpty()){
        Float druhyOperand;
        Double ans = 0d;
        switch(operation)
        {
            case 1: //Scitani
                if(!vysledek.getText().isEmpty()){
                    druhyOperand = Float.parseFloat(vysledek.getText());
                    ans = MathLib.scitani(data, druhyOperand);
                    if(ans.isInfinite() || ans.isNaN()){
                        vysledek.setText("");
                        vypocet.setText("");
                    }else{
                        vysledek.setText(String.valueOf(df.format(ans)));
                        vypocet.setText(String.valueOf(df.format(ans)));
                    }
                }
                break;
            case 2: //Odcitani
                if(!vysledek.getText().isEmpty()){
                    druhyOperand = Float.parseFloat(vysledek.getText());
                    ans = MathLib.odcitani(data, druhyOperand);
                    if(ans.isInfinite() || ans.isNaN()){
                        vysledek.setText("");
                        vypocet.setText("");
                    }else{
                        vysledek.setText(String.valueOf(df.format(ans)));
                        vypocet.setText(String.valueOf(df.format(ans)));
                    }
                }
                break;
            case 3: //Nasobeni
                if(!vysledek.getText().isEmpty()){
                    druhyOperand = Float.parseFloat(vysledek.getText());
                    ans = MathLib.nasobeni(data, druhyOperand);
                    if(ans.isInfinite()){
                        vysledek.setText("");
                        vypocet.setText("");
                    }else{
                        vysledek.setText(String.valueOf(df.format(ans)));
                        vypocet.setText(String.valueOf(df.format(ans)));
                    }
                }
                break;
            case 4: //Deleni
                if(!vysledek.getText().isEmpty()){
                    try{
                        druhyOperand = Float.parseFloat(vysledek.getText());
                        ans = MathLib.deleni(data, druhyOperand);
                        if(ans.isInfinite() || ans.isNaN()){
                            vysledek.setText("");
                            vypocet.setText("");
                        }else{
                            vysledek.setText(String.valueOf(df.format(ans)));
                            vypocet.setText(String.valueOf(df.format(ans)));
                        }
                    }catch(ArithmeticException e){
                        alert.setContentText("Nelze delit nulou!");
                        vysledek.setText("");
                        vypocet.setText("");
                        alert.showAndWait();
                    }
                }
                break;
            case 5: //Odmocnina
                if(!vysledek.getText().isEmpty()){
                    try{
                        druhyOperand = Float.parseFloat(vysledek.getText());
                        ans = MathLib.odmocnina(data, druhyOperand);
                        if(ans.isInfinite() || ans.isNaN()){
                            vysledek.setText("");
                            vypocet.setText("");
                        }else{
                            vysledek.setText(String.valueOf(df.format(ans)));
                            vypocet.setText(String.valueOf(df.format(ans)));
                        }
                    }catch(IllegalArgumentException e){
                        alert.setContentText("Vyraz pod odmocninou nesmi byt zaporny a zaroven odmocnina nesmi byt nulteho stupne");
                        vysledek.setText("");
                        vypocet.setText("");
                        alert.showAndWait();
                    }
                }
                break;
            case 6: //Mocnina
                if(!vysledek.getText().isEmpty()){
                    try{
                        druhyOperand = Float.parseFloat(vysledek.getText());
                        ans = MathLib.mocnina(data, druhyOperand);
                        if(ans.isInfinite() || ans.isNaN()){
                            vysledek.setText("");
                            vypocet.setText("");
                        }else{
                            vysledek.setText(String.valueOf(df.format(ans)));
                            vypocet.setText(String.valueOf(df.format(ans)));
                        }
                    }catch(IllegalArgumentException e){
                        alert.setContentText("Exponent musi byt prirozene cislo");
                        vysledek.setText("");
                        vypocet.setText("");
                        alert.showAndWait();
                    }
                }
                break;
            case 7: //Modulo
                if(!vysledek.getText().isEmpty()){
                    try{
                        druhyOperand = Float.parseFloat(vysledek.getText());
                        ans = MathLib.modulo(data, druhyOperand);
                        if(ans.isInfinite() || ans.isNaN()){
                            vysledek.setText("");
                            vypocet.setText("");
                        }else{
                            vysledek.setText(String.valueOf(df.format(ans)));
                            vypocet.setText(String.valueOf(df.format(ans)));
                        }
                    }catch(ArithmeticException e){
                        alert.setContentText("Nelze delit nulou");
                        vysledek.setText("");
                        vypocet.setText("");
                        alert.showAndWait();
                    }
                }
                break;
            }
            operation = -1;
            if(vypocet.getText().contains(".")){
                destecka = true;
            }else{
                destecka = false;
            }
        }//if(!vypocet.getText().isEmpty())
    }
    }// void handleButtonAction(ActionEvent event){}
    
	/**
	 *
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
} // public class FXMLDocumentController
