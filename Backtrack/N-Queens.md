# Algorithm
    Backtracking Algorithm for solving the N-Queens Problem
## Data
    Q[n]: an array contains the positions of n queens
    k: index of the first empty row
## Result
    All the possible placement of n non-attacking queens on a chessboard
## Code
```
Procedure NQueen (Q[n],k)
    if k == n+1 then
        return Q
    end
    for j = 1 to n do
        valid = true
        for i = 1 to k-1 do
            if (Q[i] = j) or (Q[i] = j+k-i) or (Q[i] = j-k+k) then
                valid = false
            end
            if valid = true then
                Q[k] = j
                NQueen(Q[n], k+1)
            end
        end
    end
end
```