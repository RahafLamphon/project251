/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project251;

/**
 *
 * @author 96650
 */
public class Treatment_Plan {
    String TreatmentPlan_Name;
    String Pname;
    int treatmentPlan_ID;
    Session sessions[];
    Category categoryType;

    public Treatment_Plan(String TreatmentPlan_Name, int treatmentPlan_ID) {
        this.TreatmentPlan_Name = TreatmentPlan_Name;
        this.treatmentPlan_ID = treatmentPlan_ID;
    }

   

    public Treatment_Plan(String TreatmentPlan_Name, int treatmentPlan_ID, Category categoryType) {
        this.TreatmentPlan_Name = TreatmentPlan_Name;
        this.treatmentPlan_ID = treatmentPlan_ID;
        this.categoryType = categoryType;
    }

    public Treatment_Plan(String TreatmentPlan_Name, String Pname, int treatmentPlan_ID, Category categoryType) {
        this.TreatmentPlan_Name = TreatmentPlan_Name;
        this.Pname = Pname;
        this.treatmentPlan_ID = treatmentPlan_ID;
        this.categoryType = categoryType;
    }

    public Session[] getSessions() {
        return sessions;
    }
    public Session getSession(int sessionID) {
        return sessions[sessionID-1];
    }

    public void setSessions(Session[] sessions) {
        this.sessions = sessions;
    }

    public String getTreatmentPlan_Name() {
        return TreatmentPlan_Name;
    }

    public void setTreatmentPlan_Name(String TreatmentPlan_Name) {
        this.TreatmentPlan_Name = TreatmentPlan_Name;
    }

    public int getTreatmentPlan_ID() {
        return treatmentPlan_ID;
    }

    public void setTreatmentPlan_ID(int treatmentPlan_ID) {
        this.treatmentPlan_ID = treatmentPlan_ID;
    }

    public Category getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Category categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "Treatment_Plan{" + "TreatmentPlan_Name=" + TreatmentPlan_Name + ", Pname=" + Pname + ", treatmentPlan_ID=" + treatmentPlan_ID + ", categoryType=" + categoryType + '}';
    }

 
    
    
}
