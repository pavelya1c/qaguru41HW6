
import org.junit.jupiter.api.Test;
import pages.AllPages;


import static com.codeborne.selenide.Selenide.*;
import static testdata.TestData.*;




public class TestBoxHW6 extends TestBase {
    AllPages allPages = new AllPages();



    @Test
    public void successfulFormSubmissionWithAllFieldsTestHardForm() {




        allPages.openPage("/automation-practice-form")
                .typeUserFirstName(userfirstNameFaker)
                .typeUserLastName(userlastNameFaker)
                .typeUserEmail(userEmailFaker)
                .typeUserNumber(userPhoneFaker)
                .typeUserGender(userGenderFaker)
                .setDayOfBirth(userDayOfBirthFaker, userMonthOfBirthFaker, userYearOfBirthFaker)
                .typeUserSubject(userSubjectFaker)
                .typeUserHobbies(userHobbiesFaker)
                .typeUserPicture(userPictureFaker)
                .typeUserCurrentAddress(userCurrentAdressFaker)
                .typeUserState(userStateFaker)
                .typeUserCity(userCityFaker)
                .submitButtonClick()
                .checkFormFieldHardForm("Student Name", (userfirstNameFaker + " " + userlastNameFaker))
                .checkFormFieldHardForm("Student Email", userEmailFaker)
                .checkFormFieldHardForm("Gender", userGenderFaker)
                .checkFormFieldHardForm("Mobile", userPhoneFaker)
                .checkFormFieldHardForm("Hobbies", userHobbiesFaker)
                .checkFormFieldHardForm("Date of Birth", (userDayOfBirthFaker + " " + userMonthOfBirthFaker + "," + userYearOfBirthFaker))
                .checkFormFieldHardForm("Subjects", userSubjectFaker)
                .checkFormFieldHardForm("Picture", userPictureFaker)
                .checkFormFieldHardForm("Address", userCurrentAdressFaker)
                .checkFormFieldHardForm("State and City", ((userStateFaker + " " + userCityFaker)));


    }

    @Test
    void successfulFormSubmissionWithAllFieldsTestEasyForm() {

        allPages.openPage("/text-box")
                .typeUserName(userfirstNameFaker + " " + userlastNameFaker)
                .typeUserEmail(userEmailFaker)
                .typeUserCurrentAddress(userCurrentAdressFaker)
                .typeUserPermanentAddress(userPermanentAddressFaker)
                .submitButtonClick()
                .checkFormFieldEasyForm(userfirstNameFaker + " " + userlastNameFaker)
                .checkFormFieldEasyForm(userEmailFaker)
                .checkFormFieldEasyForm(userCurrentAdressFaker)
                .checkFormFieldEasyForm(userPermanentAddressFaker);


    }

    @Test
    public void successfulFormSubmissionWithRequiredFieldsTestHardForm() {
        open("/automation-practice-form");
        allPages.typeUserFirstName(userfirstNameFaker)
                .typeUserLastName(userlastNameFaker)
                .typeUserEmail(userEmailFaker)
                .typeUserNumber(userPhoneFaker)
                .typeUserGender(userGenderFaker)
                .submitButtonClick()
                .checkFormFieldHardForm("Student Name", (userfirstNameFaker + " " + userlastNameFaker))
                .checkFormFieldHardForm("Student Email", userEmailFaker)
                .checkFormFieldHardForm("Gender", userGenderFaker)
                .checkFormFieldHardForm("Mobile", userPhoneFaker);
    }

    @Test
    public void successfulFormSubmissionWithNoTAllFieldsTestEasyForm() {
        allPages.openPage("/text-box")
                .typeUserName(userfirstNameFaker + " " + userlastNameFaker)
                .typeUserEmail(userEmailFaker)
                .submitButtonClick()
                .checkFormFieldEasyForm(userfirstNameFaker + " " + userlastNameFaker)
                .checkFormFieldEasyForm(userEmailFaker);


    }

    //НЕГАТИВНЫЕ ТЕСТЫ

    @Test
    public void shouldShowValidationErrorsWhenAllRequiredFieldsAreEmptyTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserGender(userGenderFaker)
                .submitButtonClick()
                .userFormWasValidatedHardForm();
    }

    @Test
    public void shouldShowValidationErrorsWhenFirstNameAreEmptyTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserLastName(userfirstNameFaker)
                .typeUserEmail(userlastNameFaker)
                .typeUserNumber(userPhoneFaker)
                .typeUserGender(userGenderFaker)
                .submitButtonClick()
                .userFormWasValidatedHardForm();
    }

    @Test
    public void shouldNotDisplayResultTableWhenFormSubmissionIsInvalidTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserLastName(userlastNameFaker)
                .typeUserEmail(userEmailFaker)
                .typeUserNumber(userPhoneFaker)
                .typeUserGender(userGenderFaker)
                .submitButtonClick()
                .userFormWasNotValidatedHardForm();
    }

    @Test
    public void shouldShowValidationErrorWhenInvalidEmailIsEnteredTestEasyForm() {
        allPages.openPage("/text-box")
                .typeUserEmail(userEmailNotValid)
                .submitButtonClick()
                .userFormWasValidatedEasyForm();
    }


}
