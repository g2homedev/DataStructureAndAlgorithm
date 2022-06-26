# PreProcess
    Finding the depth and parent of each node
## Data
    Adj: Adjacency list representing the tree
    Visited: Boolean visited array, initially all false
## Result
    Stores the depth and parent of each node
## Code
```
function DFS (v)
    Visist[v] = true
    for each u in Adj[v] do
        if Visited[u] = false then
            Depth[u] = Depth[v] +1;
            Parent[u] = v
            DFS(u)
        end
    end
end
```


# Process
    Build Sparse Table structure for binary lifting
## Data
    Par: Array storing the parent of each node -> Refer #PreProcess
    N: Number of nodes on the tree
## Result
    The sparse table ST[N][log(N)]
## Code
```
Log = Ceil (Log2(N))

for i = 1 to N do
    ST[i][0] = Par[i]
end

for j = 1 to Log do
    for i = 1 to N do
        ST[i][j] = ST[ST[i][j-1]][j-1]
    end
end
```

# Algorithm
    Efficient LCA Query
## Data
    ST: The sparse table we built in above -> Refer #Process
    Depth: Array storing the depth of each node -> Refer #PreProcess
    u,v: Pair of nodes to find the LCA for
## Result
    Returns the LCA of u and v

## Code