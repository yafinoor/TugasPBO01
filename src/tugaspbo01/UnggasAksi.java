/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo01;

/**
 *
 * @author Asus
 */
public class UnggasAksi {
    public static void main(String[] args) {
        unggas Ayam = new unggas();
            Ayam.bentuk_cakar="cakar kecil";
                Ayam.bentuk_paruh="runcing kecil";
                    Ayam.panjang_bulu="2 cm";
                Ayam.ukuran_tubuh="kecil";
            Ayam.warna_bulu="hitam merah";
        
        Ayam.cetakinfo();
   
        unggas Elang = new unggas();      
            Elang.bentuk_cakar="cakar kecil";
                Elang.bentuk_paruh="runcing kecil";
                    Elang.panjang_bulu="2 cm";
                Elang.ukuran_tubuh="kecil";
            Elang.warna_bulu="hitam merah";
  
         Elang.cetakinfo();
         
        unggas Angsa = new unggas();
            Angsa.bentuk_cakar="cakar kecil";
                Angsa.bentuk_paruh="runcing kecil";
                    Angsa.panjang_bulu="2 cm";
                Angsa.ukuran_tubuh="kecil";
            Angsa.warna_bulu="hitam merah";
        Angsa.cetakinfo();
    }
}
