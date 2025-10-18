package diamond;

public class DiamondCheck implements Ainterface,Binterface{
    @Override
    public void methodDiamond() {
        Binterface.super.methodDiamond();
    }

    public static void main(String[] args) {

        DiamondCheck dc = new DiamondCheck();
        dc.methodDiamond();
    }
}
