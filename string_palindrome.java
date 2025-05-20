public class string_palindrome {
    public static void main(String[] args){
                String name = "car";
                String rev = "";

                for(int i = 0; i < name.length(); i++){
                    rev = name.charAt(i) + rev;
                }
                if ( rev.equals(name)){
                    System.out.println("palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
    }
}
