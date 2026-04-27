package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class CalendarComponent {
    public void setDate(String day, String mounth, String year) {
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(mounth);
        $(".react-datepicker__month:not(.react-datepicker__day--outside-month)").$(byText(day)).doubleClick();
    }
}
