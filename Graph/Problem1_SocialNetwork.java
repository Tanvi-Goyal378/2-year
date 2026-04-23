
import java.util.*;

public class Problem1_SocialNetwork {
    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static List<String> getFriends(String user) {
        return graph.getOrDefault(user, new ArrayList<>());
    }

    static boolean isDirectlyConnected(String u, String v) {
        return graph.getOrDefault(u, new ArrayList<>()).contains(v);
    }

    static int shortestPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> dist = new HashMap<>();

        q.add(start);
        visited.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.equals(end)) return dist.get(curr);

            for (String nei : graph.get(curr)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    q.add(nei);
                    dist.put(nei, dist.get(curr) + 1);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        addEdge("Alice", "Bob");
        addEdge("Alice", "Charlie");
        addEdge("Bob", "David");
        addEdge("Charlie", "Eve");
        addEdge("David", "Eve");

        System.out.println(getFriends("Alice"));
        System.out.println(isDirectlyConnected("Bob", "Eve"));
        System.out.println(shortestPath("Alice", "Eve"));
    }
}
