package main.Enums;

public enum Profession {

    DEV ("Developer"),
    QA ("Quality Assurance"), 
    DIR ("Director");
    //local code review (vtegza): make it final @ 22.06.14
    private final String profession;
    
    private Profession(String profession) {
        this.profession = profession;
    }
    
    public String toString() {       
        return this.profession;
    }
           
}
