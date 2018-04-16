package GitHub;

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
    public static double prumer(double pole[]){
       double prumer = 0;
       //Secte vsechny prvky v poli
       for(int i = 0; i < pole.length;i++){
         prumer = MathLib.scitani(prumer, pole[i]);
       }
       //Vydelime poctem
       return MathLib.deleni(prumer, pole.length);
    }
    /**
     * Funkce pro vypocet Smerodatne odchylky prvku v poli.
     * @param pole Pole nad kterym smerodatnou odchylku pocitame.
     * @return Vraci smerodatnou odchylku prvku v poli.
     */
    public static double smOdchylka(double pole[]){
        double rada = 0;
        //Do promene rada ukladame sumu prvku v poli^2
        for (int i = 0; i < pole.length; i++) {
            rada += MathLib.mocnina(pole[i], 2);
        }
        double tmp = 0;
        //do promene tmp si ulozime Pocet prvku * prumer pole^2
        tmp = MathLib.nasobeni(pole.length, MathLib.mocnina(prumer(pole), 2));
        //tyto hodnoty od sebe odecteme
        tmp = rada - tmp;
        //nakonec prinasobime 1/PocetPrvku - 1 a cele to umocnime
        return MathLib.odmocnina(MathLib.nasobeni(MathLib.deleni(1,MathLib.odcitani(pole.length, 1)), tmp), 2);
    }
    /**
     * @brief Main zatim slouzi k otestovani.
     * Program by mel pocitat spravne.
     * @param args 
     * @TODO Predelat na automatickou detekci poctu cisel a poresit cteni cisel ze stdin(mozna funguje) viz. zadani.
     * @TODO Prodiskutovat.
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[] pole = new double[10];
        int pocet = 0;
        while((pocet != 10)){
            pole[pocet]=pocet+1;
            pocet++;
        }
        /*
        int pocet = 1;
        while((stdin.hasNext()) && (pocet != 10)){
            pole[pocet]=stdin.nextDouble();
            pocet++;
        }*/
        System.out.println(smOdchylka(pole));
    }
}
