# This is the resurive version of the DFS algorithm
## Data
    G: The graph stored in an adjacency list
    root: The starting node
## Result
    Prints all nodes inside the graph in the DFS order
## Code
```
visisted = {false}
DFS (root)
function DFS (u):
    if visited[u] = true then
        return;
    end
    print(u)
    visited[u] = true
    for v in G[u].neighbors() do
        DFS(v)
    end
end
```