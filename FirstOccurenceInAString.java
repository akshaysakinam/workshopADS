package src;

public class FirstOccurenceInAString {
    public static void main(String[] args) {
        String actual="sadbutsad";
        String required="sad";
        int len1=actual.length();
        int len2=required.length();
        int flag=0;
        for(int i=0;i<=(len1-len2);i++){
            int j=0;
            for (j=0;j<len2;j++){
                if(actual.charAt(i+j)!=required.charAt(j)){
                    break;
                }

            }
            if(j==len2){
                System.out.println("String is matched at index "+i);
                flag++;
//                break; add break for getting only first occurence
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
