#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <iomanip>


class Table {
private:
    int rows;
    int cols;

public:
    Table() {}

    // Getters & Setters
    int getRows() {
        return this->rows;
    }

    void setRows(int rows) {
        this->rows = rows;
    }

    int getCols() {
        return this->cols;
    }

    void setCols(int cols) {
        this->cols = cols;
    }

    // Create rows method
    void createRows(int rows, int cols, const std::vector<std::vector<std::string>>& data) {
        // Vector to store maximum length of string for each column
        std::vector<int> maxLen(cols, 0);

        // Find maximum length for each column
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                maxLen[i] = std::max(maxLen[i], static_cast<int>(data[j][i].length()));
            }
        }

        // Baseline length for row separator
        int separatorLength = 28;

        // Add maximum length of each column to the separator length
        for (int num : maxLen) {
            separatorLength += num;
        }

        // Generate row separator
        std::string separator(separatorLength, '-');

        // Output table
        for (int i = 0; i < rows; i++) {
            std::cout << separator << std::endl;

            for (int j = 0; j < cols; j++) {
                std::cout << "| " << std::left << std::setw(maxLen[j]) << data[i][j] << " ";
            }
            std::cout << "|" << std::endl;
        }
        std::cout << separator << std::endl;
    }
};
