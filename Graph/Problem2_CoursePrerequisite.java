
import java.util.*;

public class Problem2_CoursePrerequisite {
    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    static boolean hasCycleUtil(String node, Set<String> visited, Set<String> rec) {
        if (rec.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        rec.add(node);

        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (hasCycleUtil(nei, visited, rec)) return true;
        }

        rec.remove(node);
        return false;
    }

    static boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> rec = new HashSet<>();

        for (String node : graph.keySet()) {
            if (hasCycleUtil(node, visited, rec)) return true;
        }
        return false;
    }

    static List<String> topoSort() {
        Map<String, Integer> indegree = new HashMap<>();
        for (String u : graph.keySet()) {
            indegree.putIfAbsent(u, 0);
            for (String v : graph.get(u)) {
                indegree.put(v, indegree.getOrDefault(v, 0) + 1);
            }
        }

        Queue<String> q = new LinkedList<>();
        for (String k : indegree.keySet()) {
            if (indegree.get(k) == 0) q.add(k);
        }

        List<String> res = new ArrayList<>();
        while (!q.isEmpty()) {
            String curr = q.poll();
            res.add(curr);
            for (String nei : graph.getOrDefault(curr, new ArrayList<>())) {
                indegree.put(nei, indegree.get(nei) - 1);
                if (indegree.get(nei) == 0) q.add(nei);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        addEdge("CS101", "CS102");
        addEdge("CS101", "CS201");
        addEdge("CS102", "CS202");
        addEdge("MATH101", "CS201");

        System.out.println("Cycle: " + hasCycle());
        System.out.println("Topo Sort: " + topoSort());
    }
}
