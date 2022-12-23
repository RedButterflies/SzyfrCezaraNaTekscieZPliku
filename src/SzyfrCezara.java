import java.io.*;
import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) throws IOException {
        SzyfrCezara.Odczyt();

    }
    public static void Odczyt() throws IOException {

        File f = new File("C:\\Users\\szyns\\IdeaProjects\\PracaDomowa\\src\\JanBrzechwa.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String s = null;
        System.out.println("O ile miejsc chcesz przesunac znaki? ");
        Scanner ile = new Scanner(System.in);
        int n;
        n = ile.nextInt();
        System.out.println("Zaszyfrowany plik: ");
        File q = new File("zaszyfrowany.txt");
        FileWriter fw = new FileWriter(q);
        while ((s = br.readLine()) != null) {
            String zaszyfrowany;
            char[] tablica;
            tablica = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                tablica[i] = (char) ((int) (tablica[i] + n));

            }
            zaszyfrowany = String.valueOf(tablica);
            fw.write(zaszyfrowany+"\n");
            fw.flush();
            System.out.println(zaszyfrowany);
        }
        fw.close();

        fr.close();
        File x = new File("zaszyfrowany.txt");
        FileReader frx = new FileReader(x);
        BufferedReader brx = new BufferedReader(frx);
        String sx = null;
        System.out.println("O ile miejsc chcesz przesunac znaki? ");
        Scanner ilex = new Scanner(System.in);
        int nx;
        nx = ilex.nextInt();
        System.out.println("Odszyfrowany plik: ");
        char[] tablicax = new char[0];
        while ((sx = brx.readLine()) != null) {
            tablicax = sx.toCharArray();
            for (int i = 0; i < sx.length(); i++) {
                tablicax[i] = (char) ((int) (tablicax[i] - nx));
            }
            String odszyfrowany = String.valueOf(tablicax);
            System.out.println(odszyfrowany);
        }

    }


    }

