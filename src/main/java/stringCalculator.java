import java.util.ArrayList;
import java.util.jar.JarOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class stringCalculator {

    public static final String delimiter = "[,\n;]";
    public static int add(String number) throws Exception {
        ArrayList<Integer> negNumbers = new ArrayList<>();
        String [] sequenceA;
        String [] sequenceB;
        int total = 0;
        if (number.isEmpty()) {
            System.out.println(total);
                return total; }
        if(number.startsWith("//")){
            Matcher m = Pattern.compile("//(\\d)\n(\\d*);?\\d?").matcher(number);
            m.matches();
            String newDeli = m.group(1);
            String numbers = m.group(2);
            sequenceB = numbers.split(newDeli);
            for (String x : sequenceB) {
                if(Integer.parseInt(x) >= 1000){
                    continue; }
                if(Integer.parseInt(x) < 0){
                    negNumbers.add(Integer.parseInt(x));
                    System.out.println("ERROR: negatives not allowed" + negNumbers);
                }
                total += Integer.parseInt(x);
            }
            System.out.println(total);
            return total;
        }
        sequenceA = number.split(delimiter);
        for (String x : sequenceA) {
            if(Integer.parseInt(x) >= 1000){
                continue; }
            if(Integer.parseInt(x) < 0){
                negNumbers.add(Integer.parseInt(x));
                System.out.println("ERROR: negatives not allowed" + negNumbers);
            }
            total += Integer.parseInt(x);
       }
        System.out.println(total);
        return total;
    }

    public static void main(String[] args) throws Exception {
//        Question1
        System.out.println("Question1");
        add("");
        add("1");
        add("1,1");
        System.out.println();

//        Question2
        System.out.println("Question2");
        add("1,2,3,4");
        System.out.println();

//      Question3
        System.out.println("Question3");
        add("1\n2,3" );
        System.out.println();

//        Question4
        System.out.println("Question4");
        add("//4\n142");
        System.out.println();

//        Question5(uncomment the add method to test if it works)
//        System.out.println("Question5");
//        add("-1,-2,3,4");
//        System.out.println();







    }


}
