import java.util.HashSet;

public static boolean checkB(int[] completed, int[] prereq) {
    HashSet<Integer> set = new HashSet<>();

    for (int c : completed) {
        set.add(c);
    }

    for (int p : prereq) {
        if (!set.contains(p)) return false;
    }
    return true;
}