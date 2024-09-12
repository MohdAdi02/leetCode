import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoint {
    /*public int[][] kClosest(int [][] points, int k){

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] +a[1] * a[1] ));

        for(int [] point: points){
            pq.add(point);

            if(pq.size() > k){
                pq.poll();
            }
        }
        int [][]result = new int[k][2];
        for(int i =0; i< k; i++){
            result[i] =pq.poll();
        }


        System.out.println(Arrays.deepToString(result));
        return result;
    }
    */

    // lambda expression

    public int[][] kClosest(int [][] points, int k){
        Arrays.sort(points,(a,b) -> Integer.compare(a[0] * a[0] + a[1] * a[1], b[0] * b[0] + b[1] * b[1])
        );
        System.out.println(Arrays.deepToString(Arrays.copyOfRange(points, 0, k)));
        return Arrays.copyOfRange(points,0,k);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{-2,2}};
        int k =1;
        KClosestPoint kcp = new KClosestPoint();
        kcp.kClosest(arr,k);
    }
}
