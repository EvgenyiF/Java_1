
class Solution {
    
        public static void main(String[] args) {
            int[] arr = new int[] {1,0,2,3,0,4,5,0};
            duplicateZeros(arr);
        }
        public static void duplicateZeros(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) {
                    for(int j = arr.length - 1; j >= i + 1; j--) {
                        if(j == i + 1) {
                            arr[j] = 0;
                        }
                         arr[j] = arr[j - 1];
                        
                    }
                    i += 1;
                }
            
               
            }
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
}
