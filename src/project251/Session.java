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
   
   
}
