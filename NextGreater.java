import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int arr[]={3,2,5,8,7,9};
        Stack<Integer>s=new Stack<>();
        int NxtGreater[]= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                NxtGreater[i]=-1;
            } else{
                NxtGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<NxtGreater.length;i++){
            System.out.print(NxtGreater[i]+" ");
        }
        System.out.println();
    }
}
