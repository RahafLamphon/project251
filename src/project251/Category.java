/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

/**
 *
 * @author rahaf
 */
public class Category {
    String catName;
    String catType;

    public Category(String catName, String catType) {
        this.catName = catName;
        this.catType = catType;
    }

    public Category() {
    }

   public Category(String catName) {
       this.catName = catName;
        
   }

    public void setCatName(int option) {
    if(option==1)
        catName="obsessive compulsive Disorder";
    else if(option==2)
        catName="Anxiety Disorder";
    else if(option==3)
        catName="Schizophrenia Disorder";
    else if(option==4)
        catName="Bipolar Disorder"; 
    else if(option==5)
        catName="Major Depressive Disorder"; 
    else if(option==6)
        catName="Acute stress Disorder"; 
    else if(option==7)
        catName="Eating Disorders"; 
    else if(option==8)
        catName="Attention-Deficit Hyperactivity Disorder"; 
    else if(option==9)
        catName="Insomnia"; 
    
    }

    public String getCatType() {
    return catType="1.obsessive compulsive Disorder"+"\n"+
            "2.Anxiety Disorder"+"\n"+"3.Schizophrenia Disorder"+"\n"+"4.Bipolar Disorder"+"\n"+"5.Major Depressive Disorder"+"\n"+
            "6.Acute stress disorder"+"\n"+"Posttraumatic stress Disorder"+"\n"+"7.Eating Disorders"+"\n"+"8.Attention-Deficit Hyperactivity Disorder"+
            "\n"+"9.Insomnia";
        
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getCatName() {
        return catName;
    }

    @Override
    public String toString() {
        return "Category{" + "catName=" + catName + ", catType=" + catType + '}';
    }
   
}