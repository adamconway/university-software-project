package controllers.dto.User;

import play.data.validation.Constraints;

import java.util.List;

public class UpdateUserReq {
    @Constraints.Required
    public String firstName;

    @Constraints.Required
    public String lastName;

    public String middleName;

    @Constraints.Required
    public String gender;

    @Constraints.Required
    public int dateOfBirth;

    @Constraints.Required
    public List<NationalityReq> nationalities;

    @Constraints.Required
    public List<Long> travellerTypes;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<NationalityReq> getNationalities() {
        return nationalities;
    }

    public void setNationalities(List<NationalityReq> nationalities) {
        this.nationalities = nationalities;
    }

    public List<Long> getTravellerTypes() {
        return travellerTypes;
    }

    public void setTravellerTypes(List<Long> travellerTypes) {
        this.travellerTypes = travellerTypes;
    }
}
