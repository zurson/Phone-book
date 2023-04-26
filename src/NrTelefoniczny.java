public class NrTelefoniczny implements Comparable<NrTelefoniczny>
{
    String nrKierunkowy;
    String nrTelefonu;

    public NrTelefoniczny(String nrKierunkowy, String nrTelefonu)
    {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny o)
    {
        String n1 = nrKierunkowy.concat(nrTelefonu);
        String n2 = o.nrKierunkowy.concat(o.nrTelefonu);
        return n1.compareTo(n2);
    }

    public String getPhoneNumber()
    {
        return "+" + nrKierunkowy + " " + nrTelefonu;
    }
}
