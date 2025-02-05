import java.util.Scanner;

public class CheckStockProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับจำนวนสินค้าทั้งหมด
        System.out.print("How many products list in stock: ");
        int numProducts = input.nextInt();

        // สร้างอาร์เรย์ของสินค้า
        Product[] productList = new Product[numProducts];

        // รับข้อมูลสินค้าแต่ละรายการ
        for (int i = 0; i < numProducts; i++) {
            productList[i] = new Product(null, i);
            System.out.print("Input Product ID: ");
            productList[i].setId(input.next());

            int unit;
            do {
                System.out.print("Input Product Unit: ");
                unit = input.nextInt();
            } while (unit < 0);
            productList[i].setUnit(unit);
        }

        // แสดงผลการตรวจสอบปริมาณสินค้า
        System.out.println("\nStock Level Summary:");
        for (Product p : productList) {
            String level;
            if (p.getUnit() < 5) {
                level = "LOW";
            } else if (p.getUnit() < 50) {
                level = "NORMAL";
            } else {
                level = "HIGH";
            }
            System.out.println("Product ID: " + p.getId() + ", Stock Level: " + level);
        }

        input.close();
    }
}
