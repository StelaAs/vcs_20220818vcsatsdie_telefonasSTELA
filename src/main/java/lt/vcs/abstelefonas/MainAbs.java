package lt.vcs.abstelefonas;

public class MainAbs {

    public static void main(String[] args) {

//        Telefonas telefonas = new Telefonas("8-5-123 1234");
        Mobilius mobilius01 = new Mobilius("8-623-11123", "132 123 132 132");
        Taksofonas taksofonas01 = new Taksofonas(0.55);

//        telefonas.setSkambutis("Dzin-dzi-lin");
        mobilius01.setSkambutis("Skamba melodija");

//        System.out.println(telefonas);
        System.out.println(mobilius01);
        System.out.println(taksofonas01);

//        telefonas.paskambink("8-635-47616");
        mobilius01.paskambink("8-635-47616");
        taksofonas01.paskambink("8-635-47616");

        mobilius01.fotografuok();
        mobilius01.fotografuok();
        mobilius01.fotografuok();
        mobilius01.fotografuok();

        System.out.println(mobilius01);
        System.out.println(taksofonas01);

        taksofonas01.paskambink("8-635-47616");
        System.out.println(taksofonas01);
        taksofonas01.paskambink("8-635-47616");
        taksofonas01.setPiniguLikutis(0.80);

        System.out.println(taksofonas01);

        System.out.println(Constants.PI);
    }
}
