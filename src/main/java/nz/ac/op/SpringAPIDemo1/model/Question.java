package nz.ac.op.SpringAPIDemo1.model;

import java.util.List;

/*
 "type": "multiple",
"difficulty": "easy",
"category": "Sports",
"question": "Who won the premier league title in the 2015-2016 season following a fairy tale run?",
"correct_answer": "Leicester City",
"incorrect_answers": [
    "Tottenham Hotspur",
    "Watford",
    "Stoke City"
]
 */
public class Question {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    private String correct_answer;

    List<String> incorrect_answers;

    public Question(){

    }

    public Question(String type, String difficulty, String category, String question, String correct_answer, List<String> incorrect_answers) {
        this.type = type;
        this.difficulty = difficulty;
        this.category = category;
        this.question = question;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
