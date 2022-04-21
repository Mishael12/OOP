package com.TugasDavin;

public class Manusia {
    private String Nama;
    private String NIK;
    private boolean JenisKelamin;
    private boolean Menikah;

    Manusia(String Nama,  String NIK, Boolean JenisKelamin, Boolean Menikah){
        this.Nama = Nama;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.Menikah = Menikah;
    }

    void setNama(String Nama){
        this.Nama = Nama;
    }
    String getNama(){
        return Nama;
    }

    void setNik(String NIK){
        this.NIK = NIK;
    }
    String getNik(){
        return NIK;
    }

    void setJenisKelamin(boolean JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    Boolean getJenisKelamin(){
        return JenisKelamin;
    }

    void setMenikah(Boolean Menikah){
        this.Menikah = Menikah;
    }
    Boolean getMenikah(){
        return Menikah;
    }
    // boolean jenisKelamin(){
    //     if(getJenisKelamin()==true){
    //         System.out.println("Laki - Laki");
    //     }else{
    //         System.out.println("Perempuan");
    //     }
    //     return getJenisKelamin();
    // }

    double getTunjangan(){
        int x;
        if(getJenisKelamin()==true){
            x = 25;
        }else{
            x = 20;
        }
        return x;
    }

    double getPendapatan(){
        double y;
        if(getMenikah()==false){
            y = 15;
        }else{
            y = getTunjangan();
        }
        return y;
    }

    public String toString(){
       return ("Nama          : "+getNama()+"\n"
              +"NIK           : "+getNik()+"\n"
              +"Jenis Kelamin : "+getJenisKelamin()+"\n"
              +"Pendapatan    : "+getPendapatan());
    }

}
