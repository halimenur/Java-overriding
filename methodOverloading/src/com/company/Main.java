package com.company;

public class Main {

    public static void main(String[] args) {
     Islem islem=new Islem();
     //Overloading yapmış olduk aynı metod ismi farklı adet
        // parametreler aldığından aynı isimde kullanabildik
     System.out.println(islem.toplama(5,7));
     System.out.println(islem.toplama(9,8,7));

   }
}
