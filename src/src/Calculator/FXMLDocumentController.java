/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @todo Faktorial omezit na 1 argument
 * @author fpolicar
 */
public class FXMLDocumentController implements Initializable {
    
    Double data;
    int operation = -1;
    boolean destecka = false; //nastavi true pokud uz byla zadana des. tecka
    boolean textDopredu = false; //pokud je true, zapisuje text vypoctu dopredu 
    String cislo;
    Alert alert = new Alert(AlertType.ERROR, "File already exists. Do you want to override?");
    int pocitadloMinus;
    DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
    DecimalFormat df = new DecimalFormat("#############.####",formatSymbols);
    
    @FXML
    private Button button;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cara;

    @FXML
    private Button ctyri;

    @FXML
    private Button deleno;

    @FXML
    private Button devet;

    @FXML
    private Button dva;

    @FXML
    private Button faktorial;

    @FXML
    private Button jedna;

    @FXML
    private Button krat;

    @FXML
    private Button minus;

    @FXML
    private Button mocnina;

    @FXML
    private Button modulo;

    @FXML
    private Button nula;

    @FXML
    private Button odmocnina;

    @FXML
    private Button osm;

    @FXML
    private Button pet;

    @FXML
    private Button plus;

    @FXML
    private Button rovno;

    @FXML
    private Button sedm;

    @FXML
    private Button sest;

    @FXML
    private Button smazat;

    @FXML
    private Button tri;

    @FXML
    private TextField vysledek;
    @FXML
    private TextField vypocet;

    //Cisla 
    @FXML
    void handleButtonAction(ActionEvent event) {
    if(event.getSource() == jedna)
    {
        vysledek.setText(vysledek.getText() + "1");
        if(textDopredu == true){
            vypocet.setText("1" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "1");
        }
    }
    else if(event.getSource() == dva)
    {
        vysledek.setText(vysledek.getText() + "2");
        if(textDopredu == true){
            vypocet.setText("2" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "2");
        }
    }
    else if(event.getSource() == tri)
    {
        vysledek.setText(vysledek.getText() + "3");
        if(textDopredu == true){
            vypocet.setText("3" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "3");
        }
    }
    else if(event.getSource() == ctyri)
    {
        vysledek.setText(vysledek.getText() + "4");
        if(textDopredu == true){
            vypocet.setText("4" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "4");
        }
    }
    else if(event.getSource() == pet)
    {
        vysledek.setText(vysledek.getText() + "5");
        if(textDopredu == true){
            vypocet.setText("5" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "5");
        }
    }
    else if(event.getSource() == sest)
    {
        vysledek.setText(vysledek.getText() + "6");
        if(textDopredu == true){
            vypocet.setText("6" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "6");
        }
    }
    else if(event.getSource() == sedm)
    {
        vysledek.setText(vysledek.getText() + "7");
        if(textDopredu == true){
            vypocet.setText("7" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "7");
        }
    }
    else if(event.getSource() == osm)
    {
        vysledek.setText(vysledek.getText() + "8");
        if(textDopredu == true){
            vypocet.setText("8" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "8");
        }
    }
    else if(event.getSource() == devet)
    {
        vysledek.setText(vysledek.getText() + "9");
        if(textDopredu == true){
            vypocet.setText("9" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "9");
        }
    }
    else if(event.getSource() == nula)
    {
        vysledek.setText(vysledek.getText() + "0");
       if(textDopredu == true){
            vypocet.setText("0" + vypocet.getText()); 
        }else{
            vypocet.setText(vypocet.getText() + "0");
        }
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
        vypocet.setText("√" + vypocet.getText());
        textDopredu = true;
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
        textDopredu = false;
        if(vypocet.getText().contains(".")){
            destecka = true;
        }else{
            destecka = false;
        }
        }
    }else{
        //vysledek.setText("Nebylo nic zadano");
    }
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
