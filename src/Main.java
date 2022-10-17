public class Main {
    public static void main(String[] args) {
        //Ex1
        System.out.println("Задание номер один");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName= lastName + " " + firstName + " "+ middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //Ex2
        System.out.println("Задание номер два");
        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameForReport);
        //Ex3
        System.out.println("Задание номер три");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО  сотрудника - " + fullName);
    }
}