package com.perbandingan;
import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk membandingkan nilai pertama dan nilai kedua
 */

public class Main {
    static final Scanner scan = new Scanner(System.in);
    int nilai1, nilai2;

    private void masukkanNilai(){
        System.out.println("=======Progaram Perbandingan Nilai=======");
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = scan.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = scan.nextInt();
    }

    private String perbandinganNilai(){
        return (nilai1 < nilai2) ? nilai1+" lebih kecil dari "+nilai2 :
                (nilai1 > nilai2) ? nilai1+" lebih besar dari "+nilai2 :
                        nilai1+" sama dengan "+nilai2;
    }

    private void ulangPerbandingan(){
        System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
        if(scan.next().equals("Ya")){
            System.out.print("\n");
            startMethod();
        }
    }

    private void tampilPerbandingan(String hasil){
        System.out.println("\nHasil : "+hasil);
    }

    private void startMethod(){
        masukkanNilai();
        tampilPerbandingan(perbandinganNilai());
        ulangPerbandingan();
    }

    public static void main(String[] args) {
	    Main data = new Main();
        data.startMethod();
    }
}
