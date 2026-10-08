package paagbi.Karpeta_berriak;
//programa honek bi funtzio nagusi ditu: aurretik sortutako karpeta baten idatzi fitxategiak; eta fitxategi harek irakurri terminalean bistaratzeko

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Galderak
{
    public static void main( String[] args )
    {
        int i=1, zein;
        String Helbidea="", idatzi="", deskribapena="", Helbide_has="src/main/java/paagbi/Karpeta_berriak/";
        //jarri behar izan nauen Helbide_has bariablea programak ez zituelako aurkitzen
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Zer nahi dozu? deskribatu (1) edo karpeta beten informazioa ikusi(2): ");
            zein = Integer.parseInt(br.readLine());
            //bariable honen arabera gero irakurri edo idatziko du

            System.out.println( "Aukeratu: arraina (1), ugaztuna (2), barazkia (3) ala esnekia(4)?: " );
            i = Integer.parseInt(br.readLine());
            //Erabiltzaileak erabaki duenaren araberako helbidea ezarri
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

            //Fitxero berria idazteko
            if (zein==1) {
                System.out.println("Zein?: ");
                idatzi = br.readLine();

                System.out.println("Nolakoa da?: ");
                deskribapena = br.readLine();

                //sortzen da fitxategia behar duen helbidean eta idazten da deskibapena aldagaian gorde dena.
                try(FileOutputStream out = new FileOutputStream(Helbide_has+Helbidea+"/"+idatzi+".txt");) {
                    out.write(deskribapena.getBytes());
                }
                
            }
            //Karpeta baten fitxeroak irakurtzeko
            //, gero artxiboz, artxibo biztaratzeko haien izenburua eta 
            else if (zein==2) {
                //hemen aldagai batetan gordeko dira karpetaren artxiboen izenak
                File carpeta = new File(Helbide_has+Helbidea);
                File[] fitxategiak = carpeta.listFiles();

                if (fitxategiak != null) {
                    //hemen gordato fitxategiak izenez izenez irakurriko dira
                    for (File fitxategia : fitxategiak) {
                        //biztaratu fitxategiaren izenburua eta idatzita duena
                        System.out.print("Izena: " + fitxategia.getName()+": ");

                        //byte--> string, terminalean erabiltzaileak idatzitakoa ulertu dezan
                        try (FileInputStream in = new FileInputStream(Helbide_has+Helbidea+"/"+fitxategia.getName())) {
                            byte[] datos = in.readAllBytes();
                            String edukia = new String(datos, "UTF-8");
                            System.out.println(edukia);
                        }
                    }
                }
                else {
                    System.out.println("Ezin izan da karpeta irakurri.");
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}