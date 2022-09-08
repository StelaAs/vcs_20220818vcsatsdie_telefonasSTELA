package lt.vcs.abstelefonas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Taksofonas extends Telefonas {

    private BigDecimal piniguLikutis;

    public Taksofonas(double pinigelis) {
        super("[Cia yra TAKSAFONAS]");
        this.piniguLikutis = new BigDecimal(pinigelis);
    }

    @Override
    public void paskambink(String telNumeris) {
        if (piniguLikutis.compareTo(Constants.SKAMBUCIO_KAINA) >= 0){
//            super.paskambink(telNumeris);

            System.out.println(
                    String.format(
                            "Abonimentas %s skambina i %s",
                            super.getNumeris(),
                            telNumeris
                    )
            );

            this.piniguLikutis = this.piniguLikutis.subtract(Constants.SKAMBUCIO_KAINA);
        } else {
            System.out.println("Sorriukas, idek pinigeli!");
        }
    }

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public void setPiniguLikutis(double piniguLikutis) {
        this.piniguLikutis = this.piniguLikutis.add(BigDecimal.valueOf(piniguLikutis)) ;
    }

    @Override
    public String toString() {
        return String.format(
                "Taksofonas{pinigu likutis: %s}",
                this.piniguLikutis.setScale(2, RoundingMode.HALF_EVEN)
        );
    }
}
