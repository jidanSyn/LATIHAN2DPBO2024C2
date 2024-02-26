class Table:
    __rows = 0
    __cols = 0

    def __init__(self, rows = 0, cols = 0):
        self.__rows = rows
        self.__cols = cols

    def printRowSeparator(self, separator_length):

        # manual way  
        # for i in range(separator_length):
        #     print('-', end='')
        # print()

        # cleaner way? using fstrings
        print(f"{'':->{separator_length}}")
    
    # def printColPadding(self, padding_length):
    #     # manual
    #     # for i in range(padding_length):
    #     #     print(' ', end='')
    #     print(f"{'': >{padding_length}}", end='')


    def createRows(self, rows, cols, data):

        max_len = [0] * cols

        # getting max lengths of each columns
        for i in range(cols):
            for j in range(rows):
                max_len[i] = max(max_len[i], len(data[j][i]))

        separator_length = sum(max_len) + 28

        for i in range(rows):
            self.printRowSeparator(separator_length)
            
            for j in range(cols):
                print(f"| {data[i][j]: <{max_len[j]}} ", end='')
                # self.printColPadding(max_len[j] - len(data[i][j]))
         
            print("|")

        self.printRowSeparator(separator_length)
        



        
        