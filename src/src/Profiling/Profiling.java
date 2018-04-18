package Profiling;

import Lib.MathLib;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @brief Trida pro vypocet smerodatne odchylka
 * @author David Bulawa(xbulaw01)
 * @date 7.4.2018
 * @version 1.0
 */
public class Profiling {
    
    /**
     * @brief Funkce pro vypocet Aritmetickeho prumeru pole.
     * @param pole Pole nad kterym prumernou hodnotu pocitame.
     * @return Vraci prumernou hodnotu prvku v poli.
     */
    public static double prumer(ArrayList<Double> pole){
       double prumer = 0;
       //Secte vsechny prvky v poli
       for(int i = 0; i < pole.size();i++){
         prumer = MathLib.scitani(prumer, pole.get(i));
       }
       //Vydelime poctem
       return MathLib.deleni(prumer, pole.size());
    }
    /**
     * Funkce pro vypocet Smerodatne odchylky prvku v poli.
     * @param pole Pole nad kterym smerodatnou odchylku pocitame.
     * @return Vraci smerodatnou odchylku prvku v poli.
     */
    public static double smOdchylka(ArrayList<Double> pole){
        double rada = 0;
        //Do promene rada ukladame sumu prvku v poli^2
        for (int i = 0; i < pole.size(); i++) {
            rada += MathLib.mocnina(pole.get(i), 2);
        }
        double tmp = 0;
        //do promene tmp si ulozime Pocet prvku * prumer pole^2
        tmp = MathLib.nasobeni(pole.size(), MathLib.mocnina(prumer(pole), 2));
        //tyto hodnoty od sebe odecteme
        tmp = rada - tmp;
        //nakonec prinasobime 1/PocetPrvku - 1 a cele to umocnime
        return MathLib.odmocnina(MathLib.nasobeni(MathLib.deleni(1,MathLib.odcitani(pole.size(), 1)), tmp), 2);
    }
    /**
     * @brief Main zatim slouzi k otestovani.
     * Program by mel pocitat spravne.
     * @param args 
     * @TODO Predelat na automatickou detekci poctu cisel a poresit cteni cisel ze stdin(mozna funguje) viz. zadani.
     * @TODO Prodiskutovat.
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
}
