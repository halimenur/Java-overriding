package com.company;

public class OgrenciKrediManager extends  BaseKrediManager{
    private double miktar;
    //BaseKrediManager içindeki aynı metodla yazıldı BaseKrediManager içindeki hesapla metodu ezilmiş oldu
    //Çağrıldığında burdaki metod çalışacak

    public double hesapla(double tutar){
        //Faiz hesaplama
        return tutar*1.10;

    }



}
