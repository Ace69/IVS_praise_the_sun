/************************************************************************
* N�zev projektu: Kalkula�ka                                            *
* Bal��ek: Calculator                                                   *
* Soubor: FXMLDocumentController.java                                   *
* Datum: 15.4.2018                                                      *
* Auto�i: David Bulawa (xbulaw01)                                       *
*         Franti�ek Policar (xpolic04)                                  *
*                                                                       *
* Popis: Funkce GUI kalkula�ky                                          *
*                                                                       *
************************************************************************/

/**
 * @file FXMLDocumentController.java 
 * 
 * @brief Funkce GUI kalkula�ky kalkula�ky
 */

/**
 * @package Calculator
 * 
 * @brief GUI a funkce kalkula�ky
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
 * @brief T��da zab�vaj�c� se funkcionalitou kalkula�ky.
 * @author David Bulawa (xbulaw01)
 * @author Franti�ek Policar (xpolic04)
 * @date 15.4.2018
 * @version 1.0
 */
public class FXMLDocumentController implements Initializable {
    Double data; /**<@brief Zadan� ��slo */
    int operation = -1; /**<@brief Po�etn� operace kter� se bude prov�d�t */
    boolean destecka = false; /**<@brief Nastav� true pokud u� byla zad�na des. te�ka */
    Alert alert = new Alert(AlertType.ERROR, ""); /**<@brief V�pis chybov� hl�ky  */
    DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.ENGLISH); /**<@brief P�epnut� na desetinnou te�ku */
    DecimalFormat df = new DecimalFormat("#############.####",formatSymbols); /**<@brief Up�esn�n� form�tu ��sel */
    Alert helpAlert = new Alert(AlertType.INFORMATION, "Napov�da"); /**<@Vyskakovaci okno na n�pov�du */
    
    /**
     * @brief Tla��tko pro desetinnou ��rku
     */
    @FXML
    private Button cara;
    
    /**
     * @brief Tla��tko ��sla 4
     */
    @FXML
    private Button ctyri;
    
    /**
     * @brief Tla��tko operace d�leno
     */
    @FXML
    private Button deleno;
    
    /**
     * @brief Tla��tko ��sla 9
     */
    @FXML
    private Button devet;
    
    /**
     * @brief Tla��tko ��sla 2
     */
    @FXML
    private Button dva;
    
    /**
     * @brief Tla��tko pro faktori�l
     */
    @FXML
    private Button faktorial;
    
    /**
     * @brief Tla��tko ��sla 1
     */
    @FXML
    private Button jedna;
    
    /**
     * Tla��tko operace n�soben�
     */
    @FXML
    private Button krat;
    
    /**
     * @brief Tla��tko operace od��t�n�
     */
    @FXML
    private Button minus;
    
    /**
     * @brief Tla��tko operace mocnina
     */
    @FXML
    private Button mocnina;
    
    /**
     * @brief Tla��tko operace modulo
     */
    @FXML
    private Button modulo;
    
    /**
     * @brief Tla��tko ��sla 0
     */
    @FXML
    private Button nula;
    
    /**
     * @brief Tla��tko operace odmocnina
     */
    @FXML
    private Button odmocnina;
    
    /**
     * @brief Tla��tko ��sla 8
     */
    @FXML
    private Button osm;
    
    /**
     * @brief Tla��tko ��sla 5
     */
    @FXML
    private Button pet;
    
    /**
     * @brief Tla��tko operace s��t�n�
     */
    @FXML
    private Button plus;
    
    /**
     * @brief Tla��tko pro v�po�et zadan� operace
     */
    @FXML
    private Button rovno;
    
    /**
     * @brief Tla��tko ��sla 7
     */
    @FXML
    private Button sedm;
    
    /**
     * @brief Tla��tko ��sla 6
     */
    @FXML
    private Button sest;
    
    /**
     * @brief Tla��tko pro smaz�n� zad�van�ch ��sel
     */
    @FXML
    private Button smazat;
    
    /**
     * @brief Tla��tko ��sla 3
     */
    @FXML
    private Button tri;
    
    /**
     * @brief Tla��tko pro n�pov�du
     */
    @FXML
    private Button help;
    /**
     * @brief Spodn� textov� pole zobrazuj�c� v�sledek
     */
    @FXML
    private TextField vysledek;
    
    /**
     * @brief Horn� textov� pole zobrazuj�c� meziv�po�et
     */
    @FXML
    private TextField vypocet;

    /**
     * @brief Akce kter� se provedou p�i stisknut� tla��tka
     * @param event Prov�d�n� akce (kliknut�)
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
"Program Calculator je mo�n� pou��vat na jednoduch� v�po�ty, \n" +
"jako je s��t�n�, od��t�n�, n�soben�, d�len�, odmocnina, mocnina, faktori�l a modulo. \n" +
"\n" +
"Pro v�b�r ��sel a oper�tor� pou��v�me lev� tal��tko my�i. \n" +
"Na v�sledek a v�po�ty n�m slou�� dv� textov� pole ve vrchn� ��sti kalkula�ky. \n" +
"\n" +
"1. S��t�n� \n" +
"Zad�me prvn� ��slo, pot� vybereme oper�tor \"+\" a zad�me druh� ��slo. \n" +
"P�: 4+4=8\n" +
"\n" +
"2. Od��t�n� \n" +
"Zad�me prvn� ��slo, pot� vybereme oper�tor \"-\" a zad�me druh� ��slo.\n" +
"P�: 8-4=4\n" +
"\n" +
"3. N�soben�\n" +
"Zad�me prvn� ��slo, pot� vybereme oper�tor \"*\" a zad�me druh� ��slo.\n" +
"P�: 4*4=16\n" +
"\n" +
"4. D�len�\n" +
"Zad�me prvn� ��slo, pot� vybereme oper�tor \"/\" a zad�me druh� ��slo.\n" +
"P�: 8/4=2\n" +
"\n" +
"5. Odmocnina\n" +
"Zad�me prvn� ��slo, kter� bude pod odmocninou, pot� vybereme oper�tor znazornujici odmocninu a zad�me druh� ��slo.\n" +
"P�: 16 root 2=4\n" +
"\n" +
"6. Mocnina\n" +
"Zad�me prvn� ��slo, pot� vybereme oper�tor \"^\" a zad�me druh� ��slo.\n" +
"P�: 4^2=16\n" +
"\n" +
"7. Faktorial\n" +
"Zad�me ��slo a vybereme oper�tor \"!\", po stisku oper�toru \"=\", vypo��t� faktori�l zadan�ho ��sla.\n" +
"P�: 4!=24\n" +
"\n" +
"8. Modulo\n" +
"Zad�me prvn� ��slo, pot� vybereme oper�tor \"%\" a zad�me druh� ��slo, v�sledek je zbytek po d�len�.\n" +
"P�: 5%3=2\n" +
"\n" +
"9. Rovn� se\n" +
"Pro v�sledek zad�v�me oper�tor \"=\". \n" +
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
     * @param url Lokace pro zji�t�n� relativn�ch cest ke ko�enov�mu objektu
     * @param rb Zdroje pou��t� pro nalezen� ko�enov�ho objektu
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
} // public class FXMLDocumentController
