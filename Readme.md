# Heap dump to resolve memory leak

## Start app

JVM arguments:
```shell
-Xms128m -Xmx128m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp/heapdump.hprof
```

## Analyse Heap dump

### With IntelliJ

![intellij-dump-visualisation.png](images/intellij-dump-visualisation.png)

### JVisualVM

![jvisualvm-heap-dump-objects.png](images/jvisualvm-heap-dump-objects.png)

### Memory Analyzer (MAT)

![mat.png](images/mat.png)

https://eclipse.dev/mat/download/ 
