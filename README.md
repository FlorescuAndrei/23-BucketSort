# 23-BucketSort
Array sort Algorithm that hash the values to sort  

Three phases:  
1. Scattering phase: distribute the items into buckets based on their hashed values;  
2. Sort the items in each bucket  
3. Gathering phase: merge the buckets   

The values in bucket X must be greater than the values in bucket X-1 and less than X+1. The hash function must meet this requirement.  
Insertion sort is usually used to sort the buckets. 

Preform better when hashed values of items being sorted are evenly distributed, so there aren’t many collisions.  

The algorithm make assumptions about data and can sort in O(n) time.  

It is a generalization of counting sort.  

[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
