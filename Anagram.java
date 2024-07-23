package Java_Interview_Questions;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "act";
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    str2 = str2.replaceFirst(""+str1.charAt(i),"");
                    break;
                }
            }
        }
        if(str2.length() == 0)
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }
    }
}
