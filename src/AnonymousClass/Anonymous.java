package AnonymousClass ;

public class Anonymous {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player(){    //Anonymous class  (TimerTask,Runnable,callback)
            @Override
            void ability(){
                System.out.println("He is Finisher");
            }
        };
        p1.ability();
        p2.ability();
    }
}
