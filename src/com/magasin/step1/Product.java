package com.magasin.step1;

import java.sql.SQLOutput;

public class Product {
     long code ;
     String designation;
     float prix ;
    void initialiser(long c,String des,float pr){
     code=c;
     designation=des;
     prix=pr;
    }
    void modifierPrix(float pr){
       prix=pr;
    }
    void afficherProduct(){
        System.out.println("-------PRODUCT-------");
        System.out.println("Code :"+code);
        System.out.println("Designation :"+designation);
        System.out.println("Prix :"+prix);

    }

}
// ce type de methode facilite la maitenance des applications en cas de changement de besoins
//ou bien de regle de gestion