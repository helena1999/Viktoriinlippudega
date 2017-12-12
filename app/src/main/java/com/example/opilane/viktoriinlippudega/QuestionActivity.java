package com.example.opilane.viktoriinlippudega;

 public class QuestionActivity {
    //array of questions
    public Integer MyQuestion [] =  {
            R.drawable.est,
            R.drawable.fin,
            R.drawable.sweden,
            R.drawable.russia,
            R.drawable.spain

    };
    //array of multiple choises for question
    public String MyChoises [] [] = {
            {"Russia","Estonia","England","Latvia"},
            {"Finland","Estonia","Lithuania","Italy"},
            {"Spain","Russia","Finland","Sweden"},
            {"French","Canada","Russia","America"},
            {"Bulgaria","Spain","German","French"}
    };
    //array of correct answers - in the same order as array of questions
    private String MyCorrectAnswers [] = {
            "Estonia", "Finland", "Sweden", "Russia", "Spain"
    };
    //method returns number of questions
    public int getLenght(){
        return MyQuestion.length;
    }
    //method returns question from array textQuestions[] based array index
    public Integer getQuestion (int a){
        Integer question = MyQuestion[a];
        return question;
    }
    //method returns a single multiple choice item for question based on array indeks,
    //based on number of multiple choice item in the list - 1, 2, 3, 4 as an argument
    public String getChoice (int index, int num){
        String choice0=MyChoises[index][num -1];
        return choice0;
    }
    //method returns correct answer for the question based on array indeks
    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers [a];
        return answer;
    }


     public int getLength() {
         return MyQuestion.length;
     }
 }
