package paagbi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class Galderak 
{
    public static void main( String[] args )
    {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int i, ii;
            String helbidea="", idatzi="", deskribapena="";

            System.out.println( "Zer zoaz deskribatzera? arraina (1), ugaztuna (2), barazkia (3) ala esnekia(4)?: " );
            i = br.readLine();

            Switch(i) {
                case 1:
                    helbidea="paagbi/animaliak/arrainak";
                    break;
                case 2:
                    helbidea="paagbi/animaliak/ugaztunak";
                    break;
                case 3:
                    helbidea="paagbi/elikagaiak/barazkiak";
                    break;
                case 4:
                    helbidea="paagbi/elikagaiak/esnekiak";
                    break;
                default: break;
            }

            System.out.println("Zein?: ");
            idatzi = br.readLine();
            System.out.println("Nolakoa da?: ");
            deskribapena = br.readLine();

            try(FileOutputStream out = new FileOutputStream(helbidea+"/"+idatzi+".txt")) {
                out.write(deskribapena);
            }
            
        }
        
    }
}
