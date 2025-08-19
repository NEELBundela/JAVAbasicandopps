package basic;

public class TWOdARRAY {
    public static void main(String[] args) {
       // String[] fruits={"apple","orange","banana"};
      //  String[] veg={"potato","onion","carrot"};
      //  String[] player={"ms","vk","rs"};

        String[][] all={{"apple","orange","banana"},
                {"potato","onion","carrot"},
                {"ms","vk","rs"}
        };
        all[0][0]="pineapple";

       // String[][] all={fruits,veg,player};


        for(String[] foods: all)
        {
            for(String food:foods)
            {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
