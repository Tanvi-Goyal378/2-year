
import java.util.*;

public class Problem5_NetworkRouting {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static boolean isConnected(String start) {
        Set<String> vis = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(start);
        vis.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            for (String nei : graph.get(curr)) {
                if (!vis.contains(nei)) {
                    vis.add(nei);
                    q.add(nei);
                }
            }
        }
        return vis.size() == graph.size();
    }

    static int bfsHops(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String,Integer> dist = new HashMap<>();

        q.add(start);
        dist.put(start,0);

        while(!q.isEmpty()){
            String curr = q.poll();
            if(curr.equals(end)) return dist.get(curr);

            for(String nei: graph.get(curr)){
                if(!dist.containsKey(nei)){
                    dist.put(nei, dist.get(curr)+1);
                    q.add(nei);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        addEdge("R1","R2");
        addEdge("R1","R3");
        addEdge("R2","R4");
        addEdge("R3","R4");
        addEdge("R4","R5");
        addEdge("R5","R6");

        System.out.println(isConnected("R1"));
        System.out.println(bfsHops("R1","R6"));
    }
}
