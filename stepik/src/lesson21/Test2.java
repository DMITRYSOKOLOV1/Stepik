package lesson21;

public class Test2 {
    public static void main(String[] args) {
        String s1,s2;
        s1 = new String("Hello");
        s2 = new String("World");
        s1 = s2;
        String s3 = s1;
        s1 = null;
        System.out.println("s3 - "+ s3 + " s2 - " + s2 + " s1 - " + s1);
    }
}
