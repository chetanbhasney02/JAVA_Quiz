package task;

import java.util.Scanner;

public class QuizGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Array of questions
        String[] questions = {
            "1. Which of the following is not a Java features?\n(a) Dynamic\n(b) Architecture Neutral\n(c) Use of pointers\n(d) Object-oriented",
            "2. _____ is used to find and fix bugs in the Java programs.\n(a) JVM\n(b) JRE\n(c) JDK\n(d) JDB",
            "3. What is the return type of the hashCode() method in the Object class?\n(a) Object\n(b) int\n(c) long\n(d) void",
            "4. Who invented Java Programming?\n(a) Guido van Rossum\n(b) James Gosling\n(c) Dennis Ritchie\n(d) Bjarne Stroustrup",
            "5. Which statement is true about Java?\n(a) Java is a sequence-dependent programming language\n(b) Java is a code dependent programming language\n(c) Java is a platform-dependent programming language\n(d) Java is a platform-independent programming language"
        };
        
        // Array of correct answers
        String[] answers = {"c", "d", "b", "b", "d"};
        
        System.out.println("Welcome to the Quiz Game!\n");
        
        // Iterate through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine().toLowerCase();
            
            if (userAnswer.equals(answers[i])) {
                System.out.println("\nCorrect answer!\n");
                score++;
            } else {
                System.out.println("\nWrong answer!\n");
            }
            
            System.out.println();
        }
        
        System.out.println("Quiz completed!\n");
        System.out.println("Your score: " + score + "/" + questions.length);
        
        scanner.close();
    }
}
