package paagbi.Karpeta_berriak;
//falta jata: karpeta baten edukia bistaratzea

import java.io.BufferedReader;
//Import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Galderak
{
    public static void main( String[] args )
    {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int i;
            String Helbidea="", idatzi="", deskribapena="", Helbide_has="src/main/java/paagbi/Karpeta_berriak/";

            System.out.println( "Zer zoaz deskribatzera? arraina (1), ugaztuna (2), barazkia (3) ala esnekia(4)?: " );
            i = Integer.parseInt(br.readLine());

            switch(i) {
                case 1:
                    Helbidea="animaliak/arrainak";
                    break;
                case 2:
                    Helbidea="animaliak/ugaztunak";
                    break;
                case 3:
                    Helbidea="elikagaiak/barazkiak";
                    break;
                case 4:
                    Helbidea="elikagaiak/esnekiak";
                    break;
            }

            System.out.println("Zein?: ");
            idatzi = br.readLine();

            /*File dir = new File(Helbidea);
            System.out.println("Directorio existe? " + dir.exists());
            System.out.println("Es directorio? " + dir.isDirectory());
            boolean creado = dir.mkdirs();
            System.out.println("mkdirs() resultado: " + creado);*/


            System.out.println("Nolakoa da?: ");
            deskribapena = br.readLine();

            try(FileOutputStream out = new FileOutputStream(Helbide_has+Helbidea+"/"+idatzi+".txt");) {
                out.write(deskribapena.getBytes());
            }
            
        }
        catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}