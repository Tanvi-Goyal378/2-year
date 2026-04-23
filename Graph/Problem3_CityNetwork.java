
import java.util.*;

class Pair {
    String node;
    int weight;
    Pair(String n, int w){ node=n; weight=w; }
}

public class Problem3_CityNetwork {
    static Map<String, List<Pair>> graph = new HashMap<>();

    static void addEdge(String u, String v, int w, boolean bidirectional) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(new Pair(v, w));
        if (bidirectional) {
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(v).add(new Pair(u, w));
        }
    }

    static void bfs(String start) {
        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();

        q.add(start);
        vis.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            System.out.print(curr + " ");
            for (Pair p : graph.getOrDefault(curr, new ArrayList<>())) {
                if (!vis.contains(p.node)) {
                    vis.add(p.node);
                    q.add(p.node);
                }
            }
        }
    }

    public static void main(String[] args) {
        addEdge("A","B",5,false);
        addEdge("B","C",3,true);
        addEdge("A","D",7,true);
        addEdge("D","E",2,false);
        addEdge("C","E",4,false);

        bfs("A");
    }
}
