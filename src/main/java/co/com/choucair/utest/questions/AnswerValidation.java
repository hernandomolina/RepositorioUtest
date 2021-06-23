package co.com.choucair.utest.questions;

import co.com.choucair.utest.userinterface.SecurityDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.choucair.utest.userinterface.SecurityDataPage.*;

public class AnswerValidation implements Question<Boolean> {
    private String question;

    public AnswerValidation(String question){

        this.question = question;
    }

    public static AnswerValidation toThe(String question){

        return new AnswerValidation(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String namePage = Text.of(SecurityDataPage.NAME_PAGE).viewedBy(actor).asString();
        if (question.equals(namePage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }


}
