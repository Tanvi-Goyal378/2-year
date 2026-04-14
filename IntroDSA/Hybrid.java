public static boolean hybrid(int[] completed, int[] prereq) {
    if (prereq.length <= 2) {
        return checkA(completed, prereq); // small m
    } else {
        return checkB(completed, prereq); // large m
    }
}