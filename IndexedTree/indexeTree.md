```
 public static int findHightIndexed(int n) {
        int i = 0;
        while (Math.pow(2, i) < n) {
            i++;
        }
        return i;
    }

    public static void initTree(int n, int step) {
        for (int i = 1; i <= n; i++) {
            indexedTree[step + i] = i;
        }
    }

    public static void buildTree(int n) {
        for (int i = n; i >= 1; i--) {
            if (i / 2 > 0) {
                indexedTree[i / 2] += indexedTree[i];
            }
        }
    }

    public static void updateTree(int i, int step, int value) {
        int newIndex = i + step;
        indexedTree[newIndex] = value;
        int parentIndex = newIndex / 2;
        while (parentIndex > 0) {
            indexedTree[parentIndex] = indexedTree[2 * parentIndex] + indexedTree[2 * parentIndex + 1];
            parentIndex = parentIndex / 2;
        }

    }

    public static long sumSegment(int start, int end) {
        long sum = 0;
        while (start <= end) {
            if (start % 2 == 1) {
                sum += indexedTree[start];
            }
            start = (start + 1) / 2;
            if (end % 2 == 0) {
                sum += indexedTree[end];

            }
            end = (end - 1) / 2;
        }
        return sum;
    }
```