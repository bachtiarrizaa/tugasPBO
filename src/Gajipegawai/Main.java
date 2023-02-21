/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gajipegawai;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args){
        Pegawai pegawai = new Pegawai("hrd","expert","dekstop");
        //int totalgaji = Pegawai.hitung();
        pegawai.cekdepartemen();
        pegawai.cekpengalaman();
        pegawai.cekskill();
        int totalgaji = pegawai.getGD()+ pegawai.getGP() + pegawai.getGS();
        System.out.println("Total gaji : " + totalgaji);
    }
}
