package box;

public class Boxing_Un {
    public static void main(String[] args) {
        int a = 50;
        Integer a2 = Integer.valueOf(a);//Boxing
        //Integer a2 = new Integer(a);//Boxing
        Integer a3 = 5;//Boxing
        System.out.println(a2 + " " + a3);

        int num = a3;
        System.out.println(a);
    }
}

