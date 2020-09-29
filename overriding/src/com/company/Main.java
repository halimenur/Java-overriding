package com.company;

public class Main {

    public static void main(String[] args) {
 // OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
  //System.out.println(ogretmenKrediManager.hesapla(1000));

        BaseKrediManager[] baseKrediManagers=new BaseKrediManager [] {new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager baseKrediManager1:baseKrediManagers){
       System.out.println(baseKrediManager1.hesapla(1000));
         }

        //OgrenciKrediManager ogrenciKrediManager=new OgrenciKrediManager(1000);
        //System.out.println(ogrenciKrediManager.hesapla1(1000));


    }
}
