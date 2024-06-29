//KEVIN LENIHAN - CS 210 - MAY 26 2024

#include <iostream>

std::string twoDigitString(unsigned int n) { // this function checks if the number is a two digit or not, adds 0 if not
    if (n < 10 && n > 0) {
        return "0" + std:: to_string(n); //adds 0 to numbers less than 10
    }
    else if (n < 60) {
        return std::to_string(n); //returns the string
    }
    else {
        return "Invalid";
    }
}

std::string nCharString(size_t n, char c) { // this function prints a character x number of times
    std::string charString;

    for (size_t i = 0; i < n; ++i) { //loop to print a character x number of times
        charString += c;
    }
    return charString; // returns the character
}

std::string formatTime24(unsigned int h, unsigned int m, unsigned int s) { // function to turn time into 24 hour format
  if (h >= 24 || m >= 60 || s >= 60) { //checks to make sure time is within appropriate bounds
      return "Invalid time.";
  }
  return twoDigitString(h) + ":" + twoDigitString(m) + ":" + twoDigitString(s); //returns 24 hour format using other function
}

std::string formatTime12(unsigned int h, unsigned int m, unsigned int s) { // function for 12 hour format
    std::string period = " A M";
    if (h == 0) { // checks for midnight
        h = 12;
    } else if (h == 12) { // checks for noon
        period = " P M";
    } else if (h > 12) { // checks for PM
        h -= 12;
        period = " P M";
    }

    std::string time = twoDigitString(h) + ":" + twoDigitString(m) + ":" + twoDigitString(s) + period; //initializes string time
    return time; // returns time
}

void printMenu(char * strings[], unsigned int numStrings, unsigned char width) { // function for menu

    std::cout << nCharString(width, '*') << std::endl; //prints top border

    for (unsigned int i = 0; i < numStrings; ++i) { // loop to determine how many lines are printed and how much space between walls
        std::string menuItem = strings[i];
        std::string itemNumber = std::to_string(i + 1);
        std::string line = "* " + itemNumber + " - " + menuItem;

        size_t spacesNeeded = width - 1 - line.length();
        line += nCharString(spacesNeeded, ' ') + "*"; //determines the structure of the line printed

        std::cout << line << std::endl;

        if (i < numStrings - 1) {
            std::cout << std::endl; //prints a newline if last line printed
        }
    }
    std::cout << nCharString(width, '*') << std::endl; // bottom border
}

unsigned int getMenuChoice(unsigned int maxChoice) { //function that determines a valid choice
    unsigned int choice;

    while (true) { // loop continues to run and ask for inputs until correct input is entered
        std::cin >> choice;

        if (std::cin.fail() || choice < 1 || choice > maxChoice) { //checks input to see if it is correct
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n'); //lines 74 & 75 reset the cin
            continue;
        }
        return choice; // returns choice once it is correct
    }
}

void displayClocks(unsigned int h, unsigned int m, unsigned int s) { //function for printing the display of the clocks
    std::cout << nCharString(27, '*') << nCharString(3, ' ') << nCharString(27, '*') << std::endl; //prints top border
    std::cout << '*' << nCharString(6, ' ') << "12-HOUR CLOCK" << nCharString(6, ' ') << '*' << "   ";
    std::cout << '*' << nCharString(6, ' ') << "24-HOUR CLOCK" << nCharString(6, ' ') << '*' << std::endl;
    std::cout << std::endl;
    std::cout << '*' << nCharString(6, ' ') << formatTime12(h, m, s) << nCharString(7, ' ') << '*' << "   "; // prints 12 hr format
    std::cout << '*' << nCharString(8, ' ') << formatTime24(h, m, s) << nCharString(9, ' ') << '*' << std::endl; // prints 24 hr format
    std::cout << nCharString(27, '*') << nCharString(3, ' ') << nCharString(27, '*') << std::endl; // prints bottom border
}

void addOneSecond() {
    unsigned int second = getSecond(); //assigns local variable second to the seconds on the time
    if (second >= 0 && second <= 58) { //this if adds 1 second if seconds between 0 and 58
        second += 1;
        setSecond(second);
    }
    else if (second == 59) { //this if adds one minute if second is 59
        second = 0;
        setSecond(second);
        addOneMinute();
    }
}

void addOneMinute() { //this function adds one minute
    unsigned int minute = getMinute();
    if (minute >= 0 && minute <= 58) { //checks if minute is between 0 and 58, then adds 1
        minute += 1;
        setMinute(minute);
    }
    else if (minute == 59) { //if minute is 59, resets it to 0 and adds one hour
        minute = 0;
        setMinute(minute);
        addOneHour();
    }
}

void addOneHour() { //this function adds an hour
    unsigned int hour = getHour();
    if (hour >= 0 && hour <= 22) { //if hour is between 0&22 one is added
        hour += 1;
        setHour(hour);
    }
    else if (hour == 23) { //if hour = 23 then hour is reset to 0
        hour = 0;
        setHour(hour);
    }
}

void mainMenu() {
    while (true) { //loop runs infinitely until 4 is entered ending the program
        unsigned int choice = getMenuChoice(4);

        switch (choice) {
            case 1:
                addOneHour(); // adds an hour to the clock
            break;
            case 2:
                addOneMinute(); // adds a minute to the clock
            break;
            case 3:
                addOneSecond(); // adds a second to the clock
            break;
            case 4:
                return; // ends the loop
            default:
                break;
        }
    }
}

int main() {
    return 0;
}
