public class TicketLucky {
    // Task2
// boolean isMyTicketLucky(? ticketNumber);

// Notes:
// - You need to choose a type of the ticketNumber input parameter yourself.
// - Ticket number consists of 6 digits like 123456 or 404404.
// - The method returns true if sum of the first three digits is equal to sum of the last three digits.
// If the sums are different the method returns false.

    public static void main(String[] args) {
        //isMyTicketLucky("123006");
        System.out.println(isMyTicketLucky(223007));
    }

    static boolean isMyTicketLucky(int ticketNumber) {
        int number1 = ticketNumber / 100000;
        int number2 = ticketNumber / 10000%10;
        int number3 = ticketNumber / 1000%10;
        int number4 = ticketNumber / 100%10;
        int number5 = ticketNumber / 10%10;
        int number6 = ticketNumber %10;

        return number1 + number2 + number3 == number4 + number5 + number6;
    }
}
