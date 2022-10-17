package solved.PROGRAMMERS.LV1;

public class test {
    public static void main(String[] args) {
        String a = "0123456789";

        for(int i = 0 ; i < a.length(); i ++){
            System.out.println(a.charAt(i) - 'A');
        }
    }   
}
