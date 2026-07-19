# 🧵 Multithreading in Java

Multithreading allows concurrent execution of multiple parts of a program for maximum CPU utilization.

---

## 💻 Creating Threads
1. **Extend Thread Class**:
   ```java
   class MyThread extends Thread {
       public void run() { System.out.println("Thread running"); }
   }
   ```
2. **Implement Runnable Interface (Recommended)**:
   ```java
   class MyRunnable implements Runnable {
       public void run() { System.out.println("Runnable running"); }
   }
   ```

## 🔒 Synchronization
Use the `synchronized` keyword to restrict thread access to critical sections, avoiding data races.
