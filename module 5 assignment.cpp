#include <iostream>
#include <fstream>
#include <sstream>
#include <string>

//Function converts the fahrenheit temperature into celsius
int fahrenheitToCelsius(int temp) {
    return ((temp - 32 * (5 / 9))); // equation converts f to c
}

int main() {
    std::ifstream inputFile("FahrenheitTemperature.txt"); //opens input file
    std::ofstream outputFile("CelsiusTemperature.txt"); //opens output file

    if (!inputFile.is_open()) { //checks if input file can be opened, if not then error is posted
        std::cerr << "Unable to open input file" << std::endl;
        return 1;
    }

    if (!outputFile.is_open()) { //checks if output file can be opened, if not then error is posted
        std::cerr << "Unable to open output file" << std::endl;
        return 1;
    }

    std::string line;
    while (std::getline(inputFile, line)) {
        std::istringstream iss(line);
        std::string city;
        int temperature;

        //reads city name and number from the line in the file
        if (!(iss >> city >> temperature)) {
            std::cerr << "Error reading line: " << line << std::endl;
            continue;
        }

        //call to convertion equation and use temperature as the input
        int newTemperature = fahrenheitToCelsius(temperature);

        //writes data to output file
        outputFile << city << " " << newTemperature << std::endl;
    }

    //close input and output files
    inputFile.close();
    outputFile.close();

    return 0;
}
