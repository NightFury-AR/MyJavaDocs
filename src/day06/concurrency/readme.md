# Java Concurrency

<hr/>

### Locks

when we use synchronized keyword, then thread will always wait for that block to be available. its might leads to performance issues due to waiting. but when we use lock , then we can handle this scenario in sophiscated way.

### What's the difference between Synchronized and Lock?

- Lock is an interface, and Synchronized is the key word.

- Synchronized releases the lock automatically, and Lock must release the lock manually.

- Lock can interrupt the response of the thread waiting for the lock, but Synchronized will not, and the thread will wait all the time.

-  Lock lets you know if a thread has a lock, but Synchronized can't.

- Lock can improve the efficiency of multiple threads.

- Synchronized locks classes, methods, and code blocks, while Lock is block-wide

### Runnable vs Callable

when we use runnable threads, then it can't returns any value, its just used to execute the given task and doesn't return anything.

when we want our threads to return something then we can go with callable. the return value can be collected using Future object.
also compared to runnable , you can also cancel the return values in callable.


## Executors in Java concurrency

In java , instead of manually managing thread states, we can use executors to manage the threads automatically.

ExecutorService, and Executors are part of Java's Executor framework which provides thread pool facilities to Java applications. Since the creation and management of Threads are expensive and the operating system also imposes restrictions on how many Threads an application can spawn, it's a good idea is to use a pool of threads to execute tasks in parallel, instead of creating a new thread every time a request comes in. This not only improves the response time of the application but also prevent resource exhaustion errors like "java.lang.OutOfMemoryError: unable to create new native thread".

A thread pool that is created when an application is a startup solves both of these problems. It has ready threads to serve clients when needed and it also has a bound on how many threads to create under load.


#### How to create a ThreadPool using executor ?

        ExecutorService es = Executors.newFixedThreadPool(3);

here ,  

<span style="background-color:white;color:black;padding:5px;margin-bottom:12px;border-radius:10px">ExecutorService</span> - this is an interface which will gives us some useful methods for manipulating the thread.  
e.g. execute(), shutdown(), submit(), invokeAll(), invokeAny(), isTerminated(), awaitTermination()

<span style="background-color:white;color:black;padding:5px;margin-bottom:12px;border-radius:10px">Executors</span> - This is a Class which provides Factory and utility methods for Executor , ExecutorService , ScheduledExecutorService , ThreadFactory , and Callable classes defined in this package.

below are some common methods of executors class.

<div style="background-color:black;padding:10px;border-radius:12px;font-weight:bold">
Executors.newFixedThreadPool(int Threads,ThreadFactory T)
Executors.newFixedThreadPool(int noOfThread)
Executors.newCachedThreadPool()
Executors.newCachedThreadPool(ThreadFactory)
Executors.newScheduledThreadPool(int corePoolSize)
Executors.newScheduledThreadPool(int corePoolSize,ThreadFactory tf);
Executors.newSingleThreadExecutor(ThreadFactory)
Executors.newSingleThreadExecutor()
Executors.newSingleThreadScheduledExecutor()
Executors.newSingleThreadScheduledExecutor(ThreadGroup)
Executors.defaultThreadFactory()
</div>

### Executor vs Thread

- Executor is an interface and Thread is a class.
- Thread is concrete way to run code in parallel, executors is a abstacted way and allows run code in parallel in managed way.
- Executor decouples from execution, but incase of Thread , both task and execution tightly coupled.
- Executor executed code using worker thread from thread pool, but incase of Thread , execution done by Thread itself.
- runnable task passed in constructor in Thread, in executors , its passed inside .execute() method.
- one thread can execute only one runnable task. but exector accepts multiple runnable tasks.


Read more: https://javarevisited.blogspot.com/2017/02/difference-between-executor-executorservice-and-executors-in-java.html#ixzz7AgVbFoAy
