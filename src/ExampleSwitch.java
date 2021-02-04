public class ExampleSwitch {
    public static void main(String[] args) {

        //switch = statement that allows a variable to be tested for equality against a list of value
        //оператор, который позволяет проверить переменную на равенство со списком значений
        String day = "Friday";

        switch (day) {
            case "Sunday": //Воскресенье
                System.out.println("It is Sunday!");
                break;
            case "Monday": //Понедельник
                System.out.println("It is Monday!");
                break;
            case "Tuesday": //Вторник
                System.out.println("It is Thuesday!");
                break;
            case "Wednesday": //Среда
                System.out.println("It is Wednesday!");
                break;
            case "Thursday": //Четверг
                System.out.println("It is Thursday!");
                break;
            case "Friday": //Пятница
                System.out.println("It is Friday!");
                break;
            case "Saturday": //Суббота
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("That is not a day!");
        }
    }
}
