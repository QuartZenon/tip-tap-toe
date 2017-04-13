import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Выбери, пожалуйста, сторону");
        System.out.println("Введи Х (крестик) или О (нолик) ");
        Scanner input  = new Scanner(System.in);
        Mark mark = new Mark();
        mark.input();

        System.out.println("Вы выбрали " + mark.first);
        System.out.println("Ваш противник - " + mark.second);
        Table table = new Table();
        int x,y;
        Side side = new Side();
        char ch;
        while (true){
            if(side.move %2 == 1){
                mark.now = mark.first;
            }else{
                mark.now = mark.second;
            }
            System.out.println("Сейчас ходит " + mark.now);
            System.out.println("Ход #" + side.move);

            table.display();

            System.out.println("Укажите куда вы метите? ");

            System.out.print("X >>> ");
            x = input.nextInt();
            System.out.println();
            System.out.print("Y >>> ");
            y = input.nextInt();
            System.out.println();

            if(!table.inputInCell(mark.now, x, y)){
                System.out.println("!#$%&*@> Повторите попытку");
                continue;
            }

            if(table.ifEnd())
                break;
            side.next();


        }
        side.win(table.win, mark.now);
    }
}