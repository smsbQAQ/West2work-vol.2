import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeaShop ts=new TeaShop();
        System.out.println("欢迎光临西二奶茶店");
        while(true){
            System.out.println("输入");
            System.out.println("1->珍珠奶茶");
            System.out.println("2->椰果奶茶");
            System.out.println("3->溜了");
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            if(n==3)
                break;
            if(n==1){
                MilkTea mt=new MilkTea("珍珠奶茶!",new Bubble());
                ts.sell(mt);
            }
            else{
                MilkTea mt=new MilkTea("椰果奶茶!",new Coconut());
                ts.sell(mt);
            }
        }
    }
}
