class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] seen = new boolean[s.length() + 1];
        queue.add(0);

        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (start == s.length()) {
                return true;
            }

            for (int end = start + 1; end <= s.length(); end++) {
                if (seen[end]) {
                    continue;
                }

                if (wordDict.contains(s.substring(start, end))) {
                    queue.add(end);
                    seen[end] = true;
                }
            }
        }

        return false;
    }
}