
package project251;

public class Exercise {
    
    String ContentOfEx;
    String AnswerOfEx;
    public static Boolean availability;
    ArrayList<String> Comments = new ArrayList<String>();

    public Exercise(String ContentOfEx) {
        this.ContentOfEx = ContentOfEx;
    }
    

    public Exercise(String ContentOfEx, String AnswerOfEx, Boolean availability) {
        this.ContentOfEx = ContentOfEx;
        this.AnswerOfEx = AnswerOfEx;
        this.availability = availability;
    }
    public ArrayList<String> getComments() {
        return Comments;
    }
    
    public void setComment(String comment) {
        this.Comments.add(comment);
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
