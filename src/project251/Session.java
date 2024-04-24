/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.util.Date;

/**
 *
 * @author SHROOQAS
 */
public class Session {
   int SessionNumber;
   String TreatmentPlanName;
   Date sessiondate;

    public Session(int SessionNumber, String TreatmentPlanName) {
        this.SessionNumber = SessionNumber;
        this.TreatmentPlanName = TreatmentPlanName;
    }

   public int getSessionNumber() {
        return SessionNumber;
    }

    public void setSessionNumber(int SessionNumber) {
        this.SessionNumber = SessionNumber;
    }

    public String getTreatmentPlanName() {
        return TreatmentPlanName;
    }

    public void setTreatmentPlanName(String TreatmentPlanName) {
        this.TreatmentPlanName = TreatmentPlanName;
    }

    @Override
    public String toString() {
        return "Session{" + "SessionNumber=" + SessionNumber + ", TreatmentPlanName=" + TreatmentPlanName + ", sessiondate=" + sessiondate + '}';
    }
   
   
}
