int trappingWater(int[] blocks, int n) {
int max = blocks[0], rainCollected = 0;

// traversing the left
for (int i=1; i<n; i++) { if(blocks[i]>= max) {
max = blocks[i];
}
rainCollected+=(max-blocks[i]);
}
int rightMax = 0;
for(int i=n-1; blocks[i]!=max; i--) {
if(blocks[i]>=rightMax) {
rightMax = blocks[i];
}
rainCollected-=(max-rightMax);
}
return rainCollected;
}