package Fabric;

import Interface.iGameItem;
import Product.Pearl;

public class PearlGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {

        return new Pearl();
    }
    
}
