
import java.util.Scanner;
class TotalWaste {
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double point1Waste, point2Waste, total;

        System.out.print("Enter waste at point 1: ");
        point1Waste = sc.nextDouble();

        System.out.print("Enter waste at point 2: ");
        point2Waste = sc.nextDouble();

        total = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected: " + total + " kg");
    }
}
