public class Firma extends Wpis
{
    String nazwa;
    String adres;
    NrTelefoniczny telefon;

    public Firma(String nazwa, String adres, NrTelefoniczny telefon)
    {
        this.nazwa = nazwa;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public void opis()
    {
        System.out.println("Informacje o firmie " + "'" + nazwa + "'");
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
