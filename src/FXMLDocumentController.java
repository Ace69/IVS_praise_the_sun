/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GitHub;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.random;

/**
 *
 * @author fpolicar
 */
public class FXMLDocumentController implements Initializable {
    
    Double data;
    int operation = -1;
    boolean destecka = false;
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

    //Cisla 
    @FXML
    void handleButtonAction(ActionEvent event) {
    if(event.getSource() == jedna)
    {
        vysledek.setText(vysledek.getText() + "1");
    }
    else if(event.getSource() == dva)
    {
        vysledek.setText(vysledek.getText() + "2");
    }
    else if(event.getSource() == tri)
    {
        vysledek.setText(vysledek.getText() + "3");
    }
    else if(event.getSource() == ctyri)
    {
        vysledek.setText(vysledek.getText() + "4");
    }
    else if(event.getSource() == pet)
    {
        vysledek.setText(vysledek.getText() + "5");
    }
    else if(event.getSource() == sest)
    {
        vysledek.setText(vysledek.getText() + "6");
    }
    else if(event.getSource() == sedm)
    {
        vysledek.setText(vysledek.getText() + "7");
    }
    else if(event.getSource() == osm)
    {
        vysledek.setText(vysledek.getText() + "8");
    }
    else if(event.getSource() == devet)
    {
        vysledek.setText(vysledek.getText() + "9");
    }
    else if(event.getSource() == nula)
    {
        vysledek.setText(vysledek.getText() + "0");
    }
    else if(event.getSource() == cara)
    {   
        if(destecka == false){
            vysledek.setText(vysledek.getText() + ".");
            destecka = true;
        }
    }
    //Mazani
    else if(event.getSource() == smazat)
    {
        vysledek.setText("");
    }

    //Pocetni operace
    else if(event.getSource() == plus)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 1; //Scitani
        vysledek.setText("");
    }
    else if(event.getSource() == minus)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 2; //Odcitni
        vysledek.setText("");
    }
    else if(event.getSource() == krat)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 3; //Nasobeni
        vysledek.setText("");
    }
    else if(event.getSource() == deleno)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 4; //Deleni
        vysledek.setText("");
    }
    else if(event.getSource() == odmocnina)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 5; //Mocnina
        vysledek.setText("");
    }
    else if(event.getSource() == mocnina)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 6; //Odmocnina
        vysledek.setText("");
    }
    else if(event.getSource() == modulo)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 7; //Faktorial
        vysledek.setText("");
    }
    else if(event.getSource() == faktorial)
    {
        data = Double.parseDouble(vysledek.getText());
        operation = 8; //Modulo
        vysledek.setText("");
    }
    
    else if(event.getSource() == rovno)
    {
        
        if(!vysledek.getText().isEmpty()){
        Float druhyOperand = Float.parseFloat(vysledek.getText());
        switch(operation)
        {
            case 1: //Scitani
                Double ans = data + druhyOperand;
                vysledek.setText(String.valueOf(ans));break;
            case 2: //Odcitani
                ans = data - druhyOperand;
                vysledek.setText(String.valueOf(ans));break;
            case 3: //Nasobeni
                ans = data * druhyOperand;
                vysledek.setText(String.valueOf(ans));break;
            case 4: //Deleni
                ans = data / druhyOperand;
                vysledek.setText(String.valueOf(ans));break;
            case 5: //Odmocnina
                ans = Math.sqrt(data);
                vysledek.setText(String.valueOf(ans));break;
            case 6: //Mocnina
                ans = Math.pow(data, druhyOperand);
                vysledek.setText(String.valueOf(ans));break;
           /* case 7: //Faktorial
                Float fakt = data + druhyOperand;
                vysledek.setText(String.valueOf(fakt));break;
            case 8: //Modulo
                Float mod = data + druhyOperand;
                vysledek.setText(String.valueOf(mod));break;
           */
        }
        }
          
    }else{
        vysledek.setText("Nebylo nic zadano");
    }
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
