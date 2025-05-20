public class reverse_a_string {
    public static void main(String [] args){
        String name = "vikash";
        String rev = "";

        for(int i = 0; i < name.length(); i++){
            rev = name.charAt(i) + rev;
        }
        System.out.print(rev);
    }
}
