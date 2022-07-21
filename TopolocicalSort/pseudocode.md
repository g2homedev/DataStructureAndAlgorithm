# Initialize
```
in[a]=0, in[b]=0;
if a -> b => in[b]=in[b]+1;
```
# Process
```
for (int i=1;i<=N;i++) if (in[i] == 0)
    que.add(i);
while (!que.isEmpty()){
    int q = que.poll();
    order.add(q);
    for (int t: con[q]){
        if (--in[t] == 0) que.add(t);
    }
}
```
