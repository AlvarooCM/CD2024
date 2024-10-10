**EN VEZ DE EJECUTAR "java Suma"**

**TIENES QUE EJECUTAR java Suma.java**

### Proba 1 

Input

    java Suma.java 3.4 4.6

Output

    8.0

### Proba 2 

Input

    java Suma.java -3.4 -4.6

Output

    -8.0

### Proba 3 

Input

    java Suma.java asdf 789

Output

    vagrant@CDDeveloper2024:~/Desktop/CD2024/ud01/ciclovida$ java Suma.java asdf 789
    Exception in thread "main" java.lang.NumberFormatException: For input string: "asdf"
        at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        at java.base/java.lang.Double.parseDouble(Double.java:792)
        at ciclovida.Suma.main(Suma.java:8)

    

