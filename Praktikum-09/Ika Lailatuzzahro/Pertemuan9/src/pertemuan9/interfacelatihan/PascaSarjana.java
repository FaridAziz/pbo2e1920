/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfacelatihan;

/**
 *
 * @author ELA-PC
 */
public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi {

    public PascaSarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
       System.out.println("Aku sudah menyelesaikan TESIS"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
