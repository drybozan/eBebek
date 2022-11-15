package week3;

public class Bir100ArasiAsallariBulanProgram {
    /*
 Kendisi dışında başka böleni olmayan sayılara asıl sayılar denir.
  */
    public static void main(String[] args) {
        // 1 den 100 e kadar sayilara sayacak döngüyü kur
        for(int i=2; i<=100; i++){


            boolean asalMi = true ;
            //2 den itibaren bölme işlemine tabi tut
            for(int j=2; j<i; j++){
                if(i % j == 0){
                  asalMi = false;
                }
            }

            if (asalMi){
                System.out.print(i +",");
            }

        }

    }
}
