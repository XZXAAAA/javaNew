package study;

public class StringJoiner {
    public StringJoiner() {
    }

    public static void main(String[] args) {
        StringJoiner test = new StringJoiner();
        test.concatString("-", "world", "java","fuck","you");
    }

    public void concatString(String a,String ... strs){
        java.util.StringJoiner sj = new java.util.StringJoiner(a);
        for(String str:strs){
            sj.add(str);
        }
        System.out.println(
                sj
        );
    }



}
