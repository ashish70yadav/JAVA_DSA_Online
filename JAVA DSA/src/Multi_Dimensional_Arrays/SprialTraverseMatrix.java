package Multi_Dimensional_Arrays;

public class SprialTraverseMatrix {
    static void main(String[] args) {
        int [][] arr = {{3,5,6,7},{3,6,7,9},{8,89,8,9},{5,8,9,3}, {3,18,90,26}};
        int fr = 0 ,fc = 0 , lc = arr[0].length-1 , lr = arr.length-1;
        while(fr <= lr && fc <= lc){
            for(int  i = fc ; i<= lc ; i++ ){
                System.out.print(arr[fr][i]+" ");
            }
            fr++;
            if(fr > lr || fc > lc) break ;
            for (int i = fr; i <=lr ; i++) {
                System.out.print(arr[i][lc]+" ");
            }
            lc--;
            if(fr > lr || fc > lc) break ;
            for (int i = lc; i >= fc ; i--) {
                System.out.print(arr[lr][i]+" ");
            }
            lr--;
            if(fr > lr || fc > lc) break ;
            for (int i = lr; i >=fr ; i--) {
                System.out.print(arr[i][fc]+" ");
            }
            fc++;
        }
    }
}
