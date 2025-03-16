package basicb;

public class ArrayAdd {

    public static void main(String[] args) {
        int arr[] = {9, 9, 9};  

        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i]+1; 
                break; 
            } else {
                arr[i] = 0; 
            }
        }

       
        if (arr[0] == 0) {
          
            int[] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            
            
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }

            arr = newArr;
        }

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
