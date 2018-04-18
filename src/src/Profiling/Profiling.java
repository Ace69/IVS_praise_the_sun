/****************************************************************************
* Název projektu: Kalkulaèka                                                *
* Balíèek: Profiling                                                        *
* Soubor: Profiling.java                                                    *
* Datum: 7.4.2018                                                           *
* Autor: David Bulawa(xbulaw01)                                             *
*                                                                           *
* Popis: Profiling - výpoèet smìrodatné odchylky pomocí mat. knihovny.      *
*                                                                           *
****************************************************************************/

/**
 * @file Profiling.java 
 * 
 * @brief Profiling matematické knihovny.
 */

/**
 * @package Profiling
 * 
 * @brief Profiling matematické knihovny.
 */
package Profiling;

import Lib.MathLib;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @brief Tøída pro výpoèet smìrodatné odchylky
 * @author David Bulawa(xbulaw01)
 * @date 7.4.2018
 * @version 1.0
 */
public class Profiling {
    
    /**
     * @brief Funkce pro výpoèet aritmetického prùmìru pole.
     * @param pole Pole nad kterým prùmìrnou hodnotu poèítáme.
     * @return Vrací prùmìrnou hodnotu prvkù v poli.
     */
    public static double prumer(ArrayList<Double> pole){
       double prumer = 0;
       //Seète všechny prvky v poli
       for(int i = 0; i < pole.size();i++){
         prumer = MathLib.scitani(prumer, pole.get(i));
       }
       //Vydìlíme poètem
       return MathLib.deleni(prumer, pole.size());
    }
    
    /**
     * @brief Funkce pro výpoèet smìrodatné odchylky prvkù v poli.
     * @param pole Pole nad kterým smìrodatnou odchylku poèítáme.
     * @return Vrací smìrodatnou odchylku prvkù v poli.
     */
    public static double smOdchylka(ArrayList<Double> pole){
        double rada = 0;
        //Do promìnné øada ukládáme sumu prvkù v poli^2
        for (int i = 0; i < pole.size(); i++) {
            rada += MathLib.mocnina(pole.get(i), 2);
        }
        double tmp = 0;
        //Do promìnné tmp si uložíme poèet prvkù * prùmìr pole^2
        tmp = MathLib.nasobeni(pole.size(), MathLib.mocnina(prumer(pole), 2));
        //Tyto hodnoty od sebe odeèteme
        tmp = rada - tmp;
        //Nakonec pøinásobíme 1/PoèetPrvkù - 1 a celé to umocníme
        return MathLib.odmocnina(MathLib.nasobeni(MathLib.deleni(1,MathLib.odcitani(pole.size(), 1)), tmp), 2);
    }
    
    /**
     * @brief Vypíše výsledek výpoètu smìrodatné odchylky posloupnosti èísel.
     * @param args Argumenty pøíkazové øádky 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList();
        Double hodnota;
        int pocet = 0;
        while(sc.hasNext()){
            hodnota = sc.nextDouble();
            list.add(pocet,hodnota);
            pocet++;
        }
        
        System.out.println(smOdchylka(list));
    }
} // public class Profiling
