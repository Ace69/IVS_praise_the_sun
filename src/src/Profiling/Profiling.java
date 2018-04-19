/****************************************************************************
* Název projektu: Kalkulačka                                                *
* Balíček: Profiling                                                        *
* Soubor: Profiling.java                                                    *
* Datum: 7.4.2018                                                           *
* Autor: David Bulawa(xbulaw01)                                             *
*                                                                           *
* Popis: Profiling - výpočet směrodatné odchylky pomocí mat. knihovny.      *
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
 * @brief Třída pro výpočet směrodatné odchylky
 * @author David Bulawa(xbulaw01)
 * @date 7.4.2018
 * @version 1.0
 */
public class Profiling {
    
    /**
     * @brief Funkce pro výpočet aritmetického průměru pole.
     * @param pole Pole nad kterým průměrnou hodnotu počítáme.
     * @return Vrací průměrnou hodnotu prvků v poli.
     */
    public static double prumer(ArrayList<Double> pole){
       double prumer = 0;
       //Sečte všechny prvky v poli
       for(int i = 0; i < pole.size();i++){
         prumer = MathLib.scitani(prumer, pole.get(i));
       }
       //Vydělíme počtem
       return MathLib.deleni(prumer, pole.size());
    }
    
    /**
     * @brief Funkce pro výpočet směrodatné odchylky prvků v poli.
     * @param pole Pole nad kterým směrodatnou odchylku počítáme.
     * @return Vrací směrodatnou odchylku prvků v poli.
     */
    public static double smOdchylka(ArrayList<Double> pole){
        double rada = 0;
        //Do proměnné řada ukládáme sumu prvků v poli^2
        for (int i = 0; i < pole.size(); i++) {
            rada += MathLib.mocnina(pole.get(i), 2);
        }
        double tmp = 0;
        //Do proměnné tmp si uložíme počet prvků * průměr pole^2
        tmp = MathLib.nasobeni(pole.size(), MathLib.mocnina(prumer(pole), 2));
        //Tyto hodnoty od sebe odečteme
        tmp = rada - tmp;
        //Nakonec přinásobíme 1/PočetPrvků - 1 a celé to umocníme
        return MathLib.odmocnina(MathLib.nasobeni(MathLib.deleni(1,MathLib.odcitani(pole.size(), 1)), tmp), 2);
    }
    
    /**
     * @brief Vypíše výsledek výpočtu směrodatné odchylky posloupnosti čísel.
     * @param args Argumenty příkazové řádky 
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
