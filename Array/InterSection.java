import java.util.*;
public class InterSection {
    public static ArrayList<Integer> intersectionOfArrays(int[] A, int[] B){
        
       ArrayList<Integer> ans=new ArrayList<>();
    
      int i = 0, j = 0; 
    
      while (i < A.length && j < B.length) {
          
        if (A[i] < B[j]) { 
          i++;
        } else if (B[j] < A[i]) {
          j++;
        } else {
        
          ans.add(A[i]);
          i++;
          j++;
        }
      }
      return ans;
    }    
    
    public static void main(String args[]) 
    {
      int A[]= {1,2,3,3,4,5,6,7};
      int B[]= {3,3,4,4,5,8};
    
      ArrayList<Integer> ans= intersectionOfArrays(A,B);
      
      for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i)+" ");
      }
    
    }
    }
