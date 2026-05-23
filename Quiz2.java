import java.util.*;

class Quiz{
    String questions;
    String options;
    int correct;

    Quiz(String questions,String options,int correct){
        this.questions = questions;
        this.options = options;
        this.correct = correct;
    }
}

public class Quiz2{
    public static void main(String[] args){
        HashMap<String, Quiz> abc = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the quiz:");

        abc.put(
            "Q1",
            new Quiz(
                "What is the charge on Na?",
                "1) +1\n2) -1\n3) +2\n4) 0",
                1
            )
        );
        
        abc.put(
            "Q2",
            new Quiz(
                "A uniform rod of mass M and length L is kept on a smooth horizontal surface.A small insect of mass m starts crawling from one end of the rod to the other with constant speed v relative to the rod.Find the displacement of the rod when the insect reaches the other end.?",
                "1) x = mL/M+m \n2) x = m+L/m+M \n3) x = 2m/L+m \n4) x = 2M/mL",
                1
            )
        );
        
        abc.put(
            "Q3",
            new Quiz(
                "Find x for x= x^2+1",
                "1) 2+5i/2\n2)1+3i/2 \n3)6i-5/2 \n4) 1",
                2
            )
        );
        
        int score = 0;

        for (Quiz q : abc.values()) {

            System.out.println("\n" + q.questions);
            System.out.println(q.options);

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == q.correct) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println(" Wrong!");
                System.out.println("Correct option is: " + q.correct);
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + "/" + abc.size());

        sc.close();
    }
}