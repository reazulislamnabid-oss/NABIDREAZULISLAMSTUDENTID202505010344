import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Questions {
    private String question;
    private String option1;
    private String option2;
    private String correctAnswer;

    public Questions(String question, String option1, String option2, String correctAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public boolean isCorrect(String answer) {
        return answer.equals(correctAnswer);
    }
}

public class QuizBattleGUI extends JFrame implements ActionListener {

    JLabel lblQuestion;
    JLabel lblResult;

    JButton btn1;
    JButton btn2;

    Questions[] questions;
    int currentQuestion = 0;

    public QuizBattleGUI() {

        // Create questions
        questions = new Questions[3];

        questions[0] = new Questions(
                "Which keyword creates an object?",
                "new",
                "class",
                "new"
        );

        questions[1] = new Questions(
                "Which keyword is used to create a class?",
                "class",
                "object",
                "class"
        );

        questions[2] = new Questions(
                "Which method is the starting point of a Java program?",
                "main",
                "start",
                "main"
        );

        // Window title
        setTitle("Programming Quiz Battle");

        // Window size
        setSize(500, 300);

        // Close application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout
        setLayout(new FlowLayout());

        // Question label
        lblQuestion = new JLabel();

        lblQuestion.setPreferredSize(new Dimension(450, 50));

        add(lblQuestion);

        // Button 1
        btn1 = new JButton();

        btn1.setPreferredSize(new Dimension(150, 40));

        btn1.addActionListener(this);

        add(btn1);

        // Button 2
        btn2 = new JButton();

        btn2.setPreferredSize(new Dimension(150, 40));

        btn2.addActionListener(this);

        add(btn2);

        // Result label
        lblResult = new JLabel("Answer the question!");

        lblResult.setPreferredSize(new Dimension(450, 50));

        add(lblResult);

        // Display first question
        showQuestion();

        // Show window
        setVisible(true);
    }

    // Display current question
    public void showQuestion() {

        lblQuestion.setText(questions[currentQuestion].getQuestion());

        btn1.setText(questions[currentQuestion].getOption1());

        btn2.setText(questions[currentQuestion].getOption2());

        lblResult.setText("Answer the question!");
    }

    // Button click event
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        String selectedAnswer = button.getText();

        if (questions[currentQuestion].isCorrect(selectedAnswer)) {

            lblResult.setText("Correct! You defeated the Code Boss!");

            currentQuestion++;

            // Check if there are more questions
            if (currentQuestion < questions.length) {

                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showQuestion();
                    }
                });

                timer.setRepeats(false);
                timer.start();

            } else {

                lblResult.setText("Congratulations! You are a Java Champion!");

                btn1.setEnabled(false);
                btn2.setEnabled(false);
            }

        } else {

            lblResult.setText("Wrong! Try Again!");
        }
    }

    // Main method
    public static void main(String[] args) {

        new QuizBattleGUI();
    }
}