#MultiThreading in Java

-----

- process of executing multiple programs simultaniously.

- multi-threads are sharing same memory area.

- context switching between threads takes less time.

- its independent each other. so, if error occurs in one thread, then it will not affect other threads.

![image](https://user-images.githubusercontent.com/72085278/138113933-0380ee67-920b-455a-8f41-43f3830cbf27.png)


## Life Cycle of a Thread :

- New
- Runnable
- Waiting
- Timed Waiting 
- Terminated

**New**: Thread is just created and yet started to run method.

**Runnable** : Thread is ready to Run state or waiting to be picked by Thread Scheduler.

**Waiting** : Thread is waiting for some IO operations to happens

**Timed waiting** : Thread is waiting for some specified time

**Terminated** : once thread is finished its execution


![image](https://user-images.githubusercontent.com/72085278/138127706-c98f3823-4d0e-4dda-8482-5911b75e1975.png)


## Thread Creation :

There are 2 ways to create a Threads in java

- by extending Thread class
- by implementing Runnable Interface

**By *extending* Thread class** :

- we cannot inherit more than one class.
- when we use this method , separate object will be created for each thread.

**By implementing Runnable interface** :

- we can implement more than one class.
- when we implement using this method, then multiple threads can share the same object.


### ***Commonly used methods of Thread class:***
**public void run():**  is used to perform action for a thread.

**public void start():** starts the execution of the thread.JVM calls the run() method on the thread.

**public void sleep(long miliseconds):** Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

**public void join():** waits for a thread to die.    

**public void join(long miliseconds):** waits for a thread to die for the specified miliseconds.

**public int getPriority():** returns the priority of the thread.

**public int setPriority(int priority):** changes the priority of the thread.

**public String getName():** returns the name of the thread.

**public void setName(String name):** changes the name of the thread.

**public Thread currentThread():** returns the reference of currently executing thread.

**public int getId():** returns the id of the thread.

**public Thread.State getState():** returns the state of the thread.

**public boolean isAlive():** tests if the thread is alive.

**public void yield():** causes the currently executing thread object to temporarily pause and allow other threads to execute.

**public void suspend():** is used to suspend the thread(depricated).

**public void resume():** is used to resume the suspended thread(depricated).

**public void stop():** is used to stop the thread(depricated).

**public boolean isDaemon():** tests if the thread is a daemon thread.

**public void setDaemon(boolean b):** marks the thread as daemon or user thread.

**public void interrupt():** interrupts the thread.

**public boolean isInterrupted():** tests if the thread has been interrupted.

**public static boolean interrupted():** tests if the current thread has been interrupted.


## Thread Scheduler [Ref](https://www.javatpoint.com/thread-scheduler-in-java)

In java , each and every threads are processed by ThreadScheduler. it will decide which Thread to run and which one to wait.

ThreadScheduler consider two factors while picking the thread.

- Thread Priority
- Thread Arrival Time

ThreadScheduler users 3 algorithm to process the threads.

- First Come First Served
- Time Slicing Scheduling 
- Preemptive-Priority scheduling

## Synchronization in Multithreading

![image](https://user-images.githubusercontent.com/72085278/138597611-46984146-ed4f-43de-af97-a928beebf3ec.png)

when we want to execute the specific block/method by single thread at a time, then we have to use either synchronized block or synchronized method.

- synchronized block used to synchronize the specific block
- synchronized method used synchronize the whole method (locks whole object)

but when we use synchronized method as static, then its locks whole class.

points to be noted :
- if one thread is acquiring lock for the specific method. then other thread can access other static,sync,normal methods inside the same class.
- threads can create multiple locks.

## InterThread communication

inter thread communication was achieved by any of below methods.

- wait()
- notify()
- notifyAll()

points to be noted when using the above methods.

- this should be used only inside synchronized area.
- this can be used object level (which thread owns).
- when we use wait() , then the object immediately released the lock, but notify(),notifyall() may/may not release the lock.

## DeadLock , Starvation

[DeadLock vs Starvation](https://www.geeksforgeeks.org/difference-between-deadlock-and-starvation-in-os/)

![image](https://user-images.githubusercontent.com/72085278/139096273-9b2eb56c-e09b-47ca-a43c-cc546e368fa9.png)

#### DeadLock
each thread will wait for resources where it never released. this is called dead lock in java

![image](https://user-images.githubusercontent.com/72085278/139098072-c2836757-1a66-4d0c-8609-947e5462bfe9.png)

#### starvation

thread is always waiting for picked by the scheduler, but scheduler always picks the priority threads and doesn't care of this thread 😪

## ThreadGroup 

[ThreadGroup ref](https://www.javatpoint.com/threadgroup-in-java)  

ThreadGroup is used to groups the specific actions thread seperately. this will help us to maintain the code readability.

for e.g if we have a program for download threads and upload threads together.    
then we can group download threads as a ThreadGroup(fetchingDataThread,reportPreparationThread,respondData Thread). so if we have a group like this, then whenever we want to stop/interrupt the download threads , then we simply stop/interrupt the group instead of performing actions for each thread.

A thread is allowed to access information about its own thread group, but it cannot access the information about its thread group's parent thread group or any other thread groups.


## ThreadPool

In java , when we use multithreading, each user threads are mapped to worker threads by the system.
OS maintains these thread executions. but Thread creation is bit heavy process for the system. 
for example if our program is having 500+ threads then system will create all threads seperately.

this will affects the performance of both system and program.

by using threadpool, we can have specific number of readily available threads instead of creating threads each time.

This not only improves the response time of the application but also prevent resource exhaustion errors like "java.lang.OutOfMemoryError: unable to create new native thread"

## Executor

usually if we use Thread class methods to execute the thread, we have to manage all thread related states. this will work well with small programs
but when its comes to large applications, its difficult to maintain.but when we use Executor framework (from java 1.5), this will take care of the thread execution.

