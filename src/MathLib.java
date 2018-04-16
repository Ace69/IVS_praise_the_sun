package GitHub;

/**
 * @brief Matematicka knihovna pro kalkulacku.
 * @author Tomas Sverak (xsvera04)
 * @date 6.4. 2018
 * @version 1.0
 */
public class MathLib {
    
    /**
     * @brief Metoda secte dve cisla.
     * @param cislo1 Prvni scitanec
     * @param cislo2 Druhy scitanec
     * @return Soucet cisla1 a cisla2
     */
    protected static double scitani(double cislo1, double cislo2){
        return cislo1 + cislo2;
    }
    
    /**
     * @brief Metoda odecte dve cisla.
     * @param cislo1 Mensenec
     * @param cislo2 Mensitel
     * @return Rozdil cisla1 a cisla2
     */
    protected static double odcitani(double cislo1, double cislo2){
        return cislo1 - cislo2;
    }
    
    /**
     * @brief Metoda vynasobi dve cisla.
     * @param cislo1 Prvni cinitel
     * @param cislo2 Druhy cinitel
     * @return Soucin cisla1 a cisla2
     */
    protected static double nasobeni(double cislo1, double cislo2){
        return cislo1 * cislo2;
    }
    
    /**
     * @brief Metoda vydeli dve cisla.
     * @param delenec Cislo ktere chceme delit
     * @param delitel Cislo kterym delime
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud delitel = 0
     * @return Podil delence a delitele
     */
    protected static double deleni(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
    return delenec / delitel;
    }
    
    /**
     * @brief Metoda vypocita faktorial zadaneho cisla.
     * @param cislo Cislo ze ktereho chceme jeho faktorial.
     * @pre cislo > 0
     * @throw IllegalArgumentException - pokud je zadane cislo zaporne.
     * @return Faktorial cisla.
     */
    protected static double faktorial(double cislo){
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
     * @brief Metoda vypocita zaklad umocneny na hodnotu exponenty.
     * @param zaklad Cislo ktere chceme umocnovat
     * @param exponent Exponent kterym budeme umocnovat
     * @return Zaklad^exponent
     */
    protected static double mocnina(double zaklad, double exponent){
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
     * @brief Metoda vypocita odmocnina zadaneho stupne ze zakladu
     * @param zaklad Cislo ktere chceme odmocnit
     * @param stupen Hodnota odmocniny
     * @pre zaklad > 0 - vyyraz pod odmocninou nesmi byt zaporny
     * @pre stupen != 0 odmocnina nesmi byt nulteho stupne
     * @return zaklad^(1/stupen)
     */
    protected static double odmocnina(double zaklad, double stupen){
        if(zaklad < 0){
            throw new IllegalArgumentException("Vyraz pod odmocninou nesmi byt zaporny");
        }
        if(stupen == 0){
            throw new IllegalArgumentException("Odmocnina nesmi byt nulteho stupne");
        }
        
        return Math.pow(zaklad, 1.00 / stupen);
    }
    /**
     * @brief Metoda vypocita modulo dvou cisel.
     * @param delenec Cislo ktere chceme delit
     * @param delitel Cislo kterym delime
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud delitel = 0
     * @return Zbytek po deleni dvou cisel
     */
    protected static double modulo(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        
        return delenec % delitel;
    }
}
