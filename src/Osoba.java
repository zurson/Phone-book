public class Osoba extends Wpis
{
    String imie;
    String nazwisko;
    String adres;
    NrTelefoniczny telefon;

    public Osoba(String imie, String nazwisko, String adres, NrTelefoniczny telefon)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public void opis()
    {
        System.out.println("Informacje o uzytkowniku " + "'" + imie + " " + nazwisko + "'");
        System.out.println("Adres: " + adres);
        System.out.println("Kontakt: " + telefon.getPhoneNumber());
        System.out.println("\n");
    }

    @Override
    public NrTelefoniczny getPhone()
    {
        return telefon;
    }

    @Override
    public String getAddress()
    {
        return adres;
    }
}
