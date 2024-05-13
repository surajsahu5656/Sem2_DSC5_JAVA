package P1 ;
public class TwoDim {
    private int x,y ;

    public TwoDim(){  
    }

    public TwoDim(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    public String toString(){
        return "Two Dimensional :" + x + " " + y ;
    }
    
}
