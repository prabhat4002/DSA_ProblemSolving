class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis=new boolean[n];
        Queue<Integer> q1=new LinkedList<>();
        List<List<Integer>> g1=buildAL(edges, n);

        q1.add(source);
        vis[source]=true;

        while(q1.size()!=0){
            int temp=q1.remove();
            List<Integer> nighList=g1.get(temp);

            for(int i=0;i<nighList.size();i++){
                int nigh=nighList.get(i);
                if(!vis[nigh]){
                    vis[nigh]=true;
                    q1.add(nigh);
                }
            }
        }
        if(vis[destination]==true){
            return true;
        }else{
            return false;
        }
        
        
    }
    public List<List<Integer>> buildAL(int[][] edges, int n){
        List<List<Integer>> graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            graph.add(temp);
        }
        int e=edges.length;
        for(int i=0;i<e;i++){
            int u=edges[i][0];
            int v=edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
}