/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gajipegawai;

/**
 *
 * @author lenovo
 */
public class Pegawai {
    String departemen, pengalaman, skill;
    int gd = 0;
    int gp = 0;
    int gs = 0;
    Pegawai(String departemen, String pengalaman, String skill){
        this.departemen = departemen;
        this.pengalaman = pengalaman;
        this.skill = skill;
    }
    void cekdepartemen(){
        switch(this.departemen){
            case "it":
                System.out.println("Departemen IT");
                gd = gd + 8000000;
                break;
            case "hrd":
                System.out.println("Departemen HRD");
                gd = gd + 5000000;
                break;
            case "finance":
                System.out.println("Departemen Finance");
                gd = gd + 4000000;
                break;
            default:
                System.out.printf("Tidak Ada");
        }
    }
    void cekpengalaman(){
        switch(this.pengalaman){
            case "pemula":
                System.out.println("Pengalaman Pemula");
                gp = gp + 500000;
                break;
            case "menengah":
                System.out.println("Pengalaman Menengah");
                gp = gp + 2000000;
                break;
            case "expert":
                System.out.println("Pengalaman Expert");
                gp = gp + 2000000;
                break;
            default:
                System.out.printf("Tidak Ada");
        }
    }
    void cekskill(){
        switch(this.skill){
            case "web":
                System.out.println("Skill WEB");
                gs = gs + 1000000;
                break;
            case "mobile":
                System.out.println("Skill Mobile");
                gs = gs + 2000000;
                break;
            case "dekstop":
                System.out.println("Skill Dekstop");
                gs = gs + 2500000;
                break;
            default:
                System.out.printf("Tidak Ada");
        }
    }
    int getGD(){
        return gd;
    }
    int getGP(){
        return gp;
    }
    int getGS(){
        return gs;
    }
}
