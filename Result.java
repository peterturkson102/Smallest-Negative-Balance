import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




class Result {


    /*
     * Complete the 'smallestNegativeBalance' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_STRING_ARRAY debts as parameter.
     */
    public static void main(String[] args) {

        List<List<String>> debts = Arrays.asList(Arrays.asList("A","B","2") ,Arrays.asList("B","A","5") ,Arrays.asList("C","B","7"),Arrays.asList("A","C","5"));
        List<String> s = smallestNegativeBalance(debts);
        System.out.println(s);
    }


    public static List<String> smallestNegativeBalance(List<List<String>> debts) {
        List<String> smallestBalanceList = new ArrayList<>();

        Map<String, Integer> recordMap = new HashMap<>();



        for (int record = 0;record<debts.size();record++) {
            String borrower= debts.get(record).get(1);
            if(!recordMap.containsKey(borrower)){
                recordMap.put(borrower,  Integer.parseInt(debts.get(record).get(2)));
            }else{
                recordMap.put(borrower, recordMap.get(borrower)+Integer.parseInt(debts.get(record).get(2)));
            }
        }
        for (int records = 0;records<debts.size();records++) {
            String lender= debts.get(records).get(0);
            if(!recordMap.containsKey(lender)){
                recordMap.put(lender, 0 - Integer.parseInt(debts.get(records).get(2)));
            }else{
                recordMap.put(lender, recordMap.get(lender)-Integer.parseInt(debts.get(records).get(2)));
            }

        }

        Integer smallest = Collections.min(recordMap.values());

        for (Map.Entry<String,Integer> entry : recordMap.entrySet()) {

            if(Objects.equals(entry.getValue(), smallest)){
                smallestBalanceList.add(entry.getKey());
            }
        }
        System.out.println(recordMap);
        if(smallestBalanceList.isEmpty()){
            smallestBalanceList.add("Nobody has a negative balance");
        }

        return  smallestBalanceList;
    }


}
