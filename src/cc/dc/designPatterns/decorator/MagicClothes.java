package cc.dc.designPatterns.decorator;

public class MagicClothes extends ClothesDecorator {

    @Override
    public void designClothes() {
        System.out.print(",and one long one short ");
        super.designClothes();
    }
}
