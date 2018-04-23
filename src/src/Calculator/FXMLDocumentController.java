/************************************************************************
* Název projektu: Kalkulaèka                                            *
* Balíèek: Calculator                                                   *
* Soubor: FXMLDocumentController.java                                   *
* Datum: 15.4.2018                                                      *
* Autoøi: David Bulawa (xbulaw01)                                       *
*         František Policar (xpolic04)                                  *
*                                                                       *
* Popis: Funkce GUI kalkulaèky                                          *
*                                                                       *
************************************************************************/

/**
 * @file FXMLDocumentController.java 
 * 
 * @brief Funkce GUI kalkulaèky kalkulaèky
 */

/**
 * @package Calculator
 * 
 * @brief GUI a funkce kalkulaèky
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
 * @brief Tøída zabývající se funkcionalitou kalkulaèky.
 * @author David Bulawa (xbulaw01)
 * @author František Policar (xpolic04)
 * @date 15.4.2018
 * @version 1.0
 */
public class FXMLDocumentController implements Initializable {
    Double data; /**<@brief Zadané èíslo */
    int operation = -1; /**<@brief Poèetní operace která se bude provádìt */
    boolean destecka = false; /**<@brief Nastaví true pokud už byla zadána des. teèka */
    Alert alert = new Alert(AlertType.ERROR, ""); /**<@brief Výpis chybové hlášky  */
    DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.ENGLISH); /**<@brief Pøepnutí na desetinnou teèku */
    DecimalFormat df = new DecimalFormat("#############.####",formatSymbols); /**<@brief Upøesnìní formátu èísel */
    Alert helpAlert = new Alert(AlertType.INFORMATION, "Napovìda"); /**<@Vyskakovaci okno na nápovìdu */
    
    /**
     * @brief Tlaèítko pro desetinnou èárku
     */
    @FXML
    private Button cara;
    
    /**
     * @brief Tlaèítko èísla 4
     */
    @FXML
    private Button ctyri;
    
    /**
     * @brief Tlaèítko operace dìleno
     */
    @FXML
    private Button deleno;
    
    /**
     * @brief Tlaèítko èísla 9
     */
    @FXML
    private Button devet;
    
    /**
     * @brief Tlaèítko èísla 2
     */
    @FXML
    private Button dva;
    
    /**
     * @brief Tlaèítko pro faktoriál
     */
    @FXML
    private Button faktorial;
    
    /**
     * @brief Tlaèítko èísla 1
     */
    @FXML
    private Button jedna;
    
    /**
     * Tlaèítko operace násobení
     */
    @FXML
    private Button krat;
    
    /**
     * @brief Tlaèítko operace odèítání
     */
    @FXML
    private Button minus;
    
    /**
     * @brief Tlaèítko operace mocnina
     */
    @FXML
    private Button mocnina;
    
    /**
     * @brief Tlaèítko operace modulo
     */
    @FXML
    private Button modulo;
    
    /**
     * @brief Tlaèítko èísla 0
     */
    @FXML
    private Button nula;
    
    /**
     * @brief Tlaèítko operace odmocnina
     */
    @FXML
    private Button odmocnina;
    
    /**
     * @brief Tlaèítko èísla 8
     */
    @FXML
    private Button osm;
    
    /**
     * @brief Tlaèítko èísla 5
     */
    @FXML
    private Button pet;
    
    /**
     * @brief Tlaèítko operace sèítání
     */
    @FXML
    private Button plus;
    
    /**
     * @brief Tlaèítko pro výpoèet zadané operace
     */
    @FXML
    private Button rovno;
    
    /**
     * @brief Tlaèítko èísla 7
     */
    @FXML
    private Button sedm;
    
    /**
     * @brief Tlaèítko èísla 6
     */
    @FXML
    private Button sest;
    
    /**
     * @brief Tlaèítko pro smazání zadávaných èísel
     */
    @FXML
    private Button smazat;
    
    /**
     * @brief Tlaèítko èísla 3
     */
    @FXML
    private Button tri;
    
    /**
     * @brief Tlaèítko pro nápovìdu
     */
    @FXML
    private Button help;
    /**
     * @brief Spodní textové pole zobrazující výsledek
     */
    @FXML
    private TextField vysledek;
    
    /**
     * @brief Horní textové pole zobrazující mezivýpoèet
     */
    @FXML
    private TextField vypocet;

    /**
     * @brief Akce které se provedou pøi stisknutí tlaèítka
     * @param event Provádìná akce (kliknutí)
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
"Program Calculator je možné používat na jednoduché výpoèty, \n" +
"jako je sèítání, odèítání, násobení, dìlení, odmocnina, mocnina, faktoriál a modulo. \n" +
"\n" +
"Pro výbìr èísel a operátorù používáme levé talèítko myši. \n" +
"Na výsledek a výpoèty nám slouží dvì textové pole ve vrchní èásti kalkulaèky. \n" +
"\n" +
"1. Sèítání \n" +
"Zadáme první èíslo, poté vybereme operátor \"+\" a zadáme druhé èíslo. \n" +
"Pø: 4+4=8\n" +
"\n" +
"2. Odèítání \n" +
"Zadáme první èíslo, poté vybereme operátor \"-\" a zadáme druhé èíslo.\n" +
"Pø: 8-4=4\n" +
"\n" +
"3. Násobení\n" +
"Zadáme první èíslo, poté vybereme operátor \"*\" a zadáme druhé èíslo.\n" +
"Pø: 4*4=16\n" +
"\n" +
"4. Dìlení\n" +
"Zadáme první èíslo, poté vybereme operátor \"/\" a zadáme druhé èíslo.\n" +
"Pø: 8/4=2\n" +
"\n" +
"5. Odmocnina\n" +
"Zadáme první èíslo, které bude pod odmocninou, poté vybereme operátor znazornujici odmocninu a zadáme druhé èíslo.\n" +
"Pø: 16 root 2=4\n" +
"\n" +
"6. Mocnina\n" +
"Zadáme první èíslo, poté vybereme operátor \"^\" a zadáme druhé èíslo.\n" +
"Pø: 4^2=16\n" +
"\n" +
"7. Faktorial\n" +
"Zadáme èíslo a vybereme operátor \"!\", po stisku operátoru \"=\", vypoèítá faktoriál zadaného èísla.\n" +
"Pø: 4!=24\n" +
"\n" +
"8. Modulo\n" +
"Zadáme první èíslo, poté vybereme operátor \"%\" a zadáme druhé èíslo, výsledek je zbytek po dìlení.\n" +
"Pø: 5%3=2\n" +
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
     * @brief Inicializace controller
     * @param url Lokace pro zjištìní relativních cest ke koøenovému objektu
     * @param rb Zdroje použíté pro nalezení koøenového objektu
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
} // public class FXMLDocumentController
