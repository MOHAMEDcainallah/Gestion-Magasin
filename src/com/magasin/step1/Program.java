package com.magasin.step1;

public class Program {
    public static void main(String[] args) {
    Product p1=new Product();
    p1.initialiser(12,"sumsung j7",1200.02f);
        Product p2=new Product();
        p2.initialiser(500,"sumsung s20",4500.00f);
        Product p3=new Product();
        p3.initialiser(95,"iphone 12",9000.00f);
        //modifier le prix d un product
        p2.modifierPrix(3600.00f);
        p3.modifierPrix(10000.00f);
        //afficher les produits
        p1.afficherProduct();
        p2.afficherProduct();
        p3.afficherProduct();


    }
}
