package com.TugasDavin;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String Nama,  String NIK, Boolean JenisKelamin, Boolean Menikah, String NIM, double IPK){
        super(Nama, NIK, JenisKelamin, Menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    void setNIM(String NIM){
        this.NIM = NIM;
    }
    String getNIM(){
        return NIM;
    }

    void setIPK(double IPK){
        this.IPK = IPK;
    }
    double getIPK(){
        return IPK;
    }

    String getStatus(){
        String Prodi = "";
        String Angkatan = "";
        //Angkatan
        if(getNIM().substring(0,2).equals("20")){
            Angkatan = "2020";
        }else if(NIM.substring(0,2).equals("21")){
            Angkatan = "2021";
        }else if(getNIM().substring(0,2).equals("22")){
            Angkatan = "2022";
        }

        //Prodi
        switch(getNIM().charAt(6)){
            case ('2'):
            Prodi = "Teknik Meniup Gelembung";
            break;
            case ('3'):
            Prodi = "Teknik Berburu Ubur Ubur";
            break;
            case ('4'):
            Prodi = "Sistem Perhamburgeran";
            break;
            case ('6'):
            Prodi = "Pendidikan Chum Bucket";
            break;
            case ('7'):
            Prodi = "Teknologi Telepon Kerang";
            break;
        }
        return (Prodi+", "+Angkatan);
        
    }

    double getBeasiswa(){
        double hasil = 0;
        if(getIPK() <= 3.5){
            hasil = (getPendapatan()+50);
        }else if(getIPK() <= 4){
            hasil = (getPendapatan()+75);
        }
        return hasil;
    }

    public String toString(){
        return("Nama          : "+getNama()+"\n"
              +"NIK           : "+getNik()+"\n"
              +"Jenis Kelamin : "+getJenisKelamin()+"\n"
              +"Pendapatan    : "+getBeasiswa()+"$"+"\n"
              +"IPK           : "+getIPK()+"\n"
              +"NIM           : "+getNIM()+"\n"
              +"Status        : "+getStatus());
    }

}
