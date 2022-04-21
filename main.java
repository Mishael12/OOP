package com.TugasDavin;

public class main {
    public static void main(String []args){
        Manusia man1 = new Manusia("Aku", "3923842934",true, true);
        System.out.println(man1.toString());

        System.out.println();
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        System.out.println(mhs1.toString());

        System.out.println();
        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.toString());

        System.out.println();
        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.toString());
    }
}
