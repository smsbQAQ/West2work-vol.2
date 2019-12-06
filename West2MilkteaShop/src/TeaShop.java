import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;

public class TeaShop implements shop{

    Queue<Bubble> qB = new LinkedList<Bubble>();
    Queue<Coconut> qC = new LinkedList<Coconut>();

    @Override
    public void buyIngredient(MilkTea mT) {
        if(mT.getType()==0)
            buy(new Bubble());
        else buy(new Coconut());
    }

    @Override
    public void sell(MilkTea milkTea) {
        boolean isAfter=false;
        if(milkTea.getType()==0){
            try {
                while(!isAfter){
                    Bubble b=qB.poll();
                    if(b==null)
                        throw new SoldOutException();
                    b.getData().add(Calendar.DATE,b.getWarranty());
                    int temp=b.getData().compareTo(Calendar.getInstance());
                    if(temp>0){
                        isAfter=true;
                        System.out.println("谢谢惠顾，还要啥子不");
                    }
                }
            }
            catch (SoldOutException e){
                System.out.println("珍珠卖光啦！正在进货！！");
                buyIngredient(milkTea);
            }
        }
        else {
            try {
                while(!isAfter){
                    Coconut c=qC.poll();
                    if(c==null)
                        throw new SoldOutException();
                    c.getData().add(Calendar.DATE,c.getWarranty());
                    int temp=c.getData().compareTo(Calendar.getInstance());
                    if(temp>0){
                        isAfter=true;
                        System.out.println("谢谢惠顾，还要啥子不");
                    }
                }
            }
            catch (SoldOutException e){
                System.out.println("椰果卖光啦！正在进货！！");
                buyIngredient(milkTea);
            }
        }
    }

    private void buy(Bubble bubble){
        for (int i = 0; i < 10; i++) {
            qB.offer(new Bubble());
        }
    }

    private void buy(Coconut coconut){
        for (int i = 0; i < 10; i++) {
            qC.offer(new Coconut());
        }
    }

}
