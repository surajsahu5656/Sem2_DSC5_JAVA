package P2;

import P1.*;
public class ThreeDim extends TwoDim {

    private int z;
    public ThreeDim (TwoDim obj1, int z){
        super(obj1.getx(),obj1.gety());
        this.z = z;
    }

    public int getz(){
        return z;
    }

    public String toString(){
        return "Three Dimension:" + this.getx() + " " + this.gety() + " " + z ;
    }

    
}
