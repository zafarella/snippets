### How to make your intelliJ faster
 1. remove all unused plug-ins
 2. For modern macs use similar to below (or adjust per need) [`Help -> Edit Custom VM Options`]:
 ```
 -Xms512m
-Xmx3g
-XX:ReservedCodeCacheSize=340m
-XX:+UseCompressedOops
-Dfile.encoding=UTF-8
-XX:+UseConcMarkSweepGC
-XX:SoftRefLRUPolicyMSPerMB=50
-ea
-Dsun.io.useCanonCaches=false
-Djava.net.preferIPv4Stack=true
-XX:+HeapDumpOnOutOfMemoryError
-XX:-OmitStackTraceInFastThrow
-Xverify:none

-XX:ErrorFile=$USER_HOME/java_error_in_idea_%p.log
-XX:HeapDumpPath=$USER_HOME/java_error_in_idea.hprof
-Xbootclasspath/a:../lib/boot.jar
-server
-XX:+UseG1GC
-XX:-UseParNewGC
-XX:-UseConcMarkSweepGC
```
