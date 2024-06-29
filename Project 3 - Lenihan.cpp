#include <iostream>
#include <fstream>
#include <map>
#include <string>
#include <iomanip> // For formatting the histogram

class CornerGrocer {
private:
    std::map<std::string, int> itemFrequency;

    // Helper function to load data from file
    void loadDataFromFile(const std::string& filename) {
        std::ifstream inFile(filename);
        if (!inFile) {
            std::cerr << "Error opening file: " << filename << std::endl;
            return;
        }
        std::string item;
        int frequency;
        while (inFile >> item >> frequency) {
            itemFrequency[item] = frequency;
        }
        inFile.close();
    }

    // Helper function to save data to backup file
    void saveDataToFile(const std::string& filename) {
        std::ofstream outFile(filename);
        if (!outFile) {
            std::cerr << "Error opening file: " << filename << std::endl;
            return;
        }
        for (const auto& entry : itemFrequency) {
            outFile << entry.first << " " << entry.second << std::endl;
        }
        outFile.close();
    }

public:
    // Constructor to load data and create backup
    CornerGrocer(const std::string& inputFilename, const std::string& backupFilename) {
        loadDataFromFile(inputFilename);
        saveDataToFile(backupFilename);
    }

    // Method for menu option 1
    void searchItemFrequency(const std::string& item) {
        auto it = itemFrequency.find(item);
        if (it != itemFrequency.end()) {
            std::cout << item << " appears " << it->second << " times." << std::endl;
        } else {
            std::cout << item << " does not appear in the list." << std::endl;
        }
    }

    // Method for menu option 2
    void printAllFrequencies() {
        for (const auto& entry : itemFrequency) {
            std::cout << entry.first << " " << entry.second << std::endl;
        }
    }

    // Method for menu option 3
    void printHistogram() {
        for (const auto& entry : itemFrequency) {
            std::cout << entry.first << " " << std::string(entry.second, '*') << std::endl;
        }
    }
};

int main() {
    CornerGrocer grocer("CS210_Project_Three_Input_File.txt", "frequency.dat");

    int choice;
    do {
        std::cout << "\nMenu:\n";
        std::cout << "1. Search for item frequency\n";
        std::cout << "2. Print all item frequencies\n";
        std::cout << "3. Print histogram of item frequencies\n";
        std::cout << "4. Exit\n";
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
            case 1: {
                std::string item;
                std::cout << "Enter the item to search for: ";
                std::cin >> item;
                grocer.searchItemFrequency(item);
                break;
            }
            case 2:
                grocer.printAllFrequencies();
            break;
            case 3:
                grocer.printHistogram();
            break;
            case 4:
                std::cout << "Exiting program.\n";
            break;
            default:
                std::cout << "Invalid choice. Please try again.\n";
        }
    } while (choice != 4);

    return 0;
}
