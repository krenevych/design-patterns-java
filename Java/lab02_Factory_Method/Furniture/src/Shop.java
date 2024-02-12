import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Furniture> furnitures = new ArrayList<>();
    protected String material = "Wood";
    protected String color = "Crimson";
    protected int nailNumber = 100;

    void useFurnitures(){
        for (Furniture furniture : furnitures) {
            furniture.use();
        }
    }

    void buildFurniture(
            /*Furniture.Type type*/
           FurnitureMaster furnitureMaster
    ){
//        if (type == Furniture.Type.CHAIR){
//            furnitures.add(new Chair(material, color, nailNumber));
//        }else if (type == Furniture.Type.CABINET){
//            furnitures.add(new Cabinet(material, color, nailNumber));
//        }else {
//            furnitures.add(new Table(material, color, nailNumber));
//        }
        if (furnitureMaster == null){
            throw new IllegalStateException("furniture master == null");
        }
        Furniture furniture = furnitureMaster.createFurniture(material, color, nailNumber);
        furnitures.add(furniture);
    }

}
