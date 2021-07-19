import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Tanah [] tanah = new Tanah[3];
        int taanah;
        int panjang,lebar;

        for(int i=0;i<tanah.length;i++){
            System.out.println("Tanah : ");
            taanah = input.nextInt();
            System.out.println("Panjang : ");
            panjang = input.nextInt();
            System.out.println("Lebar : ");
            lebar = input.nextInt();

            tanah[i] = new Tanah();
            tanah[i].setLuas(panjang*lebar);
        }

        for(int i=0;i<tanah.length;i++){
            System.out.println("Luas tanah " + (i+1) + " : " + tanah[i].getLuas());
        }

    }
}
