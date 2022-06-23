**Data**: A direct weighted graph G (V,E)
**Result**: Shortest path between each pair of vertices in G

for each d in V do
    distance [d][d] = 0
end

for each edge (s,p) in E do
    distance[s][p] = weight(s,p)
end

n = cardinality (V)

for k =1 to n do
    for i =1 to n do
        for j =1 to n do
            if distance[i][j] > distance [i][k] + distance[k][j] then
                distance[i][j] = distance [i][k] + distance[k][j]
            end
        end
    end
end