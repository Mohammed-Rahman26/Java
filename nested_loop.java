//Write a program to understand the nested loop.
public class nested_loop {
    public static void main(String[] args){
        int count=1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println(count++);
            }
        }
    }
}
