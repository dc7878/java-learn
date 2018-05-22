package cc.dc.designPatterns.decorator;

public class TestDemo {

    public static void main(String[] args) {
        TShit tshit = new TShit();
        tshit.map(new MagicClothes()).map(new LeftLongClothes()).map(new LeftBlueClothes()).map(new RightRedClothes());
        tshit.designClothes();

        System.out.println();

        TShit tShit2 = new TShit();
        tShit2.map(new MagicClothes()).map(new RightLongClothes()).map(new RightRedClothes());
        tShit2.designClothes();
    }
}
