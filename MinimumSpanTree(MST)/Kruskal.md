# Algorithm
    Kruskal's Algorithm base on union-find
## Input
    Graph G
## Output
    Minimum Span Tree
## Code
```
function Kruskal (graph G):
    MST = {}
    for each vertex v belonging G.V do
        parent[v] = v
    end
    for each (u,v) in G.E ordered by weight (v,v) do // sort from min -> max
        if find (u) != find(v) then
            add {(u,v)} to MST
            union (u,v)
        end
    end
end
```