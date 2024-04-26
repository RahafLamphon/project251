
package project251;

public class Exercise {
    
    String ContentOfEx;
    String AnswerOfEx;
    public static Boolean availability;

    public Exercise(String ContentOfEx) {
        this.ContentOfEx = ContentOfEx;
    }
    

    public Exercise(String ContentOfEx, String AnswerOfEx, Boolean availability) {
        this.ContentOfEx = ContentOfEx;
        this.AnswerOfEx = AnswerOfEx;
        this.availability = availability;
    }

    public String getContentOfEx() {
    
        return ContentOfEx;
    }

    public void setContentOfEx(String ContentOfEx) {
        this.ContentOfEx = ContentOfEx;
    }

    public String getAnswerOfEx() {
        return AnswerOfEx;
    }

    public void setAnswerOfEx(String AnswerOfEx) {
        this.AnswerOfEx = AnswerOfEx;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    
    
}
