
package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika Subhan = new Matematika(5,1);
        
        System.out.println("Hasil penjumlahan:"+Subhan.setPenjumlahan());
        System.out.println("Hasil pengurangan:"+Subhan.setPengurangan());
        System.out.println("Hasil perkalian:"+Subhan.setPerkalian());
        System.out.println("Hasil pembagian:"+Subhan.setPembagian());

    }
    
}
