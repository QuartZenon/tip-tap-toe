/**
 * Created by sidney on 13.04.17.
 */
public class Side {
    public int move = 1;
    public void next(){
        this.move++;
    }
    public void win(boolean q, char m){
        if(q){
            System.out.println("Победитель  - " + m);
        }else {
            System.out.println("Ничья");
        }
    }
}
