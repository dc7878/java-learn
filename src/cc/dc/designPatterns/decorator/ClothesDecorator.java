package cc.dc.designPatterns.decorator;

public class ClothesDecorator extends Clothes{

    protected Clothes clothes;

    public ClothesDecorator map(ClothesDecorator clothes) {
        this.clothes = clothes;
        return clothes;
    }

    @Override
    public void designClothes() {
        if (clothes != null) {
            clothes.designClothes();
        }
    }
}
