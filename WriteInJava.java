import java.io.FileWriter;
import java.io.IOException;
class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myCar = new FileWriter("Car.txt");
            myCar.write("Car 1 Details\n ---------\n");
            myCar.write("C_Name: Maruti Omni \n"+"C_Color: Pink \n"+"C_Number Plate: RJ 23 CE 9987 \n"+"C_Country: India\n"+"C_Price: 6 Lakhs\n"+"C_Description: Very spacious, can fit upto 8-10 children and the color is loved by many children\n");
            myCar.write("Car 2 Details\n ---------\n");
            myCar.write("1. Tesla Model S\n" +
                    "Color: Red\n" +
                    "Number Plate: AB 1234\n" +
                    "Country: USA\n" +
                    "Price: $90,000\n" +
                    "Description: A high-performance electric sedan with autopilot, long-range battery, and premium features.\n");
            myCar.write("Car 3 Details\n ---------\n");
            myCar.write("2. BMW M5\n" +
                    "Color: Blue\n" +
                    "Number Plate: XY 5678\n" +
                    "Country: Germany\n" +
                    "Price: $105,000\n" +
                    "Description: A luxury sports sedan with a twin-turbo V8 engine, advanced handling, and modern technology.d\n");
            myCar.write("Car 4 Details\n ---------\n");
            myCar.write("3. Ford Mustang GT\n" +
                    "Color: Black\n" +
                    "Number Plate: GT 9901\n" +
                    "Country: USA\n" +
                    "Price: $60,000\n" +
                    "Description: An American muscle car with a powerful V8 engine and aggressive styling.\n");
            myCar.write("Car 5 Details\n ---------\n");
            myCar.write("4. Ferrari 488 Spider\n" +
                    "Color: Yellow\n" +
                    "Number Plate: FR 4589\n" +
                    "Country: Italy\n" +
                    "Price: $300,000\n" +
                    "Description: A convertible supercar with a turbocharged V8 engine, providing extreme speed and luxury.\n");
            myCar.write("Car 6 Details\n ---------\n");
            myCar.write("5. Toyota Corolla\n" +
                    "Color: White\n" +
                    "Number Plate: TO 1236\n" +
                    "Country: Japan\n" +
                    "Price: $25,000\n" +
                    "Description: A reliable and fuel-efficient sedan, popular worldwide for its affordability and durability.\n");
            myCar.write("Car 7 Details\n ---------\n");
            myCar.write("6. Mercedes-Benz G-Class\n" +
                    "Color: Silver\n" +
                    "Number Plate: MB 9087\n" +
                    "Country: Germany\n" +
                    "Price: $150,000\n" +
                    "Description: A luxury off-road SUV with a boxy design, premium interior, and powerful engine options\n");
            myCar.write("Car 8 Details\n ---------\n");
            myCar.write("7. Honda Civic Type R\n" +
                    "Color: Red\n" +
                    "Number Plate: HC 7654\n" +
                    "Country: Japan\n" +
                    "Price: $45,000\n" +
                    "Description: A high-performance hatchback with a turbocharged engine and sporty design\n");
            myCar.write("Car 9 Details\n ---------\n");
            myCar.write("8. Lamborghini Huracán\n" +
                    "Color: Green\n" +
                    "Number Plate: LM 4455\n" +
                    "Country: Italy\n" +
                    "Price: $250,000\n" +
                    "Description: A stylish supercar with a naturally aspirated V10 engine and cutting-edge aerodynamics\n");
            myCar.write("Car 10 Details\n ---------\n");
            myCar.write("9. Audi RS7\n" +
                    "Color: Grey\n" +
                    "Number Plate: AU 2289\n" +
                    "Country: Germany\n" +
                    "Price: $120,000\n" +
                    "Description: A high-performance luxury sedan with a twin-turbo V8 engine and quattro all-wheel drive.\n");

            myCar.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}