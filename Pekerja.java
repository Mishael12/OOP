package com.TugasDavin;


public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String Nama,  String NIK, Boolean JenisKelamin, Boolean Menikah){
        super(Nama, NIK, JenisKelamin, Menikah);
        this.NIP = NIP;
        this.hariKerja = hariKerja;
        this.jamKerja = jamKerja;
    }

    void setNIP(String NIP){
        this.NIP = NIP;
    }
    String getNIP(){
        return NIP;
    }

    void setGaji(double Gaji){
        this.gaji = Gaji;
    }

    void setJamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }
    int getJamKerja(){
        return jamKerja;
    }

    void setHariKerja(int hariKerja){
        this.hariKerja = hariKerja;
    }
    int getHariKerja(){
        return hariKerja;
    }

    String getStatus(){
        String status = "";
        String status2 = "";
        switch(getNIP().charAt(0)){
            case ('1'):
            status = "Mondstadt";
            break;
            case ('2'):
            status = "Liyue";
            break;
            case ('3'):
            status = "Inazuma";
            break;
            case ('4'):
            status = "Sumeru";
            break;
            case ('5'):
            status = "Fontaine";
            break;
            case ('6'):
            status = "Natlan";
            break;
            case ('7'):
            status = "Snezhnaya";
            break;
        }
        switch(getNIP().charAt(6)){
            case ('1'):
            status2 = "Pemasaran";
            break;
            case ('2'):
            status2 = "Humas";
            break;
            case ('3'):
            status2 = "Riset";
            break;
            case ('4'):
            status2 = "Teknologi";
            break;
            case ('5'):
            status2 = "Personalia";
            break;
            case ('6'):
            status2 = "Akademik";
            break;
            case ('7'):
            status2 = "Administrasi";
            break;
            case ('8'):
            status2 = "Operasional";
            break;
            case ('9'):
            status2 = "Pembangunan";
            break;
        }
        char status3;
        status3 = getNIP().charAt(2);

        return (status+", "+status2+" cabang ke- "+status3);
    }

    public String toString(){
        double bonusL = 0;
        double bonusLi = 0;
        gaji = (getJamKerja()*getHariKerja()*15);
        bonusLi = ((((getHariKerja()/7)*2)*getJamKerja()*20));
        if(getJamKerja() > 7){
            double hasil = ((getHariKerja()/7)*2) - getHariKerja();
            bonusL = (hasil*(getJamKerja()-7)*7);
            bonusL = ((7-getJamKerja())*7);
        }
        bonus = bonusL+ bonusLi;

        double pendapatan = (getPendapatan()+gaji+bonus);
        return ("Nama          : "+getNama()+"\n"
               +"NIK           : "+getNik()+"\n"
               +"Jenis Kelamin : "+getJenisKelamin()+"\n"
               +"Pendapatan    : "+pendapatan+"$"+"\n"
               +"Bonus         : "+bonus+"$"+"\n"
               +"Gaji          : "+gaji+"$"+"\n"
               +"Status        : "+getStatus());
    }
}
