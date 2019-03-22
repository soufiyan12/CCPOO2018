/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etudiant;

/**
 *
 * @author soufiyan
 */
public class Element {
        public static int numero_Element=0;
        private Etudiant valeur;
        private Element suivant;

    public Element(Etudiant valeur, Element suivant) {
        this.valeur = valeur;
        this.suivant = suivant;
        numero_Element++;   
    }

 

    public static int getNumero_Element() {
        return numero_Element;
    }

    
    public Etudiant getValeur() {
        return valeur;
    }

    public Element getSuivant() {
        return suivant;
    }

    public void setSuivant(Element suivant) {
        this.suivant = suivant;
    }
        

    
}
