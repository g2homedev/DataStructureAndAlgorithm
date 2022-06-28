# Algorithm
    Dijkstra's Algorithm
## Input
    Graph, source, (dest)
## Output
    Path
## Code
```
function Dijkstra (Graph, source):
    // initialization
    dist[source] = 0
    create vertex priority queue Q
    Q.add_with_priority(source, dist[source])
    
    for each vertex v in Graph.Vertices:
        if v # source then
            dist[v] = INFINITY  // Unknow distance from source to v
            prev[v] = UNDEFINED
        end
    end

    while Q is not empty do
        u = Q.extract_min()
        for each neighbor v of u do
            alt = dist[u] + Graph.Edges(u,v)
            if alt < dist[v] and dist[u] is not INFINITY then
                dist[v] = alt
                prev[v] = u
                Q.add_with_priority(v, dist[v])
            end
        end
    end

    return dist, prev
end
```
