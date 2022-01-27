## Map

A map is a data structure which supports the key-value pair mapping for the data. This interface doesn’t support duplicate keys because the same key cannot have multiple mappings. A map is useful if there is a data and we wish to perform operations on the basis of the key.

![JavaMaps](https://user-images.githubusercontent.com/72085278/132676449-0c856400-567f-469c-b32c-e32cd5547994.JPG)

## HashMap

![JavaHashMap1](https://user-images.githubusercontent.com/72085278/132676765-26e2bfff-9343-4937-bf9d-72ddcb4b611b.JPG)
![JavaHashMap2](https://user-images.githubusercontent.com/72085278/132676759-7d53ade6-7b38-422c-94d5-1ca38c6a8c60.JPG)
![JavaHashMap3](https://user-images.githubusercontent.com/72085278/132676751-b48db298-b9b3-4ecf-a455-b237697cb81b.JPG)


### Extras

----
Difference between HashMap and Hash Table


| HashMap   | HashTable | 
|-----------|:-----------:|
|HashMap is non synchronized.It is not-thread safe and can't be shared between many threads without proper synchronization code. | Hashtable is synchronized. It is thread-safe and can be shared with many threads.|
|HashMap allows one null key and multiple null values.	| Hashtable doesn't allow any null key or value.|
|HashMap is a new class introduced in JDK 1.2. | Hashtable is a legacy class.|
|HashMap is fast. | Hashtable is slow.|
|We can make the HashMap as synchronized by calling this code
   Map m = Collections.synchronizedMap(hashMap); |	Hashtable is internally synchronized and can't be unsynchronized.|
|HashMap is traversed by Iterator.	| Hashtable is traversed by Enumerator and Iterator.|
|Iterator in HashMap is fail-fast.	| Enumerator in Hashtable is not fail-fast.|
| HashMap inherits AbstractMap class. |	Hashtable inherits Dictionary class. |

