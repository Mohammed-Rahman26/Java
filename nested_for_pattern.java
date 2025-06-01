//Write a program to find teh nested for loop pattern.
public class nested_for_pattern {
    public static void main(String[] args){
        int count=1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}

//                System.out.print(count++ +" ");
//    for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j +" ");
//                System.out.print("*" +" ");
//                System.out.print(count++ +" ");

