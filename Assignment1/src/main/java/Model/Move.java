package Model;

/**
 * Created by chkyj_000 on 1/22/2016.
 */
public class move {

    public int[] from;
    public int[] to;

    public move(int x1, int y1, int x2, int y2){
        from = new int[2];
        from[0] = x1;
        from[1] = y1;
        to = new int[2];
        to[0] = x2;
        to[1] = y2;
        
    }

}
