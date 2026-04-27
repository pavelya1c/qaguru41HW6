
import org.junit.jupiter.api.Test;
import pages.AllPages;
import testdata.TestData;

import static testdata.TestData.userEmailNotValid;


public class TestBoxHW6 extends TestBase {
    AllPages allPages = new AllPages();
    TestData testData = new TestData();


    @Test
    public void successfulFormSubmissionWithAllFieldsTestHardForm() {


        allPages.openPage("/automation-practice-form")
                .typeUserFirstName(testData.userFirstNameFaker)
                .typeUserLastName(testData.userlastNameFaker)
                .typeUserEmail(testData.userEmailFaker)
                .typeUserNumber(testData.userPhoneFaker)
                .typeUserGender(testData.userGenderFaker)
                .setDayOfBirth(testData.userDayOfBirthFaker, testData.userMonthOfBirthFaker, testData.userYearOfBirthFaker)
                .typeUserSubject(testData.userSubjectFaker)
                .typeUserHobbies(testData.userHobbiesFaker)
                .typeUserPicture(testData.userPictureFaker)
                .typeUserCurrentAddress(testData.userCurrentAdressFaker)
                .typeUserState(testData.userStateFaker)
                .typeUserCity(testData.userCityFaker)
                .submitButtonClick()
                .checkFormFieldHardForm("Student Name", (testData.userFirstNameFaker + " " + testData.userlastNameFaker))
                .checkFormFieldHardForm("Student Email", testData.userEmailFaker)
                .checkFormFieldHardForm("Gender", testData.userGenderFaker)
                .checkFormFieldHardForm("Mobile", testData.userPhoneFaker)
                .checkFormFieldHardForm("Hobbies", testData.userHobbiesFaker)
                .checkFormFieldHardForm("Date of Birth", (testData.userDayOfBirthFaker + " " + testData.userMonthOfBirthFaker + "," + testData.userYearOfBirthFaker))
                .checkFormFieldHardForm("Subjects", testData.userSubjectFaker)
                .checkFormFieldHardForm("Picture", testData.userPictureFaker)
                .checkFormFieldHardForm("Address", testData.userCurrentAdressFaker)
                .checkFormFieldHardForm("State and City", ((testData.userStateFaker + " " + testData.userCityFaker)));
    }


    @Test
    void successfulFormSubmissionWithAllFieldsTestEasyForm() {

        allPages.openPage("/text-box")
                .typeUserName(testData.userFirstNameFaker + " " + testData.userlastNameFaker)
                .typeUserEmail(testData.userEmailFaker)
                .typeUserCurrentAddress(testData.userCurrentAdressFaker)
                .typeUserPermanentAddress(testData.userPermanentAddressFaker)
                .submitButtonClick()
                .checkFormFieldEasyForm(testData.userFirstNameFaker + " " + testData.userlastNameFaker)
                .checkFormFieldEasyForm(testData.userEmailFaker)
                .checkFormFieldEasyForm(testData.userCurrentAdressFaker)
                .checkFormFieldEasyForm(testData.userPermanentAddressFaker);
    }

    @Test
    public void successfulFormSubmissionWithRequiredFieldsTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserFirstName(testData.userFirstNameFaker)
                .typeUserLastName(testData.userlastNameFaker)
                .typeUserEmail(testData.userEmailFaker)
                .typeUserNumber(testData.userPhoneFaker)
                .typeUserGender(testData.userGenderFaker)
                .submitButtonClick()
                .checkFormFieldHardForm("Student Name", (testData.userFirstNameFaker + " " + testData.userlastNameFaker))
                .checkFormFieldHardForm("Student Email", testData.userEmailFaker)
                .checkFormFieldHardForm("Gender", testData.userGenderFaker)
                .checkFormFieldHardForm("Mobile", testData.userPhoneFaker);
    }

    @Test
    public void successfulFormSubmissionWithNoTAllFieldsTestEasyForm() {
        allPages.openPage("/text-box")
                .typeUserName(testData.userFirstNameFaker + " " + testData.userlastNameFaker)
                .typeUserEmail(testData.userEmailFaker)
                .submitButtonClick()
                .checkFormFieldEasyForm(testData.userFirstNameFaker + " " + testData.userlastNameFaker)
                .checkFormFieldEasyForm(testData.userEmailFaker);
    }

    //НЕГАТИВНЫЕ ТЕСТЫ

    @Test
    public void shouldShowValidationErrorsWhenAllRequiredFieldsAreEmptyTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserGender(testData.userGenderFaker)
                .submitButtonClick()
                .userFormWasValidatedHardForm();
    }

    @Test
    public void shouldShowValidationErrorsWhenFirstNameAreEmptyTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserLastName(testData.userFirstNameFaker)
                .typeUserEmail(testData.userlastNameFaker)
                .typeUserNumber(testData.userPhoneFaker)
                .typeUserGender(testData.userGenderFaker)
                .submitButtonClick()
                .userFormWasValidatedHardForm();
    }

    @Test
    public void shouldNotDisplayResultTableWhenFormSubmissionIsInvalidTestHardForm() {
        allPages.openPage("/automation-practice-form")
                .typeUserLastName(testData.userlastNameFaker)
                .typeUserEmail(testData.userEmailFaker)
                .typeUserNumber(testData.userPhoneFaker)
                .typeUserGender(testData.userGenderFaker)
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
