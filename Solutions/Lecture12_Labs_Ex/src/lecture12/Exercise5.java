package lecture12;

public class Exercise5 {
    
    public static void main (String[] args){
        System.out.println ("The Maxium between 3 and 4 is " + max(3,4));
        System.out.println ("The Maxium between 5,6 and 7 is " + max(5,6,7));
        System.out.println ("The Maxium between 8,9,10 and 11 is " + max(8,9,10,11));
        System.out.println ("The Maxium between 12,13,14,15 and 16 is " + max(12,13,14,15,16));
    }
            static int max(int numb1, int numb2){
                if (numb1 > numb2)
                    return numb1;
                else
                    return numb2;
            }
            static int max (int numb1, int numb2, int numb3){
                return max( max(numb1,numb2), numb3);
            }
            static int max (int numb1, int numb2, int numb3, int numb4){
                return max(max( max(numb1,numb2), numb3),numb4);
            }
            static int max (int numb1, int numb2, int numb3, int numb4, int numb5){
                return max(max (max( max(numb1,numb2), numb3), numb4), numb5);
            }
    
}
