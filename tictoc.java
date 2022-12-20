import java.util.Scanner;
import java.lang.*;
class Show{
    Scanner sc=new Scanner(System.in);
    int s=0,p1,p2,k=0;
   char arr[][]={{'*','*','*'},{'*','*','*'},{'*','*','*'}};
    public void great() {
        System.out.println("welcome tictoc game...");
        System.out.println("your position is here...!");
        System.out.println("-------------------------");
        System.out.println("1    2    3\n4    5    6\n7    8    9");
        System.out.println("-------------------------");
    }
    public void dis(){
        System.out.println("your board is here\n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
    public void game(){
        if(k==9)
        {
            System.out.println("match tie...");
            System.exit(0);
        }
        if(s%2==0)
        {
            System.out.println("enter player 1 Positon");
            p1=sc.nextInt();
            s++;
            send(p1,1);
        }
        else{
            System.out.println("enter player 2 Positon");
            p1=sc.nextInt();
            s++;
            send(p1,2);
        }
    }
    public void send(int x,int y) {
        switch (x) {
            case 1:
                if(y==1)
                {
                    if(arr[0][0]=='*')
                    {
                        arr[0][0]='X';
                        k++;
                        check();
                    }
                    else
                    {
                        System.out.println("already puted");
                        s--;
                        game();
                    }
                }
                else
                {
                    if(arr[0][0]=='*')
                    {
                        arr[0][0]='0';
                        k++;
                        check();
                    }
                    else
                    {
                        System.out.println("already puted");
                        s--;
                        game();
                    } 
                }
                dis();
                game();
                break;
            case 2:
                if(y==1)
                {
                    if(arr[0][1]=='*')
                   {
                    arr[0][1]='X';
                    k++;
                    check();
                   }
                    else
                    {
                        System.out.println("already puted");
                        s--;
                        game();
                    } 
                }
                else
                {
                    if(arr[0][1]=='*')
                        {
                            arr[0][1]='0';
                            k++;
                            check();
                        }
                    else
                    {
                        System.out.println("already puted");
                        s--;
                        game();
                    } 
                }
                dis();
                game();
                break;
            case 3:
                if(y==1)
                {
                    if(arr[0][2]=='*')
                        {
                            arr[0][2]='X';
                            k++;
                            check();
                        }
                    else
                    {
                        System.out.println("already puted");
                        s--;
                        game();
                    }
                }
                else
                {
                    if(arr[0][2]=='*')
                   {
                    arr[0][2]='0';
                    k++;
                    check();
                   }
                    else
                    {
                        System.out.println("already puted");
                        s--;
                        game();
                    } 
                }
                dis();
                game();
                break;
            case 4:
            if(y==1)
            {
                if(arr[1][0]=='*')
                    {
                        arr[1][0]='X';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                }
            }
            else
            {
                if(arr[1][0]=='*')
                    {
                        arr[1][0]='0';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                } 
            }
                dis();
                game();
                break;
            case 5:
            if(y==1)
            {
                if(arr[1][1]=='*')
                    {
                        arr[1][1]='X';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                }
            }
            else
            {
                if(arr[1][1]=='*')
                    {
                        arr[1][1]='0';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                } 
            }
                dis();
                game();
                break;
            case 6:
            if(y==1)
            {
                if(arr[1][2]=='*')
                    {
                        arr[1][2]='X';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                }
            }
            else
            {
                if(arr[1][2]=='*')
                    {
                        arr[1][2]='0';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                } 
            }
                dis();
                game();
                break;
            case 7:
            if(y==1)
            {
                if(arr[2][0]=='*')
                    {
                        arr[2][0]='X';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                }
            }
            else
            {
                if(arr[2][0]=='*')
                    {
                        arr[2][0]='0';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                } 
            }
                dis();
                game();
                break;
            case 8:
            if(y==1)
            {
                if(arr[2][1]=='*')
                    {
                        arr[2][1]='X';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                }
            }
            else
            {
                if(arr[2][1]=='*')
                {
                    arr[2][1]='0';
                    k++;
                    check();
                }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                } 
            }
                dis();
                game();
                break;
            case 9:
            if(y==1)
            {
                if(arr[2][2]=='*')
               {
                arr[2][2]='X';
                k++;
                check();
               }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                }
            }
            else
            {
                if(arr[2][2]=='*')
                    {
                        arr[2][2]='0';
                        k++;
                        check();
                    }
                else
                {
                    System.out.println("already puted");
                    s--;
                    game();
                } 
            }
                dis();
                game();
                break;
            default:
            System.out.println("wrong input...!");
            s--;
            game();
            break;
        }
    }
    public void check() {
        if((arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X')||(arr[0][0]=='0' && arr[0][1]=='0' && arr[0][2]=='0'))
        {
            if(arr[0][0]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }

        if((arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X')||(arr[1][0]=='0' && arr[1][1]=='0' && arr[1][2]=='0'))
        {
            if(arr[1][0]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
        if((arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X')||(arr[2][0]=='0' && arr[2][1]=='0' && arr[2][2]=='0'))
        {
            if(arr[2][0]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
        if((arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X')||(arr[0][2]=='0' && arr[1][2]=='0' && arr[2][2]=='0'))
        {
            if(arr[0][2]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
        if((arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X')||(arr[0][1]=='0' && arr[1][1]=='0' && arr[2][1]=='0'))
        {
            if(arr[0][1]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
        if((arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X')||(arr[0][0]=='0' && arr[1][0]=='0' && arr[2][0]=='0'))
        {
            if(arr[0][0]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
        if((arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X')||(arr[0][0]=='0' && arr[1][1]=='0' && arr[2][2]=='0'))
        {
            if(arr[0][0]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
        if((arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X')||(arr[0][2]=='0' && arr[1][1]=='0' && arr[2][0]=='0'))
        {
            if(arr[0][2]=='X')
            {
                dis();
                System.out.println("player 1 win");
                System.exit(0);
            }
            else
            {
                dis();
                System.out.println("player 2 win");
                System.exit(0);
            }
        }
    }
}
class tictoc{
    public static void main(String[] args) {    
        Show o=new Show();
        o.great();
        o.dis();
        o.game();
    }
}