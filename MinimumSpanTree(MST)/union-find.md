# implementation
## Initialization
function initialize ()
    for i=1 to N
        parent [i] =i;
    end
end

## Union
function union (a,b)
    aRoot = find (a)
    bRoot = find (b)
    parent [aRoot] = bRoot

## Find
function find (a)
    if (parent[a] == a)
        return a
    else
        return parent[a] = find (parent[a])
    end
end