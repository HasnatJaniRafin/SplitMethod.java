// Name : Hasnat Jani Rafin
// ID : 20172507
import java.util.*;
import java.io.*;
import java.util.regex.*;
    class SplitMethod {
    public static String[] split(String s,String regex) {
        ArrayList<String> ML = new ArrayList<String>();
        Pattern px = Pattern.compile(regex); Matcher mat = px.matcher(s);
        int index = 0;
        while(mat.find()) {
                String match = s.subSequence(index, mat.start()).toString();ML.add(match);
                String match2 = s.subSequence(mat.start(),mat.end()).toString();ML.add(match2);
                index = mat.end();}
        String match = s.subSequence(index,s.length()).toString();ML.add(match);
        int resultSize = ML.size();
        while (resultSize > 0 && ML.get(resultSize-1).equals(""))
                            resultSize--;
        String[] result = new String[resultSize];
        return ML.subList(0, resultSize).toArray(result);}
    public static void main(String[] args) 
    {
        String[] a1=split("ab#123#453 ","#");
        System.out.println(" Pattern string (ab#123#453 ) and matching string (#)");
        System.out.print(" **********The matching result string array is:  ") ;
        for(int i=0;i<a1.length;i++) {System.out.print(a1[i]); System.out.print(" ,  ") ;}
        System.out.println(" ") ;
        String[] a2=split("a?b?gf#e","[?#]");
        System.out.println(" Pattern string (a?b?gf#e) and matching string (?#) ");
        System.out.print(" **********The matching result string array is:  ") ;
        for(int i=0;i<a2.length;i++) {System.out.print(a2[i]);System.out.print(" ,  ") ; }
        System.out.println();
    }
}