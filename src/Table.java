/**
 * Created by sidney on 12.04.17.
 */
public class Table {
    int size = 3;
    char[][] cell = new  char[3][3];
    boolean win = false;

    public void display(){
        for (int i = 0; i < this.size+1; i++) {
            for (int j = 0; j < this.size+1; j++) {
                if((i!=0)&&(j!=0)){
                    System.out.print("["+this.cell[i-1][j-1]+"]");
                }else{
                    if((i==0)&&(j==0)){
                        System.out.print("YX]");
                    }else if((i==0)&&(j!=0)){
                        System.out.print("["+j+"]");
                    }else if((j==0)&&(i!=0)){
                        System.out.print("["+i+"]");
                    }
                }
            }
            System.out.println();
        }
    }

    public Table(){
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.cell[i][j] = ' ';
            }
        }
    }
    public boolean ifEnd(){
        boolean check = true;
        boolean line = true;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if(this.cell[i][j]==' '){
                    check = false;
                }
                if((line)&&(j!=this.size-1)){
                    if((this.cell[i][j] == this.cell[i][j+1])&&(this.cell[i][j]!=' ')&&(this.cell[i][j+1]!=' ')){
                        this.win = true;
                    }else{
                        line = false;
                        this.win = false;
                    }
                }
            }
            if(this.win){
                return true;
            }
            line = true;
        }

        for (int j = 0; j < this.size; j++) {
            for (int i = 0; i < this.size-1; i++) {
                if((line)){
                    if((this.cell[i][j] == this.cell[i+1][j])&&(this.cell[i][j]!=' ')&&(this.cell[i+1][j]!=' ')){
                        this.win = true;
                    }else{
                        line = false;
                        this.win = false;
                    }
                }
            }
            if(this.win){
                return true;
            }
            line = true;
        }

        for (int i = 0; i < this.size-1; i++) {
            if((line)){
                if((this.cell[i][i] == this.cell[i+1][i+1])&&(this.cell[i][i]!=' ')&&(this.cell[i+1][i+1]!=' ')){
                    this.win = true;
                }else{
                    line = false;
                    this.win = false;
                }
            }
        }

        if(this.win){
            return true;
        }

        for (int i = 0; i < this.size-1; i++) {
            if((line)){
                if((this.cell[i][this.size-i-1] == this.cell[i+1][this.size-i-2])
                        &&(this.cell[i][this.size-i-1]!=' ')&&(this.cell[i+1][this.size-i-2]!=' ')){

                    this.win = true;
                }else{
                    line = false;
                    this.win = false;
                }
            }
        }

        if(win){
            this.win = true;
            return true;
        }

        return check;
    }
    public boolean inputInCell(char ch, int y, int x){
        if((x<=this.size)&&(x>=1)&&(y<=this.size)&&(y>=1)&&(this.cell[x-1][y-1] == ' ')){
            this.cell[x-1][y-1] = ch;
            return true;
        } else {
            return false;
        }

    }


}
