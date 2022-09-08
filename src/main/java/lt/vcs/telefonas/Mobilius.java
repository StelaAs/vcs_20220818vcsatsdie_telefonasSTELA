package lt.vcs.telefonas;

public class Mobilius extends Telefonas {

    private String simNr;
    private int nuotraukuSkaicius = 0;

    public Mobilius(String numeris, String simNr) {
        super(numeris);
        this.simNr = simNr;
    }

    public void fotografuok(){
        this.nuotraukuSkaicius ++;
    }

    public String getSimNr() {
        return this.simNr;
    }

    public int getNuotraukuSkaicius() {
        return this.nuotraukuSkaicius;
    }

    @Override
    public String toString() {
        return String.format(
                "Mobilus{%s; simNr: %s skambutis: %s; nuotruakos: %s}",
                super.getNumeris(),
                this.simNr,
                super.getSkambutis(),
                this.nuotraukuSkaicius
        );
    }
}
