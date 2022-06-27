# Algorithm
    Breadth-first search (BFS)
## Input
    A graph G and a starting vertex root of G
## Output
    Goal state. The parent links trace the shortest path back to root
## Code
```
procedure BFS (G, root)
    let Q be a queue
    Q.enqueue(root)
    while Q is not empty do
        v = Q.dequeue()
        visited[root] = true
        if v is the goal then
            return v
        end
        for all edges from v to w in G.adjacentEdges(v) do
            if visited[w] = false then
                Q.enqueue(w)
            end
        end
    end
end
```