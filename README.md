# Stackful Coroutines for Dotty

An implementation of coroutines for Scala 3 based on CPS transformation. This library was implemented using the Dotty macro system.

The library directory contains the source code, unit tests and benchmarks.
The archives directory contains outdated code. As well as designs we thought about for the coroutine library initially.

To run the project you can switch to the library directory and run one of the following sbt command:

the unit tests
```
sbt test
```

the main class
```
sbt run 
```

the JMH benchmark
```
jmh:run *BenchMarkClassName*
```
where you have to replace BenchMarkClassName by your choice.

take a look at library/runBenchmarks.bash to have a more precise example.

Comparative benchmarks results between storm en-route implementation and this library can be seen:

* [Here for a benchmark on binary trees](https://jmh.morethan.io/?source=https://raw.githubusercontent.com/LeDevDuDimanche/Coroutines-for-Scala-3/master/library/mergedTree.json)
* [Here for a benchmark of fibonacci](https://jmh.morethan.io/?source=https://raw.githubusercontent.com/LeDevDuDimanche/Coroutines-for-Scala-3/master/library/mergedFibo.json)
* [Here for a benchmark of taylor series](https://jmh.morethan.io/?source=https://raw.githubusercontent.com/LeDevDuDimanche/Coroutines-for-Scala-3/master/library/mergedTaylor.json)

[Here](https://github.com/LeDevDuDimanche/StormCoroutines) is a link to the forked storm-enroute coroutine project adapted in order to run some of its benchmarks with JMH.


