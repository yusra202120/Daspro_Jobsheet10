import java.util.Scanner;
public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, pil;
        String menu[] = {"Input data penonton", "Tampilkan daftar Penonton", "Exit"};

        while (true) {
            System.out.println("Yusra Yusuf");
            System.out.println("2341760044");
            System.out.println("==============================");
            System.out.println("Selamat Datang di Bioskop");
            System.out.println();
            for(int i = 0; i<menu.length; i++){
                System.out.println((i+1)+". "+menu[i]);
            }
            System.out.print("PIlih salah satu menu (1/2/3): ");

            pil = input.nextInt();
            switch (pil) {
                case 1:
                     while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = input.next();
                        System.out.print("Masukkan baris: ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = input.nextInt();

                        input.nextLine();
                        if ( baris >= penonton.length) {
                            System.out.println("Maaf, nomor baris tidak tersedia.");
                            continue;
                        }
                        if ( kolom-1 >= penonton[baris-1].length) {
                            System.out.println("Maaf, nomor kolom tidak tersedia.");
                            continue;
                        }
                        
                        if(penonton[baris-1][kolom-1] != null){
                            System.out.println("Maaf, kursi yang anda pilih sudah terisi orang lain. Silahkan isi kembali baris dan kolom");
                            continue;
                        }   

                        penonton[baris-1][kolom-1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = input.next();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for(int i=0; i<penonton.length; i++){
                        String[] penontonBaris = penonton[i];
                        for (int j = 0; j < penontonBaris.length; j++) {
                            if (penontonBaris[j] == null) {
                                penontonBaris[j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-"+(i+1)+ ": "+ String.join(", ", penontonBaris));
                    }
                    System.out.println();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan anda tidak tersedia.");
            }
           
        }
        
    }
}
