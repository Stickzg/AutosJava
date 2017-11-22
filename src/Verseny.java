import com.flowacademy.jarmu.Auto;
import com.flowacademy.jarmu.F1Auto;

public class Verseny {

    public static void autoKiir (Auto auto) {
        System.out.println(auto);
    }

    public static void main(String[] args) {

        int bemenetAutok = args.length / 5;

        F1Auto[] forma1autok = new F1Auto[bemenetAutok];

        int n = 0;

        for (int i = 0; i < args.length; i+=5) {
            String tipus = args[i];
            String pilota = args[i+1];
            int teljesitmeny = Integer.parseInt(args[i+2]);
            int maxSebesseg = Integer.parseInt(args[i+3]);
            float beallitas = Float.parseFloat(args[i+4]);
            forma1autok[n] = new F1Auto(tipus, pilota, teljesitmeny, maxSebesseg, beallitas);
            n++;
        }

        F1Auto leglassabb = forma1autok[0];

        for (int i=0; i < forma1autok.length; i++) {
            if (leglassabb.versenykepesseg() > forma1autok[i].versenykepesseg()) {
                leglassabb = forma1autok[i];
            }
        }

        F1Auto elso = leglassabb;
        F1Auto masodik = leglassabb;
        F1Auto harmadik = leglassabb;


        for (int i = 0; i < forma1autok.length; i++) {
            if (forma1autok[i].versenykepesseg() > elso.versenykepesseg() ) {
                harmadik = masodik;
                masodik = elso;
                elso = forma1autok[i];
            } else if (forma1autok[i].versenykepesseg() > masodik.versenykepesseg() ) {
                harmadik = masodik;
                masodik = forma1autok[i];
            } else if ( forma1autok[i].versenykepesseg() > harmadik.versenykepesseg()) {
                harmadik = forma1autok[i];
            }

        }

        autoKiir(elso);
        autoKiir(masodik);
        autoKiir(harmadik);

    }
}
