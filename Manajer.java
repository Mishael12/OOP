package com.TugasDavin;

public class Manajer extends Pekerja{
    private int lamaKerja;
    
    Manajer(int jamKerja, int hariKerja, String NIP, String Nama,  String NIK, Boolean JenisKelamin, Boolean Menikah, int lamaKerja){
        super(jamKerja, hariKerja, NIP, Nama, NIK, JenisKelamin, Menikah);
        this.lamaKerja = lamaKerja;
    }

    void setlamaKerja(int lamaKerja){
        this.lamaKerja = lamaKerja;
    }
    int getlamaKerja(){
        return lamaKerja;
    }

    public String toString(){
        double bonusL = 0;
        double hasil = 0;
        double bonusLi = 0;
        double gaji = (getJamKerja()*getHariKerja()*15);
        if(getJamKerja() > 7){
            hasil = getHariKerja()-((double)(getHariKerja()/7)*2);
            bonusL = (hasil*(getJamKerja()-7)*7);
        }
        bonusLi = ((((getHariKerja()/7)*2)*getJamKerja()*20));
        double bonus = (bonusL + bonusLi) + ((bonusL + bonusLi)*0.3);
        double pendapatan = (getPendapatan()+gaji+bonus+15);
        return ("Nama          : "+getNama()+"\n"
               +"NIK           : "+getNik()+"\n"
               +"Jenis Kelamin : "+getJenisKelamin()+"\n"
               +"Pendapatan    : "+pendapatan+"$"+"\n"
               +"Bonus         : "+bonus+"$"+"\n"
               +"Gaji          : "+gaji+"$"+"\n"
               +"Status        : "+getStatus()+"\n"
               +"Lama Kerja    : "+getlamaKerja());
    }
}
