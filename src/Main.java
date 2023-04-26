import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        // Kilka przykladowych osob
        Wpis osoba1 = new Osoba(
                "Bartek",
                "Mazur",
                "Lodz al. Politechniki 15C",
                new NrTelefoniczny("48", "123-321-567"));

        Wpis osoba2 = new Osoba(
                "Marek",
                "Mostowiak",
                "Radzymin 125",
                new NrTelefoniczny("44", "333-444-555"));

        Wpis osoba3 = new Osoba(
                "Grzegorz",
                "Brzeczyszczykiewicz",
                "Warszawa al. Jerozolimskie 56/5",
                new NrTelefoniczny("25", "111-222-333"));

        // Kilka przykladowych firm
        Wpis firma1 = new Firma(
                "Dante Corporation",
                "Lodz park im. Ksiedza Klepacza 5",
                new NrTelefoniczny("48", "111-111-111"));

        Wpis firma2 = new Firma(
                "Dino",
                "Lodz al. Politechniki 10",
                new NrTelefoniczny("29", "222-222-222"));

        Wpis firma3 = new Firma(
                "Galeria Sukcesja",
                "Lodz al. Politechniki 5",
                new NrTelefoniczny("15", "333-333-333"));


        Map<NrTelefoniczny, Wpis> hash = new TreeMap<NrTelefoniczny, Wpis>();

        hash.put(osoba1.getPhone(), osoba1);
        hash.put(osoba2.getPhone(), osoba2);
        hash.put(osoba3.getPhone(), osoba3);

        hash.put(firma1.getPhone(), firma1);
        hash.put(firma2.getPhone(), firma2);
        hash.put(firma3.getPhone(), firma3);

//        printMap(hash);
        printMapDistinct(hash);
    }

    public static void printMap(Map<NrTelefoniczny, Wpis> hash)
    {
        Iterator<NrTelefoniczny> itr = hash.keySet().iterator();
        while (itr.hasNext())
        {
            Wpis temp = hash.get(itr.next());
            temp.opis();
        }
    }

    public static void printMapDistinct(Map<NrTelefoniczny, Wpis> hash)
    {
        Vector<Wpis> wpisy = new Vector<Wpis>();
        Iterator<NrTelefoniczny> itr = hash.keySet().iterator();

        while (itr.hasNext())
        {
            Wpis temp = hash.get(itr.next());
            boolean flag = isReapeted(wpisy, temp);

            if(flag)
                continue;

            wpisy.add(temp);
            temp.opis();
        }
    }

    public static boolean isReapeted(Vector<Wpis> wpisy, Wpis nowyWpis)
    {
        String[] splitNowyWpis = nowyWpis.getAddress().split(" ");

        for(int i=0; i<wpisy.size(); ++i)
        {
            String address = wpisy.get(i).getAddress();
            String[] splitInList = address.split(" ");

            boolean flag = hasSplitsTheSameStreet(splitNowyWpis, splitInList);

            if (flag)
                return true;
        }

        return false;
    }

    public static boolean hasSplitsTheSameStreet(String[] a, String[] b)
    {
        for (String s1 : a)
        {
            for (String s2 : b)
            {
                if(s1.compareTo(s2) == 0 && s1.length() > 3)
                    return true;
            }
        }
        return false;
    }
}