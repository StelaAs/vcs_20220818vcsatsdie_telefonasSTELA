package lt.vcs.abstelefonas;

public abstract class Telefonas {

    private String numeris;
    private String skambutis;

    public Telefonas(String numeris) {
        this.numeris = numeris;
    }

    public abstract void paskambink(String telNumeris);
//    {
//        System.out.println(
//                String.format(
//                        "Abonimentas %s skambina i %s",
//                        this.numeris,
//                        telNumeris
//                )
//        );
//    }

    public String getNumeris() {
        return numeris;
    }

    public String getSkambutis() {
        return skambutis;
    }

    public void setSkambutis(String skambutis) {
        this.skambutis = skambutis;
    }

    @Override
    public String toString() {
        return String.format(
                "Telefonas{%s, skambutis: %s}",
                this.numeris,
                this.skambutis
        );
    }
}
