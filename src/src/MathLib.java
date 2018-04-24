/************************************************************************
* N�zev projektu: Kalkula�ka                                            *
* Bal��ek: Lib                                                          *
* Soubor: MathLib.java                                                  *
* Datum: 7.4.2018                                                       *
* Autor: Tom� Sv�r�k (xsvera04)                                        *
*                                                                       *
* Popis: Matematick� knihovna pro kalkula�ku                            *
*                                                                       *
************************************************************************/

/**
 * @file MathLib.java 
 * 
 * @brief Matematick� knihovna pro kalkula�ku
 */

/**
 * @package Lib
 * 
 * @brief Matematick� knihovna
 */
package Lib;

/**
 * @brief T��da matematick� knihovny.
 * @author Tom� Sv�r�k (xsvera04)
 * @date 7.4.2018
 * @version 1.0
 */
public class MathLib {
    
    /**
     * @brief Metoda se�te dv� ��sla.
     * @param cislo1 Prvn� s��tanec
     * @param cislo2 Druh� s��tanec
     * @return Vrac� sou�et ��sel
     */
    public static double scitani(double cislo1, double cislo2){
        return cislo1 + cislo2;
    }
    
    /**
     * @brief Metoda ode�te dv� ��sla.
     * @param cislo1 Men�enec
     * @param cislo2 Men�itel
     * @return Vrac� rozd�l ��sel
     */
    public static double odcitani(double cislo1, double cislo2){
        return cislo1 - cislo2;
    }
    
    /**
     * @brief Metoda vyn�sob� dv� ��sla.
     * @param cislo1 Prvn� �initel
     * @param cislo2 Druh� �initel
     * @return Vrac� sou�in ��sel
     */
    public static double nasobeni(double cislo1, double cislo2){
        return cislo1 * cislo2;
    }
    
    /**
     * @brief Metoda vyd�l� dv� ��sla.
     * @param delenec ��slo kter� chceme d�lit
     * @param delitel ��slo kter�m d�l�me
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud d�litel = 0
     * @return Vrac� pod�l ��sel
     */
    public static double deleni(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        return delenec / delitel;
    }
    
    /**
     * @brief Metoda vypo��t� faktori�l zadan�ho ��sla.
     * @param cislo ��slo ze kter�ho chceme jeho faktori�l.
     * @pre cislo >= 0
     * @throw IllegalArgumentException - pokud je zadan� ��slo z�porn�.
     * @return Faktori�l ��sla.
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
     * @brief Metoda vypo��t� z�klad umocn�n� na hodnotu exponentu.
     * @param zaklad ��slo kter� chceme umoc�ovat
     * @param exponent Exponent kter�m budeme umoc�ovat
     * @return Vrac� v�sledek mocn�n�
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
     * @brief Metoda vypo��t� odmocninu zadan�ho stupn� ze z�kladu.
     * @param zaklad ��slo kter� chceme odmocnit
     * @param stupen Hodnota odmocniny
     * @pre zaklad > 0 - v�raz pod odmocninou nesm� b�t z�porn�
     * @pre stupen != 0 odmocnina nesm� b�t nult�ho stupn�
     * @return Vrac� v�sledek odmocn�n�
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
     * @brief Metoda vypo��t� modulo dvou ��sel.
     * @param delenec ��slo kter� chceme d�lit
     * @param delitel ��slo kter�m d�l�me
     * @pre delitel != 0
     * @throw ArithmeticExcpetion - pokud d�litel = 0
     * @return Vrac� zbytek po d�len�
     */
    public static double modulo(double delenec, double delitel){
        if(delitel == 0){
            throw new ArithmeticException("Deleni nulou");
        }
        return delenec % delitel;
    }
} // public class MathLib()
