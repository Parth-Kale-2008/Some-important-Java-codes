import java.util.*;
public class Bsf_example{
    static void bfs(int start,ArrayList<ArrayList<Integer>>graph,boolean[] visited){
        Queue<Integer>queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.err.println(node+"");

            for(int neighbor:graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args){
        int V = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);

        boolean[] visited = new boolean[V];
        System.out.println("the bfs is ");
        bfs(0,graph,visited);
    }
}