import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        boolean mulaiProgram = true;
        boolean repeatProgram = true;
        int minLengthNama = 1, maxLengthNama = 25;
//Memulai program
        while (mulaiProgram) {
//Input nama untuk registrasi
            System.out.print("Masukkan nama Anda [1..25] : ");
            String InputNama = UserInput.nextLine();
//validasi input nama jika kurang dari 1 karakter dan lebih dari sama dengan 25 karakter
            if (InputNama.length() <= minLengthNama || InputNama.length() >= maxLengthNama) {
                System.out.println("Anda memasukkan " + InputNama + ".\nNama tersebut tidak valid karena kurang dari sama dengan 1 karakter atau lebih dari sama dengan 25 karakter");
                repeatProgram = true;
            } else {
//jika validasinya false maka akan lanjut ke input NIM
                System.out.print("Masukkan NIM Anda [Harus 10 Karakter] : ");
                String inputNIM = UserInput.next();
//validasi input NIM, jika input NIM sama dengan 10 karakter maka registrasi sukses
                if (inputNIM.length() == 10) {
                    System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                    System.out.println("Registrasi Sukses..");
//jika registrasi sukses maka akan menampilkan hasil input nama dan hasil input nim
                    System.out.println("Selamat datang " + InputNama + " [NIM " + inputNIM + "].. ^^v");
                    System.out.print("\n");
//Registrasi selesai
                    System.out.println("Mari belajar macam-macam deret bilangan..");
                    System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
//input angka untuk menentukan bilangan genap, bilangan ganjil dan bilangan fibonacci
                    System.out.print("Masukkan Sembarang Angka [5..20] : ");
                    int inputAngka = UserInput.nextInt();
                    System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//validasi kondisi jika input angka lebih dari sama dengan 5 dan kurang dari sama dengan 20
                    if (inputAngka >= 5 && inputAngka <= 20) {
                        System.out.println("Deret Bilangan");
                        System.out.println("###############");
                        System.out.print("\n");
//akan menampilkan hasil input angka sebagai banyaknya bilangan genap
                        System.out.println(inputAngka + " Bilangan Genap :");
//inisialisasi dan deklarasi counter dan total genap untuk deret bilangan genap
                        int counter = 0;
                        int totalgenap = 0;
//looping untuk deret bilangan genap
                        for (int a = 2; true; a += 2) {
                            System.out.print(a + " ");
                            totalgenap += a;
                            counter++;

                            if (counter > (inputAngka - 1)) {
                                break;
                            }
                        }
                        System.out.print("\n");
                        System.out.println("Hasil dari penjumlahan = " + totalgenap);
                        System.out.print("\n");
                        int hitung = 0;
                        int totalganjil = 0;
//akan menampilkan hasil input angka sebagai banyaknya bilangan ganjil
                        System.out.println(inputAngka + " Bilangan Ganjil :");
//looping untuk deret bilangan ganjil
                        for (int a = 1; true; a += 2) {
                            System.out.print(a + " ");
                            totalganjil += a;
                            hitung++;
                            if (hitung > (inputAngka - 1)) {
                                break;
                            }
                        }
                        System.out.print("\n");
                        System.out.println("Hasil dari penjumlahan = " + totalganjil);
                        System.out.print("\n");
//akan menampilkan hasil input angka sebagai banyaknya bilangan fibonacci
                        System.out.println(inputAngka + " Bilangan fibonacci :");
//inisialisasi dan deklarasi counter dan total genap untuk deret bilangan fibonacci
                        int fn, fN1, fN2,sum;
                        fN2 = 0;
                        fN1 = 1;
                        fn = 1;
                        sum = 0;

//looping untuk deret bilangan fibonacci
                        for (int i = 1; i <= inputAngka; i++) {
                            System.out.print(fn + " ");
                            sum += fN1;
                            fn = fN1 + fN2;
                            fN2 = fN1;
                            fN1 = fn;
                        }
                        System.out.print("\n");
                        System.out.println("Hasil dari penjumlahan = " + sum);
                        System.out.print("\n");
                    } else {
//validasi jika input angka untuk deret genap, deret ganjil, dan deret fibonacci.
                        System.out.print("Anda memasukkan angka " + inputAngka + ". Angka tersebut tidak valid\n");
                    }
                } else {
                    //validasi jika input NIM kurang dari 10 karakter atau lebih dari 10 karakter
                    System.out.print("Anda memasukkan " + inputNIM + "\nNIM tersebut tidak valid\n");
                }
            }
//menu untuk keluar dari program
            while (repeatProgram) {
                System.out.print("Anda ingin mengulang [y/t] : ");
                String pengulanganProgram = UserInput.next();
//jika inputnya t atau T maka program akan berhenti
//                if ("t".equals(pengulanganProgram) || "T".equals(pengulanganProgram) || "y".equals(pengulanganProgram) || "Y".equals(pengulanganProgram)) {
//                    if ("t".equals(pengulanganProgram) || "T".equals(pengulanganProgram)) {
                if (pengulanganProgram.equalsIgnoreCase("T")||pengulanganProgram.equalsIgnoreCase("Y")){
                    if (pengulanganProgram.equalsIgnoreCase("T")){
                        System.exit(0);
                    }
                    //jika inputnya y atau Y maka program akan kembali ke awal
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    main(args);
                } else {
//jika inputnya selain t atau T atau y atau Y maka akan muncul validasi bahwa inputnya tidak sesuai
                    System.out.print("Anda memasukkan " + pengulanganProgram + ". Input tersebut tidak valid.\n");
                }
            }
            repeatProgram = true;
        }
    }
}
