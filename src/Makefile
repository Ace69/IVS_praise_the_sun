JFLAGS = -g
JC = javac
JVM=Java
MAIN=CalculatorFX
CP="."

.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

all = \
        CalculatorFX.java \
        FXMLDocumentController.java \
        MathLib.java \
        Profiling.java 
		java -cp $(CP) CalculatorFX

##############

CalculatorFX.class: Calculator.java
	$(JC) -cp $(CP) CalculatorFX.java 

FXMLDocumentController.class: FXMLDocumentController.java
	$(JC) -cp $(CP) FXMLDocumentController.java 

MathLib.class: MathLib.java
	$(JC) -cp $(CP) MathLib.java 

Profiling.class: Profiling.java
	$(JC) -cp $(CP) Profiling.java  


clean:
        rm -f *.class