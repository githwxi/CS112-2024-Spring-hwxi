##################################################################

JAVA=java
JAVAC=javac

##################################################################

test:: QuickSort.class; $(JAVA) QuickSort

QuickSort.class: QuickSort.java; $(JAVAC) QuickSort.java

##################################################################

clean:: ; rm -f *~

cleanall:: clean
cleanall:: ; rm -f QuickSort.class

##################################################################
