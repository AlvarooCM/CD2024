# Refactoring

This is an exercise designed to practice the skill of detecting 
Code Smells and refactoring the code to fix the problems. 
Solution is also included.

## Code Smells covered:

### 1. Long method

    Ocurre cuando una funcion o método es demasiado largo:

    - Realiza demasiadas tareas
    o
    - Tiene muchas lineas de código

### 2. Duplicate code within class

    Aparece cuando fragmentos de código iguales o muy similares se repiten dentro de la misma clase.

### 3. Duplicate code within method

    Ocurre cuando una misma secuencia de instrucciones o lógica se repite varias veces dentro del mismo código.

### 4. Duplicate code across classes

    Ocurre cuando 2 o más clases contienen fragmentos de código muy similares o idénticos.

### 5. Magic Number

    Ocurre cuando se usan valores numéricos literales directamente en el código.

### 6. Feature Envy (2 instances)

    Ocurre cuando un método de una clase accede excesivamente a los datos o métodos de otra clase, en lugar de trabajar con los suyos propios.

### 7. Improper Naming

    Ocurre al usar nombres poco claros, engañosos o poco descriptivos para variables, métodos, clases u otros elementos del código.

### 8. Dead Code

    Ocurre cuando el código que existe en el programa pero que nunca se ejecuta, no afecta al resultado final ni cumple ninguna función útil.

### 9. Lazy Class

    Ocurre cuando una clase no hace lo suficiente como para justificar su existencia, es decir, aporta muy poco valor y probablemente debería eliminarse o fusionarse con otra clase.

### 10. Switch Case

    Code smell que aparece cuando se abusa de estructuras switch (o if-else anidados) para tomar decisiones basadas en un valor, especialmente cuando esas decisiones deberían delegarse a objetos.

### 11. Indecent Exposure

    Es un code smell típico en el desarrollo de software, sino que se refiere a un comportamiento inapropiado en el código que involucra la exposición innecesaria de detalles internos de una clase.

### 12. Collapse Hierarchy (Lazy Class)

    Ocurre cuando una jerarquía de clases es demasiado compleja o innecesaria, lo que implica que heredar clases ya no aporta beneficios y una refactorización podría simplificar el diseño.

### 13. Long Parameter List

    Ocurre cuando un método recibe demasiados parámetros, lo que hace que el código sea difícil de leer, entender y mantener.

## Code Smells fixed:

### 1. Position.java

    Fixed Feature Envy.

### 2. ChessBoard.java

    Fixed:
    
    - Duplicate Code across methods
    - Long parameter list

### 3. GameEngine.java

    Fixed:
    
    - Feature Envy
    - Lazy class

### 4. Player.java
    Fixed Collapsing Hierarchy
    Fixed Improper Naming

### 5. Bishop.java

    Fixed Collapsing Hierarchy

### 6. Knight.java

    Fixed Collapsing Hierarchy

### 7. Piece.java

    Fixed Switch-case

### 8. Rook.java

    Fixed Collapsing Hierarchy

