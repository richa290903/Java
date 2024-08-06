/*6. write a program which creates an array of Date in form (dd/mm/yy). Analyze each element and check whether the date is correct or not. If the date is wrong then throw a User Defined Exception DateException and display the appropriate message. If the Date is correct then display the date in this format. For example, if the date is 9/9/06 then display the date like 9th September 2006. You are able to display all the dates in the given String and for the date which is not proper, display the appropriate message*/

//import java.util.Date;

class DateException extends Exception {
    public DateException(String message) {
        super(message);
    }
}

public class p6{
    public static void main(String[] args) {
        String[] dates = {"01/12/21", "31/02/22", "29/02/20", "30/04/23"};

        for (String date : dates) {
            try {
                analyzeDate(date);
            } catch (DateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void analyzeDate(String dateStr) throws DateException {
        String[] parts = dateStr.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new DateException("Invalid date: " + dateStr);
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            throw new DateException("Invalid date: " + dateStr);
        }

        if (month == 2) {
            boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if ((leapYear && day > 29) || (!leapYear && day > 28)) {
                throw new DateException("Invalid date: " + dateStr);
            }
        }

        System.out.println(formatDate(day, month, year));
    }

    public static String formatDate(int day, int month, int year) {
        String[] suffixes = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        String suffix;
        if (day % 100 >= 11 && day % 100 <= 13) {
            suffix = "th";
        } else {
            suffix = suffixes[day % 10];
        }
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
                break;
        }
        return day + suffix + " " + monthName + " " + year;
    }
}
