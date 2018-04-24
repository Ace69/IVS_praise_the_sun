/****************************************************************************
* N�zev projektu: Kalkula�ka                                                *
* Bal��ek: Profiling                                                        *
* Soubor: Profiling.java                                                    *
* Datum: 7.4.2018                                                           *
* Autor: David Bulawa(xbulaw01)                                             *
*                                                                           *
* Popis: Profiling - v�po�et sm�rodatn� odchylky pomoc� mat. knihovny.      *
*                                                                           *
****************************************************************************/

/**
 * @file Profiling.java 
 * 
 * @brief Profiling matematick� knihovny.
 */

/**
 * @package Profiling
 * 
 * @brief Profiling matematick� knihovny.
 */
package Profiling;

import Lib.MathLib;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @brief T��da pro v�po�et sm�rodatn� odchylky
 * @author David Bulawa(xbulaw01)
 * @date 7.4.2018
 * @version 1.0
 */
public class Profiling {
    
    /**
     * @brief Funkce pro v�po�et aritmetick�ho pr�m�ru pole.
     * @param pole Pole nad kter�m pr�m�rnou hodnotu po��t�me.
     * @return Vrac� pr�m�rnou hodnotu prvk� v poli.
     */
    public static double prumer(ArrayList<Double> pole){
       double prumer = 0;
       //Se�te v�echny prvky v poli
       for(int i = 0; i < pole.size();i++){
         prumer = MathLib.scitani(prumer, pole.get(i));
       }
       //Vyd�l�me po�tem
       return MathLib.deleni(prumer, pole.size());
    }
    
    /**
     * @brief Funkce pro v�po�et sm�rodatn� odchylky prvk� v poli.
     * @param pole Pole nad kter�m sm�rodatnou odchylku po��t�me.
     * @return Vrac� sm�rodatnou odchylku prvk� v poli.
     */
    public static double smOdchylka(ArrayList<Double> pole){
        double rada = 0;
        //Do prom�nn� �ada ukl�d�me sumu prvk� v poli^2
        for (int i = 0; i < pole.size(); i++) {
            rada += MathLib.mocnina(pole.get(i), 2);
        }
        double tmp = 0;
        //Do prom�nn� tmp si ulo��me po�et prvk� * pr�m�r pole^2
        tmp = MathLib.nasobeni(pole.size(), MathLib.mocnina(prumer(pole), 2));
        //Tyto hodnoty od sebe ode�teme
        tmp = rada - tmp;
        //Nakonec p�in�sob�me 1/Po�etPrvk� - 1 a cel� to umocn�me
        return MathLib.odmocnina(MathLib.nasobeni(MathLib.deleni(1,MathLib.odcitani(pole.size(), 1)), tmp), 2);
    }
    
    /**
     * @brief Vyp�e v�sledek v�po�tu sm�rodatn� odchylky posloupnosti ��sel.
     * @param args Argumenty p��kazov� ��dky 
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
