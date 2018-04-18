JFLAGS = -g
JC = javac
JVM=Java
MAIN=CalculatorFX

.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        CalculatorFX.java \
        FXMLDocumentController.java \
        MathLib.java \
        Profiling.java 

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(MAIN)


clean:
        $(RM) *.class

aa