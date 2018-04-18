/************************************************************************
* Název projektu: Kalkulačka                                            *
* Balíček: Lib                                                      *
* Soubor: MathLib.java                                                  *
* Datum: 7.4.2018                                                       *
* Autor: Tomáš Svěrák (xsvera04)                                        *
*                                                                       *
* Popis: Matematická knihovna pro kalkulačku                            *
*                                                                       *
************************************************************************/

/**
 * @file MathLib.java 
 * 
 * @brief Matematická knihovna pro kalkulačku
 */

/**
 * @package Lib
 * 
 * @brief Třída matematické knihovny
 */
package Lib;

/**
 * @brief Matematická knihovna pro kalkulačku.
 * @author Tomáš Svěrák (xsvera04)
 * @date 7.4.2018
 * @version 1.0
 * @class Matematická knihovna pro kalkulačku.
 */
public class MathLib {
    
    /**
     * @brief Metoda sečte dvě čísla.
     * @param cislo1 První sčítanec
     * @param cislo2 Druhý sčítanec
     * @return Vrací součet čísel
     */
    public static double scitani(double cislo1, double cislo2){
        return cislo1 + cislo2;
    }
    
    /**
     * @brief Metoda odečte dvě čísla.
     * @param cislo1 Menšenec
     * @param cislo2 Menšitel
     * @return Vrací rozdíl čísel
     */
    public static double odcitani(double cislo1, double cislo2){
        return cislo1 - cislo2;
    }
    
    /**
     * @brief Metoda vynásobí dvě čísla.
     * @param cislo1 První činitel
     * @param cislo2 Druhý činitel
     * @return Vrací součin čísel
     */
    public static double nasobeni(double cislo1, double cislo2){
        return cislo1 * cislo2;
    }
    
    /**
     * @brief Metoda vydělí dvě čísla.
     * @param delenec Číslo které chceme dělit
     * @param delitel Číslo kterým dělíme
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud dělitel = 0
     * @return Vrací podíl čísel
     */
    public static double deleni(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        return delenec / delitel;
    }
    
    /**
     * @brief Metoda vypočítá faktoriál zadaného čísla.
     * @param cislo Číslo ze kterého chceme jeho faktoriál.
     * @pre cislo >= 0
     * @throw IllegalArgumentException - pokud je zadané číslo záporné.
     * @return Faktoriál čísla.
     */
    public static double faktorial(double cislo){
        if(cislo < 0){
            throw new IllegalArgumentException("Zaporny faktorial");
        }
        
        if(cislo == 1 || cislo == 0){
            return 1;
        }
        double vysledek = 1;
        for (int i = 2; i <= cislo; i++) {
            vysledek *= i;
        }
        return vysledek;
    }
    
    /**
     * @brief Metoda vypočítá základ umocněný na hodnotu exponentu.
     * @param zaklad Číslo které chceme umocňovat
     * @param exponent Exponent kterým budeme umocňovat
     * @return Vrací výsledek mocnění
     */
    public static double mocnina(double zaklad, double exponent){
        if(exponent <= 0){
            throw new IllegalArgumentException("Exponent musi byt prirozeny");
        }
        double vysledek = 1;
        for (double i = 0; i < exponent; i++) {
            vysledek *= zaklad;
        }
        return vysledek;
    }
    
    /**
     * @brief Metoda vypočítá odmocninu zadaného stupně ze základu.
     * @param zaklad Číslo které chceme odmocnit
     * @param stupen Hodnota odmocniny
     * @pre zaklad > 0 - výraz pod odmocninou nesmí být záporný
     * @pre stupen != 0 odmocnina nesmí být nultého stupně
     * @return Vrací výsledek odmocnění
     */
    public static double odmocnina(double zaklad, double stupen){
        if(zaklad < 0){
            throw new IllegalArgumentException("Vyraz pod odmocninou nesmi byt zaporny");
        }
        if(stupen == 0){
            throw new IllegalArgumentException("Odmocnina nesmi byt nulteho stupne");
        }
        return Math.pow(zaklad, 1.00 / stupen);
    }
    /**
     * @brief Metoda vypočítá modulo dvou čísel.
     * @param delenec Číslo které chceme dělit
     * @param delitel Číslo kterým dělíme
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud dělitel = 0
     * @return Vrací zbytek po dělení
     */
    public static double modulo(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        return delenec % delitel;
    }
} // public class MathLib()
