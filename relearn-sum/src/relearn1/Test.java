package relearn1;

public class Test {
    public static void main(String[] args) {
        PanelAnimal.getInstance().show();
        PanelAnimal.getInstance().showkill();
        PanelAnimal2.getInstance().Sign();

        System.out.println("======================");

        SignSign ss = SignSign.X;
        System.out.println(ss);
        System.out.println(ss.name());
        System.out.println(ss.ordinal());

        System.out.println("============================");

        KillAnimal.run3();
        PanelAnimal.getInstance().run();

        System.out.println("=========================");
        PanelAnimal.gou gou1 = PanelAnimal.getInstance().new gou();
        gou1.goujiao();


        System.out.println("=================================");
        System.out.println(new KillAnimal2() {
            @Override
            public int cry() {
                return 1;
            }
        });

    }
}
