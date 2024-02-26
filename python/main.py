from DataController import DataController
from ConsoleUtilities import ConsoleUtilities
from Shirt import Shirt

# 1 is Create
# 2 is Modify
# 3 is Delete
# 4 is Show
# 0 is Exit

input_selection = -1
console_utils = ConsoleUtilities()
data_controller = DataController()

container = [
    Shirt("WHITE1", "White T-shirt", "asdf", 1000000, "M", "Cotton", "Unisex", "White", "Long-sleeve"),
    Shirt("BLUE1", "Blue T-shirt", "asdf", 1000000, "M", "Cotton", "Unisex", "Blue", "Long-sleeve"),
    Shirt("BLACK1", "Black T-shirt", "asdf", 1000000, "M", "Cotton", "Unisex", "Black", "Long-sleeve"),
]

data_controller.setContainer(container)

while input_selection != 0:
    console_utils.clear_console()
    print("Welcome to Product Database System!")
    print("What will you do? Select 1:\n 1. Create a new data\n 2. Modify an existing data\n 3. Delete a data\n 4. Show table of all existing data\n 0. End program\n")
    


    input_selection = int(input("> "))
    print()

    if input_selection == 1:
        data_controller.createData()
    elif input_selection == 2:
        data_controller.modifyData()
    elif input_selection == 3:
        data_controller.deleteData()
    elif input_selection == 4:
        data_controller.showAll()
    elif input_selection == 0:
        print("See you next time!")
    else:
        print("Invalid option!")

    if input_selection != 0:
        input("\nPress Enter to continue...")
