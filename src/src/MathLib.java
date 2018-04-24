/************************************************************************
* Název projektu: Kalkulaèka                                            *
* Balíèek: Lib                                                          *
* Soubor: MathLib.java                                                  *
* Datum: 7.4.2018                                                       *
* Autor: Tomáš Svìrák (xsvera04)                                        *
*                                                                       *
* Popis: Matematická knihovna pro kalkulaèku                            *
*                                                                       *
************************************************************************/

/**
 * @file MathLib.java 
 * 
 * @brief Matematická knihovna pro kalkulaèku
 */

/**
 * @package Lib
 * 
 * @brief Matematická knihovna
 */
package Lib;

/**
 * @brief Tøída matematické knihovny.
 * @author Tomáš Svìrák (xsvera04)
 * @date 7.4.2018
 * @version 1.0
 */
public class MathLib {
    
    /**
     * @brief Metoda seète dvì èísla.
     * @param cislo1 První sèítanec
     * @param cislo2 Druhý sèítanec
     * @return Vrací souèet èísel
     */
    public static double scitani(double cislo1, double cislo2){
        return cislo1 + cislo2;
    }
    
    /**
     * @brief Metoda odeète dvì èísla.
     * @param cislo1 Menšenec
     * @param cislo2 Menšitel
     * @return Vrací rozdíl èísel
     */
    public static double odcitani(double cislo1, double cislo2){
        return cislo1 - cislo2;
    }
    
    /**
     * @brief Metoda vynásobí dvì èísla.
     * @param cislo1 První èinitel
     * @param cislo2 Druhý èinitel
     * @return Vrací souèin èísel
     */
    public static double nasobeni(double cislo1, double cislo2){
        return cislo1 * cislo2;
    }
    
    /**
     * @brief Metoda vydìlí dvì èísla.
     * @param delenec Èíslo které chceme dìlit
     * @param delitel Èíslo kterým dìlíme
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud dìlitel = 0
     * @return Vrací podíl èísel
     */
    public static double deleni(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        return delenec / delitel;
    }
    
    /**
     * @brief Metoda vypoèítá faktoriál zadaného èísla.
     * @param cislo Èíslo ze kterého chceme jeho faktoriál.
     * @pre cislo >= 0
     * @throw IllegalArgumentException - pokud je zadané èíslo záporné.
     * @return Faktoriál èísla.
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
     * @brief Metoda vypoèítá základ umocnìný na hodnotu exponentu.
     * @param zaklad Èíslo které chceme umocòovat
     * @param exponent Exponent kterým budeme umocòovat
     * @return Vrací výsledek mocnìní
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
     * @brief Metoda vypoèítá odmocninu zadaného stupnì ze základu.
     * @param zaklad Èíslo které chceme odmocnit
     * @param stupen Hodnota odmocniny
     * @pre zaklad > 0 - výraz pod odmocninou nesmí být záporný
     * @pre stupen != 0 odmocnina nesmí být nultého stupnì
     * @return Vrací výsledek odmocnìní
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
     * @brief Metoda vypoèítá modulo dvou èísel.
     * @param delenec Èíslo které chceme dìlit
     * @param delitel Èíslo kterým dìlíme
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud dìlitel = 0
     * @return Vrací zbytek po dìlení
     */
    public static double modulo(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        return delenec % delitel;
    }
} // public class MathLib()
