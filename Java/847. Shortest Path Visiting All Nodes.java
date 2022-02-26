class Solution {
    public int shortestPathLength(int[][] graph) {
        if(graph.length==1)
            return 0;
        int finalState = (1 << graph.length) - 1;   //goal state
        
        Queue<int []> q = new LinkedList<>();
        
        for(int i=0; i<graph.length; i++){          //adding all nodes to queue
            q.add(new int[] {i, 1 << i});
        }
        
        int[][] visited = new int[graph.length][finalState+1];
        
        int shortestPath = 0;
        while(!q.isEmpty()){
            int size = q.size();
            shortestPath++;
            for(int i=0; i<size; i++){
                int[] head = q.poll();
                int nodeID = head[0];
                int nodeState = head[1];
                for(int neighbour : graph[nodeID]){
                    int newnodeState = nodeState | (1<<neighbour);      //update nodestate
                    if(visited[neighbour][newnodeState]==1)             //to stop indefinite loop
                        continue;
                    visited[neighbour][newnodeState] = 1;
                    if(newnodeState == finalState)
                        return shortestPath;
                    q.add(new int[] {neighbour, newnodeState});
                }
            }
        }
        return -1;
    }
}