package main.Person;

import main.Enums.Profession;

public class Person {
    

    private final String firstName;
    private final String lastName;
    private final String eMail;
    private final Profession profession;
    
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.eMail = builder.eMail;
        this.profession = builder.profession;
        
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String geteMail() {
        return eMail;
    }
    public Profession getProfession() {
        return profession;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result
                + ((profession == null) ? 0 : profession.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (eMail == null) {
            if (other.eMail != null)
                return false;
        } else if (!eMail.equals(other.eMail))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (profession != other.profession)
            return false;
        return true;
    }

    //local code review (vtegza): stick to StringBuilder generator (available in generate toString Method) @ 22.06.14
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", eMail='").append(eMail).append('\'');
        sb.append(", profession=").append(profession);
        sb.append('}');
        return sb.toString();
    }
    
    public static class Builder {
        
        private String firstName;
        private String lastName;
        private String eMail;
        private Profession profession;
        
        public Builder(Person original) {
                this.firstName = original.firstName;
                this.lastName = original.lastName;
                this.eMail = original.eMail;
                this.profession = original.profession;
        }
        
        public Builder() {          }
        
        public Builder firstName(String firstName ) {
            this.firstName = firstName;
            return this;
        }
        
        public Builder lastName(String lastName ) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder eMail(String eMail ) {
            this.eMail = eMail;
            return this;
        }
        
        public Builder profession(Profession profession ) {
            this.profession = profession;
            return this;
        }
        
        public Person build() {
            return new Person(this);
        }
        
    }
}

