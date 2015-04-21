package com.eviolette.flashcards.model;

/**
 * Created by eviolette on 4/20/15.
 */
public class Card {
    private String question;
    private String answer;

    public Card(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (answer != null ? !answer.equals(card.answer) : card.answer != null) return false;
        if (question != null ? !question.equals(card.question) : card.question != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = question != null ? question.hashCode() : 0;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
