
import java.lang.Math;


class Floor{
    float floorLength = 10;
    float floorWidth = 20;
    public void totalTiles(Tiles t){
        float totaltiles = (floorLength*floorWidth)/(t.tileLength*t.tileLength);
        System.out.print("Total numbers of Tiles="+ (Math.ceil(totaltiles)));
    }
}

public class Tiles {
    float tileLength = 30;
    public static void main(String[] args) {
        Tiles tiles = new Tiles();
        Floor floor = new Floor();
        floor.totalTiles(tiles);
    }
}