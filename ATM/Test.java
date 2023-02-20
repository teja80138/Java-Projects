public class Test{
    public static void main(String[] args){
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        for (String i : words){
            if (i.substring(i.length()-3,i.length()).equals("ing"))
                System.out.println(i);
        }
    }
}